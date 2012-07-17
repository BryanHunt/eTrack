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

package org.eclipselabs.etrack.server.web.entity.ldap.resources;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.etrack.server.web.storage.AbstractStorageResource;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.resource.Get;

/**
 * @author bhunt
 * 
 */
public class EntityResource extends AbstractStorageResource
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
}
