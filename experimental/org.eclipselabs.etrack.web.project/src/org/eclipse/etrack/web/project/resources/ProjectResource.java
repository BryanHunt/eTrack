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

package org.eclipse.etrack.web.project.resources;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.web.storage.resources.StorageResource;

/**
 * @author bhunt
 * 
 */
public class ProjectResource extends StorageResource<Project>
{
	@Override
	protected void mapStorageURI(Map<URI, URI> uriMap)
	{
		// FIXME : determine the mapping dynamically from the ResourceProvider
		URI logicalURI = URI.createURI(System.getProperty("baseURI", "http://localhost:8080")).appendSegments(new String[] { "storage", "projects" });
		URI physicalURI = URI.createURI(System.getProperty("mongodb", "mongo://localhost/etrack")).appendSegment("projects");
		uriMap.put(logicalURI, physicalURI);
	}
}
