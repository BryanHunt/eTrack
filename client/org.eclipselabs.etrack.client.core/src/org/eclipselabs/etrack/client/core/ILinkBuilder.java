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

import org.eclilpselabs.etrack.domain.data.Linkable;
import org.eclipse.core.databinding.observable.IObservable;

/**
 * This interface is used when building objects that can have linked content.
 * Implementations are expected to build the linked content and attach it to
 * the object being built.
 * 
 * @author bhunt
 * 
 */
public interface ILinkBuilder<T extends IObservable>
{
	/**
	 * @param linkable the object to add the link(s) to
	 */
	void buildLink(Linkable linkable);

	/**
	 * 
	 * @return the databinding observable for the linked data value
	 */
	T getLinkedObservable();
}
