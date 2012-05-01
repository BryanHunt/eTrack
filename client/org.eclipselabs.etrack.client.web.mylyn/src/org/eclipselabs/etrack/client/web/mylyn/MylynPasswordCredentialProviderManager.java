/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.client.web.mylyn;

import java.util.HashMap;

import org.eclipse.mylyn.tasks.core.IRepositoryListener;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.TasksUi;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProviderManager implements IRepositoryListener
{
	public MylynPasswordCredentialProviderManager()
	{
		providers = new HashMap<String, MylynPasswordCredentialProvider>();
		TasksUi.getRepositoryManager().addListener(this);
	}

	@Override
	public void repositoryAdded(TaskRepository repository)
	{
		providers.put(repository.getRepositoryUrl(), MylynPasswordCredentialProvider.buildProvider(repository));
	}

	@Override
	public void repositoryRemoved(TaskRepository repository)
	{
		providers.get(repository.getRepositoryUrl()).dispose();
	}

	@Override
	public void repositorySettingsChanged(TaskRepository repository)
	{}

	@Override
	public void repositoryUrlChanged(TaskRepository repository, String oldUrl)
	{
		providers.remove(oldUrl).dispose();
		repositoryAdded(repository);
	}

	private HashMap<String, MylynPasswordCredentialProvider> providers;
}
