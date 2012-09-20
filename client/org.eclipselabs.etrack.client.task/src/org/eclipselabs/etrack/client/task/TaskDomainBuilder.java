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
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.EntityBuilder;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskPackage;

/**
 * @author bhunt
 * 
 */
public class TaskDomainBuilder extends EntityBuilder<TaskDomain>
{
	public IObservableList createStateGroupsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__STATE_GROUPS).observe(getObject());
	}

	public IObservableValue createNameObservable()
	{
		return EMFProperties.value(TaskPackage.Literals.TASK_DOMAIN__NAME).observe(getObject());
	}

	/**
	 * @return the statesObservable
	 */
	public IObservableList createStatesObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__STATES).observe(getObject());
	}

	/**
	 * @return the stateTransitionsObservable
	 */
	public IObservableList createStateTransitionsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__TRANSITIONS).observe(getObject());
	}

	/**
	 * @return the taskTypesObservable
	 */
	public IObservableList createTaskTypesObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__TASK_TYPES).observe(getObject());
	}

	public IObservableList createTaskResolutionsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__RESOLUTIONS).observe(getObject());
	}

	public IObservableList createTaskRelationshipsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__RELATIONSHIPS).observe(getObject());
	}

	public void setTaskService(ITaskService taskService)
	{
		this.taskService = taskService;
	}

	private ITaskService taskService;

	@Override
	protected TaskDomain createObject()
	{
		return TaskFactory.eINSTANCE.createTaskDomain();
	}

	@Override
	protected void doBuild() throws IOException
	{
		if (taskService == null)
			throw new IOException("Could not find a task service for adding the new task domain");

		taskService.addTaskDomain(getObject());
	}
}
