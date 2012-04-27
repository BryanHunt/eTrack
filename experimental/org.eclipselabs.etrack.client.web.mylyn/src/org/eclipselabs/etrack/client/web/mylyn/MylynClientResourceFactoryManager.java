/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.client.web.mylyn;

import java.util.HashMap;

import org.eclipse.mylyn.tasks.core.IRepositoryListener;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;

/**
 * @author bhunt
 * 
 */
public class MylynClientResourceFactoryManager implements IRepositoryListener
{
	public MylynClientResourceFactoryManager()
	{
		factories = new HashMap<String, MylynClientResourceFactory>();
		TasksUi.getRepositoryManager().addListener(this);
	}

	@Override
	public synchronized void repositoryAdded(TaskRepository repository)
	{
		MylynClientResourceFactory factory = MylynClientResourceFactory.buildFactory(repository);
		factory.setChallengeResponseFactory(challengeResponseFactory);
		factories.put(repository.getRepositoryUrl(), factory);
	}

	@Override
	public void repositoryRemoved(TaskRepository repository)
	{
		factories.get(repository.getRepositoryUrl()).dispose();
	}

	@Override
	public void repositorySettingsChanged(TaskRepository repository)
	{}

	@Override
	public void repositoryUrlChanged(TaskRepository repository, String oldUrl)
	{
		factories.get(oldUrl).dispose();
		repositoryAdded(repository);
	}

	synchronized void bindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		this.challengeResponseFactory = challengeResponseFactory;

		for (MylynClientResourceFactory factory : factories.values())
			factory.setChallengeResponseFactory(challengeResponseFactory);
	}

	synchronized void unbindChallengeResponseFactory(IChallengeResponseFactory challengeResponseFactory)
	{
		if (this.challengeResponseFactory == challengeResponseFactory)
			bindChallengeResponseFactory(null);
	}

	private volatile IChallengeResponseFactory challengeResponseFactory;
	private HashMap<String, MylynClientResourceFactory> factories;
}
