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
import org.eclipselabs.etrack.domain.state.StatePackage;

/**
 * This interface provides property value constants to use with databindings
 * 
 * @author bhunt
 */
public interface StateProperties
{
	IValueProperty STATE_GROUP_NAME = EMFProperties.value(StatePackage.Literals.STATE_GROUP__NAME);
	IValueProperty STATE_NAME = EMFProperties.value(StatePackage.Literals.STATE__NAME);
	IValueProperty STATE_TRANSITION_NAME = EMFProperties.value(StatePackage.Literals.STATE_TRANSITION__NAME);
}
