/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.client.web.mylyn;

import java.util.HashMap;

import org.eclipse.mylyn.tasks.core.IRepositoryListener;
import org.eclipse.mylyn.tasks.core.IRepositoryManager;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipse.ui.PlatformUI;

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
				providers.put(repository.getRepositoryUrl(), MylynPasswordCredentialProvider.buildProvider(repository));
		}
	}

	@Override
	public void repositoryRemoved(TaskRepository repository)
	{
		synchronized (providers)
		{
			providers.get(repository.getRepositoryUrl()).dispose();
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

	private HashMap<String, MylynPasswordCredentialProvider> providers;
}
