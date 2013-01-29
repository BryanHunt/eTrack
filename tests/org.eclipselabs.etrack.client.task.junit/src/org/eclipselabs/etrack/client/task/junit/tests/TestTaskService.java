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

package org.eclipselabs.etrack.client.task.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.emf.ext.ExtFactory;
import org.eclipselabs.emf.ext.ResourceCacheImpl;
import org.eclipselabs.emf.ext.ResourceSetFactory;
import org.eclipselabs.emf.query.BinaryOperation;
import org.eclipselabs.emf.query.Literal;
import org.eclipselabs.emf.query.QueryFactory;
import org.eclipselabs.emf.query.util.ExpressionBuilder;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.task.StateProperties;
import org.eclipselabs.etrack.client.task.TaskProperties;
import org.eclipselabs.etrack.client.task.junit.support.TestRealm;
import org.eclipselabs.etrack.client.task.services.TaskService;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskFactory;
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
public class TestTaskService
{
	private URI baseURI;
	private TaskService taskService;
	private String[] taskPath;
	private String[] taskDomainPath;

	@Mock
	private ResourceSetFactory resourceSetFactory;
	@Spy
	private ResourceSetImpl resourceSet;

	@BeforeClass
	public static void globalSetup()
	{
		new TestRealm();

		assertThat(TaskProperties.TASK_DOMAIN_NAME, is(notNullValue()));
		assertThat(TaskProperties.TASK_TYPE_NAME, is(notNullValue()));

		assertThat(StateProperties.STATE_GROUP_NAME, is(notNullValue()));
		assertThat(StateProperties.STATE_NAME, is(notNullValue()));
		assertThat(StateProperties.STATE_TRANSITION_NAME, is(notNullValue()));
		assertThat(StateProperties.STATE_GROUP_NAME, is(notNullValue()));
	}

	@Before
	public void setUp() throws IOException
	{
		baseURI = URI.createURI("http://localhost:9999/junit");
		taskPath = new String[] { "storage", "tasks" };
		taskDomainPath = new String[] { "storage", "task_domains", };
		taskService = new TaskService();

		when(resourceSetFactory.createResourceSet()).thenReturn(resourceSet);

		URI taskDomainsURI = baseURI.appendSegments(taskDomainPath).appendSegment("").appendQuery("*");
		ResourceImpl projectsResource = new ResourceImpl(taskDomainsURI);
		projectsResource.getContents().add(ExtFactory.eINSTANCE.createEReferenceCollection());
		doReturn(projectsResource).when(resourceSet).getResource(taskDomainsURI, true);

		ResourceCacheImpl resourceCache = new ResourceCacheImpl();
		resourceCache.bindResourceSetFactory(resourceSetFactory);
		taskService.bindResourceCache(resourceCache);

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put(ServerResourceClient.PROP_URI, baseURI.toString());
		properties.put(TaskService.PROP_RELATED_TASKS_MAPPING_PATH, new String[] {});
		properties.put(TaskService.PROP_TASK_PATH, taskPath);
		properties.put(TaskService.PROP_TASK_DOMAIN_PATH, taskDomainPath);

		taskService.configure(properties);
	}

	@Test
	public void testAddTask() throws IOException
	{
		// --- Setup

		URI taskCollectionURI = baseURI.appendSegments(taskPath).appendSegment("");
		URI taskURI = taskCollectionURI.trimSegments(1).appendSegment("task");

		Resource resource = spy(new ResourceImpl(taskURI));
		doReturn(resource).when(resourceSet).createResource(eq(taskCollectionURI));
		doNothing().when(resource).save(anyMap());

		Task task = TaskFactory.eINSTANCE.createTask();

		// --- Test

		taskService.addTask(task);

		// --- Verify

		verify(resource).save(anyMap());
		assertThat(resource.getContents().size(), is(1));
		assertThat((Task) resource.getContents().get(0), is(sameInstance(task)));
	}

