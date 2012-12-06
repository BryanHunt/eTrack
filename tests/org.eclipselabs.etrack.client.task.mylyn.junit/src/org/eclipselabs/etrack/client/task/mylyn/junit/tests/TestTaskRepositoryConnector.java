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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.data.AbstractTaskDataHandler;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskAttributeMapper;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.core.data.TaskDataCollector;
import org.eclipse.mylyn.tasks.core.data.TaskMapper;
import org.eclipse.mylyn.tasks.core.sync.ISynchronizationSession;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.emf.ext.ExtFactory;
import org.eclipselabs.emf.query.Expression;
import org.eclipselabs.emf.query.QueryFactory;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.client.task.mylyn.TaskDataHandler;
import org.eclipselabs.etrack.client.task.mylyn.TaskRepositoryConnector;
import org.eclipselabs.etrack.client.task.mylyn.junit.support.TaskRepositoryConnectorTestHarness;
import org.eclipselabs.etrack.client.task.mylyn.junit.support.UnitTestHarness;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestTaskRepositoryConnector extends UnitTestHarness
{
	private TaskRepositoryConnectorTestHarness taskRepositoryConnector;

	@Mock
	TaskDataHandler taskDataHandler;

	@Before
	public void setUp() throws Exception
	{
		super.setUp();
		taskRepositoryConnector = spy(new TaskRepositoryConnectorTestHarness("junit", bundleContext, taskDataHandler));
		assertThat(taskRepositoryConnector.createRealTaskDataHandler(), is(notNullValue()));
	}

	@Test
	public void testCanCreateNewTask()
	{
		// --- Test & Verify

		assertTrue(taskRepositoryConnector.canCreateNewTask(null));
	}

	@Test
	public void testCanCreateTaskFromKey()
	{
		// --- Test & Verify

		assertFalse(taskRepositoryConnector.canCreateTaskFromKey(null));
	}

	@Test
	public void testGetClient() throws CoreException
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getClient(taskRepository), is(notNullValue()));
	}

	@Test
	public void testGetConnectorKind()
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getConnectorKind(), is(TaskRepositoryConnector.CONNECTOR_KIND));
	}

	@Test
	public void testGetLabel()
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getLabel(), is("junit"));
	}

	@Test
	public void getRepositoryUrlFromTaskUrl()
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getRepositoryUrlFromTaskUrl(""), is(nullValue()));
	}

	@Test
	public void testGetTaskMapping()
	{
		// --- Setup

		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");

		// --- Test

		TaskMapper taskMapper = taskRepositoryConnector.getTaskMapping(taskData);

		// --- Verify

		assertThat(taskMapper.getTaskData(), is(sameInstance(taskData)));
	}

	@Test
	public void testGetTaskDataHandler()
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getTaskDataHandler(), is(sameInstance((AbstractTaskDataHandler) taskDataHandler)));
	}

	@Test
	public void testTaskData() throws CoreException
	{
		// --- Setup

		String taskId = "task";
		Task task = TaskFactory.eINSTANCE.createTask();
		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", taskId);
		when(taskService.getTask(taskId)).thenReturn(task);
		when(taskDataHandler.getTaskData(eq(taskRepository), eq(task), any(IProgressMonitor.class))).thenReturn(taskData);

		// --- Test & Verify

		assertThat(taskRepositoryConnector.getTaskData(taskRepository, taskId, new NullProgressMonitor()), is(sameInstance(taskData)));
	}

	@Test
	public void testGetTaskIdFromTaskUrl()
	{
		// --- Setup

		URI uri = URI.createURI("http://localhost/junit/task");

		// --- Test & Verify

		assertThat(taskRepositoryConnector.getTaskIdFromTaskUrl(uri.toString()), is(uri.lastSegment()));
	}

	@Test
	public void testGetTaskUrl()
	{
		// --- Test & Verify

		assertThat(taskRepositoryConnector.getTaskUrl("", ""), is(nullValue()));
	}

	@Test
	public void testHasTaskChangedWithNoModificationAttribute()
	{
		// --- Setup

		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");

		// --- Test & Verify

		assertTrue(taskRepositoryConnector.hasTaskChanged(taskRepository, null, taskData));
	}

	@Test
	public void testHasTaskChangedWithNoModificationValue()
	{
		// --- Setup

		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");
		taskData.getRoot().createAttribute(TaskAttribute.DATE_MODIFICATION);

		// --- Test & Verify

		assertTrue(taskRepositoryConnector.hasTaskChanged(taskRepository, null, taskData));
	}

	@Test
	public void testHasTaskChangedWithNoModificationDate()
	{
		// --- Setup

		Date now = new Date();
		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");
		TaskAttribute attribute = taskData.getRoot().createAttribute(TaskAttribute.DATE_MODIFICATION);
		attribute.setValue(Long.toString(now.getTime()));
		ITask task = mock(ITask.class);
		when(task.getModificationDate()).thenReturn(null);

		// --- Test & Verify

		assertTrue(taskRepositoryConnector.hasTaskChanged(taskRepository, task, taskData));
	}

	@Test
	public void testHasTaskChangedWithNoChange()
	{
		// --- Setup

		Date now = new Date();
		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");
		TaskAttribute attribute = taskData.getRoot().createAttribute(TaskAttribute.DATE_MODIFICATION);
		attribute.setValue(Long.toString(now.getTime()));
		ITask task = mock(ITask.class);
		when(task.getModificationDate()).thenReturn(now);

		// --- Test & Verify

		assertFalse(taskRepositoryConnector.hasTaskChanged(taskRepository, task, taskData));
	}

	@Test
	public void testHasTaskChangedWithChange()
	{
		// --- Setup

		Date now = new Date();
		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");
		TaskAttribute attribute = taskData.getRoot().createAttribute(TaskAttribute.DATE_MODIFICATION);
		attribute.setValue(Long.toString(now.getTime()));
		ITask task = mock(ITask.class);
		when(task.getModificationDate()).thenReturn(new Date(now.getTime() + 1));

		// --- Test & Verify

		assertTrue(taskRepositoryConnector.hasTaskChanged(taskRepository, task, taskData));
	}

	@Test
	public void testPreSynchronizationWithoutTasks() throws CoreException
	{
		// --- Setup

		ISynchronizationSession session = mock(ISynchronizationSession.class);
		HashSet<ITask> tasks = new HashSet<ITask>();
		when(session.getTasks()).thenReturn(tasks);

		// --- Test & Verify

		taskRepositoryConnector.preSynchronization(session, new NullProgressMonitor());
	}

	@Test
	public void testPreSynchronizationWithTasks() throws CoreException
	{
		// --- Setup

		ISynchronizationSession session = mock(ISynchronizationSession.class);
		HashSet<ITask> tasks = new HashSet<ITask>();
		when(session.getTasks()).thenReturn(tasks);

		ITask task1 = mock(ITask.class);
		ITask task2 = mock(ITask.class);

		tasks.add(task1);
		tasks.add(task2);

		// --- Test

		taskRepositoryConnector.preSynchronization(session, new NullProgressMonitor());

		// --- Verify

		verify(session).markStale(task1);
		verify(session).markStale(task2);
	}

	@Test
	public void testPerformQuery() throws CoreException
	{
		// --- Setup

		TaskDataCollector collector = mock(TaskDataCollector.class);
		ISynchronizationSession session = mock(ISynchronizationSession.class);

		ECollection eCollection = ExtFactory.eINSTANCE.createECollection();
		IRepositoryQuery query = mock(IRepositoryQuery.class);
		Expression expression = QueryFactory.eINSTANCE.createBinaryOperation();
		when(queryFactory.createExpression(any(MylynTaskClient.class), eq(query))).thenReturn(expression);
		when(taskService.getTasks(expression)).thenReturn(eCollection);

		Task task1 = TaskFactory.eINSTANCE.createTask();
		Task task2 = TaskFactory.eINSTANCE.createTask();

		eCollection.getValues().add(task1);
		eCollection.getValues().add(task2);

		// --- Test

		IStatus status = taskRepositoryConnector.performQuery(taskRepository, query, collector, session, new NullProgressMonitor());

		// --- Verify

		assertTrue(status.isOK());
		verify(collector, times(2)).accept(any(TaskData.class));
	}

	@Test
	public void testPerformQueryWithException1() throws CoreException
	{
		// --- Setup

		TaskDataCollector collector = mock(TaskDataCollector.class);
		ISynchronizationSession session = mock(ISynchronizationSession.class);

		ECollection eCollection = ExtFactory.eINSTANCE.createECollection();
		IRepositoryQuery query = mock(IRepositoryQuery.class);
		Expression expression = QueryFactory.eINSTANCE.createBinaryOperation();
		when(queryFactory.createExpression(any(MylynTaskClient.class), eq(query))).thenReturn(expression);
		when(taskService.getTasks(expression)).thenReturn(eCollection);
		when(taskDataHandler.getTaskData(eq(taskRepository), any(Task.class), any(IProgressMonitor.class))).thenThrow(new CoreException(new Status(IStatus.ERROR, "id", "message")));

		Task task1 = TaskFactory.eINSTANCE.createTask();
		Task task2 = TaskFactory.eINSTANCE.createTask();

		eCollection.getValues().add(task1);
		eCollection.getValues().add(task2);

		// --- Test

		IStatus status = taskRepositoryConnector.performQuery(taskRepository, query, collector, session, new NullProgressMonitor());

		// --- Verify

		assertFalse(status.isOK());
		verify(collector, never()).accept(any(TaskData.class));
	}

	@Test
	public void testPerformQueryWithException2() throws CoreException
	{
		// --- Setup

		TaskDataCollector collector = mock(TaskDataCollector.class);
		ISynchronizationSession session = mock(ISynchronizationSession.class);
		IRepositoryQuery query = mock(IRepositoryQuery.class);

		IStatus expectedStatus = new Status(IStatus.ERROR, "id", "message");
		doThrow(new CoreException(expectedStatus)).when(taskRepositoryConnector).getClient(taskRepository);

		// --- Test

		IStatus status = taskRepositoryConnector.performQuery(taskRepository, query, collector, session, new NullProgressMonitor());

		// --- Verify

		assertThat(status, is(sameInstance(expectedStatus)));
		verify(collector, never()).accept(any(TaskData.class));
	}

	@Test
	public void testUpdateTaskFromTaskData()
	{
		// --- Setup

		ITask task = mock(ITask.class);
		TaskData taskData = new TaskData(new TaskAttributeMapper(taskRepository), "", "", "");
		TaskMapper taskMapper = mock(TaskMapper.class);
		doReturn(taskMapper).when(taskRepositoryConnector).getTaskMapping(taskData);

		// --- Test

		taskRepositoryConnector.updateTaskFromTaskData(taskRepository, task, taskData);

		// --- Verify

		verify(taskMapper).applyTo(task);
	}

	@Test
	public void testUpdateRepositoryConfiguration() throws CoreException
	{
		// --- Test & Verify

		taskRepositoryConnector.updateRepositoryConfiguration(taskRepository, new NullProgressMonitor());
	}
}
