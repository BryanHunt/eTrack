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

import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.entity.IEntityService;
import org.eclipselabs.etrack.client.task.ITaskService;
import org.eclipselabs.etrack.client.task.mylyn.IQueryFactory;
import org.junit.Before;
import org.mockito.Mock;
import org.osgi.framework.ServiceReference;

/**
 * @author bhunt
 * 
 */
public class UnitTestHarness
{
	protected BundleContextTestHarness bundleContext;
	protected TaskRepository taskRepository;

	@Mock
	protected ITaskService taskService;
	@Mock
	protected IEntityService entityService;
	@Mock
	protected IQueryFactory queryFactory;
	@Mock
	protected ServiceReference<ITaskService> taskServiceRegistration;
	@Mock
	protected ServiceReference<IEntityService> entitiServiceRegistration;
	@Mock
	protected ServiceReference<IQueryFactory> queryFactoryRegistration;

	@Before
	public void setUp() throws Exception
	{
		bundleContext = new BundleContextTestHarness("(uri=http://localhost/junit)", taskServiceRegistration, entitiServiceRegistration, queryFactoryRegistration, taskService, entityService, queryFactory);
		taskRepository = new TaskRepository("junit", "http://localhost/junit");
	}
}
