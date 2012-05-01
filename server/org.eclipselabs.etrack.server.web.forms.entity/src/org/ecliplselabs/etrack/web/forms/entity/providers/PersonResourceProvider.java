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

package org.ecliplselabs.etrack.web.forms.entity.providers;

import org.ecliplselabs.etrack.web.forms.entity.resources.PersonResource;
import org.eclipselabs.mongo.emf.ext.IResourceSetFactory;
import org.restlet.Context;
import org.restlet.ext.osgi.ResourceProvider;
import org.restlet.resource.Finder;

/**
 * @author bhunt
 * 
 */
public class PersonResourceProvider extends ResourceProvider
{
	@Override
	protected Finder createFinder(Context context)
	{
		return new Finder(context, PersonResource.class);
	}

	void bindResourceSetFactory(IResourceSetFactory resourceSetFactory)
	{
		PersonResource.setResourceSetFactory(resourceSetFactory);
	}
}
