/*******************************************************************************
 * Copyright (c) 2012 NVIDIA CORPORATION.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    NVIDIA - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.server.web.entity.ldap.resources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.eclipselabs.etrack.util.web.emf.EmfXmlRepresentation;
import org.eclipselabs.mongo.emf.ext.ECollection;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.resource.Get;

/**
 * @author bhunt
 * 
 */
public class CurrentUserResource extends WadlServerResource
{
	private static IResourceSetFactory resourceSetFactory;

	public static void setResourceSetFactory(IResourceSetFactory factory)
	{
		// TODO this factory should ultimately be replaced by a cache and probably moved to the
		// specialization classes
		resourceSetFactory = factory;
	}

	@Get("xmi+xml")
	public EmfRepresentation<EObject> retrieveXMI()
	{
		EObject object = getModel();
		return new EmfXmlRepresentation<EObject>(MediaType.APPLICATION_XMI, object);
	}

	@Get("json")
	public EmfRepresentation<EObject> retrieveJSON()
	{
		EObject object = getModel();
		return new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, object);
	}

	protected EObject getModel()
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();

		URI uri = URI.createURI(getReference().toString());
		String id = getClientInfo().getUser().getIdentifier();

		id = id.substring(0, id.indexOf('@'));
		Resource resource = resourceSet.getResource(uri.trimSegments(1).appendSegments(new String[] { "entities", "" }).appendQuery(id), true);

		if (resource.getContents().isEmpty())
			return null;

		ECollection eCollection = (ECollection) resource.getContents().get(0);

		if (eCollection.getValues().isEmpty())
			return null;

		return eCollection.getValues().get(0);
	}
}
