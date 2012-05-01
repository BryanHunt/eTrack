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

package org.eclipselabs.etrack.util.web.emf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class RestletEmfInputStream extends InputStream implements URIConverter.Loadable
{
	public RestletEmfInputStream(URI uri, Map<?, ?> options)
	{
		this.uri = uri;
		this.options = options;
	}

	@Override
	public void loadResource(final Resource resource) throws IOException
	{
		ClientResource client = RestletURIHandlerImpl.createClient(uri, options);

		try
		{
			// FIXME use EMF binary for optimal performance

			Representation representation = client.get(MediaType.APPLICATION_XMI);

			EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation)
			{
				@Override
				protected Map<?, ?> getLoadOptions()
				{
					return options;
				}
			};

			resource.getContents().add(emfRepresentation.getObject());
		}
		catch (ResourceException e)
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

		throw new IOException("read() should never be called - something that should never happen has happended - please head to the nearest fallout shelter and await further instructions");
	}

	private URI uri;
	private Map<?, ?> options;
}
