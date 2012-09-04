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

package org.eclipselabs.etrack.client.task.services;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emf.query.Expression;
import org.eclipselabs.emf.query.util.ExpressionBuilder;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.task.ITaskService;
import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StateGroup;
import org.eclipselabs.etrack.domain.state.StateTransition;
import org.eclipselabs.etrack.domain.state.StateTransitionMapping;
import org.eclipselabs.etrack.domain.task.Attachment;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.RelatedTasksMapping;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskRelationship;
import org.eclipselabs.etrack.domain.task.TaskResolution;
import org.eclipselabs.etrack.domain.task.TaskType;
import org.eclipselabs.mongo.emf.ext.ECollection;
import org.eclipselabs.mongo.emf.ext.ExtPackage;

/**
 * @author bhunt
 * 
 */
public class TaskService extends ServerResourceClient implements ITaskService
{
	public static final String PROP_RELATED_TASKS_MAPPING_PATH = "related_tasks_mapping_path";
	public static final String PROP_TASK_PATH = "task_path";
	public static final String PROP_TASK_ATTACHMENT_PATH = "task_attachment_path";
	public static final String PROP_TASK_COMMENT_PATH = "task_comment_path";
	public static final String PROP_TASK_DOMAIN_PATH = "task_domain_path";
	public static final String PROP_TASK_HISTORY_PATH = "task_history_path";
	public static final String PROP_TASK_RELATIONSHIP_PATH = "task_relationship_path";
	public static final String PROP_TASK_RESOLUTION_PATH = "task_resolution_path";
	public static final String PROP_TASK_STATE_PATH = "task_state_path";
	public static final String PROP_TASK_STATE_GROUP_PATH = "task_state_group_path";
	public static final String PROP_TASK_STATE_TRANSITION_PATH = "task_state_transition_path";
	public static final String PROP_TASK_STATE_TRANSITION_MAPPING_PATH = "task_state_transition_mapping_path";
	public static final String PROP_TASK_TYPE_PATH = "task_type_path";

	private ECollection taskDomains;
	private String[] relatedTasksMappingPath;
	private String[] taskPath;
	private String[] taskAttachmentPath;
	private String[] taskCommentPath;
	private String[] taskDomainPath;
	private String[] taskHistoryPath;
	private String[] taskRelationshipPath;
	private String[] taskResolutionPath;
	private String[] taskStatePath;
	private String[] taskStateGroupPath;
	private String[] taskStateTransitionPath;
	private String[] taskStateTransitionMappingPath;
	private String[] taskTypePath;

	@Override
	public void configure(Map<String, Object> properties)
	{
		relatedTasksMappingPath = buildCollectionPath((String[]) properties.get(PROP_RELATED_TASKS_MAPPING_PATH));
		taskPath = buildCollectionPath((String[]) properties.get(PROP_TASK_PATH));
		taskAttachmentPath = buildCollectionPath((String[]) properties.get(PROP_TASK_ATTACHMENT_PATH));
		taskCommentPath = buildCollectionPath((String[]) properties.get(PROP_TASK_COMMENT_PATH));
		taskDomainPath = buildCollectionPath((String[]) properties.get(PROP_TASK_DOMAIN_PATH));
		taskHistoryPath = buildCollectionPath((String[]) properties.get(PROP_TASK_HISTORY_PATH));
		taskRelationshipPath = buildCollectionPath((String[]) properties.get(PROP_TASK_RELATIONSHIP_PATH));
		taskResolutionPath = buildCollectionPath((String[]) properties.get(PROP_TASK_RESOLUTION_PATH));
		taskStatePath = buildCollectionPath((String[]) properties.get(PROP_TASK_STATE_PATH));
		taskStateGroupPath = buildCollectionPath((String[]) properties.get(PROP_TASK_STATE_GROUP_PATH));
		taskStateTransitionPath = buildCollectionPath((String[]) properties.get(PROP_TASK_STATE_TRANSITION_PATH));
		taskStateTransitionMappingPath = buildCollectionPath((String[]) properties.get(PROP_TASK_STATE_TRANSITION_MAPPING_PATH));
		taskTypePath = buildCollectionPath((String[]) properties.get(PROP_TASK_TYPE_PATH));

		super.configure(properties);
	}

