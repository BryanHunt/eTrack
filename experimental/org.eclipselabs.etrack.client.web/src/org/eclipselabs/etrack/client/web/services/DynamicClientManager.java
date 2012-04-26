/*******************************************************************************
 * Copyright (c) 2012 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.client.web.services;

import java.util.HashSet;

import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.eclipselabs.etrack.client.web.IDynamicClientResource;

/**
 * @author bhunt
 * 
 */
public class DynamicClientManager
{
	synchronized void bindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		this.challengeResponseFactory = challengeResponseFactory;

		for (IDynamicClientResource dynamicClientResource : dynamicClientResources)
			dynamicClientResource.setChallengeResponseFactory(challengeResponseFactory);
	}

	synchronized void bindDynamicClientResource(IDynamicClientResource dynamicClientResource)
	{
		dynamicClientResources.add(dynamicClientResource);
		dynamicClientResource.setChallengeResponseFactory(challengeResponseFactory);
	}

	synchronized void unbindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		if (this.challengeResponseFactory == challengeResponseFactory)
			bindChallengeResponseFactory(null);
	}

	synchronized void unbindDynamicClientResource(IDynamicClientResource dynamicClientResource)
	{
		dynamicClientResources.remove(dynamicClientResource);
	}

	private IChallengeResponseFactory challengeResponseFactory;
	private HashSet<IDynamicClientResource> dynamicClientResources = new HashSet<IDynamicClientResource>();
}
