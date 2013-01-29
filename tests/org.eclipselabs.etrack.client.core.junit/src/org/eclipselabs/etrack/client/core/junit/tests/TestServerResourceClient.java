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

package org.eclipselabs.etrack.client.core.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emf.ext.ExtFactory;
import org.eclipselabs.emf.ext.ResourceCache;
import org.eclipselabs.etrack.client.core.ServerClient;
import org.eclipselabs.etrack.client.core.junit.support.ServerResourceClientTestHarness;
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
public class TestServerResourceClient
{
	private URI baseURI;
	private ServerResourceClientTestHarness serverResourceClient;

	@Spy
	private ResourceSetImpl resourceSet;
	@Mock
	private ResourceCache resourceCache;

	@Before
	public void setUp()
	{
		baseURI = URI.createURI("http://localhost/junit");
		serverResourceClient = new ServerResourceClientTestHarness();
		serverResourceClient.bindResourceCache(resourceCache);

		HashMap<String, Object> properties = new HashMap<String, Object>(1);
		properties.put(ServerClient.PROP_URI, baseURI.toString());
		serverResourceClient.configure(properties);

		when(resourceCache.getResourceSet()).thenReturn(resourceSet);
	}

	@Test
	public void testGetResourceSet()
	{
		// --- Test & Verify

		assertThat(serverResourceClient.getResourceSet(), is(sameInstance((ResourceSet) resourceSet)));
	}

	@Test
	public void testAddObject() throws IOException
	{
		// --- Setup

		String[] path = { "db", "collection", "" };
		URI targetURI = baseURI.appendSegments(path);

		Resource resource = spy(new ResourceImpl(targetURI));
		doNothing().when(resource).save(anyMap());
		doReturn(resource).when(resourceSet).createResource(targetURI);

		EObject eObject = ExtFactory.eINSTANCE.createEReferenceCollection();

		// --- Test

		URI uri = serverResourceClient.addObject(eObject, path);

		// --- Verify

		assertThat(uri, is(targetURI));
		assertThat(resource.getContents().get(0), is(sameInstance(eObject)));
		verify(resource).save(anyMap());
	}
}
