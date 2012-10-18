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

package org.eclipselabs.etrack.server.web.task.providers;

import org.eclilpselabs.etrack.util.mail.IMailService;
import org.eclipselabs.etrack.server.web.storage.AbstractStorageResourceProvider;
import org.eclipselabs.etrack.server.web.task.resources.TaskResource;
import org.restlet.Context;
import org.restlet.resource.Finder;

/**
 * @author bhunt
 * 
 */
public class TaskResourceProvider extends AbstractStorageResourceProvider
{
	@Override
	protected Finder createFinder(Context context)
	{
		return new Finder(context, TaskResource.class);
	}

	public void bindMailService(IMailService mailService)
	{
		TaskResource.setMailService(mailService);
	}
}
