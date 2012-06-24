/**
 * 
 */

package org.eclipselabs.etrack.client.web.mylyn.junit.support;

import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.etrack.client.web.mylyn.MylynPasswordCredentialProvider;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
public class MylynPasswordCredentialProviderTestHarness extends MylynPasswordCredentialProvider
{
	public MylynPasswordCredentialProviderTestHarness(TaskRepository taskRepository)
	{
		super(taskRepository);
	}

	@Override
	public void setClientResourceFactoryRegistration(ServiceRegistration<IPasswordCredentialProvider> serviceRegistration)
	{
		super.setClientResourceFactoryRegistration(serviceRegistration);
	}
}
