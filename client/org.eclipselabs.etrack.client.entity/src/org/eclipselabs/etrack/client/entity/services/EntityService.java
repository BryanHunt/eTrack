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

package org.eclipselabs.etrack.client.entity.services;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.entity.IEntityService;
import org.eclipselabs.etrack.domain.entity.Entity;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;

/**
 * @author bhunt
 * 
 */
public class EntityService extends ServerResourceClient implements IEntityService
{
	public static final String PROP_ENTITY_PATH = "entity_path";
	private String[] entityBasePath;
	private String[] entityCollectionPath;
	private volatile IPasswordCredentialProvider passwordCredentialProvider;
	private Set<IPasswordCredentialProvider> passwordCredentialProviders = new HashSet<IPasswordCredentialProvider>();

	@Override
	public synchronized void configure(Map<String, Object> properties)
	{
		entityBasePath = (String[]) properties.get(PROP_ENTITY_PATH);

		entityCollectionPath = new String[entityBasePath.length + 1];
		System.arraycopy(entityBasePath, 0, entityCollectionPath, 0, entityBasePath.length);
		entityCollectionPath[entityBasePath.length] = "";
		super.configure(properties);

		for (IPasswordCredentialProvider passwordCredentialProvider : passwordCredentialProviders)
		{
			if (passwordCredentialProvider.getURI().equals(getBaseURI().toString()))
				this.passwordCredentialProvider = passwordCredentialProvider;
		}

		passwordCredentialProviders = null;
	}

	@Override
	public Person getCurrentUser()
	{
		IPasswordCredentialProvider credentialProvider = passwordCredentialProvider;

		if (credentialProvider == null)
			return null;

		String id = credentialProvider.getCredentials().getId();
		id = id.substring(0, id.indexOf('@'));
		Resource resource = getResourceSet().getResource(getBaseURI().appendSegments(entityBasePath).appendSegment("").appendQuery(id), true);

		if (resource.getContents().isEmpty())
			return null;

		ECollection eCollection = (ECollection) resource.getContents().get(0);

		if (eCollection.getValues().isEmpty())
			return null;

		return (Person) eCollection.getValues().get(0);
	}

	@Override
	public Entity getEntity(String id)
	{
		Resource resource = getResourceSet().getResource(getBaseURI().appendSegments(entityBasePath).appendSegment(id), true);
		return resource.getContents().isEmpty() ? null : (Entity) resource.getContents().get(0);
	}

	public synchronized void bindPasswordCredentialProvider(IPasswordCredentialProvider passwordCredentialProvider)
	{
		if (passwordCredentialProviders != null)
			passwordCredentialProviders.add(passwordCredentialProvider);
		else if (passwordCredentialProvider.getURI().equals(getBaseURI().toString()))
			this.passwordCredentialProvider = passwordCredentialProvider;
	}
}
