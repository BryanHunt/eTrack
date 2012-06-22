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

package org.eclipselabs.etrack.client.project;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.domain.project.ProjectPackage;

/**
 * This interface provides property value constants to use with databindings
 * 
 * @author bhunt
 */
public interface ProjectProperties
{
	IValueProperty PROJECT_NAME = EMFProperties.value(ProjectPackage.Literals.PROJECT__NAME);
}
