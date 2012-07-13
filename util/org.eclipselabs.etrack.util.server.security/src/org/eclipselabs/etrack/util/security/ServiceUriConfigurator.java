
package org.eclipselabs.etrack.util.security;

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

public class ServiceUriConfigurator
{
	public static String PROP_TARGET_ID = "target_id";

	public synchronized void activate(Map<String, Object> properties) throws IOException
	{
		this.properties = new Hashtable<String, Object>(properties);
		targetId = (String) this.properties.remove(PROP_TARGET_ID);

		if (targetId == null || targetId.isEmpty())
			throw new IllegalStateException("The target id was not specified");

		for (IServerConnection serverConnection : serverConnections)
			configure(serverConnection);

		serverConnections = null;
	}

	public synchronized void bindConfigurationAdmin(ConfigurationAdmin configurationAdmin)
	{
		this.configurationAdmin = configurationAdmin;
	}

	public synchronized void bindServerConnection(IServerConnection serverConnection) throws IOException
	{
		if (serverConnections == null)
			configure(serverConnection);
		else
			serverConnections.add(serverConnection);
	}

	public synchronized void unbindServerConnection(IServerConnection serverConnection) throws IOException
	{
		if (serverConnections != null)
			serverConnections.remove(serverConnection);
		else
		{
			Configuration configuration = configurationAdmin.getConfiguration(targetId, null);

			if (configuration != null)
				configuration.delete();
		}
	}

	private void configure(IServerConnection serverConnection) throws IOException
	{
		properties.put("uri", serverConnection.getURI());

		Configuration configuration = configurationAdmin.getConfiguration(targetId, null);

		if (configuration == null)
			configuration = configurationAdmin.createFactoryConfiguration(targetId);

		configuration.update(properties);
	}

	private Set<IServerConnection> serverConnections = new HashSet<IServerConnection>();
	private ConfigurationAdmin configurationAdmin;
	private String targetId;
	private Dictionary<String, Object> properties;
}
