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

package org.eclipselabs.etrack.web.storage.resources;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.etrack.web.emf.EmfJsonRepresentation;
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

/**
 * @author bhunt
 * 
 */
public abstract class StorageResource extends WadlServerResource
{
	@Get("xmi+xml")
	public EmfRepresentation<EObject> getXMI()
	{
		EObject object = getModel();
		return new EmfRepresentation<EObject>(MediaType.APPLICATION_XMI, object);
	}

	@Get("json")
	public EmfRepresentation<EObject> getJSON()
	{
		EObject object = getModel();
		return new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, object);
	}

	@Post("json")
	public void addObject(Representation representation) throws IOException
	{
		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation);
		EObject object = emfRepresentation.getObject();
		ResourceSet resourceSet = createResourceSet();

		Resource resource = resourceSet.createResource(URI.createURI(getReference().toString()));
		resource.getContents().add(object);
		resource.save(null);
	}

	protected EObject getModel()
	{
		ResourceSet resourceSet = createResourceSet();

		URI uri = URI.createURI(getReference().toString());

		if ("*".equals(uri.query()))
			uri = uri.trimQuery().appendQuery("");

		Resource resource = resourceSet.getResource(uri, true);
		return resource.getContents().get(0);
	}

	protected ResourceSet createResourceSet()
	{
		// FIXME this algorithm can be significantly improved. Look at caching the mapping.

		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter uriConverter = resourceSet.getURIConverter();

		URI logicalURI = URI.createURI(getReference().toString());
		int targetSegmentIndex = 0;

		for (String segment : logicalURI.segments())
		{
			if ("storage".equals(segment))
				break;

			targetSegmentIndex++;
		}

		logicalURI = logicalURI.trimQuery().trimSegments(logicalURI.segmentCount() - (targetSegmentIndex + 1)).appendSegment("");

		URI physicalURI = URI.createURI(System.getProperty("mongodb", "mongo://localhost"));
		uriConverter.getURIMap().put(logicalURI, physicalURI);

		EList<URIHandler> uriHandlers = uriConverter.getURIHandlers();
		uriHandlers.add(0, new MongoURIHandlerImpl());
		return resourceSet;
	}
}
