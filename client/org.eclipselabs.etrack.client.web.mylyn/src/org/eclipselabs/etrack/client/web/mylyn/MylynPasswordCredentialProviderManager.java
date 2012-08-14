/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.client.web.mylyn;

import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.mylyn.tasks.core.IRepositoryListener;
import org.eclipse.mylyn.tasks.core.IRepositoryManager;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.eclipselabs.etrack.util.security.IServerConnection;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProviderManager implements IRepositoryListener
{
	public MylynPasswordCredentialProviderManager()
	{
		providers = new HashMap<String, MylynPasswordCredentialProvider>();

		new Thread()
		{
			@Override
			public void run()
			{
				while (!PlatformUI.isWorkbenchRunning())
				{
					try
					{
						sleep(1000);
					}
					catch (InterruptedException e)
					{}
				}

				synchronized (providers)
				{
					IRepositoryManager repositoryManager = TasksUi.getRepositoryManager();
					repositoryManager.addListener(MylynPasswordCredentialProviderManager.this);

					for (TaskRepository repository : repositoryManager.getAllRepositories())
						repositoryAdded(repository);
				}
			}
		}.start();
	}

	@Override
	public void repositoryAdded(TaskRepository repository)
	{
		synchronized (providers)
		{
			if (!providers.containsKey(repository.getRepositoryUrl()))
			{
				MylynPasswordCredentialProvider provider = createMylynPasswordCredentialProvider(repository);
				Hashtable<String, Object> properties = new Hashtable<String, Object>();
				properties.put("type", repository.getConnectorKind());

				ServiceRegistration<IPasswordCredentialProvider> providerRegistration = getBundleContext().registerService(IPasswordCredentialProvider.class, provider, properties);
				ServiceRegistration<IServerConnection> connectionRegistration = getBundleContext().registerService(IServerConnection.class, provider, properties);
				provider.setRegistrations(providerRegistration, connectionRegistration);

				providers.put(repository.getRepositoryUrl(), provider);
			}
		}
	}

	@Override
	public void repositoryRemoved(TaskRepository repository)
	{
		synchronized (providers)
		{
			providers.remove(repository.getRepositoryUrl()).dispose();
		}
	}

	@Override
	public void repositorySettingsChanged(TaskRepository repository)
	{}

	@Override
	public void repositoryUrlChanged(TaskRepository repository, String oldUrl)
	{
		synchronized (providers)
		{
			providers.remove(oldUrl).dispose();
			repositoryAdded(repository);
		}
	}

	protected BundleContext getBundleContext()
	{
		return Activator.getBundleContext();
	}

	protected MylynPasswordCredentialProvider createMylynPasswordCredentialProvider(TaskRepository repository)
	{
		return new MylynPasswordCredentialProvider(repository);
	}

	private HashMap<String, MylynPasswordCredentialProvider> providers;
}
