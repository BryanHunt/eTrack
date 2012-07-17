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

package org.eclipselabs.etrack.server.web.storage;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.eclipselabs.etrack.util.web.emf.EmfXmlRepresentation;
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class AbstractStorageResource extends WadlServerResource
{
	public static void setResourceSetFactory(IResourceSetFactory factory)
	{
		// TODO this factory should ultimately be replaced by a cache and probably moved to the
		// specialization classes
		resourceSetFactory = factory;
	}

	public Representation createXmiObject(Representation representation) throws IOException
	{
		EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation);
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	public Representation createJsonObject(Representation representation) throws IOException
	{
		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation);
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	public EmfRepresentation<EObject> retrieveXMI()
	{
		EObject object = getModel();
		return new EmfXmlRepresentation<EObject>(MediaType.APPLICATION_XMI, object);
	}

	public EmfRepresentation<EObject> retrieveJSON()
	{
		EObject object = getModel();
		return new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, object);
	}

	public void updateXmiObject(Representation representation) throws IOException
	{
		// TODO check the etag?

		EObject object = getModel();

		if (object == null)
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND);

		EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation);
		saveObject(emfRepresentation.getObject());
	}

	public void updateJsonObject(Representation representation) throws IOException
	{
		// TODO check the etag?

		EObject object = getModel();

		if (object == null)
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND);

		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation);
		saveObject(emfRepresentation.getObject());
	}

	public void deleteObject() throws IOException
	{
		EObject object = getModel();
		object.eResource().delete(null);
	}

	protected EObject getModel()
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();

		// FIXME I think the key string is missing for the headers attribute
		Form headers = (Form) getRequestAttributes().get("");

		if (headers != null)
			resourceSet.getLoadOptions().put(MongoURIHandlerImpl.OPTION_PROXY_ATTRIBUTES, Boolean.valueOf(headers.getFirstValue(MongoURIHandlerImpl.OPTION_PROXY_ATTRIBUTES)));

		URI uri = URI.createURI(getReference().toString());

		if ("*".equals(uri.query()))
			uri = uri.trimQuery().appendQuery("");

		Resource resource = resourceSet.getResource(uri, true);
		return resource.getContents().get(0);
	}

	private URI saveObject(EObject object) throws IOException
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();

		Resource resource = resourceSet.createResource(URI.createURI(getReference().toString()));
		resource.getContents().add(object);
		resource.save(null);
		return resource.getURI();
	}

	private static IResourceSetFactory resourceSetFactory;
}
