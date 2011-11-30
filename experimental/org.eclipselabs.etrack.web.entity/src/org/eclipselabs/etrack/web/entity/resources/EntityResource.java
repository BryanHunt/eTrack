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

package org.eclipselabs.etrack.web.entity.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.etrack.domain.entity.Entity;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.web.entity.representations.EmfJsonRepresentation;
import org.eclipselabs.mongo.emf.MongoDBURIHandlerImpl;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.resource.Get;

/**
 * @author bhunt
 * 
 */
public class EntityResource extends WadlServerResource
{
	@Get("xmi+xml")
	public EmfRepresentation<Entity> getPersonXMI()
	{
		Person person = getModel();
		return new EmfRepresentation<Entity>(MediaType.APPLICATION_XMI, person);
	}

	@Get("json")
	public EmfRepresentation<Entity> getPersonJSON()
	{
		Person person = getModel();
		return new EmfJsonRepresentation<Entity>(MediaType.APPLICATION_JSON, person);
	}

	private Person getModel()
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
		uriHandlers.add(0, new MongoDBURIHandlerImpl());

		Resource resource = resourceSet.getResource(URI.createURI("mongo://localhost/etrack/entity/foo"), true);
		Person person = (Person) resource.getContents().get(0);
		return person;
	}
}
