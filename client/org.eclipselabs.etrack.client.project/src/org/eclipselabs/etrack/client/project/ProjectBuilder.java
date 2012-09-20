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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipselabs.etrack.client.core.EntityBuilder;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.domain.project.ProjectFactory;

/**
 * This class is used to build a new Project instance and store it on the server. This
 * class is intended to be used by the UI in a wizard. Since a Project implements
 * Linkable, you may use link builders with a ProjectBuilder.
 * 
 * @author bhunt
 */
public class ProjectBuilder extends EntityBuilder<Project>
{
	private IProjectService projectService;
	private IObservableValue projectNameObservable;

	public ProjectBuilder()
	{
		projectNameObservable = ProjectProperties.PROJECT_NAME.observe(getObject());
	}

	/**
	 * Gives you an observable for databinding to a UI element such as
	 * a Text widget. This function must be called with an active realm.
	 * 
	 * @return the observable
	 */
	public IObservableValue getProjectNameObservable()
	{
		return projectNameObservable;
	}

	/**
	 * Binds the project service to use when creating and saving the project
	 * to the server.
	 * 
	 * @param projectService the project service to use to save the new project object
	 */
	public void setProjectService(IProjectService projectService)
	{
		this.projectService = projectService;
	}

	@Override
	protected Project createObject()
	{
		return ProjectFactory.eINSTANCE.createProject();
	}

	@Override
	protected void doBuild() throws IOException
	{
		if (projectService == null)
			throw new IOException("Could not find the project service for adding the new project");

		projectService.addProject(getObject());
	}
}
