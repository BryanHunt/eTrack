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

package org.eclipselabs.etrack.web.security.authentication.basic.junit.integration.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipselabs.mongo.emf.developer.junit.ServiceTestHarness;
import org.junit.Test;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

/**
 * @author bhunt
 * 
 */
public class TestBasicAuthenticationFilterProvider extends ServiceTestHarness
{
	@Test
	public void testValidCredentials() throws IOException
	{
		ClientResource client = new ClientResource("http://localhost:9999/etrack/junit");
		ChallengeResponse challengeResponse = new ChallengeResponse(ChallengeScheme.HTTP_BASIC, "junit", "junit");
		client.setChallengeResponse(challengeResponse);
		Representation representation = client.get();
		assertThat(representation.getText(), is("Hello"));
	}

	@Test
	public void testInvalidCredentials()
	{
		ClientResource client = new ClientResource("http://localhost:9999/etrack/junit");
		ChallengeResponse challengeResponse = new ChallengeResponse(ChallengeScheme.HTTP_BASIC, "junit", "");
		client.setChallengeResponse(challengeResponse);

		try
		{
			client.get();
			fail("Expected resource exception");
		}
		catch (ResourceException e)
		{
			assertThat(client.getStatus(), is(Status.CLIENT_ERROR_UNAUTHORIZED));
		}
	}
}
