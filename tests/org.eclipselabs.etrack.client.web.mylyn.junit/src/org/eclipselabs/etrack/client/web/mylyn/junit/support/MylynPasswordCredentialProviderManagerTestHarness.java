/*******************************************************************************
 * Copyright (c) 2012 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.client.web.mylyn.junit.support;

import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.web.mylyn.MylynPasswordCredentialProvider;
import org.eclipselabs.etrack.client.web.mylyn.MylynPasswordCredentialProviderManager;
import org.osgi.framework.BundleContext;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProviderManagerTestHarness extends MylynPasswordCredentialProviderManager
{
	private BundleContext bundleContext;

	public MylynPasswordCredentialProviderManagerTestHarness(BundleContext bundleContext)
	{
		this.bundleContext = bundleContext;
	}

	@Override
	public MylynPasswordCredentialProvider createMylynPasswordCredentialProvider(TaskRepository repository)
	{
		return super.createMylynPasswordCredentialProvider(repository);
	}

	public MylynPasswordCredentialProvider createRealMylynPasswordCredentialProvider(TaskRepository repository)
	{
		return super.createMylynPasswordCredentialProvider(repository);
	}

	@Override
	protected BundleContext getBundleContext()
	{
		return bundleContext;
	}

	public BundleContext getRealBundleContext()
	{
		return super.getBundleContext();
	}
}
