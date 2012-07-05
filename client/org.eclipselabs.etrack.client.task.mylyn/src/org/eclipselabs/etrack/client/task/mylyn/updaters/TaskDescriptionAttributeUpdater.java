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
import org.eclipselabs.etrack.domain.task.Task;

/**
 * @author bhunt
 * 
 */
public class TaskDescriptionAttributeUpdater extends TaskAttributeUpdater
{
	@Override
	protected String getAttributeName()
	{
		return "Description";
	}

	@Override
	protected void doUpdateTaskFromAttribute(MylynTaskClient client, Task task, TaskAttribute attribute)
	{
		task.setDescription(attribute.getValue());
	}
}
