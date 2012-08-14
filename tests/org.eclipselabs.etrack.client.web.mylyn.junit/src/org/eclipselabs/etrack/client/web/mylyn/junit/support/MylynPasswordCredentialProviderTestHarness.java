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
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.eclipselabs.etrack.util.security.IServerConnection;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProviderTestHarness extends MylynPasswordCredentialProvider
{
	public MylynPasswordCredentialProviderTestHarness(TaskRepository taskRepository)
	{
		super(taskRepository);
	}

	@Override
	public void setRegistrations(ServiceRegistration<IPasswordCredentialProvider> providerRegistration, ServiceRegistration<IServerConnection> connectionRegistration)
	{
		super.setRegistrations(providerRegistration, connectionRegistration);
	}
}
