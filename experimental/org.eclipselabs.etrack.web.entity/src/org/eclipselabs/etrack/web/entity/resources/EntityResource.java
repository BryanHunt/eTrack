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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.JsURIHandlerImpl;
import org.eclipselabs.etrack.domain.entity.Entity;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.entity.Phone;
import org.eclipselabs.etrack.web.entity.representations.EmfJsonRepresentation;
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
	@Get("application/xmi+xml")
	public EmfRepresentation<Entity> getPersonXML()
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
		uriHandlers.add(0, new JsURIHandlerImpl());

		Person person = EntityFactory.eINSTANCE.createPerson();
		person.setFirstName("Foo");
		person.setLastName("Bar");
		Phone phone = EntityFactory.eINSTANCE.createPhone();
		phone.setNumber("867-5309");
		person.getPhoneNumbers().add(phone);
		return new EmfJsonRepresentation<Entity>(MediaType.APPLICATION_XMI, person);
	}
}
