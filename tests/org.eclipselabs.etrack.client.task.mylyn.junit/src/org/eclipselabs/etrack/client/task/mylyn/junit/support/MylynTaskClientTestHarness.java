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
import org.osgi.framework.BundleContext;

/**
 * @author bhunt
 * 
 */
public class MylynTaskClientTestHarness extends MylynTaskClient
{
	private BundleContext bundleContext;

	public MylynTaskClientTestHarness(TaskRepository taskRepository, BundleContext bundleContext) throws CoreException
	{
		this.bundleContext = bundleContext;
		init(taskRepository);
	}

	public BundleContext getRealBundleContext()
	{
		return super.getBundleContext();
	}

	@Override
	protected BundleContext getBundleContext()
	{
		return bundleContext;
	}
}
