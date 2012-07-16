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

import org.eclipse.emf.ecore.EObject;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

/**
 * @author bhunt
 * 
 */
public class StorageResource extends AbstractStorageResource
{
	@Get("xmi+xml")
	@Override
	public EmfRepresentation<EObject> retrieveXMI()
	{
		return super.retrieveXMI();
	}

	@Get("json")
	@Override
	public EmfRepresentation<EObject> retrieveJSON()
	{
		return super.retrieveJSON();
	}

	@Put("xmi+xml")
	@Override
	public void updateXmiObject(Representation representation) throws IOException
	{
		super.updateXmiObject(representation);
	}

	@Put("json")
	@Override
	public void updateJsonObject(Representation representation) throws IOException
	{
		super.updateJsonObject(representation);
	}

	@Post("xmi+xml")
	@Override
	public Representation createXmiObject(Representation representation) throws IOException
	{
		return super.createXmiObject(representation);
	}

	@Post("json")
	@Override
	public Representation createJsonObject(Representation representation) throws IOException
	{
		return super.createJsonObject(representation);
	}

	@Delete
	@Override
	public void deleteObject() throws IOException
	{
		super.deleteObject();
	}
}
