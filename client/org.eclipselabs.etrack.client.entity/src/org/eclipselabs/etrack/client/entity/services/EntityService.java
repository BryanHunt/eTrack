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

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
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

	@Override
	public void configure(Map<String, Object> properties)
	{
		entityCollectionPath = (String[]) properties.get(PROP_ENTITY_PATH);

		entityBasePath = new String[entityCollectionPath.length - 1];
		System.arraycopy(entityCollectionPath, 0, entityBasePath, 0, entityBasePath.length);
		super.configure(properties);
	}

	@Override
	public Person getCurrentUser()
	{
		IPasswordCredentialProvider credentialProvider = passwordCredentialProvider;

		if (credentialProvider == null)
			return null;

		Entity entity = getEntity(credentialProvider.getCredentials().getId());
		return entity instanceof Person ? (Person) entity : null;
	}

	@Override
	public Entity getEntity(String id)
	{
		Resource resource = getResourceSet().getResource(getBaseURI().appendSegments(entityBasePath).appendSegment(id), true);
		return resource.getContents().isEmpty() ? null : (Entity) resource.getContents().get(0);
	}

	public void bindPasswordCredentialProvider(IPasswordCredentialProvider passwordCredentialProvider)
	{
		if (passwordCredentialProvider.getURI().equals(getBaseURI().toString()))
			this.passwordCredentialProvider = passwordCredentialProvider;
	}
}
