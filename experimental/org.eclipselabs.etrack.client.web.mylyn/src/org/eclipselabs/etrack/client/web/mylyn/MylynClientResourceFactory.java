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

import java.util.Hashtable;

import org.eclipse.mylyn.commons.net.AuthenticationCredentials;
import org.eclipse.mylyn.commons.net.AuthenticationType;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.eclipselabs.etrack.client.web.IClientResourceFactory;
import org.osgi.framework.ServiceRegistration;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
public class MylynClientResourceFactory implements IClientResourceFactory
{
	public static MylynClientResourceFactory buildFactory(TaskRepository taskRepository)
	{
		MylynClientResourceFactory factory = new MylynClientResourceFactory(taskRepository);

		Hashtable<String, Object> properties = new Hashtable<String, Object>(1);
		properties.put("uri", taskRepository.getRepositoryUrl());

		factory.setClientResourceFactoryRegistration(Activator.getBundleContext().registerService(IClientResourceFactory.class, factory, properties));

		return factory;
	}

	@Override
	public ClientResource createClientResource(String path)
	{
		ClientResource clientResource = new ClientResource(taskRepository.getUrl() + path);
		IChallengeResponseFactory factory = challengeResponseFactory;

		if (factory != null)
		{
			AuthenticationCredentials credentials = taskRepository.getCredentials(AuthenticationType.REPOSITORY);
			clientResource.setChallengeResponse(factory.createChallengeResponse(credentials.getUserName(), credentials.getPassword()));
		}

		return clientResource;
	}

	public void dispose()
	{
		clientResourceFactoryRegistration.unregister();
	}

	public void setChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		this.challengeResponseFactory = challengeResponseFactory;
	}

	private MylynClientResourceFactory(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}

	private void setClientResourceFactoryRegistration(ServiceRegistration<IClientResourceFactory> serviceRegistration)
	{
		clientResourceFactoryRegistration = serviceRegistration;
	}

	private TaskRepository taskRepository;
	private volatile IChallengeResponseFactory challengeResponseFactory;
	private ServiceRegistration<IClientResourceFactory> clientResourceFactoryRegistration;
}
