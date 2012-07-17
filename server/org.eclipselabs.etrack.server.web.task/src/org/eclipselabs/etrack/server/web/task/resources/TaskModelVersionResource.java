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

package org.eclipselabs.etrack.server.web.task.resources;

import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskModelVersion;
import org.eclipselabs.etrack.util.web.emf.EmfJsonRepresentation;
import org.eclipselabs.etrack.util.web.emf.EmfXmlRepresentation;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.resource.Get;

/**
 * @author bhunt
 * 
 */
public class TaskModelVersionResource extends WadlServerResource
{
	@Get("xmi+xml")
	public EmfRepresentation<TaskModelVersion> getXMI()
	{
		return new EmfXmlRepresentation<TaskModelVersion>(MediaType.APPLICATION_XMI, getVersion());
	}

	@Get("json")
	public EmfRepresentation<TaskModelVersion> getJSON()
	{
		return new EmfJsonRepresentation<TaskModelVersion>(MediaType.APPLICATION_JSON, getVersion());
	}

	protected TaskModelVersion getVersion()
	{
		return TaskFactory.eINSTANCE.createTaskModelVersion();
	}
}
