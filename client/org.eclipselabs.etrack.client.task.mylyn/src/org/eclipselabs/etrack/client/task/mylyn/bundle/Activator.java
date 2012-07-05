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

package org.eclipselabs.etrack.client.task.mylyn.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author bhunt
 * 
 */
public class Activator implements BundleActivator
{
	private static BundleContext bundleContext;

	public static BundleContext getBundleContext()
	{
		return bundleContext;
	}

	@Override
	public void start(BundleContext context) throws Exception
	{
		bundleContext = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		bundleContext = null;
	}
}
