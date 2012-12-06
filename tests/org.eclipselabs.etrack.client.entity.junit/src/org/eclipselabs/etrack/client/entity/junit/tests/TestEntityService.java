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

package org.eclipselabs.etrack.client.entity.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.ext.ResourceCacheImpl;
import org.eclipselabs.emf.ext.ResourceSetFactory;
import org.eclipselabs.etrack.client.core.ServerResourceClient;
import org.eclipselabs.etrack.client.entity.services.EntityService;
import org.eclipselabs.etrack.domain.entity.EntityFactory;
import org.eclipselabs.etrack.domain.entity.Organization;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.security.PasswordCredential;
import org.eclipselabs.etrack.domain.security.SecurityFactory;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestEntityService
{
	private EntityService entityService;
	private URI baseURI;
	private String[] entityPath;

	@Mock
	private IPasswordCredentialProvider passwordCredentialProvider;
	@Mock
	private ResourceSetFactory resourceSetFactory;
	@Spy
	private ResourceSetImpl resourceSet;

	@Before
	public void setUp()
	{
		baseURI = URI.createURI("http://localhost:9999/junit");
		entityPath = new String[] { "storage", "entities", "" };
		entityService = new EntityService();

		when(resourceSetFactory.createResourceSet()).thenReturn(resourceSet);

		ResourceCacheImpl resourceCache = new ResourceCacheImpl();
		resourceCache.bindResourceSetFactory(resourceSetFactory);
		entityService.bindResourceCache(resourceCache);

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put(ServerResourceClient.PROP_URI, baseURI.toString());
		properties.put(EntityService.PROP_ENTITY_PATH, entityPath);

		entityService.configure(properties);
	}

	@Test
	public void testGetEntityWithBadId()
	{
		// --- Setup

		String entityId = "entity";

		URI entityCollectionURI = baseURI.appendSegments(entityPath);
		URI entityURI = entityCollectionURI.trimSegments(1).appendSegment(entityId);

		Resource resource = spy(new ResourceImpl(entityURI));
		doReturn(resource).when(resourceSet).getResource(eq(entityURI), eq(true));

		// --- Test & Verify

		assertThat(entityService.getEntity(entityId), is(nullValue()));
	}

	@Test
	public void testGetEntityWithGoodId()
	{
		// --- Setup

		String entityId = "entity";

		URI entityCollectionURI = baseURI.appendSegments(entityPath);
		URI entityURI = entityCollectionURI.trimSegments(1).appendSegment(entityId);

		Person person = EntityFactory.eINSTANCE.createPerson();

		Resource resource = spy(new ResourceImpl(entityURI));
		resource.getContents().add(person);
		doReturn(resource).when(resourceSet).getResource(eq(entityURI), eq(true));

		// --- Test & Verify

		assertThat((Person) entityService.getEntity(entityId), is(sameInstance(person)));
	}

	@Test
	public void testGetCurrentUserWithoutCredentialProvider()
	{
		// --- Setup

		PasswordCredential passwordCredential = SecurityFactory.eINSTANCE.createPasswordCredential();
		passwordCredential.setId("junit");

		when(passwordCredentialProvider.getURI()).thenReturn(baseURI.trimSegments(1).toString());
		when(passwordCredentialProvider.getCredentials()).thenReturn(passwordCredential);
		entityService.bindPasswordCredentialProvider(passwordCredentialProvider);

		// --- Test & Verify

		assertThat(entityService.getCurrentUser(), is(nullValue()));
	}

	@Test
	public void testGetCurrentUserWithCredentialProvider()
	{
		// --- Setup

		String entityId = "junit";

		URI entityCollectionURI = baseURI.appendSegments(entityPath);
		URI entityURI = entityCollectionURI.trimSegments(1).appendSegment(entityId);

		PasswordCredential passwordCredential = SecurityFactory.eINSTANCE.createPasswordCredential();
		passwordCredential.setId(entityId);

		when(passwordCredentialProvider.getURI()).thenReturn(baseURI.toString());
		when(passwordCredentialProvider.getCredentials()).thenReturn(passwordCredential);
		entityService.bindPasswordCredentialProvider(passwordCredentialProvider);

		Person person = EntityFactory.eINSTANCE.createPerson();

		Resource resource = spy(new ResourceImpl(entityURI));
		resource.getContents().add(person);
		doReturn(resource).when(resourceSet).getResource(eq(entityURI), eq(true));

		// --- Test & Verify

		assertThat(entityService.getCurrentUser(), is(sameInstance(person)));
	}

	@Test
	public void testGetCurrentUserAsOrganization()
	{
		// --- Setup

		String entityId = "junit";

		URI entityCollectionURI = baseURI.appendSegments(entityPath);
		URI entityURI = entityCollectionURI.trimSegments(1).appendSegment(entityId);

		PasswordCredential passwordCredential = SecurityFactory.eINSTANCE.createPasswordCredential();
		passwordCredential.setId(entityId);

		when(passwordCredentialProvider.getURI()).thenReturn(baseURI.toString());
		when(passwordCredentialProvider.getCredentials()).thenReturn(passwordCredential);
		entityService.bindPasswordCredentialProvider(passwordCredentialProvider);

		Organization organization = EntityFactory.eINSTANCE.createOrganization();

		Resource resource = spy(new ResourceImpl(entityURI));
		resource.getContents().add(organization);
		doReturn(resource).when(resourceSet).getResource(eq(entityURI), eq(true));

		// --- Test & Verify

		assertThat(entityService.getCurrentUser(), is(nullValue()));
	}
}
