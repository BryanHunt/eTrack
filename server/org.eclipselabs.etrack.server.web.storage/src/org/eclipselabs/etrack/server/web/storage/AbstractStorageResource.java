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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.eclipselabs.etrack.util.web.emf.EmfXmlRepresentation;
import org.eclipselabs.mongo.emf.MongoURIHandlerImpl;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.osgi.service.log.LogService;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.data.Tag;
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
	private static IResourceSetFactory resourceSetFactory;
	private static LogService logService;
	private static Map<String, ReentrantLock> locks = new HashMap<String, ReentrantLock>();

	public static void setResourceSetFactory(IResourceSetFactory factory)
	{
		// TODO this factory should ultimately be replaced by a cache and probably moved to the
		// specialization classes
		resourceSetFactory = factory;
	}

	public static void setLogService(LogService service)
	{
		logService = service;
	}

	public Representation createXmiObject(Representation representation) throws IOException
	{
		EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation);
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	public Representation createJsonObject(Representation representation) throws IOException
	{
		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation, URI.createURI(getReference().toString()), new ResourceSetImpl());
		URI uri = saveObject(emfRepresentation.getObject());
		return new StringRepresentation(uri.toString());
	}

	public EmfRepresentation<EObject> retrieveXMI()
	{
		EObject object = getModel();
		EmfXmlRepresentation<EObject> representation = new EmfXmlRepresentation<EObject>(MediaType.APPLICATION_XMI, object);
		representation.setTag(computeTag(object));
		return representation;
	}

	public EmfRepresentation<EObject> retrieveJSON()
	{
		EObject object = getModel();
		EmfJsonRepresentation<EObject> representation = new EmfJsonRepresentation<EObject>(MediaType.APPLICATION_JSON, object);
		representation.setTag(computeTag(object));
		return representation;
	}

	public EObject updateXmiObject(Representation representation) throws IOException
	{
		EObject model = getModel();

		EmfXmlRepresentation<EObject> emfRepresentation = new EmfXmlRepresentation<EObject>(representation);
		saveObject(emfRepresentation.getObject());

		return model;
	}

	public EObject updateJsonObject(Representation representation) throws IOException
	{
		EObject model = getModel();

		EmfJsonRepresentation<EObject> emfRepresentation = new EmfJsonRepresentation<EObject>(representation, URI.createURI(getReference().toString()), new ResourceSetImpl());
		saveObject(emfRepresentation.getObject());

		return model;
	}

	public void deleteObject() throws IOException
	{
		EObject object = getModel();
		object.eResource().delete(null);
	}

	@Override
	public Representation handle()
	{
		try
		{
			return super.handle();
		}
		catch (ResourceException e)
		{
			LogService log = logService;

			if (log != null)
				log.log(LogService.LOG_ERROR, "Resource exception", e);

			throw e;
		}
	}

	@Override
	protected Representation doConditionalHandle() throws ResourceException
	{
		ReentrantLock lock = null;

		synchronized (locks)
		{
			lock = locks.get(getReference().toString());

			if (lock == null)
			{
				lock = new ReentrantLock();
				locks.put(getReference().toString(), lock);
			}
		}

		lock.lock();

		try
		{
			Representation result = super.doConditionalHandle();
			return result;
		}
		finally
		{
			lock.unlock();
		}
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

		if (resource.getContents().isEmpty())
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND);

		return resource.getContents().get(0);
	}

	private Tag computeTag(EObject object)
	{
		ByteArrayOutputStream data = new ByteArrayOutputStream();

		try
		{
			object.eResource().save(data, null);
			return new Tag(DigestUtils.md5Hex(data.toByteArray()));
		}
		catch (IOException e)
		{
			return null;
		}
	}

	private URI saveObject(EObject object) throws IOException
	{
		ResourceSet resourceSet = resourceSetFactory.createResourceSet();

		Resource resource = resourceSet.createResource(URI.createURI(getReference().toString()));
		resource.getContents().add(object);
		resource.save(null);
		return resource.getURI();
	}
}
