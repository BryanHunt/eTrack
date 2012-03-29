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

import org.osgi.service.component.ComponentContext;
import org.restlet.ext.osgi.ResourceProvider;

/**
 * @author bhunt
 * 
 */
public abstract class StorageResourceProvider extends ResourceProvider
{
	public String getLogicalPath()
	{
		return logicalPath;
	}

	public String getPhysicalPath()
	{
		return physicalPath;
	}

	@Override
	protected void activate(ComponentContext context)
	{
		logicalPath = (String) context.getProperties().get("logicalPath");
		physicalPath = (String) context.getProperties().get("physicalPath");
		super.activate(context);
	}

	private String logicalPath;
	private String physicalPath;
}
