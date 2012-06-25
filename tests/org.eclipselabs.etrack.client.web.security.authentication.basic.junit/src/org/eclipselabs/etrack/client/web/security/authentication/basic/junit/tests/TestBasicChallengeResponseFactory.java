/**
 * 
 */

package org.eclipselabs.etrack.client.web.security.authentication.basic.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.eclipselabs.etrack.client.web.security.authentication.basic.BasicChallengeResponsseFactory;
import org.eclipselabs.etrack.domain.security.PasswordCredential;
import org.eclipselabs.etrack.domain.security.SecurityFactory;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.restlet.data.ChallengeResponse;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestBasicChallengeResponseFactory
{
	private BasicChallengeResponsseFactory basicChallengeResponsseFactory;

	@Mock
	IPasswordCredentialProvider passwordCredentialProvider;

	private PasswordCredential passwordCredential;

	private String uri;

	@Before
	public void setUp()
	{
		basicChallengeResponsseFactory = new BasicChallengeResponsseFactory();

		uri = "http://localhost/junit";
		passwordCredential = SecurityFactory.eINSTANCE.createPasswordCredential();
		passwordCredential.setId("junit");
		passwordCredential.setPassword("pass");

		when(passwordCredentialProvider.getURI()).thenReturn(uri);
		when(passwordCredentialProvider.getCredentials()).thenReturn(passwordCredential);

		basicChallengeResponsseFactory.bindPasswordCredentialProvider(passwordCredentialProvider);
	}

	@Test
	public void testCreateChallengeResponseWithCredentialProviderAndExactUri()
	{
		// --- Test

		ChallengeResponse challengeResponse = basicChallengeResponsseFactory.createChallengeResponse(uri);

		// --- Verify

		assertThat(challengeResponse.getIdentifier(), is(passwordCredential.getId()));
		assertThat(challengeResponse.getSecret(), is(passwordCredential.getPassword().toCharArray()));
	}

	@Test
	public void testCreateChallengeResponseWithCredentialProviderAndExtendedUri()
	{
		// --- Test

		ChallengeResponse challengeResponse = basicChallengeResponsseFactory.createChallengeResponse(uri + "/storage");

		// --- Verify

		assertThat(challengeResponse.getIdentifier(), is(passwordCredential.getId()));
		assertThat(challengeResponse.getSecret(), is(passwordCredential.getPassword().toCharArray()));
	}

	@Test
	public void testCreateChallengeResponseWithoutCredentialProvider()
	{
		// --- Setup

		basicChallengeResponsseFactory.unbindPasswordCredentialProvider(passwordCredentialProvider);

		// --- Test & Verify

		assertThat(basicChallengeResponsseFactory.createChallengeResponse(""), is(nullValue()));
	}
}
