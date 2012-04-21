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

package org.eclipselabs.etrack.app.security.ldap.impl;

import java.io.IOException;
import java.io.InputStream;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipselabs.etrack.app.security.ldap.IEObjectBuilder;
import org.eclipselabs.etrack.app.security.ldap.ILdapService;

/**
 * @author bhunt
 * 
 */
public class LdapEmfInputStream extends InputStream implements URIConverter.Loadable
{
	public LdapEmfInputStream(URI uri, IEObjectBuilder builder, ILdapService ldapSecurityService)
	{
		this.uri = uri;
		this.builder = builder;
		this.ldapSecurityService = ldapSecurityService;
	}

	@Override
	public void loadResource(final Resource resource) throws IOException
	{
		try
		{
			Attributes attributes = null;

			if (uri.hasQuery())
			{
				NamingEnumeration<SearchResult> results = ldapSecurityService.find(SearchControls.SUBTREE_SCOPE, uri.lastSegment(), uri.query());

				if (results.hasMore())
					attributes = results.next().getAttributes();
			}
			else
			{
				StringBuilder dn = new StringBuilder();
				boolean firstOne = true;

				for (String segment : uri.segments())
				{
					if (firstOne)
						firstOne = false;
					else
						dn.append(',');

					dn.append(segment);
				}

				attributes = ldapSecurityService.getAttributes(dn.toString());
			}

			if (attributes != null)
			{
				EObject eObject = builder.buildEObject(attributes);
				resource.getContents().add(eObject);
			}
		}
		catch (NamingException e)
		{
			throw new IOException(e);
		}
	}

	@Override
	public int read() throws IOException
	{
		// InputStream requires that we implement this function. It will never be called since this
		// implementation implements URIConverter.Loadable. The loadResource() function will be called
		// instead.

		return 0;
	}

	private URI uri;
	private IEObjectBuilder builder;
	private ILdapService ldapSecurityService;
}
