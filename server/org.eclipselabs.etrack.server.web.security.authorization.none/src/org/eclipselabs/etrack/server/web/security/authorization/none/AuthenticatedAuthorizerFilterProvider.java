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

import org.restlet.Context;
import org.restlet.ext.osgi.FilterProvider;
import org.restlet.routing.Filter;

/**
 * @author bhunt
 * 
 */
public class AuthenticatedAuthorizerFilterProvider extends FilterProvider
{
	@Override
	protected Filter createFilter(Context context)
	{
		return new AuthenticatedAuthorizer();
	}
}
