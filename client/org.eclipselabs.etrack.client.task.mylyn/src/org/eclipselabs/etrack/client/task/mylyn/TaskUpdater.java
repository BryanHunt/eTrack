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

package org.eclipselabs.etrack.client.task.mylyn;

import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipselabs.etrack.domain.task.Task;

/**
 * @author bhunt
 * 
 */
public interface TaskUpdater
{
	void updateTaskFromAttribute(MylynTaskClient client, Task task, TaskAttribute oldAttribute, TaskAttribute newAttribute);
}
