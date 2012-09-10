/*******************************************************************************
 * Copyright (c) 2011 Bryan Hunt.
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
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.emfjson.resource.JsResourceImpl;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;

/**
 * @author bhunt
 * 
 */
public class EmfJsonRepresentation<T extends EObject> extends EmfRepresentation<T>
{
	/**
	 * @param mediaType
	 * @param object
	 */
	public EmfJsonRepresentation(MediaType mediaType, T object)
	{
		super(mediaType, object);
		resource = object.eResource();
	}

	/**
	 * @param representation
	 */
	public EmfJsonRepresentation(Representation representation, URI uri, ResourceSet resourceSet)
	{
		super(representation);
		this.uri = uri;
		this.resourceSet = resourceSet;
	}

	@Override
	protected Resource createEmfResource(MediaType mediaType)
	{
		if (resource == null || !(resource instanceof JsResourceImpl))
		{
			resource = new JsResourceImpl();
			resource.setURI(uri);

			if (resourceSet != null)
				resourceSet.getResources().add(resource);
		}

		return resource;
	}

	@Override
	public void write(EObject object, OutputStream outputStream) throws IOException
	{
		Resource originalResource = object.eResource();
		Resource targetResource = originalResource;

		if (!(originalResource instanceof JsResourceImpl))
		{
			targetResource = new JsResourceImpl();
			targetResource.getContents().add(originalResource.getContents().get(0));
			targetResource.setURI(originalResource.getURI());
		}

		targetResource.save(outputStream, getSaveOptions());

		if (!(originalResource instanceof JsResourceImpl))
		{
			originalResource.getContents().add(targetResource.getContents().get(0));
			originalResource.setURI(targetResource.getURI());
			originalResource.setTimeStamp(targetResource.getTimeStamp());
		}
	}

	private URI uri;
	private Resource resource;
	private ResourceSet resourceSet;
}
