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
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskPackage;

/**
 * @author bhunt
 * 
 */
public class TaskDomainBuilder
{
	public TaskDomainBuilder()
	{
		taskDomain = TaskFactory.eINSTANCE.createTaskDomain();
	}

	public TaskDomain buildTaskDomain() throws IOException
	{
// for (TaskRelationship relationship : taskDomain.getRelationships())
// taskService.addTaskRelationship(relationship);
//
// for (TaskRelationship relationship : taskDomain.getRelationships())
// relationship.eResource().save(null);
//
// for (TaskResolution resolution : taskDomain.getResolutions())
// taskService.addTaskResolution(resolution);
//
// for (State state : taskDomain.getStates())
// taskService.addTaskState(state);
//
// for (StateGroup stateGroup : taskDomain.getStateGroups())
// taskService.addTaskStateGroup(stateGroup);
//
// for (StateTransition stateTransition : taskDomain.getTransitions())
// taskService.addTaskStateTransition(stateTransition);
//
// for (TaskType taskType : taskDomain.getTaskTypes())
// {
// Iterator<Entry<State, EList<StateTransition>>> iterator = taskType.getStates().iterator();
//
// while (iterator.hasNext())
// {
// StateTransitionMapping stateTransitionMapping = (StateTransitionMapping) iterator.next();
// taskService.addTaskStateTransitionMapping(stateTransitionMapping);
// }
//
// taskService.addTaskType(taskType);
// }

		taskService.addTaskDomain(taskDomain);
		return taskDomain;
	}

	public IObservableList createStateGroupsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__STATE_GROUPS).observe(taskDomain);
	}

	public IObservableValue createNameObservable()
	{
		return EMFProperties.value(TaskPackage.Literals.TASK_DOMAIN__NAME).observe(taskDomain);
	}

	/**
	 * @return the statesObservable
	 */
	public IObservableList createStatesObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__STATES).observe(taskDomain);
	}

	/**
	 * @return the stateTransitionsObservable
	 */
	public IObservableList createStateTransitionsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__TRANSITIONS).observe(taskDomain);
	}

	/**
	 * @return the taskTypesObservable
	 */
	public IObservableList createTaskTypesObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__TASK_TYPES).observe(taskDomain);
	}

	public IObservableList createTaskResolutionsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__RESOLUTIONS).observe(taskDomain);
	}

	public IObservableList createTaskRelationshipsObservable()
	{
		return EMFProperties.list(TaskPackage.Literals.TASK_DOMAIN__RELATIONSHIPS).observe(taskDomain);
	}

	public void setTaskService(ITaskService taskService)
	{
		this.taskService = taskService;
	}

	private ITaskService taskService;

	private TaskDomain taskDomain;
}
