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

package org.ecliplselabs.etrack.server.web.forms.entity.resources;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipselabs.etrack.domain.entity.Address;
import org.eclipselabs.etrack.domain.entity.Email;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.entity.Phone;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.restlet.data.Form;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.InputRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class PersonResource extends WadlServerResource
{
	public static void setResourceSetFactory(IResourceSetFactory factory)
	{
		resourceSetFactory = factory;
	}

	@Get("html")
	public Representation getForm()
	{
		try
		{
			URL url = new URL("platform:/plugin/org.eclipselabs.etrack.web.forms.entity/forms/person.html");
			return new InputRepresentation(url.openStream());
		}
		catch (Exception e)
		{
			throw new ResourceException(e);
		}
	}

	@Post
	public Representation addUser(Representation userData)
	{
		Form form = new Form(userData);
		Person person = EntityFactory.eINSTANCE.createPerson();
		person.setFirstName(form.getFirstValue("firstName"));
		person.setLastName(form.getFirstValue("lastName"));

		Email email = EntityFactory.eINSTANCE.createEmail();
		email.setAddress(form.getFirstValue("email"));
		person.getEmails().add(email);

		Address address = EntityFactory.eINSTANCE.createAddress();
		address.setStreet(form.getFirstValue("street"));
		address.setAdditional(form.getFirstValue("add"));
		address.setCity(form.getFirstValue("city"));
		address.setState(form.getFirstValue("state"));
		address.setZip(Integer.parseInt(form.getFirstValue("zip")));
		address.setCountry(form.getFirstValue("country"));
		person.getAddresses().add(address);

		Phone phone = EntityFactory.eINSTANCE.createPhone();
		phone.setNumber(form.getFirstValue("phone"));
		person.getPhoneNumbers().add(phone);

		ResourceSet resourceSet = createResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("mongodb://localhost/etrack/entity/"));
		resource.getContents().add(person);

		try
		{
			resource.save(null);
		}
		catch (IOException e)
		{
			return new StringRepresentation("Failed to add user");
		}

		return new StringRepresentation("User added");
	}

	private ResourceSet createResourceSet()
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();
		URIConverter uriConverter = resourceSet.getURIConverter();
		uriConverter.getURIMap().put(URI.createURI("http://localhost:8080/etrack/storage/"), URI.createURI("mongodb://localhost/etrack/"));
		return resourceSet;
	}

	private static IResourceSetFactory resourceSetFactory;
}
