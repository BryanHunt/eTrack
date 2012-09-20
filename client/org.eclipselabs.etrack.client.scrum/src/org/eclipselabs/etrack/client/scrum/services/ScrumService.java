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

package org.eclipselabs.etrack.client.scrum.services;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.scrum.IScrumService;
import org.eclipselabs.etrack.domain.scrum.Backlog;
import org.eclipselabs.etrack.domain.scrum.Release;

/**
 * @author bhunt
 * 
 */
public class ScrumService extends ServerResourceClient implements IScrumService
{
	public static final String PROP_BACKLOG_PATH = "backlog_path";
	public static final String PROP_RELEASE_PATH = "release_path";

	private String[] backlogPath;
	private String[] releasePath;

	@Override
	public void configure(Map<String, Object> properties)
	{
		backlogPath = buildCollectionPath((String[]) properties.get(PROP_BACKLOG_PATH));
		releasePath = buildCollectionPath((String[]) properties.get(PROP_RELEASE_PATH));

		super.configure(properties);
	}

	@Override
	public URI addBacklog(Backlog backlog) throws IOException
	{
		return addObject(backlog, backlogPath);
	}

	@Override
	public URI addRelease(Release release) throws IOException
	{
		return addObject(release, releasePath);
	}
}
