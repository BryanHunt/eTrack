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

package org.eclipselabs.etrack.server.web.storage;

import org.eclipselabs.emodeling.ResourceSetFactory;
import org.osgi.service.log.LogService;
import org.restlet.ext.osgi.ResourceProvider;

/**
 * @author bhunt
 * 
 */
public abstract class AbstractStorageResourceProvider extends ResourceProvider
{
	public void bindResourceSetFactory(ResourceSetFactory resourceSetFactory)
	{
		AbstractStorageResource.setResourceSetFactory(resourceSetFactory);
	}

	public void bindLogService(LogService logService)
	{
		AbstractStorageResource.setLogService(logService);
	}
}
