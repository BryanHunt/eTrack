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

package org.eclipselabs.etrack.client.task.mylyn.junit.support;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.task.mylyn.MylynTaskClient;
import org.eclipselabs.etrack.client.task.mylyn.TaskDataHandler;
import org.eclipselabs.etrack.client.task.mylyn.TaskRepositoryConnector;
import org.osgi.framework.BundleContext;

/**
 * @author bhunt
 * 
 */
public class TaskRepositoryConnectorTestHarness extends TaskRepositoryConnector
{
	private BundleContext bundleContext;
	private TaskDataHandler taskDataHandler;

	public TaskRepositoryConnectorTestHarness(String label, BundleContext bundleContext, TaskDataHandler taskDataHandler)
	{
		super(label);
		this.bundleContext = bundleContext;
		this.taskDataHandler = taskDataHandler;
	}

	public TaskDataHandler createRealTaskDataHandler()
	{
		return super.createTaskDataHandler();
	}

	@Override
	protected MylynTaskClient createClient(TaskRepository repository) throws CoreException
	{
		return new MylynTaskClientTestHarness(repository, bundleContext);
	}

	@Override
	protected TaskDataHandler createTaskDataHandler()
	{
		return taskDataHandler;
	}
}
