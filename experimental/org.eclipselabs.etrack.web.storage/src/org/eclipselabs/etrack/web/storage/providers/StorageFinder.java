/*******************************************************************************
 * Copyright (c) 2012 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.web.storage.providers;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.resource.Finder;
import org.restlet.resource.ServerResource;

/**
 * @author bhunt
 * 
 */
public class StorageFinder extends Finder
{
	/**
	 * @param context
	 * @param targetClass
	 */
	public StorageFinder(Context context, Class<? extends ServerResource> targetClass, StorageResourceProvider resourceProvider)
	{
		super(context, targetClass);
		this.resourceProvider = resourceProvider;
	}

	@Override
	public ServerResource create(Class<? extends ServerResource> targetClass, Request request, Response response)
	{
		ServerResource serverResource = super.create(targetClass, request, response);
		((IStorageResource) serverResource).setResourceProvider(resourceProvider);
		return serverResource;
	}

	private StorageResourceProvider resourceProvider;
}
