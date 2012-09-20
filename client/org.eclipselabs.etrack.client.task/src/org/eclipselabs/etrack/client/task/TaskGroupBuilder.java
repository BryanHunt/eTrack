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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.EntityBuilder;
import org.eclipselabs.etrack.domain.task.TaskGroup;
import org.eclipselabs.etrack.domain.task.TaskPackage;

/**
 * @author bhunt
 * 
 */
public abstract class TaskGroupBuilder<T extends TaskGroup> extends EntityBuilder<T>
{
	public IObservableValue createTaskGroupNameObservable()
	{
		return TaskProperties.TASK_GROUP_NAME.observe(getObject());
	}

	public IObservableValue createProjectObservable()
	{
		return EMFProperties.value(TaskPackage.Literals.TASK_GROUP__PROJECT).observe(getObject());
	}
}
