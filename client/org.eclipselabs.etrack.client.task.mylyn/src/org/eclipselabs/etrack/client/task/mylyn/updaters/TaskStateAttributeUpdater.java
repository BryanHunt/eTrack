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

package org.eclipselabs.etrack.client.task.mylyn.updaters;

import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.domain.state.StateTransition;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskType;

/**
 * @author bhunt
 * 
 */
public class TaskStateAttributeUpdater extends TaskAttributeUpdater
{
	@Override
	protected String getAttributeName()
	{
		return "State";
	}

	@Override
	protected void doUpdateTaskFromAttribute(MylynTaskClient client, Task task, TaskAttribute attribute)
	{
		TaskType taskType = task.getType();

		for (StateTransition transition : taskType.getStates().get(task.getCurrentState()))
		{
			if (transition.getName().equals(attribute.getValue()))
			{
				task.setCurrentState(transition.getTargetState());
				break;
			}
		}
	}

	@Override
	protected String getOldValue(Task task, TaskAttribute oldAttribute)
	{
		return task.getCurrentState().getName();
	}
}
