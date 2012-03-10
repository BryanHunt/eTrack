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

package org.ecliplselabs.etrack.web.forms.entity.resources;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.query.Result;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.restlet.data.MediaType;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.AppendableRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class PersonDirectoryResource extends WadlServerResource
{
	@Get("html")
	public Representation getDirectory()
	{
		AppendableRepresentation html = new AppendableRepresentation("<html xmlns=\"http://www.w3.org/1999/xhtml\">", MediaType.TEXT_HTML);

		try
		{
			html.append("<body>");
			html.append("<h2>Person Directory</h2>");
			html.append("<table>");
			html.append("<tr>");
			html.append("<th>First Name</th>");
			html.append("<th>Last Name</th>");
			html.append("<th>Email</th>");
			html.append("</tr>");

			ResourceSet resourceSet = createResourceSet();
			resourceSet.getLoadOptions().put(MongoURIHandlerImpl.OPTION_PROXY_ATTRIBUTES, Boolean.TRUE);
			Resource resource = resourceSet.getResource(
					URI.createURI("mongo://localhost/etrack/entity/").appendQuery(URI.encodeQuery("_eClass=='http://www.eclipselabs.org/etrack/domain/entity#//Person'", false)), true);
			Result result = (Result) resource.getContents().get(0);

// for (EObject object : ((InternalEList<EObject>) result.getValues()).basicList())
			for (EObject object : result.getValues())
			{
				Person person = (Person) object;

				html.append("<tr>");
				html.append("<td>");
				html.append(person.getFirstName());
				html.append("</td>");
				html.append("<td>");
				html.append(person.getLastName());
				html.append("</td>");
				html.append("<td>");
				html.append(person.getEmails().isEmpty() ? "" : person.getEmails().get(0).getAddress());
				html.append("</td>");
				html.append("</tr>");
			}

			html.append("</table>");
			html.append("</body>");
		}
		catch (IOException e)
		{
			throw new ResourceException(e);
		}

		return html;
	}

	private ResourceSet createResourceSet()
	{
		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter uriConverter = resourceSet.getURIConverter();
		uriConverter.getURIMap().put(URI.createURI("http://localhost:8080/etrack/storage/"), URI.createURI("mongo://localhost/etrack/"));
		EList<URIHandler> uriHandlers = uriConverter.getURIHandlers();
		uriHandlers.add(0, new MongoURIHandlerImpl());
		return resourceSet;
	}
}
