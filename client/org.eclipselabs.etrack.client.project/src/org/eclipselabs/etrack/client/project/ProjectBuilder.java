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
import java.util.HashSet;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.domain.project.ProjectFactory;
import org.eclipselabs.etrack.domain.project.ProjectPackage;

/**
 * This class is used to build a new Project instance and store it on the server. This
 * class is intended to be used by the UI in a wizard. Since a Project implements
 * Linkable, you may use link builders with a ProjectBuilder.
 * 
 * @author bhunt
 */
public class ProjectBuilder
{
	private Project project;
	private IProjectService projectService;
	private IObservableValue projectNameObservable;
	private HashSet<ILinkBuilder> linkBuilders = new HashSet<ILinkBuilder>();

	public ProjectBuilder()
	{
		project = ProjectFactory.eINSTANCE.createProject();
		projectNameObservable = EMFProperties.value(ProjectPackage.Literals.PROJECT__NAME).observe(project);
	}

	/**
	 * Add link builders to the project builder. The link builders will
	 * be called during buildProject().
	 * 
	 * @param linkBuilder the link builder to add
	 */
	public void addLinkBuilder(ILinkBuilder linkBuilder)
	{
		linkBuilders.add(linkBuilder);
	}

	/**
	 * Remove link builders from the project builder. The removed
	 * link builder will not be called during buildProject().
	 * 
	 * @param linkBuilder the link builder to remove
	 */
	public void removeLinkBuilder(ILinkBuilder linkBuilder)
	{
		linkBuilders.remove(linkBuilder);
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

	/**
	 * Builds and saves a new project object.
	 * 
	 * @return the new project object
	 * @throws IOException if there was a problem saving the new project object
	 */
	public Project buildProject() throws IOException
	{
		if (projectService == null)
			throw new IllegalStateException("The project service was not set");

		for (ILinkBuilder linkBuilder : linkBuilders)
			linkBuilder.buildLink(project);

		projectService.addProject(project);
		return project;
	}
}
