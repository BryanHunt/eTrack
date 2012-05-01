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

package org.eclipselabs.etrack.server.web.security.authorization.none;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.security.Authorizer;

/**
 * @author bhunt
 * 
 */
public class AuthenticatedAuthorizer extends Authorizer
{
	@Override
	protected boolean authorize(Request request, Response response)
	{
		return request.getClientInfo().isAuthenticated();
	}
}
