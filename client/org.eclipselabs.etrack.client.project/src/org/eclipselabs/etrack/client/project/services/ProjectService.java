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

package org.eclipselabs.etrack.client.project.services;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.project.IProjectService;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.mongo.emf.ext.ECollection;
import org.eclipselabs.mongo.emf.ext.ExtPackage;

/**
 * @author bhunt
 * 
 */
public class ProjectService extends ServerResourceClient implements IProjectService
{
	// { "storage", "projects", "" }
	public static final String PROP_PROJECT_PATH = "project_path";

	private ECollection projects;
	private String[] projectCollectionPath;

	@Override
	public void configure(Map<String, Object> properties)
	{
		projectCollectionPath = buildCollectionPath((String[]) properties.get(PROP_PROJECT_PATH));
		super.configure(properties);
	}

	@Override
	public URI addProject(Project project) throws IOException
	{
		URI uri = addObject(project, projectCollectionPath);

		if (projects == null)
			refresh();

		projects.getValues().add(project);
		return uri;
	}

	@Override
	public IObservableList createProjectsObservable()
	{
		if (projects == null)
			refresh();

		return EMFProperties.list(ExtPackage.Literals.ECOLLECTION__VALUES).observe(projects);
	}

	@Override
	public Project[] getProjects()
	{
		if (projects == null)
			refresh();

		return (Project[]) projects.getValues().toArray(new Project[projects.getValues().size()]);
	}

	@Override
	public Project getProject(String projectName)
	{
		if (projects == null)
			refresh();

		if (projectName != null && !projectName.isEmpty())
		{
			for (EObject element : projects.getValues())
			{
				Project project = (Project) element;

				if (projectName.equals(project.getName()))
					return project;
			}
		}

		return null;
	}

	public void refresh()
	{
		// FIXME hack until the problem with the EMF uri converter removing the last segment is fixed

		URI uri = getBaseURI().appendSegments(projectCollectionPath).appendQuery(URI.encodeQuery("*", false));
// URI uri =
// getBaseURI().appendSegments(projectCollectionPath).trimSegments(1).appendSegment("0").appendQuery(URI.encodeQuery("*",
// false));
		Resource resource = getResourceSet().getResource(uri, true);
		projects = (ECollection) resource.getContents().get(0);
	}
}
