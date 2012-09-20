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

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.domain.task.TaskPackage;

/**
 * This interface provides property value constants to use with databindings
 * 
 * @author bhunt
 */
public interface TaskProperties
{
	IValueProperty TASK_DOMAIN_NAME = EMFProperties.value(TaskPackage.Literals.TASK_DOMAIN__NAME);
	IValueProperty TASK_TYPE_NAME = EMFProperties.value(TaskPackage.Literals.TASK_TYPE__NAME);
	IValueProperty TASK_RESOLUTION_NAME = EMFProperties.value(TaskPackage.Literals.TASK_RESOLUTION__NAME);
	IValueProperty TASK_RELATIONSHIP_NAME = EMFProperties.value(TaskPackage.Literals.TASK_RELATIONSHIP__NAME);
	IValueProperty TASK_GROUP_NAME = EMFProperties.value(TaskPackage.Literals.TASK_GROUP__NAME);
}
