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

import org.eclipselabs.etrack.domain.entity.Entity;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Person;
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
		Person person = EntityFactory.eINSTANCE.createPerson();
		person.setFirstName("Foo");
		person.setLastName("Bar");
		return new EmfRepresentation<Entity>(MediaType.APPLICATION_XMI, person);
	}
}
