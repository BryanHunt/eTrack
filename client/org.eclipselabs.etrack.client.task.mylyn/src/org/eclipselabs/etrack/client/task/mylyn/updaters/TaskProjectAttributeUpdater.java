/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.client.task.mylyn.updaters;

import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.domain.task.Task;

/**
 * @author bhunt
 * 
 */
public class TaskProjectAttributeUpdater extends TaskAttributeUpdater
{
	@Override
	protected String getAttributeName()
	{
		return "Project";
	}

	@Override
	protected void doUpdateTaskFromAttribute(MylynTaskClient client, Task task, TaskAttribute attribute)
	{
		task.setProject(client.getProject(attribute.getValue()));
	}
}
