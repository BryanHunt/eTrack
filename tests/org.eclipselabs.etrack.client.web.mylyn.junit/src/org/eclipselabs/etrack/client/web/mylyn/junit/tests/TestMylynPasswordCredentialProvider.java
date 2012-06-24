/**
 * 
 */

package org.eclipselabs.etrack.client.web.mylyn.junit.tests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.eclipse.mylyn.commons.net.AuthenticationCredentials;
import org.eclipse.mylyn.commons.net.AuthenticationType;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.web.mylyn.junit.support.MylynPasswordCredentialProviderTestHarness;
import org.eclipselabs.etrack.domain.security.PasswordCredential;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class TestMylynPasswordCredentialProvider
{
	private static final String REPOSITORY_LABEL = "JUnit";
	private static final String REPOSITORY_URL = "http://localhost/junit";

	private MylynPasswordCredentialProviderTestHarness mylynPasswordCredentialProvider;

	private TaskRepository taskRepository;
	private AuthenticationCredentials credentials;

	@Before
	public void setUp()
	{
		taskRepository = new TaskRepository("junit", REPOSITORY_URL);
		taskRepository.setRepositoryLabel(REPOSITORY_LABEL);

		credentials = new AuthenticationCredentials("junit", "pass");
		taskRepository.setCredentials(AuthenticationType.REPOSITORY, credentials, false);
		mylynPasswordCredentialProvider = new MylynPasswordCredentialProviderTestHarness(taskRepository);
	}

	@Test
	public void testGetName()
	{
		// --- Test & Verify

		assertThat(mylynPasswordCredentialProvider.getName(), is(REPOSITORY_LABEL));
	}

	@Test
	public void testGetURI()
	{
		// --- Test & Verify

		assertThat(mylynPasswordCredentialProvider.getURI(), is(REPOSITORY_URL));
	}

	@Test
	public void testGetCredentials()
	{
		// --- Test

		PasswordCredential actualCredentials = mylynPasswordCredentialProvider.getCredentials();

		// --- Verify

		assertThat(actualCredentials.getId(), is(credentials.getUserName()));
		assertThat(actualCredentials.getPassword(), is(credentials.getPassword()));
	}

	@Test
	public void testDispose()
	{
		// --- Setup

		@SuppressWarnings("unchecked")
		ServiceRegistration<IPasswordCredentialProvider> serviceRegistration = mock(ServiceRegistration.class);
		mylynPasswordCredentialProvider.setClientResourceFactoryRegistration(serviceRegistration);
		// --- Test

		mylynPasswordCredentialProvider.dispose();

		// --- Verify

		verify(serviceRegistration).unregister();
	}
}