	@Override
	public URI addRelatedTasksMapping(RelatedTasksMapping relatedTasksMapping) throws IOException
	{
		return addObject(relatedTasksMapping, relatedTasksMappingPath);
	}

	@Override
	public URI addTask(Task task) throws IOException
	{
		return addObject(task, taskPath);
	}

	@Override
	public URI addTaskAttachment(Attachment attachment) throws IOException
	{
		return addObject(attachment, taskAttachmentPath);
	}

	@Override
	public URI addTaskComment(Comment comment) throws IOException
	{
		return addObject(comment, taskCommentPath);
	}

	@Override
	public URI addTaskDomain(TaskDomain taskDomain) throws IOException
	{
		URI uri = addObject(taskDomain, taskDomainPath);

		if (taskDomains == null)
			refresh();

		taskDomains.getValues().add(taskDomain);
		return uri;
	}

	@Override
	public URI addTaskHistory(Action history) throws IOException
	{
		return addObject(history, taskHistoryPath);
	}

	@Override
	public URI addTaskRelationship(TaskRelationship taskRelationship) throws IOException
	{
		return addObject(taskRelationship, taskRelationshipPath);
	}

	@Override
	public URI addTaskResolution(TaskResolution taskResolution) throws IOException
	{
		return addObject(taskResolution, taskResolutionPath);
	}

	@Override
	public URI addTaskState(State state) throws IOException
	{
		return addObject(state, taskStatePath);
	}

	@Override
	public URI addTaskStateGroup(StateGroup stateGroup) throws IOException
	{
		return addObject(stateGroup, taskStateGroupPath);
	}

	@Override
	public URI addTaskStateTransition(StateTransition stateTransition) throws IOException
	{
		return addObject(stateTransition, taskStateTransitionPath);
	}

	@Override
	public URI addTaskStateTransitionMapping(StateTransitionMapping stateTransitionMapping) throws IOException
	{
		return addObject(stateTransitionMapping, taskStateTransitionMappingPath);
	}

	@Override
	public URI addTaskType(TaskType taskType) throws IOException
	{
		return addObject(taskType, taskTypePath);
	}

	@Override
	public Task getTask(String id)
	{
		Resource resource = getResourceSet().getResource(getBaseURI().appendSegments(taskPath).trimSegments(1).appendSegment(id), true);
		return resource.getContents().isEmpty() ? null : (Task) resource.getContents().get(0);
	}

	@Override
	public ECollection getTasks(Expression query)
	{
		// TODO each call with a new query will add an ECollection to the resourceSet. Is this ok?

		String rawQuery;

		if (query != null)
			rawQuery = ExpressionBuilder.toString(query);
		else
			rawQuery = "*";

		URI uri = getBaseURI().appendSegments(taskPath).appendQuery(URI.encodeQuery(rawQuery, false));
		Resource resource = getResourceSet().getResource(uri, true);
		return (ECollection) resource.getContents().get(0);
	}

	@Override
	public TaskDomain getTaskDomain(String id)
	{
		if (taskDomains == null)
			refresh();

		// TODO implement a more efficient algorithm

		for (EObject taskDomain : taskDomains.getValues())
		{
			if (taskDomain.eResource().getURI().lastSegment().equals(id))
				return (TaskDomain) taskDomain;
		}

		return null;
	}

	@Override
	public IObservableList createTaskDomainsObservable()
	{
		if (taskDomains == null)
			refresh();

		return EMFProperties.list(ExtPackage.Literals.ECOLLECTION__VALUES).observe(taskDomains);
	}

	public void refresh()
	{
		URI uri = getBaseURI().appendSegments(taskDomainPath).appendQuery(URI.encodeQuery("*", false));
		Resource resource = getResourceSet().getResource(uri, true);
		taskDomains = (ECollection) resource.getContents().get(0);
	}

	private String[] buildCollectionPath(String[] basePath)
	{
		String[] collectionPath = new String[basePath.length + 1];
		System.arraycopy(basePath, 0, collectionPath, 0, basePath.length);
		collectionPath[basePath.length] = "";
		return collectionPath;
	}
}
