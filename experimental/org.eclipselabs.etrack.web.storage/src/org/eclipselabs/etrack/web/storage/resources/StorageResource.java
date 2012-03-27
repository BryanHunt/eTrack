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
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.etrack.web.storage.representations.EmfJsonRepresentation;
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
public abstract class StorageResource<T extends EObject> extends WadlServerResource
{
	@Get("xmi+xml")
	public EmfRepresentation<T> getXMI()
	{
		T object = getModel();
		return new EmfRepresentation<T>(MediaType.APPLICATION_XMI, object);
	}

	@Get("json")
	public EmfRepresentation<T> getJSON()
	{
		T object = getModel();
		return new EmfJsonRepresentation<T>(MediaType.APPLICATION_JSON, object);
	}

	@Post("json")
	public void addObject(Representation representation) throws IOException
	{
		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation);
		EObject object = emfRepresentation.getObject();
		ResourceSet resourceSet = createResourceSet();

		Resource resource = resourceSet.getResource(URI.createURI(getReference().toString()), true);
		resource.getContents().add(object);
		resource.save(null);
	}

	@SuppressWarnings("unchecked")
	protected T getModel()
	{
		ResourceSet resourceSet = createResourceSet();

		Resource resource = resourceSet.getResource(URI.createURI(getReference().toString()), true);
		return (T) resource.getContents().get(0);
	}

	protected ResourceSet createResourceSet()
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter uriConverter = resourceSet.getURIConverter();
		mapStorageURI(uriConverter.getURIMap());
// uriConverter.getURIMap().put(URI.createURI("http://localhost:8080/etrack/storage/"),
// URI.createURI("mongo://localhost/etrack/"));
		EList<URIHandler> uriHandlers = uriConverter.getURIHandlers();
		uriHandlers.add(0, new MongoURIHandlerImpl());
		return resourceSet;
	}

	protected abstract void mapStorageURI(Map<URI, URI> uriMap);
}
