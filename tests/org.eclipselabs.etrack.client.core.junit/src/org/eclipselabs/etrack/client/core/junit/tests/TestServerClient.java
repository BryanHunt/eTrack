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
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipselabs.etrack.client.core.ServerClient;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bhunt
 * 
 */
public class TestServerClient
{
	private ServerClient serverClient;

	@Before
	public void setUp()
	{
		serverClient = new ServerClient();
	}

	@Test
	public void testConfigure()
	{
		// --- Setup

		URI uri = URI.createURI("http://localhost/junit");

		HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put(ServerClient.PROP_URI, uri.toString());

		// --- Test

		serverClient.configure(properties);

		// --- Verify

		assertThat(serverClient.getBaseURI(), is(uri));
	}
}
