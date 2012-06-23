/**
 * 
 */

package org.eclipselabs.etrack.client.web.junit.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipselabs.etrack.client.web.services.ClientResourceFactory;
import org.junit.Before;
import org.junit.Test;
import org.restlet.resource.ClientResource;

/**
 * @author bhunt
 * 
 */
public class TestClientResourceFactoryWithoutChallengeResponse
{
	private ClientResourceFactory clientResourceFactory;

	@Before
	public void setUp()
	{
		clientResourceFactory = new ClientResourceFactory();
	}

	@Test
	public void testCreateClientResourceWithUri()
	{
		// --- Setup

		String uri = "http://localhost/junit/";

		// --- Test

		ClientResource clientResource = clientResourceFactory.createClientResource(uri);

		// ---Verify

		assertThat(clientResource.getReference().toString(), is(uri));
	}

	@Test
	public void testCreateClientResourceWithUriAndPath()
	{
		// --- Setup

		String uri = "http://localhost/junit/";
		String path = "storage";

		// --- Test

		ClientResource clientResource = clientResourceFactory.createClientResource(uri, path);

		// ---Verify

		assertThat(clientResource.getReference().toString(), is(uri + path));
	}
}
