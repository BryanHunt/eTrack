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

package org.eclipselabs.etrack.web.emf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class RestletURIHandlerImpl extends URIHandlerImpl
{
	@Override
	public boolean canHandle(URI uri)
	{
		return "http".equalsIgnoreCase(uri.scheme()) || "https".equalsIgnoreCase(uri.scheme());
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException
	{
		// TODO Auto-generated method stub
		return super.createOutputStream(uri, options);
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException
	{
		return new RestletEmfInputStream(uri, options);
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException
	{
		ClientResource client = new ClientResource(uri.toString());

		try
		{
			client.delete();
		}
		catch (ResourceException e)
		{
			throw new IOException(e);
		}
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options)
	{
		ClientResource client = new ClientResource(uri.toString());

		try
		{
			client.head();
			return true;
		}
		catch (ResourceException e)
		{
			return false;
		}
	}
}
