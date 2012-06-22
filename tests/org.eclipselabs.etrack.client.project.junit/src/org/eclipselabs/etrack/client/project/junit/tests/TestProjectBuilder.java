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
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.client.junit.util.TestRealm;
import org.eclipselabs.etrack.client.project.IProjectService;
import org.eclipselabs.etrack.client.project.ProjectBuilder;
import org.eclipselabs.etrack.domain.project.Project;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestProjectBuilder
{
	private ProjectBuilder projectBuilder;

	@Mock
	private IProjectService projectService;

	@BeforeClass
	public static void globalSetup()
	{
		new TestRealm();
	}

	@Before
	public void setUp()
	{
		projectBuilder = new ProjectBuilder();
		projectBuilder.setProjectService(projectService);
	}

	@Test(expected = IllegalStateException.class)
	public void testBuildProjectWithNoProjectService() throws IOException
	{
		// --- Setup

		projectBuilder.setProjectService(null);

		// --- Test

		projectBuilder.buildProject();
	}

	@Test
	public void testBuildProject() throws IOException
	{
		// --- Test

		Project project = projectBuilder.buildProject();

		// --- Verify

		verify(projectService).addProject(project);
	}

	@Test
	public void testGetProjectNameObservable() throws IOException
	{
		// --- Setup

		String projectName = "JUnit";

		// --- Test

		projectBuilder.getProjectNameObservable().setValue(projectName);
		Project project = projectBuilder.buildProject();

		// --- Verify

		assertThat(project.getName(), is(projectName));
	}

	@Test
	public void testAddLinkBuilder() throws IOException
	{
		// --- Setup

		ILinkBuilder linkBuilder = mock(ILinkBuilder.class);

		// --- Test

		projectBuilder.addLinkBuilder(linkBuilder);
		Project project = projectBuilder.buildProject();

		// --- Verify

		verify(linkBuilder).buildLink(project);
	}

	@Test
	public void testRemoveLinkBuilder() throws IOException
	{
		// --- Setup

		ILinkBuilder linkBuilder1 = mock(ILinkBuilder.class);
		ILinkBuilder linkBuilder2 = mock(ILinkBuilder.class);

		projectBuilder.addLinkBuilder(linkBuilder1);
		projectBuilder.addLinkBuilder(linkBuilder2);

		// --- Test

		projectBuilder.removeLinkBuilder(linkBuilder1);
		Project project = projectBuilder.buildProject();

		// --- Verify

		verify(linkBuilder1, never()).buildLink(project);
		verify(linkBuilder2).buildLink(project);
	}
}
