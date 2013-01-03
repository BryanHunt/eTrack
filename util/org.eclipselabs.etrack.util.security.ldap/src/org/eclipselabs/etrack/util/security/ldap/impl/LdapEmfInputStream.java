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

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.emf.ext.ExtFactory;
import org.eclipselabs.etrack.util.security.ldap.IEObjectBuilder;
import org.eclipselabs.etrack.util.security.ldap.ILdapService;

/**
 * @author bhunt
 * 
 */
public class LdapEmfInputStream extends InputStream implements URIConverter.Loadable
{
	public LdapEmfInputStream(URI uri, IEObjectBuilder builder, ILdapService ldapService)
	{
		this.uri = uri;
		this.builder = builder;
		this.ldapService = ldapService;
	}

	@Override
	public void loadResource(final Resource resource) throws IOException
	{
		try
		{
			Attributes attributes = null;
			EList<EObject> contents = resource.getContents();

			XMLResource.URIHandler uriHandler = new org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl();

			if (resource.getURI().hasQuery())
				uriHandler.setBaseURI(resource.getURI().trimSegments(1).appendSegment("-1"));
			else
				uriHandler.setBaseURI(resource.getURI());

			if (uri.hasQuery())
			{
				NamingEnumeration<SearchResult> results = null;

				if (uri.lastSegment() == null)
					results = ldapService.findUser(URI.decode(uri.query()));
				else
					results = ldapService.find(SearchControls.SUBTREE_SCOPE, URI.decode(uri.lastSegment()), URI.decode(uri.query()));

				ECollection eCollection = ExtFactory.eINSTANCE.createECollection();
				contents.add(eCollection);
				InternalEList<EObject> values = (InternalEList<EObject>) eCollection.getValues();

				while (results.hasMore())
				{
					SearchResult searchResult = results.next();
					attributes = searchResult.getAttributes();
					values.addUnique(builder.buildEObject(attributes, uriHandler, true));
				}
			}
			else
			{
				attributes = ldapService.getAttributes(URI.decode(uri.lastSegment()));
				contents.add(builder.buildEObject(attributes, uriHandler, false));
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
	private ILdapService ldapService;
}
