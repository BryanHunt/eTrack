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

package org.eclipselabs.etrack.client.project;

import java.io.IOException;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipselabs.etrack.client.core.IServerClient;
import org.eclipselabs.etrack.domain.project.Project;

/**
 * This service manages projects for a given server. This service uses
 * an EMF ResourceSet as a cache and is not thread safe. It is expected
 * that this service will be called from the UI thread.
 * 
 * @author bhunt
 */
public interface IProjectService extends IServerClient
{
	/**
	 * Adds a project to the database. This function is intended to be called only
	 * by administrators.
	 * 
	 * @param project the project to add
	 * @return the URI of the project added to the database
	 */
	URI addProject(Project project) throws IOException;

	/**
	 * This function is used to create an observable of the projects on the server. It
	 * must be called from a thread that has a valid realm.
	 * 
	 * @return projects observable
	 */
	IObservableList createProjectsObservable();

	/**
	 * Gets all of the projects on the server
	 * 
	 * @return the list of projects from the server.
	 */
	Project[] getProjects();

	/**
	 * Gets a single project by name
	 * 
	 * @param projectName the name of the project
	 * @return the project corresponding to the given name
	 */
	Project getProject(String projectName);
}
