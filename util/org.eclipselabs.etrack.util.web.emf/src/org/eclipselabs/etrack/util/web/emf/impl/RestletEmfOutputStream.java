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

package org.eclipselabs.etrack.util.web.emf.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipselabs.emodeling.ECollection;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
public class RestletEmfOutputStream extends ByteArrayOutputStream implements URIConverter.Saveable
{
	public RestletEmfOutputStream(ClientResource client, Map<?, ?> options)
	{
		this.client = client;
		this.options = options;
	}

	@Override
	public void close() throws IOException
	{
		super.close();

		EmfRepresentation<EObject> representation = new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, resource.getContents().get(0))
		{
			@Override
			protected Map<?, ?> getSaveOptions()
			{
				return options;
			}
		};

		Representation result;

		if (resource.getTimeStamp() <= 0)
			result = client.post(representation);
		else
			result = client.put(representation);

		if (client.getStatus().equals(Status.SUCCESS_OK))
		{
			if (resource.getContents().get(0) instanceof ECollection)
			{
				EmfRepresentation<ECollection> response = new EmfJsonRepresentation<ECollection>(result, resource.getURI().appendSegment("uris"), resource.getResourceSet());
				resource.getContents().add(0, response.getObject());
			}
			else
				resource.setURI(URI.createURI(result.getText()));
		}
	}

	@Override
	public void saveResource(Resource resource) throws IOException
	{
		this.resource = resource;
	}

	private ClientResource client;
	private Map<?, ?> options;
	private Resource resource;
}
