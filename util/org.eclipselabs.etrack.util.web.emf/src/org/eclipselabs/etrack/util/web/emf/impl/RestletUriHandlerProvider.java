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

package org.eclipselabs.etrack.util.web.emf.impl;

import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipselabs.etrack.client.web.IClientResourceFactory;
import org.eclipselabs.mongo.emf.ext.IUriHandlerProvider;

/**
 * @author bhunt
 * 
 */
public class RestletUriHandlerProvider implements IUriHandlerProvider
{
	@Override
	public URIHandler getURIHandler()
	{
		return handler;
	}

	public void bindClientResourceFactory(IClientResourceFactory clientResourceFactory)
	{
		this.clientResourceFactory = clientResourceFactory;
	}

	void activate()
	{
		handler = new RestletURIHandlerImpl(clientResourceFactory);
	}

	private RestletURIHandlerImpl handler;
	private IClientResourceFactory clientResourceFactory;
}
