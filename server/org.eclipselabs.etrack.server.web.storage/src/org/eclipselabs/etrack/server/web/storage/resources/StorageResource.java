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

package org.eclipselabs.etrack.server.web.storage.resources;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.eclipselabs.etrack.util.web.emf.EmfXmlRepresentation;
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

/**
 * @author bhunt
 * 
 */
public class StorageResource extends WadlServerResource
{
	public static void setResourceSetFactory(IResourceSetFactory factory)
	{
		resourceSetFactory = factory;
	}

	@Get("xmi+xml")
	public EmfRepresentation<EObject> getXMI()
	{
		EObject object = getModel();
		return new EmfXmlRepresentation<EObject>(MediaType.APPLICATION_XMI, object);
	}

	@Get("json")
	public EmfRepresentation<EObject> getJSON()
	{
		EObject object = getModel();
		return new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, object);
	}

	@Post("xmi+xml")
	public Representation addXmiObject(Representation representation) throws IOException
	{
		EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation);
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	@Post("json")
	public Representation addJsonObject(Representation representation) throws IOException
	{
		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation);
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	protected EObject getModel()
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();

		// FIXME see if we can get the option from a HTTP header Pragma
		resourceSet.getLoadOptions().put(MongoURIHandlerImpl.OPTION_PROXY_ATTRIBUTES, Boolean.TRUE);

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
