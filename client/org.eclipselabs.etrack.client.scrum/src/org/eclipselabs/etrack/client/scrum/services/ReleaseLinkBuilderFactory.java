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

package org.eclipselabs.etrack.client.scrum.services;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.client.core.ILinkBuilderFactory;
import org.eclipselabs.etrack.client.scrum.ReleaseLinkBuilder;

/**
 * @author bhunt
 * 
 */
public class ReleaseLinkBuilderFactory implements ILinkBuilderFactory<IObservableList>
{
	@Override
	public ILinkBuilder<IObservableList> createLinkBuilder()
	{
		return new ReleaseLinkBuilder();
	}
}
