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

package org.eclipselabs.etrack.client.project.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emodeling.EmodelingFactory;
import org.eclipselabs.emodeling.ResourceCache;
import org.eclipselabs.emodeling.ResourceSetFactory;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.project.ProjectProperties;
import org.eclipselabs.etrack.client.project.junit.support.TestRealm;
import org.eclipselabs.etrack.client.project.services.ProjectService;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.domain.project.ProjectFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestProjectService
{
	private URI baseURI;
	private ProjectService projectService;

	@Mock
	private ResourceSetFactory resourceSetFactory;
	@Spy
	private ResourceSetImpl resourceSet;
	@Spy
	private ResourceImpl projectResource;
	@Mock
	private ResourceCache resourceCache;

	@BeforeClass
	public static void globalSetup()
	{
		new TestRealm();
		assertThat(ProjectProperties.PROJECT_NAME, is(notNullValue()));
	}

	@Before
	public void setUp() throws IOException
	{
		baseURI = URI.createURI("http://localhost:9999/junit");
		String[] projectPath = new String[] { "storage", "projects" };
		projectService = new ProjectService();

		when(resourceSetFactory.createResourceSet()).thenReturn(resourceSet);

// URI uri = baseURI.appendSegment("project1");
		projectResource.setURI(baseURI);

		doReturn(projectResource).when(resourceSet).createResource(eq(baseURI.appendSegments(projectPath).appendSegment("")));
		doNothing().when(projectResource).save(anyMap());

		URI projectsURI = baseURI.appendSegments(projectPath).appendSegment("").appendQuery("*");
		ResourceImpl projectsResource = new ResourceImpl(projectsURI);
		projectsResource.getContents().add(EmodelingFactory.eINSTANCE.createEReferenceCollection());
		doReturn(projectsResource).when(resourceSet).getResource(projectsURI, true);

		when(resourceCache.getResourceSet()).thenReturn(resourceSet);
		projectService.bindResourceCache(resourceCache);

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put(ServerResourceClient.PROP_URI, baseURI.toString());
		properties.put(ProjectService.PROP_PROJECT_PATH, projectPath);

		projectService.configure(properties);
	}

	@Test
	public void testAddProject() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();

		// --- Test

		projectService.addProject(project);

		// --- Verify

		verify(projectResource).save(anyMap());
		assertThat(projectResource.getContents().size(), is(1));
		assertThat((Project) projectResource.getContents().get(0), is(sameInstance(project)));
	}

	@Test
	public void testCreateProjectsObservable1() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();
		projectService.addProject(project);

		// --- Test

		IObservableList projectsObservable = projectService.createProjectsObservable();

		// --- Verify

		assertThat(projectsObservable.size(), is(1));
	}

	@Test
	public void testCreateProjectsObservable2() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();

		// --- Test

		IObservableList projectsObservable = projectService.createProjectsObservable();
		projectService.addProject(project);

		// --- Verify

		assertThat(projectsObservable.size(), is(1));
	}

	@Test
	public void testGetProjectsWithNoProjects()
	{
		// --- Test

		Project[] projects = projectService.getProjects();

		// --- Verify

		assertThat(projects.length, is(0));
	}

	@Test
	public void testGetProjectsWithProject() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();
		projectService.addProject(project);

		// --- Test

		Project[] projects = projectService.getProjects();

		// --- Verify

		assertThat(projects.length, is(1));
		assertThat(projects[0], is(project));
	}

	@Test
	public void testGetProjectWithNoProjects() throws IOException
	{
		// --- Test & Verify

		assertThat(projectService.getProject("foo"), is(nullValue()));
	}

	@Test
	public void testGetProjectWithBadProjectName1() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();
		project.setName("JUnit");
		projectService.addProject(project);

		// --- Test & Verify

		assertThat(projectService.getProject(null), is(nullValue()));
	}

	@Test
	public void testGetProjectWithBadProjectName2() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();
		project.setName("JUnit");
		projectService.addProject(project);

		// --- Test & Verify

		assertThat(projectService.getProject(""), is(nullValue()));
	}

	@Test
	public void testGetProjectWithBadProjectName3() throws IOException
	{
		// --- Setup

		Project project = ProjectFactory.eINSTANCE.createProject();
		project.setName("JUnit");
		projectService.addProject(project);

		// --- Test & Verify

		assertThat(projectService.getProject("foo"), is(nullValue()));
	}

	@Test
	public void testGetProjectWithGoodProjectName() throws IOException
	{
		// --- Setup

		String projectName = "JUnit";

		Project project = ProjectFactory.eINSTANCE.createProject();
		project.setName(projectName);
		projectService.addProject(project);

		// --- Test

		Project actualProject = projectService.getProject(projectName);

		// --- Verify

		assertThat(actualProject, is(sameInstance(project)));
	}
}
