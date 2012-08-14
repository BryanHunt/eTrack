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

package org.eclipselabs.etrack.client.web.mylyn;

import org.eclipse.mylyn.commons.net.AuthenticationCredentials;
import org.eclipse.mylyn.commons.net.AuthenticationType;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.domain.security.PasswordCredential;
import org.eclipselabs.etrack.domain.security.SecurityFactory;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.eclipselabs.etrack.util.security.IServerConnection;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProvider implements IPasswordCredentialProvider
{
	public MylynPasswordCredentialProvider(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}

	public void dispose()
	{
		providerRegistration.unregister();
		connectionRegistration.unregister();
	}

	@Override
	public String getName()
	{
		return taskRepository.getRepositoryLabel();
	}

	@Override
	public String getURI()
	{
		return taskRepository.getRepositoryUrl();
	}

	@Override
	public PasswordCredential getCredentials()
	{
		PasswordCredential credentials = SecurityFactory.eINSTANCE.createPasswordCredential();
		AuthenticationCredentials authenticationCredentials = taskRepository.getCredentials(AuthenticationType.REPOSITORY);
		credentials.setId(authenticationCredentials.getUserName());
		credentials.setPassword(authenticationCredentials.getPassword());
		return credentials;
	}

	protected void setRegistrations(ServiceRegistration<IPasswordCredentialProvider> providerRegistration, ServiceRegistration<IServerConnection> connectionRegistration)
	{
		this.providerRegistration = providerRegistration;
		this.connectionRegistration = connectionRegistration;
	}

	private TaskRepository taskRepository;
	private ServiceRegistration<IPasswordCredentialProvider> providerRegistration;
	private ServiceRegistration<IServerConnection> connectionRegistration;
}
