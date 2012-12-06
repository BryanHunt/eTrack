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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mylyn.tasks.core.AbstractRepositoryConnector;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.AbstractTaskDataHandler;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.core.data.TaskDataCollector;
import org.eclipse.mylyn.tasks.core.data.TaskMapper;
import org.eclipse.mylyn.tasks.core.sync.ISynchronizationSession;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.etrack.domain.task.Task;

/**
 * @author bhunt
 * 
 */
public class TaskRepositoryConnector extends AbstractRepositoryConnector
{
	public static final String CONNECTOR_KIND = "org.eclipselabs.etrack.task";

	private Map<TaskRepository, MylynTaskClient> clientsByRepository;
	private TaskDataHandler taskDataHandler;
	private String label;

	public TaskRepositoryConnector(String label)
	{
		this.label = label;
		clientsByRepository = new HashMap<TaskRepository, MylynTaskClient>();
	}

	@Override
	public boolean canCreateNewTask(TaskRepository repository)
	{
		return true;
	}

	@Override
	public boolean canCreateTaskFromKey(TaskRepository repository)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public synchronized MylynTaskClient getClient(TaskRepository repository) throws CoreException
	{
		MylynTaskClient client = clientsByRepository.get(repository);

		if (client == null)
		{
			client = createClient(repository);
			clientsByRepository.put(repository, client);
		}

		return client;
	}

	@Override
	public String getConnectorKind()
	{
		return CONNECTOR_KIND;
	}

	@Override
	public String getLabel()
	{
		return label;
	}

	@Override
	public String getRepositoryUrlFromTaskUrl(String taskFullUrl)
	{
		return null;
	}

	@Override
	public TaskMapper getTaskMapping(TaskData taskData)
	{
		return (TaskMapper) super.getTaskMapping(taskData);
	}

	@Override
	public TaskData getTaskData(TaskRepository taskRepository, String taskId, IProgressMonitor monitor) throws CoreException
	{
		Task task = getClient(taskRepository).getTask(taskId);
		return getLocalTaskDataHandler().getTaskData(taskRepository, task, monitor);
	}

	@Override
	public AbstractTaskDataHandler getTaskDataHandler()
	{
		return getLocalTaskDataHandler();
	}

	@Override
	public String getTaskIdFromTaskUrl(String taskFullUrl)
	{
		URI uri = URI.createURI(taskFullUrl);
		return uri.lastSegment();
	}

	@Override
	public String getTaskUrl(String repositoryUrl, String taskId)
	{
		return null;
	}

	@Override
	public boolean hasTaskChanged(TaskRepository taskRepository, ITask task, TaskData taskData)
	{
		TaskAttribute attribute = taskData.getRoot().getAttribute(TaskAttribute.DATE_MODIFICATION);

		if (attribute != null)
		{
			Date dataModificationDate = taskData.getAttributeMapper().getDateValue(attribute);

			if (dataModificationDate != null)
			{
				Date taskModificationDate = task.getModificationDate();

				if (taskModificationDate != null)
					return !taskModificationDate.equals(dataModificationDate);
			}
		}

		return true;
	}

	@Override
	public void preSynchronization(ISynchronizationSession session, IProgressMonitor monitor) throws CoreException
	{
		if (session.getTasks().isEmpty())
			return;

		// FIXME is will brute-force sync all tasks - need to build a query to get changed tasks
		// Use the bugzilla connector as an example

		for (ITask task : session.getTasks())
			session.markStale(task);
	}

	@Override
	public IStatus performQuery(TaskRepository repository, IRepositoryQuery query, TaskDataCollector collector, ISynchronizationSession session, IProgressMonitor monitor)
	{
		try
		{
			ECollection eCollection = getClient(repository).getTasks(query);
			monitor.beginTask("Loading tasks", eCollection.getValues().size());

			for (EObject task : eCollection.getValues())
			{
				try
				{
					collector.accept(getLocalTaskDataHandler().getTaskData(repository, (Task) task, monitor));
					monitor.worked(1);
				}
				catch (CoreException e)
				{
					return new Status(Status.ERROR, "com.nvidia.nitro.client.task", "Failed to execute query", e);
				}
			}

			monitor.done();
			return Status.OK_STATUS;
		}
		catch (CoreException e1)
		{
			return e1.getStatus();
		}
	}

	@Override
	public void updateTaskFromTaskData(TaskRepository taskRepository, ITask task, TaskData taskData)
	{
		getTaskMapping(taskData).applyTo(task);
	}

	@Override
	public void updateRepositoryConfiguration(TaskRepository taskRepository, IProgressMonitor monitor) throws CoreException
	{
		getClient(taskRepository).updateConfiguration(monitor);
	}

	protected MylynTaskClient createClient(TaskRepository repository) throws CoreException
	{
		return new MylynTaskClient(repository);
	}

	protected TaskDataHandler createTaskDataHandler()
	{
		return new TaskDataHandler(this);
	};

	private TaskDataHandler getLocalTaskDataHandler()
	{
		if (taskDataHandler == null)
			taskDataHandler = createTaskDataHandler();

		return taskDataHandler;
	}
}