	@Test
	public void testAddTaskDomain1() throws IOException
	{
		// --- Setup

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomainURI = taskDomainCollectionURI.trimSegments(1).appendSegment("task_domain");

		Resource resource = spy(new ResourceImpl(taskDomainURI));
		doReturn(resource).when(resourceSet).createResource(eq(taskDomainCollectionURI));
		doNothing().when(resource).save(anyMap());

		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();

		// --- Test

		taskService.addTaskDomain(taskDomain);

		// --- Verify

		verify(resource).save(anyMap());
		assertThat(resource.getContents().size(), is(1));
		assertThat((TaskDomain) resource.getContents().get(0), is(sameInstance(taskDomain)));
	}

	@Test
	public void testAddTaskDomain2() throws IOException
	{
		// --- Setup

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomain1URI = taskDomainCollectionURI.trimSegments(1).appendSegment("task_domain1");
		URI taskDomain2URI = taskDomainCollectionURI.trimSegments(1).appendSegment("task_domain2");

		Resource resource1 = spy(new ResourceImpl(taskDomain1URI));
		doReturn(resource1).when(resourceSet).createResource(eq(taskDomainCollectionURI));
		doNothing().when(resource1).save(anyMap());

		TaskDomain taskDomain1 = TaskFactory.eINSTANCE.createTaskDomain();
		taskService.addTaskDomain(taskDomain1);

		Resource resource2 = spy(new ResourceImpl(taskDomain2URI));
		doReturn(resource2).when(resourceSet).createResource(eq(taskDomainCollectionURI));
		doNothing().when(resource2).save(anyMap());

		TaskDomain taskDomain2 = TaskFactory.eINSTANCE.createTaskDomain();

		// --- Test

		taskService.addTaskDomain(taskDomain2);

		// --- Verify

		verify(resource2).save(anyMap());
		assertThat(resource2.getContents().size(), is(1));
		assertThat((TaskDomain) resource2.getContents().get(0), is(sameInstance(taskDomain2)));
	}

	@Test
	public void testGetTaskWithBadId() throws IOException
	{
		// --- Setup

		String taskId = "task";

		URI taskCollectionURI = baseURI.appendSegments(taskPath).appendSegment("");
		URI taskURI = taskCollectionURI.trimSegments(1).appendSegment(taskId);

		Resource resource = spy(new ResourceImpl(taskURI));
		doReturn(resource).when(resourceSet).getResource(eq(taskURI), eq(true));
		doNothing().when(resource).save(anyMap());

		// --- Test & Verify

		assertThat(taskService.getTask(taskId), is(nullValue()));
	}

	@Test
	public void testGetTaskWithGoodId() throws IOException
	{
		// --- Setup

		String taskId = "task";

		URI taskCollectionURI = baseURI.appendSegments(taskPath).appendSegment("");
		URI taskURI = taskCollectionURI.trimSegments(1).appendSegment(taskId);

		Task task = TaskFactory.eINSTANCE.createTask();

		Resource resource = spy(new ResourceImpl(taskURI));
		resource.getContents().add(task);
		doReturn(resource).when(resourceSet).getResource(eq(taskURI), eq(true));
		doNothing().when(resource).save(anyMap());

		// --- Test & Verify

		assertThat(taskService.getTask(taskId), is(sameInstance(task)));
	}

	@Test
	public void testGetAllTasks() throws IOException
	{
		// --- Setup

		URI taskCollectionURI = baseURI.appendSegments(taskPath).appendSegment("");
		URI taskURI = taskCollectionURI.appendQuery(URI.encodeQuery("*", false));

		ECollection tasks = ExtFactory.eINSTANCE.createEReferenceCollection();

		Resource resource = spy(new ResourceImpl(taskURI));
		resource.getContents().add(tasks);
		doReturn(resource).when(resourceSet).getResource(eq(taskURI), eq(true));
		doNothing().when(resource).save(anyMap());

		// --- Test & Verify

		assertThat(taskService.getTasks(null), is(sameInstance(tasks)));
	}

