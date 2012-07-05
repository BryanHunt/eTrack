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

import java.util.Date;

import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.client.task.mylyn.TaskUpdater;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskFactory;

/**
 * @author bhunt
 * 
 */
public class TaskCommentUpdater implements TaskUpdater
{
	@Override
	public void updateTaskFromAttribute(MylynTaskClient client, Task task, TaskAttribute oldAttribute, TaskAttribute newAttribute)
	{
		Comment comment = TaskFactory.eINSTANCE.createComment();
		comment.setCreatedOn(new Date());
		comment.setText(newAttribute.getValue());
		comment.setOwner(client.getCurrentUser());
		task.getComments().add(comment);
	}
}
