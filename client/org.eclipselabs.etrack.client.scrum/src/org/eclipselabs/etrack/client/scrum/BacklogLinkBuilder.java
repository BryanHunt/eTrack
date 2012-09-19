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

package org.eclipselabs.etrack.client.scrum;

import org.eclilpselabs.etrack.domain.data.Linkable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.domain.scrum.BacklogLink;
import org.eclipselabs.etrack.domain.scrum.ScrumFactory;
import org.eclipselabs.etrack.domain.scrum.ScrumPackage;

/**
 * @author bhunt
 * 
 */
public class BacklogLinkBuilder implements ILinkBuilder<IObservableValue>
{
	private BacklogLink backlogLink;
	private IObservableValue backlogLinkObservable;

	public BacklogLinkBuilder()
	{
		backlogLink = ScrumFactory.eINSTANCE.createBacklogLink();
		backlogLinkObservable = EMFProperties.value(ScrumPackage.Literals.BACKLOG_LINK__BACKLOG).observe(backlogLink);
	}

	@Override
	public void buildLink(Linkable linkable)
	{
		linkable.getLinksByName().put(IScrumService.BACKLOG_LINK_KEY, backlogLink);
	}

	@Override
	public IObservableValue getLinkedObservable()
	{
		return backlogLinkObservable;
	}
}
