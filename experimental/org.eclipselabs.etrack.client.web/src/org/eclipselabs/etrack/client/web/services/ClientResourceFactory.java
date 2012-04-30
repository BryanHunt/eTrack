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

import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.eclipselabs.etrack.client.web.IClientResourceFactory;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
public class ClientResourceFactory implements IClientResourceFactory
{
	@Override
	public ClientResource createClientResource(String uri)
	{
		ClientResource client = new ClientResource(uri);
		IChallengeResponseFactory factory = challengeResponseFactory;

		if (factory != null)
			client.setChallengeResponse(factory.createChallengeResponse(uri));

		return client;
	}

	@Override
	public ClientResource createClientResource(String baseURI, String path)
	{
		ClientResource client = new ClientResource(baseURI + path);
		IChallengeResponseFactory factory = challengeResponseFactory;

		if (factory != null)
			client.setChallengeResponse(factory.createChallengeResponse(baseURI));

		return client;
	}

	void bindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		this.challengeResponseFactory = challengeResponseFactory;
	}

	void unbindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		if (this.challengeResponseFactory == challengeResponseFactory)
			this.challengeResponseFactory = null;
	}

	private volatile IChallengeResponseFactory challengeResponseFactory;
}
