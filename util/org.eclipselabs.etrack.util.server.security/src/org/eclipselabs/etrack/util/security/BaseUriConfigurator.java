
package org.eclipselabs.etrack.util.security;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

public class BaseUriConfigurator
{
	public static String PROP_TARGET_ID = "target_id";

	public synchronized void activate(Map<String, Object> properties) throws IOException
	{
		targetId = (String) properties.get(PROP_TARGET_ID);

		if (targetId == null || targetId.isEmpty())
			throw new IllegalStateException("The target id was not specified");

		for (IPasswordCredentialProvider passwordCredentialProvider : passwordCredentialProviders)
			configure(passwordCredentialProvider);
	}

	public synchronized void bindConfigurationAdmin(ConfigurationAdmin configurationAdmin)
	{
		this.configurationAdmin = configurationAdmin;
	}

	public synchronized void bindPasswordCredentialProvider(IPasswordCredentialProvider passwordCredentialProvider) throws IOException
	{
		if (configurationAdmin != null)
			configure(passwordCredentialProvider);
		else
			passwordCredentialProviders.add(passwordCredentialProvider);
	}

	private void configure(IPasswordCredentialProvider passwordCredentialProvider) throws IOException
	{
		Configuration configuration = configurationAdmin.createFactoryConfiguration(targetId);
		configuration.getProperties().put("uri", passwordCredentialProvider.getURI());
	}

	private Set<IPasswordCredentialProvider> passwordCredentialProviders = new HashSet<IPasswordCredentialProvider>();
	private ConfigurationAdmin configurationAdmin;
	private String targetId;
}