	@Test
	public void testGetTasks() throws IOException
	{
		// --- Setup

		BinaryOperation query = QueryFactory.eINSTANCE.createBinaryOperation();

		Literal left = QueryFactory.eINSTANCE.createLiteral();
		left.setLiteralValue("left");

		Literal right = QueryFactory.eINSTANCE.createLiteral();
		right.setLiteralValue("right");

		query.setLeftOperand(left);
		query.setOperator("=");
		query.setRightOperand(right);

		URI taskCollectionURI = baseURI.appendSegments(taskPath).appendSegment("");
		URI taskURI = taskCollectionURI.appendQuery(URI.encodeQuery(ExpressionBuilder.toString(query), false));

		ECollection tasks = ExtFactory.eINSTANCE.createEReferenceCollection();

		Resource resource = spy(new ResourceImpl(taskURI));
		resource.getContents().add(tasks);
		doReturn(resource).when(resourceSet).getResource(eq(taskURI), eq(true));
		doNothing().when(resource).save(anyMap());

		// --- Test & Verify

		assertThat(taskService.getTasks(query), is(sameInstance(tasks)));
	}

	@Test
	public void testGetTaskDomain1() throws IOException
	{
		// --- Setup

		String id = "domain";

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomainURI = taskDomainCollectionURI.trimSegments(1).appendSegments(new String[] { "task_domain", id });
		URI queryURI = taskDomainCollectionURI.appendQuery("*");

		Resource queryResource = new ResourceImpl(queryURI);
		ECollection eCollection = ExtFactory.eINSTANCE.createEReferenceCollection();
		queryResource.getContents().add(eCollection);

		Resource domainResource = new ResourceImpl(taskDomainURI);
		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();
		domainResource.getContents().add(taskDomain);

		eCollection.getValues().add(taskDomain);
		doReturn(queryResource).when(resourceSet).getResource(eq(queryURI), eq(true));

		// --- Test & Verify

		assertThat(taskService.getTaskDomain(id), is(sameInstance(taskDomain)));
	}

	@Test
	public void testGetTaskDomain2() throws IOException
	{
		// --- Setup

		String id = "domain";

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomainURI = taskDomainCollectionURI.trimSegments(1).appendSegments(new String[] { "task_domain", id });
		URI queryURI = taskDomainCollectionURI.appendQuery("*");

		Resource queryResource = new ResourceImpl(queryURI);
		ECollection eCollection = ExtFactory.eINSTANCE.createEReferenceCollection();
		queryResource.getContents().add(eCollection);

		Resource domainResource = new ResourceImpl(taskDomainURI);
		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();
		domainResource.getContents().add(taskDomain);

		eCollection.getValues().add(taskDomain);
		doReturn(queryResource).when(resourceSet).getResource(eq(queryURI), eq(true));
		taskService.getTaskDomain(id);

		// --- Test & Verify

		assertThat(taskService.getTaskDomain("foo"), is(nullValue()));
	}

	@Test
	public void testCreateTaskDomainsObservable1() throws IOException
	{
		// --- Setup

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomainURI = taskDomainCollectionURI.trimSegments(1).appendSegment("task_domain");

		Resource resource = spy(new ResourceImpl(taskDomainURI));
		doReturn(resource).when(resourceSet).createResource(eq(taskDomainCollectionURI));
		doNothing().when(resource).save(anyMap());

		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();
		taskService.addTaskDomain(taskDomain);

		// --- Test

		IObservableList taskDomainsObservable = taskService.createTaskDomainsObservable();

		// --- Verify

		assertThat(taskDomainsObservable.size(), is(1));
	}

	@Test
	public void testCreateTaskDomainsObservable2() throws IOException
	{
		// --- Setup

		URI taskDomainCollectionURI = baseURI.appendSegments(taskDomainPath).appendSegment("");
		URI taskDomainURI = taskDomainCollectionURI.trimSegments(1).appendSegment("task_domain");

		Resource resource = spy(new ResourceImpl(taskDomainURI));
		doReturn(resource).when(resourceSet).createResource(eq(taskDomainCollectionURI));
		doNothing().when(resource).save(anyMap());

		TaskDomain taskDomain = TaskFactory.eINSTANCE.createTaskDomain();

		// --- Test

		IObservableList taskDomainsObservable = taskService.createTaskDomainsObservable();
		taskService.addTaskDomain(taskDomain);

		// --- Verify

		assertThat(taskDomainsObservable.size(), is(1));
	}
}
