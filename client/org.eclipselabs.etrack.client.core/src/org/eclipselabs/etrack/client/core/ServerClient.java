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

import java.util.Map;

import org.eclipse.emf.common.util.URI;

/**
 * This class provides a common way for configuring client services with a
 * base server URI. This class is intended to be extended by clients.
 * 
 * @author bhunt
 */
public class ServerClient implements IServerClient
{
	public static final String PROP_URI = "uri";
	private URI baseURI;

	@Override
	public URI getBaseURI()
	{
		return baseURI;
	}

	/**
	 * This function is expected to be called by DS with the service configuration
	 * properties. Clients may override this function but must call super.
	 * 
	 * @param properties the service configuration properties
	 */
	public void configure(Map<String, Object> properties)
	{
		baseURI = URI.createURI((String) properties.get(PROP_URI));
	}
}
