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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipselabs.etrack.util.security.ldap.IEObjectBuilder;
import org.eclipselabs.etrack.util.security.ldap.ILdapService;

/**
 * @author bhunt
 * 
 */
public class LdapURIHandlerImpl extends URIHandlerImpl
{
	/**
	 * @param builder
	 * @param ldapService
	 */
	public LdapURIHandlerImpl(IEObjectBuilder builder, ILdapService ldapService)
	{
		super();
		this.builder = builder;
		this.ldapService = ldapService;
	}

	@Override
	public boolean canHandle(URI uri)
	{
		return "ldap".equalsIgnoreCase(uri.scheme()) || "ldaps".equalsIgnoreCase(uri.scheme());
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException
	{
		throw new UnsupportedOperationException("updating LDAP is currently not supported");
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException
	{
		return new LdapEmfInputStream(uri, builder, ldapService);
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException
	{
		throw new UnsupportedOperationException("delete is not allowed");
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options)
	{
		// TODO implement this function

		return false;
	}

	private ILdapService ldapService;
	private IEObjectBuilder builder;
}
