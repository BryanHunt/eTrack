/*******************************************************************************
 * Copyright (c) 2012 NVIDIA CORPORATION.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    NVIDIA - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.client.task.mylyn;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.internal.tasks.core.RepositoryPerson;
import org.eclipse.mylyn.tasks.core.ITaskMapping;
import org.eclipse.mylyn.tasks.core.RepositoryResponse;
import org.eclipse.mylyn.tasks.core.RepositoryResponse.ResponseKind;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.AbstractTaskDataHandler;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskCommentMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipselabs.etrack.client.task.mylyn.updaters.TaskCommentUpdater;
import org.eclipselabs.etrack.client.task.mylyn.updaters.TaskDescriptionAttributeUpdater;
import org.eclipselabs.etrack.client.task.mylyn.updaters.TaskOwnerAttributeUpdater;
import org.eclipselabs.etrack.client.task.mylyn.updaters.TaskStateAttributeUpdater;
import org.eclipselabs.etrack.client.task.mylyn.updaters.TaskSummaryAttributeUpdater;
import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.state.StateTransition;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskType;

/**
 * @author bhunt
 * 
 */
@SuppressWarnings("restriction")
public class TaskDataHandler extends AbstractTaskDataHandler
{
	private TaskRepositoryConnector connector;
	private Map<String, TaskUpdater> taskUpdatersByAttributeId;

	public TaskDataHandler(TaskRepositoryConnector connector)
	{
		this.connector = connector;
		taskUpdatersByAttributeId = new HashMap<String, TaskUpdater>();
		taskUpdatersByAttributeId.put(TaskAttribute.SUMMARY, new TaskSummaryAttributeUpdater());
		taskUpdatersByAttributeId.put(TaskAttribute.DESCRIPTION, new TaskDescriptionAttributeUpdater());
		taskUpdatersByAttributeId.put(TaskAttribute.COMMENT_NEW, new TaskCommentUpdater());
		taskUpdatersByAttributeId.put(TaskAttribute.USER_ASSIGNED, new TaskOwnerAttributeUpdater());
		taskUpdatersByAttributeId.put(TaskAttribute.OPERATION, new TaskStateAttributeUpdater());
	}

	@Override
	public RepositoryResponse postTaskData(TaskRepository repository, TaskData taskData, Set<TaskAttribute> oldAttributes, IProgressMonitor monitor) throws CoreException
	{
		MylynTaskClient client = connector.getClient(repository);

		if (taskData.isNew())
			return createTask(taskData, client);
		else
			return updateTask(taskData, oldAttributes, client);
	}

	@Override
	public boolean initializeTaskData(TaskRepository repository, TaskData data, ITaskMapping initializationData, IProgressMonitor monitor) throws CoreException
	{
		TaskAttribute attribute = data.getRoot().createAttribute(TaskAttribute.SUMMARY);
		attribute.getMetaData().setReadOnly(false).setType(TaskAttribute.TYPE_SHORT_RICH_TEXT).setLabel("Summary:");

		if (!data.isNew())
		{
			attribute = data.getRoot().createAttribute(TaskAttribute.TASK_URL);
			attribute.getMetaData().setReadOnly(true).setType(TaskAttribute.TYPE_URL).setLabel("Location:");
		}

		attribute = data.getRoot().createAttribute(TaskAttribute.USER_REPORTER);
		attribute.getMetaData().setReadOnly(true).setKind(TaskAttribute.KIND_PEOPLE).setType(TaskAttribute.TYPE_PERSON).setLabel("Reporter:");

		attribute = data.getRoot().createAttribute(TaskAttribute.USER_ASSIGNED);
		attribute.getMetaData().setReadOnly(false).setKind(TaskAttribute.KIND_PEOPLE).setType(TaskAttribute.TYPE_PERSON).setLabel("Owner:");

		attribute = data.getRoot().createAttribute(TaskAttribute.DESCRIPTION);
		attribute.getMetaData().setReadOnly(false).setType(TaskAttribute.TYPE_LONG_RICH_TEXT).setLabel("Description:");

		attribute = data.getRoot().createAttribute(TaskAttribute.COMMENT_NEW);
		attribute.getMetaData().setReadOnly(false).setType(TaskAttribute.TYPE_LONG_RICH_TEXT).setLabel("New Comment:");

		attribute = data.getRoot().createAttribute(TaskAttribute.DATE_CREATION);
		attribute.getMetaData().setReadOnly(true).setType(TaskAttribute.TYPE_DATETIME).setLabel("Created:");

		if (data.isNew())
			attribute.setValue(Long.toString(new Date().getTime()));

		attribute = data.getRoot().createAttribute(TaskAttribute.DATE_MODIFICATION);
		attribute.getMetaData().setReadOnly(false).setType(TaskAttribute.TYPE_DATETIME).setLabel("Modified:");

		attribute = data.getRoot().createAttribute(TaskAttribute.STATUS);
		attribute.getMetaData().setReadOnly(true).setType(TaskAttribute.TYPE_SHORT_TEXT).setLabel("Status:");

		return true;
	}

	@Override
	public TaskAttributeMapper getAttributeMapper(TaskRepository repository)
	{
		return new TaskAttributeMapper(repository);
	}

