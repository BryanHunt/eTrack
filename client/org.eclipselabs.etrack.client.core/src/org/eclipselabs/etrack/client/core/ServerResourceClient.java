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

package org.eclipselabs.etrack.client.core;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.mongo.emf.ext.IResourceCache;

/**
 * This class adds the ability to get a centralized EMF ResourceSet. This
 * class is intended to be extended by clients.
 * 
 * @author bhunt
 */
public class ServerResourceClient extends ServerClient
{
	private IResourceCache resourceCache;

	public void bindResourceCache(IResourceCache resourceCache)
	{
		this.resourceCache = resourceCache;
	}

	protected URI addObject(EObject eObject, String[] path) throws IOException
	{
		URI uri = getBaseURI().appendSegments(path);
		Resource resource = getResourceSet().createResource(uri);
		resource.getContents().add(eObject);
		resource.save(null);
		return resource.getURI();
	}

	protected ResourceSet getResourceSet()
	{
		return resourceCache.getResourceSet();
	}

	protected String[] buildCollectionPath(String[] basePath)
	{
		String[] collectionPath = new String[basePath.length + 1];
		System.arraycopy(basePath, 0, collectionPath, 0, basePath.length);
		collectionPath[basePath.length] = "";
		return collectionPath;
	}
}
