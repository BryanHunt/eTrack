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

package org.eclipselabs.etrack.util.security.ldap.impl;

import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipselabs.etrack.util.security.ldap.IEObjectBuilder;
import org.eclipselabs.etrack.util.security.ldap.ILdapService;
import org.eclipselabs.mongo.emf.ext.IUriHandlerProvider;

/**
 * @author bhunt
 * 
 */
public class LdapUriHandlerProvider implements IUriHandlerProvider
{

	@Override
	public synchronized URIHandler getURIHandler()
	{
		if (uriHandler == null)
			uriHandler = new LdapURIHandlerImpl(builder, ldapService);

		return uriHandler;
	}

	public void bindEObjectBuilder(IEObjectBuilder builder)
	{
		this.builder = builder;
	}

	public void bindLdapService(ILdapService ldapService)
	{
		this.ldapService = ldapService;
	}

	private LdapURIHandlerImpl uriHandler;
	private IEObjectBuilder builder;
	private ILdapService ldapService;
}
