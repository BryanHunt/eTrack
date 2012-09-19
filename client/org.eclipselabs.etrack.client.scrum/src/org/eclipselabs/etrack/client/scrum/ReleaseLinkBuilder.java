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
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.domain.scrum.ReleaseLink;
import org.eclipselabs.etrack.domain.scrum.ScrumFactory;
import org.eclipselabs.etrack.domain.scrum.ScrumPackage;

/**
 * @author bhunt
 * 
 */
public class ReleaseLinkBuilder implements ILinkBuilder<IObservableList>
{
	private ReleaseLink releaseLink;
	private IObservableList releaseLinkObservable;

	public ReleaseLinkBuilder()
	{
		releaseLink = ScrumFactory.eINSTANCE.createReleaseLink();
		releaseLinkObservable = EMFProperties.list(ScrumPackage.Literals.RELEASE_LINK__RELEASES).observe(releaseLink);
	}

	@Override
	public void buildLink(Linkable linkable)
	{
		linkable.getLinksByName().put(IScrumService.RELEASE_LINK_KEY, releaseLink);
	}

	@Override
	public IObservableList getLinkedObservable()
	{
		return releaseLinkObservable;
	}
}
