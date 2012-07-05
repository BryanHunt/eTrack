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

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.mylyn.tasks.core.RepositoryResponse;
import org.eclipse.mylyn.tasks.core.RepositoryResponse.ResponseKind;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.client.task.mylyn.TaskDataHandler;
import org.eclipselabs.etrack.client.task.mylyn.TaskRepositoryConnector;
import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.entity.Email;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StateFactory;
import org.eclipselabs.etrack.domain.state.StateTransition;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.eclipselabs.etrack.domain.task.TaskType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestTaskDataHandler
{
	private TaskDataHandler taskDataHandler;
	private TaskRepository taskRepository;

	@Mock
	private TaskRepositoryConnector taskRepositoryConnector;
	@Mock
	private MylynTaskClient client;
	@Mock
	private TaskAttributeMapper taskAttributeMapper;

	@Before
	public void setUp() throws CoreException
	{
		taskRepository = new TaskRepository("junit", "http://localhost/junit");
		when(taskRepositoryConnector.getClient(taskRepository)).thenReturn(client);
		taskDataHandler = new TaskDataHandler(taskRepositoryConnector);
	}

	@Test
	public void testPostTaskDataNew() throws CoreException, IOException
	{
		// --- Setup

		TaskData taskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "");
		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		taskType.setStartingState(StateFactory.eINSTANCE.createState());
		Person user = EntityFactory.eINSTANCE.createPerson();
		URI uri = URI.createURI("http://localhost/junit/task");
		Set<TaskAttribute> oldAttributes = Collections.emptySet();

		TaskAttribute root = taskData.getRoot();
		root.createAttribute(MylynTaskClient.TASK_DOMAIN).setValue(MylynTaskClient.TASK_DOMAIN);
		root.createAttribute(TaskAttribute.TASK_KIND).setValue(TaskAttribute.TASK_KIND);
		root.createAttribute(TaskAttribute.SUMMARY).setValue(TaskAttribute.SUMMARY);
		root.createAttribute(TaskAttribute.DESCRIPTION).setValue(TaskAttribute.DESCRIPTION);
		root.createAttribute(TaskAttribute.DATE_CREATION).setValue("0");

		ArgumentCaptor<Task> taskArgument = ArgumentCaptor.forClass(Task.class);
		when(client.getTaskType(MylynTaskClient.TASK_DOMAIN, TaskAttribute.TASK_KIND)).thenReturn(taskType);
		when(client.getCurrentUser()).thenReturn(user);
		when(client.addTask(taskArgument.capture())).thenReturn(uri);

		// --- Test

		RepositoryResponse response = taskDataHandler.postTaskData(taskRepository, taskData, oldAttributes, new NullProgressMonitor());

		// --- Verify

		assertThat(response.getReposonseKind(), is(ResponseKind.TASK_CREATED));
		assertThat(response.getTaskId(), is(uri.lastSegment()));

		Task task = taskArgument.getValue();

		assertThat(task.getSummary(), is(TaskAttribute.SUMMARY));
		assertThat(task.getDescription(), is(TaskAttribute.DESCRIPTION));
		assertThat(task.getCreatedOn(), is(notNullValue()));
		assertThat(task.getCreatedBy(), is(sameInstance(user)));
		assertThat(task.getType(), is(sameInstance(taskType)));
		assertThat(task.getCurrentState(), is(sameInstance(taskType.getStartingState())));
	}

	@Test(expected = CoreException.class)
	public void testPostTaskDataNewWithException() throws CoreException, IOException
	{
		// --- Setup

		TaskData taskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "");
		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		taskType.setStartingState(StateFactory.eINSTANCE.createState());
		Person user = EntityFactory.eINSTANCE.createPerson();
		Set<TaskAttribute> oldAttributes = Collections.emptySet();

		TaskAttribute root = taskData.getRoot();
		root.createAttribute(MylynTaskClient.TASK_DOMAIN).setValue(MylynTaskClient.TASK_DOMAIN);
		root.createAttribute(TaskAttribute.TASK_KIND).setValue(TaskAttribute.TASK_KIND);
		root.createAttribute(TaskAttribute.SUMMARY).setValue(TaskAttribute.SUMMARY);
		root.createAttribute(TaskAttribute.DESCRIPTION).setValue(TaskAttribute.DESCRIPTION);
		root.createAttribute(TaskAttribute.DATE_CREATION).setValue("0");

		ArgumentCaptor<Task> taskArgument = ArgumentCaptor.forClass(Task.class);
		when(client.getTaskType(MylynTaskClient.TASK_DOMAIN, TaskAttribute.TASK_KIND)).thenReturn(taskType);
		when(client.getCurrentUser()).thenReturn(user);
		when(client.addTask(taskArgument.capture())).thenThrow(new IOException());

		// --- Test & Verify

		taskDataHandler.postTaskData(taskRepository, taskData, oldAttributes, new NullProgressMonitor());
	}

	@Test
	public void testPostTaskDataUpdate() throws CoreException, IOException
	{
		// --- Setup

		TaskData newTaskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "task");
		TaskData oldTaskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "task");
		URI uri = URI.createURI("http://localhost/junit/task");
		Task task = TaskFactory.eINSTANCE.createTask();

		Resource taskResource = spy(new ResourceImpl(uri));
		taskResource.getContents().add(task);

		State startState = StateFactory.eINSTANCE.createState();
		startState.setName("Start State");

		State targetState = StateFactory.eINSTANCE.createState();
		targetState.setName("Target State");

		StateTransition stateTransition = StateFactory.eINSTANCE.createStateTransition();
		stateTransition.setName("Transition");
		stateTransition.setTargetState(targetState);

		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		BasicEList<StateTransition> stateTransitions = new BasicEList<StateTransition>();
		stateTransitions.add(stateTransition);
		taskType.getStates().put(startState, stateTransitions);
		task.setType(taskType);
		task.setCurrentState(startState);

		Person owner = EntityFactory.eINSTANCE.createPerson();

		Set<TaskAttribute> oldAttributes = new HashSet<TaskAttribute>();

		TaskAttribute root = newTaskData.getRoot();
		root.createAttribute(MylynTaskClient.TASK_DOMAIN).setValue(MylynTaskClient.TASK_DOMAIN);
		root.createAttribute(TaskAttribute.TASK_KIND).setValue(TaskAttribute.TASK_KIND);
		root.createAttribute(TaskAttribute.SUMMARY).setValue(TaskAttribute.SUMMARY);
		root.createAttribute(TaskAttribute.DESCRIPTION).setValue(TaskAttribute.DESCRIPTION);
		root.createAttribute(TaskAttribute.DATE_CREATION).setValue("0");
		root.createAttribute(TaskAttribute.USER_ASSIGNED).setValue("user@example.com");
		root.createAttribute(TaskAttribute.COMMENT_NEW).setValue(TaskAttribute.COMMENT_NEW);
		root.createAttribute(TaskAttribute.OPERATION).setValue(stateTransition.getName());

		root = oldTaskData.getRoot();
		oldAttributes.add(root.createAttribute(TaskAttribute.SUMMARY));
		oldAttributes.add(root.createAttribute(TaskAttribute.DESCRIPTION));
		oldAttributes.add(root.createAttribute(TaskAttribute.DATE_MODIFICATION));
		oldAttributes.add(root.createAttribute(TaskAttribute.USER_ASSIGNED));
		oldAttributes.add(root.createAttribute(TaskAttribute.COMMENT_NEW));
		oldAttributes.add(root.createAttribute(TaskAttribute.OPERATION));

		when(client.getTask("task")).thenReturn(task);
		when(client.getUser("user")).thenReturn(owner);
		when(client.getCurrentUser()).thenReturn(owner);
		doNothing().when(taskResource).save(anyMap());

		// --- Test

		RepositoryResponse response = taskDataHandler.postTaskData(taskRepository, newTaskData, oldAttributes, new NullProgressMonitor());

		// --- Verify

		assertThat(response.getReposonseKind(), is(ResponseKind.TASK_UPDATED));
		assertThat(response.getTaskId(), is(uri.lastSegment()));
		verify(taskResource).save(anyMap());

		assertThat(task.getSummary(), is(TaskAttribute.SUMMARY));
		assertThat(task.getDescription(), is(TaskAttribute.DESCRIPTION));
		assertThat(task.getHistory().size(), is(4));
		assertThat(task.getOwner(), is(sameInstance(owner)));
		assertThat(task.getComments().get(0).getText(), is(TaskAttribute.COMMENT_NEW));
		assertThat(task.getComments().get(0).getCreatedOn(), is(notNullValue()));
		assertThat(task.getComments().get(0).getOwner(), is(sameInstance(owner)));
		assertThat(task.getCurrentState(), is(sameInstance(targetState)));
	}

	@Test(expected = CoreException.class)
	public void testPostTaskDataUpdateWithException() throws CoreException, IOException
	{
		// --- Setup

		TaskData newTaskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "task");
		TaskData oldTaskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "task");
		URI uri = URI.createURI("http://localhost/junit/task");
		Task task = TaskFactory.eINSTANCE.createTask();

		Resource taskResource = spy(new ResourceImpl(uri));
		taskResource.getContents().add(task);

		Set<TaskAttribute> oldAttributes = new HashSet<TaskAttribute>();

		TaskAttribute root = newTaskData.getRoot();
		root.createAttribute(MylynTaskClient.TASK_DOMAIN).setValue(MylynTaskClient.TASK_DOMAIN);
		root.createAttribute(TaskAttribute.TASK_KIND).setValue(TaskAttribute.TASK_KIND);
		root.createAttribute(TaskAttribute.SUMMARY).setValue(TaskAttribute.SUMMARY);
		root.createAttribute(TaskAttribute.DESCRIPTION).setValue(TaskAttribute.DESCRIPTION);
		root.createAttribute(TaskAttribute.DATE_CREATION).setValue("0");

		root = oldTaskData.getRoot();
		oldAttributes.add(root.createAttribute(TaskAttribute.SUMMARY));
		oldAttributes.add(root.createAttribute(TaskAttribute.DESCRIPTION));
		oldAttributes.add(root.createAttribute(TaskAttribute.DATE_MODIFICATION));

		when(client.getTask("task")).thenReturn(task);
		doThrow(new IOException()).when(taskResource).save(anyMap());

		// --- Test & Verify

		taskDataHandler.postTaskData(taskRepository, newTaskData, oldAttributes, new NullProgressMonitor());
	}

	@Test
	public void testInitializeTaskDataNew() throws CoreException
	{
		// --- Setup

		TaskData taskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "");

		// --- Test

		assertTrue(taskDataHandler.initializeTaskData(taskRepository, taskData, null, new NullProgressMonitor()));

		// --- Verify

		TaskAttribute root = taskData.getRoot();
		assertThat(root.getAttribute(TaskAttribute.SUMMARY), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.USER_REPORTER), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.USER_ASSIGNED), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DESCRIPTION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.COMMENT_NEW), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DATE_CREATION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DATE_MODIFICATION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.STATUS), is(notNullValue()));

		assertThat(root.getAttribute(TaskAttribute.TASK_URL), is(nullValue()));
		assertThat(root.getAttribute(TaskAttribute.DATE_CREATION).getValue(), is(notNullValue()));
	}

	@Test
	public void testInitializeTaskDataNotNew() throws CoreException
	{
		// --- Setup

		TaskData taskData = new TaskData(taskAttributeMapper, "junit", "http://localhost/junit", "task");

		// --- Test

		assertTrue(taskDataHandler.initializeTaskData(taskRepository, taskData, null, new NullProgressMonitor()));

		// --- Verify

		TaskAttribute root = taskData.getRoot();
		assertThat(root.getAttribute(TaskAttribute.SUMMARY), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.USER_REPORTER), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.USER_ASSIGNED), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DESCRIPTION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.COMMENT_NEW), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DATE_CREATION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.DATE_MODIFICATION), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.STATUS), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.TASK_URL), is(notNullValue()));

		assertThat(root.getAttribute(TaskAttribute.DATE_CREATION).getValue(), is(""));
	}

	@Test
	public void testGetAttributeMapper()
	{
		// --- Test

		TaskAttributeMapper mapper = taskDataHandler.getAttributeMapper(taskRepository);

		// --- Verify

		assertThat(mapper.getTaskRepository(), is(sameInstance(taskRepository)));
	}

	@Test
	public void testGetTaskData1() throws CoreException
	{
		// --- Setup

		URI uri = URI.createURI("http://localhost/junit/task");

		Task task = TaskFactory.eINSTANCE.createTask();
		Resource taskResource = new ResourceImpl(uri);
		taskResource.getContents().add(task);

		State state = StateFactory.eINSTANCE.createState();
		state.setName("State");

		StateTransition stateTransition = StateFactory.eINSTANCE.createStateTransition();
		stateTransition.setName("Transition");

		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		BasicEList<StateTransition> stateTransitions = new BasicEList<StateTransition>();
		stateTransitions.add(stateTransition);
		taskType.getStates().put(state, stateTransitions);
		task.setType(taskType);
		task.setCurrentState(state);

		Person reporter = EntityFactory.eINSTANCE.createPerson();
		reporter.setFirstName("John");
		reporter.setLastName("Doh");
		Email reporterEmail = EntityFactory.eINSTANCE.createEmail();
		reporterEmail.setAddress("reporter@example.com");
		reporter.getEmails().add(reporterEmail);
		task.setCreatedBy(reporter);

		Person owner = EntityFactory.eINSTANCE.createPerson();
		owner.setFirstName("John");
		owner.setLastName("Doh");
		Email ownwerEmail = EntityFactory.eINSTANCE.createEmail();
		ownwerEmail.setAddress("owner@example.com");
		owner.getEmails().add(ownwerEmail);
		task.setOwner(owner);

		Action action = TaskFactory.eINSTANCE.createTaskAttributeChange();
		action.setInitiatedOn(new Date());
		task.getHistory().add(action);

		Comment comment = TaskFactory.eINSTANCE.createComment();
		comment.setText("Comment");
		comment.setCreatedOn(new Date());
		comment.setOwner(owner);
		task.getComments().add(comment);

		task.setSummary("Summary");
		task.setDescription("Description");
		task.setCreatedOn(new Date());

		// --- Test

		TaskData taskData = taskDataHandler.getTaskData(taskRepository, task, new NullProgressMonitor());

		// --- Verify

		TaskAttribute root = taskData.getRoot();
		assertThat(root.getAttribute(TaskAttribute.TASK_URL).getValue(), is(uri.toString()));
		assertThat(root.getAttribute(TaskAttribute.SUMMARY).getValue(), is(task.getSummary()));
		assertThat(root.getAttribute(TaskAttribute.USER_REPORTER).getValue(), containsString(reporterEmail.getAddress()));
		assertThat(root.getAttribute(TaskAttribute.USER_ASSIGNED).getValue(), containsString(ownwerEmail.getAddress()));
		assertThat(root.getAttribute(TaskAttribute.DATE_MODIFICATION).getValue().length(), is(greaterThan(0)));
		assertThat(root.getAttribute(TaskAttribute.DESCRIPTION).getValue(), is(task.getDescription()));
		assertThat(root.getAttribute(TaskAttribute.STATUS).getValue(), is(state.getName()));
		assertThat(root.getAttribute(TaskAttribute.OPERATION).getValue(), is("None"));
		assertThat(root.getAttribute(TaskAttribute.PREFIX_COMMENT + 0).getTaskData().getAttributeMapper(), is(notNullValue()));
		assertThat(root.getAttribute(TaskAttribute.PREFIX_OPERATION + stateTransition.getName()).getValue(), is(stateTransition.getName()));
	}

	@Test
	public void testGetTaskData2() throws CoreException
	{
		// --- Setup

		URI uri = URI.createURI("http://localhost/junit/task");

		Task task = TaskFactory.eINSTANCE.createTask();
		Resource taskResource = new ResourceImpl(uri);
		taskResource.getContents().add(task);

		State state = StateFactory.eINSTANCE.createState();
		state.setName("State");

		TaskType taskType = TaskFactory.eINSTANCE.createTaskType();
		taskType.getStates().put(state, new BasicEList<StateTransition>());
		task.setType(taskType);
		task.setCurrentState(state);

		Person reporter = EntityFactory.eINSTANCE.createPerson();
		reporter.setFirstName("John");
		reporter.setLastName("Doh");
		Email reporterEmail = EntityFactory.eINSTANCE.createEmail();
		reporterEmail.setAddress("reporter@example.com");
		reporter.getEmails().add(reporterEmail);
		task.setCreatedBy(reporter);

		task.setSummary("Summary");
		task.setDescription("Description");
		task.setCreatedOn(new Date());

		// --- Test

		TaskData taskData = taskDataHandler.getTaskData(taskRepository, task, new NullProgressMonitor());

		// --- Verify

		TaskAttribute root = taskData.getRoot();
		assertThat(root.getAttribute(TaskAttribute.TASK_URL).getValue(), is(uri.toString()));
		assertThat(root.getAttribute(TaskAttribute.SUMMARY).getValue(), is(task.getSummary()));
		assertThat(root.getAttribute(TaskAttribute.USER_REPORTER).getValue(), containsString(reporterEmail.getAddress()));
		assertThat(root.getAttribute(TaskAttribute.USER_ASSIGNED).getValue(), is(""));
		assertThat(root.getAttribute(TaskAttribute.DATE_MODIFICATION).getValue().length(), is(greaterThan(0)));
		assertThat(root.getAttribute(TaskAttribute.DESCRIPTION).getValue(), is(task.getDescription()));
		assertThat(root.getAttribute(TaskAttribute.STATUS).getValue(), is(state.getName()));
		assertThat(root.getAttribute(TaskAttribute.OPERATION).getValue(), is("None"));
	}
}
