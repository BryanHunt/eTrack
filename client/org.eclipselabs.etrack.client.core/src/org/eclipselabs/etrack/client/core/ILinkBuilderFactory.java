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

package org.eclipselabs.etrack.client.core;

import org.eclipse.core.databinding.observable.IObservable;

/**
 * @author bhunt
 * 
 */
public interface ILinkBuilderFactory<T extends IObservable>
{
	ILinkBuilder<T> createLinkBuilder();
}
