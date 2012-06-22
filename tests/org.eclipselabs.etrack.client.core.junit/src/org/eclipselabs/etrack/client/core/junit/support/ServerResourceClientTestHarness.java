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

package org.eclipselabs.etrack.client.core.junit.support;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipselabs.etrack.client.core.ServerResourceClient;

/**
 * @author bhunt
 * 
 */
public class ServerResourceClientTestHarness extends ServerResourceClient
{
	@Override
	public URI addObject(EObject eObject, String[] path) throws IOException
	{
		return super.addObject(eObject, path);
	}

	@Override
	public ResourceSet getResourceSet()
	{
		return super.getResourceSet();
	}
}
