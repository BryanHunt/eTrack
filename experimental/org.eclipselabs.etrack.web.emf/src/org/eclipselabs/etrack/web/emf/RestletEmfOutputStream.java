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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
public class RestletEmfOutputStream extends ByteArrayOutputStream implements URIConverter.Saveable
{
	public RestletEmfOutputStream(URI uri, Map<?, ?> options)
	{
		this.uri = uri;
		this.options = options;
	}

	@Override
	public void close() throws IOException
	{
		super.close();
		ClientResource client = new ClientResource(uri.toString());
		EmfRepresentation<EObject> representation = new EmfRepresentation<EObject>(MediaType.APPLICATION_XMI, resource.getContents().get(0))
		{
			@Override
			protected Map<?, ?> getSaveOptions()
			{
				return options;
			}
		};

		client.post(representation);
	}

	@Override
	public void saveResource(Resource resource) throws IOException
	{
		this.resource = resource;
	}

	private URI uri;
	private Map<?, ?> options;
	private Resource resource;
}
