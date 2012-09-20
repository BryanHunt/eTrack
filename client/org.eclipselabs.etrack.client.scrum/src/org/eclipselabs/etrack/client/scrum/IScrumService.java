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

package org.eclipselabs.etrack.client.scrum;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipselabs.etrack.client.core.IServerClient;
import org.eclipselabs.etrack.domain.scrum.Backlog;
import org.eclipselabs.etrack.domain.scrum.Release;

/**
 * @author bhunt
 * 
 */
public interface IScrumService extends IServerClient
{
	String BACKLOG_LINK_KEY = "org.eclipselabs.etrack.scrum.backlog.link";
	String RELEASE_LINK_KEY = "org.eclipselabs.etrack.scrum.release.link";

	URI addBacklog(Backlog backlog) throws IOException;

	URI addRelease(Release release) throws IOException;
}
