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

package org.eclipselabs.etrack.client.task;

import java.io.IOException;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipselabs.emf.query.Expression;
import org.eclipselabs.etrack.client.core.IServerClient;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.mongo.emf.ext.ECollection;

/**
 * This service manages tasks for a given server. This service uses
 * an EMF ResourceSet as a cache and is not thread safe. It is expected
 * that this service will be called from the UI thread.
 * 
 * @author bhunt
 */
public interface ITaskService extends IServerClient
{
	/**
	 * Adds a task to the database.
	 * 
	 * @param task the task to add
	 * @return the URI of the task added to the database
	 */
	URI addTask(Task task) throws IOException;

	/**
	 * Adds a task domain to the database.
	 * 
	 * @param taskDomain the task domain to add
	 * @return the URI of the task domain added to the database
	 */
	URI addTaskDomain(TaskDomain taskDomain) throws IOException;

	/**
	 * Gets a single task by id
	 * 
	 * @param id the task id
	 * @return the task for the given id
	 */
	Task getTask(String id);

	/**
	 * Gets a collection of tasks filtered by a query
	 * 
	 * @param query the task filter
	 * @return the tasks that match the query
	 */
	ECollection getTasks(Expression query);

	/**
	 * Gets a single task domain by id
	 * 
	 * @param id the task domain id
	 * @return the task domain for the given id
	 */
	TaskDomain getTaskDomain(String id);

	/**
	 * This function is used to create an observable of the task domains on the
	 * server. It must be called from a thread that has a valid realm.
	 * 
	 * @return task domains observable
	 */
	IObservableList createTaskDomainsObservable();
}
