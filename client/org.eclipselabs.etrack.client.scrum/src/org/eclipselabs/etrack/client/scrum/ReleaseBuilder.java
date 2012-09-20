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

import org.eclipselabs.etrack.domain.scrum.Release;
import org.eclipselabs.etrack.domain.scrum.ScrumFactory;

/**
 * @author bhunt
 * 
 */
public class ReleaseBuilder
{
	private Release release;
	private IScrumService scrumService;

	public ReleaseBuilder()
	{
		release = ScrumFactory.eINSTANCE.createRelease();
	}

	public Release buildRelease() throws IOException
	{
		scrumService.addRelease(release);
		return release;
	}

	public void setScrumService(IScrumService scrumService)
	{
		this.scrumService = scrumService;
	}
}
