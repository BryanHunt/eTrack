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

package org.eclipselabs.etrack.client.task.mylyn.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.emf.ext.ExtFactory;
import org.eclipselabs.emf.query.Expression;
import org.eclipselabs.emf.query.QueryFactory;
import org.eclipselabs.etrack.client.task.mylyn.junit.support.MylynTaskClientTestHarness;
import org.eclipselabs.etrack.client.task.mylyn.junit.support.UnitTestHarness;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Organization;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestMylynTaskClient extends UnitTestHarness
{
	private MylynTaskClientTestHarness mylynTaskClient;

	@Before
	public void setUp() throws Exception
	{
		super.setUp();
		mylynTaskClient = new MylynTaskClientTestHarness(taskRepository, bundleContext);

		assertThat(mylynTaskClient.getRealBundleContext(), is(notNullValue()));
		assertTrue(mylynTaskClient.hasConfiguration());
	}

	@Test
	public void testGetCurrentUser()
	{
		// --- Setup

		Person person = EntityFactory.eINSTANCE.createPerson();
		when(entityService.getCurrentUser()).thenReturn(person);

		// --- Test & Verify

		assertThat(mylynTaskClient.getCurrentUser(), is(sameInstance(person)));
	}

	@Test
	public void testGetUser1()
	{
		// --- Setup

		String id = "user";
		Person person = EntityFactory.eINSTANCE.createPerson();
		when(entityService.getEntity(id)).thenReturn(person);

		// --- Test & Verify

		assertThat(mylynTaskClient.getUser(id), is(sameInstance(person)));
	}

	@Test
	public void testGetUser2()
	{
		// --- Setup

		String id = "user";
		Organization organization = EntityFactory.eINSTANCE.createOrganization();
		when(entityService.getEntity(id)).thenReturn(organization);

		// --- Test & Verify

		assertThat(mylynTaskClient.getUser(id), is(nullValue()));
	}

	@Test
	public void testAddTask() throws IOException
	{
		// --- Setup

		URI uri = URI.createURI("http://localhost/junit/task");
		Task task = TaskFactory.eINSTANCE.createTask();
		when(taskService.addTask(task)).thenReturn(uri);

		// --- Test & Verify

		assertThat(mylynTaskClient.addTask(task), is(uri));
	}

	@Test
	public void testGetTask()
	{
		// --- Setup

		String id = "task";
		Task task = TaskFactory.eINSTANCE.createTask();
		when(taskService.getTask(id)).thenReturn(task);

		// --- Test & verify

		assertThat(mylynTaskClient.getTask(id), is(sameInstance(task)));
	}

	@Test
	public void getTasks()
	{
		// --- Setup

		ECollection eCollection = ExtFactory.eINSTANCE.createEReferenceCollection();
		IRepositoryQuery query = mock(IRepositoryQuery.class);
		Expression expression = QueryFactory.eINSTANCE.createBinaryOperation();
		when(queryFactory.createExpression(mylynTaskClient, query)).thenReturn(expression);
		when(taskService.getTasks(expression)).thenReturn(eCollection);

		// --- Test & Verify

		assertThat(mylynTaskClient.getTasks(query), is(sameInstance(eCollection)));
	}

	@Test
	public void testGetTaskType1()
	{
		// --- Setup

		String domainId = "domain";
		String typeName = "type";

		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();

		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		taskType.setName(typeName);
		taskDomain.getTaskTypes().add(taskType);

		when(taskService.getTaskDomain(domainId)).thenReturn(taskDomain);

		// --- Test & Verify

		assertThat(mylynTaskClient.getTaskType(domainId, typeName), is(sameInstance(taskType)));
	}

	@Test
	public void testGetTaskType2()
	{
		// --- Setup

		String domainId = "domain";

		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();

		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		taskType.setName("type");
		taskDomain.getTaskTypes().add(taskType);

		when(taskService.getTaskDomain(domainId)).thenReturn(taskDomain);

		// --- Test & Verify

		assertThat(mylynTaskClient.getTaskType(domainId, "foo"), is(nullValue()));
	}

	@Test(expected = CoreException.class)
	public void testException() throws CoreException
	{
		// --- Setup

		bundleContext.setThrowException(true);

		// --- Test & Verify

		new MylynTaskClientTestHarness(taskRepository, bundleContext);
	}
}
