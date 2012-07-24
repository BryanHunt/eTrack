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

package org.eclipselabs.etrack.client.web.junit.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.eclipselabs.etrack.client.web.services.ClientResourceFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestClientResourceFactoryWithChallengeResponse
{
	private String uri;
	private ClientResourceFactory clientResourceFactory;
	private ChallengeResponse challengeResponse;

	@Mock
	private IChallengeResponseFactory challengeResponseFactory;

	@Before
	public void setUp()
	{
		uri = "http://localhost/junit/";

		clientResourceFactory = new ClientResourceFactory();
		clientResourceFactory.bindChallengeResponseFactory(challengeResponseFactory);

		challengeResponse = new ChallengeResponse(ChallengeScheme.HTTP_BASIC);
		when(challengeResponseFactory.createChallengeResponse(uri)).thenReturn(challengeResponse);
	}

	@Test
	public void testCreateClientResourceWithUri()
	{
		// --- Test

		ClientResource clientResource = clientResourceFactory.createClientResource(uri);

		// ---Verify

		assertThat(clientResource.getReference().toString(), is(uri));
		assertThat(clientResource.getChallengeResponse(), is(sameInstance(challengeResponse)));
	}

	@Test
	public void testCreateClientResourceWithUriAndPath()
	{
		// --- Setup

		String path = "storage";

		// --- Test

		ClientResource clientResource = clientResourceFactory.createClientResource(uri, path);

		// --- Verify

		assertThat(clientResource.getReference().toString(), is(uri + path));
		assertThat(clientResource.getChallengeResponse(), is(sameInstance(challengeResponse)));
	}

	@Test
	public void testUnbindChallengeResponseFactory()
	{
		// --- Test

		clientResourceFactory.unbindChallengeResponseFactory(challengeResponseFactory);

		// --- Verify

		assertThat(clientResourceFactory.createClientResource(uri).getChallengeResponse(), is(nullValue()));
	}
}
