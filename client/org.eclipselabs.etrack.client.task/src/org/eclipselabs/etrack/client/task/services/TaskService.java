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
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.mongo.emf.ext.ECollection;
import org.eclipselabs.mongo.emf.ext.ExtPackage;

/**
 * @author bhunt
 * 
 */
public class TaskService extends ServerResourceClient implements ITaskService
{
	// { "storage", "tasks", "" }
	public static final String PROP_TASK_PATH = "task_path";
	// { "storage", "task_domains", "" }
	public static final String PROP_TASK_DOMAIN_PATH = "task_domain_path";

	private ECollection taskDomains;
	private String[] taskBasePath;
	private String[] taskCollectionPath;
	private String[] taskDomainCollectionPath;

	@Override
	public void configure(Map<String, Object> properties)
	{
		taskCollectionPath = (String[]) properties.get(PROP_TASK_PATH);
		taskDomainCollectionPath = (String[]) properties.get(PROP_TASK_DOMAIN_PATH);
		taskBasePath = new String[taskCollectionPath.length - 1];

		System.arraycopy(taskCollectionPath, 0, taskBasePath, 0, taskBasePath.length);
		super.configure(properties);
	}

	@Override
	public URI addTask(Task task) throws IOException
	{
		return addObject(task, taskCollectionPath);
	}

	@Override
	public URI addTaskDomain(TaskDomain taskDomain) throws IOException
	{
		URI uri = addObject(taskDomain, taskDomainCollectionPath);

		if (taskDomains == null)
			refresh();

		taskDomains.getValues().add(taskDomain);
		return uri;
	}

	@Override
	public Task getTask(String id)
	{
		Resource resource = getResourceSet().getResource(getBaseURI().appendSegments(taskBasePath).appendSegment(id), true);
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

		URI uri = getBaseURI().appendSegments(taskCollectionPath).appendQuery(URI.encodeQuery(rawQuery, false));
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
		URI uri = getBaseURI().appendSegments(taskDomainCollectionPath).appendQuery(URI.encodeQuery("*", false));
		Resource resource = getResourceSet().getResource(uri, true);
		taskDomains = (ECollection) resource.getContents().get(0);
	}
}