	public TaskData getTaskData(TaskRepository repository, Task task, IProgressMonitor monitor) throws CoreException
	{
		TaskData taskData = new TaskData(getAttributeMapper(repository), repository.getConnectorKind(), repository.getRepositoryUrl(), task.eResource().getURI().lastSegment());
		initializeTaskData(repository, taskData, null, monitor);

		TaskAttribute attribute = taskData.getRoot().createAttribute(TaskAttribute.TASK_URL);
		attribute.setValue(task.eResource().getURI().toString());

		attribute = taskData.getRoot().getAttribute(TaskAttribute.SUMMARY);
		attribute.setValue(task.getSummary());

		attribute = taskData.getRoot().getAttribute(TaskAttribute.USER_REPORTER);
		attribute.setValue(task.getCreatedBy().getDisplayName() + " <" + task.getCreatedBy().getEmails().get(0).getAddress() + ">");

		if (task.getOwner() != null)
		{
			attribute = taskData.getRoot().getAttribute(TaskAttribute.USER_ASSIGNED);
			attribute.setValue(task.getOwner().getDisplayName() + " <" + task.getOwner().getEmails().get(0).getAddress() + ">");
		}

		attribute = taskData.getRoot().getAttribute(TaskAttribute.DATE_CREATION);
		attribute.setValue(Long.toString(task.getCreatedOn().getTime()));

		attribute = taskData.getRoot().getAttribute(TaskAttribute.DATE_MODIFICATION);

		if (!task.getHistory().isEmpty())
		{
			Action lastAction = task.getHistory().get(task.getHistory().size() - 1);
			attribute.setValue(Long.toString(lastAction.getInitiatedOn().getTime()));
		}
		else
			attribute.setValue(Long.toString(task.getCreatedOn().getTime()));

		attribute = taskData.getRoot().getAttribute(TaskAttribute.DESCRIPTION);
		attribute.setValue(task.getDescription());

		int index = 0;

		for (Comment comment : task.getComments())
		{
			TaskCommentMapper mapper = new TaskCommentMapper();
			mapper.setNumber(index);
			mapper.setText(comment.getText());
			mapper.setCreationDate(comment.getCreatedOn());
			RepositoryPerson author = new RepositoryPerson(repository, comment.getOwner().getEmails().get(0).getAddress());
			author.setName(comment.getOwner().getDisplayName());
			mapper.setAuthor(author);

			attribute = taskData.getRoot().createAttribute(TaskAttribute.PREFIX_COMMENT + index);
			mapper.applyTo(attribute);
			index++;
		}

		attribute = taskData.getRoot().getAttribute(TaskAttribute.STATUS);
		attribute.setValue(task.getCurrentState().getName());

		attribute = taskData.getRoot().createAttribute(TaskAttribute.OPERATION);
		attribute.getMetaData().setType(TaskAttribute.TYPE_OPERATION);
		attribute.setValue("None");

		attribute = taskData.getRoot().createAttribute(TaskAttribute.PREFIX_OPERATION + "Selected");
		attribute.getMetaData().setType(TaskAttribute.TYPE_OPERATION).setLabel("Leave " + task.getCurrentState().getName());
		attribute.setValue("None");

		TaskType taskType = task.getType();

		for (StateTransition transition : taskType.getStates().get(task.getCurrentState()))
		{
			attribute = taskData.getRoot().createAttribute(TaskAttribute.PREFIX_OPERATION + transition.getName());
			attribute.getMetaData().setType(TaskAttribute.TYPE_OPERATION).setLabel(transition.getName());
			attribute.setValue(transition.getName());
		}

		return taskData;
	}

	private RepositoryResponse createTask(TaskData taskData, MylynTaskClient client) throws CoreException
	{
		String domainId = taskData.getRoot().getAttribute(MylynTaskClient.TASK_DOMAIN).getValue();
		String typeId = taskData.getRoot().getAttribute(TaskAttribute.TASK_KIND).getValue();
		TaskType taskType = client.getTaskType(domainId, typeId);

		Task task = TaskFactory.eINSTANCE.createTask();
		task.setSummary(taskData.getRoot().getAttribute(TaskAttribute.SUMMARY).getValue());
		task.setDescription(taskData.getRoot().getAttribute(TaskAttribute.DESCRIPTION).getValue());
		Date created = new Date(Long.parseLong(taskData.getRoot().getAttribute(TaskAttribute.DATE_CREATION).getValue()));
		task.setCreatedOn(created);
		task.setCreatedBy(client.getCurrentUser());
		task.setType(taskType);
		task.setCurrentState(taskType.getStartingState());

		try
		{
			URI uri = client.addTask(task);
			return new RepositoryResponse(ResponseKind.TASK_CREATED, uri.lastSegment());
		}
		catch (IOException e)
		{
			throw new CoreException(new Status(Status.ERROR, "com.nvidia.nitro.client.task", "Failed to save task to repository", e));
		}
	}

	private RepositoryResponse updateTask(TaskData taskData, Set<TaskAttribute> oldAttributes, MylynTaskClient client) throws CoreException
	{
		Task task = client.getTask(taskData.getTaskId());

		for (TaskAttribute attribute : oldAttributes)
		{
			TaskUpdater updater = taskUpdatersByAttributeId.get(attribute.getId());

			if (updater != null)
				updater.updateTaskFromAttribute(client, task, attribute, taskData.getRoot().getAttribute(attribute.getId()));
		}

		try
		{
			task.eResource().save(null);
			return new RepositoryResponse(ResponseKind.TASK_UPDATED, taskData.getTaskId());
		}
		catch (IOException e)
		{
			throw new CoreException(new Status(Status.ERROR, "com.nvidia.nitro.client.task", "Failed to save task to repository", e));
		}
	}
}
