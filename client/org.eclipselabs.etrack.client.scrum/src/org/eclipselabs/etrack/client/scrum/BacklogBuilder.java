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

import org.eclipselabs.etrack.client.task.TaskGroupBuilder;
import org.eclipselabs.etrack.domain.scrum.Backlog;
import org.eclipselabs.etrack.domain.scrum.ScrumFactory;

/**
 * @author bhunt
 * 
 */
public class BacklogBuilder extends TaskGroupBuilder<Backlog>
{
	private IScrumService scrumService;

	public void setScrumService(IScrumService scrumService)
	{
		this.scrumService = scrumService;
	}

	@Override
	protected Backlog createObject()
	{
		return ScrumFactory.eINSTANCE.createBacklog();
	}

	@Override
	protected void doBuild() throws IOException
	{
		if (scrumService == null)
			throw new IOException("Could not find a scrum service for adding the new backlog");

		scrumService.addBacklog(getObject());
	}
}
