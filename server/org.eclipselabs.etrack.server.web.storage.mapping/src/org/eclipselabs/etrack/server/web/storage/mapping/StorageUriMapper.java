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

package org.eclipselabs.etrack.server.web.storage.mapping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipselabs.mongo.emf.ext.IResourceSetConfigurator;

/**
 * @author bhunt
 * 
 */
public class StorageUriMapper implements IResourceSetConfigurator
{

	@Override
	public void configureResourceSet(ResourceSet resourceSet)
	{
		URIConverter uriConverter = resourceSet.getURIConverter();
		URI logicalURI = URI.createURI(System.getProperty("storageLogicalURI", "http://localhost/etrack"));

		URI physicalURI = URI.createURI(System.getProperty("storagePhysicalURI", "mongodb://localhost"));
		uriConverter.getURIMap().put(logicalURI, physicalURI);
	}
}
