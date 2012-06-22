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

import org.eclipse.emf.common.util.URI;

/**
 * This interface provides common functionality when the client
 * service needs to talk to a server. This interface is intended
 * to be extended.
 * 
 * @author bhunt
 */
public interface IServerClient
{
	/**
	 * Clients should use this function to get the base URI of the
	 * server and append path segments as appropriate.
	 * 
	 * @return the base URI of the server application
	 */
	URI getBaseURI();
}
