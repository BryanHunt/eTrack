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

import org.eclilpselabs.etrack.domain.data.Linkable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.domain.task.TaskDomainLink;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskPackage;

/**
 * @author bhunt
 * 
 */
public class TaskDomainLinkBuilder implements ILinkBuilder<IObservableValue>
{
	public TaskDomainLinkBuilder()
	{
		taskDomainLink = TaskFactory.eINSTANCE.createTaskDomainLink();
		linkedTaskDomainObservable = EMFProperties.value(TaskPackage.Literals.TASK_DOMAIN_LINK__TASK_DOMAIN).observe(taskDomainLink);
	}

	@Override
	public void buildLink(Linkable linkable)
	{
		linkable.getLinksByName().put(ITaskService.TASK_DOMAIN_LINK_KEY, taskDomainLink);
	}

	@Override
	public IObservableValue getLinkedObservable()
	{
		return linkedTaskDomainObservable;
	}

	private TaskDomainLink taskDomainLink;
	private IObservableValue linkedTaskDomainObservable;
}
