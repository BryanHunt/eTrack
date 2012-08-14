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

package org.eclipselabs.etrack.client.core;

import java.io.IOException;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.eclipselabs.etrack.util.security.IServerConnection;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

/**
 * @author bhunt
 * 
 */
public class ClientServiceFactory
{
	private ConfigurationAdmin configurationAdmin;
	private Set<IServerConnection> serverConnections = new HashSet<IServerConnection>();
	private String factoryPid; // FIXME set this value from the config

	public void activate(Map<String, ?> properties)
	{
		factoryPid = (String) properties.get("factoryPid");
	}

	public synchronized void bindConfigurationAdmin(ConfigurationAdmin configurationAdmin)
	{
		this.configurationAdmin = configurationAdmin;

		for (IServerConnection serverConnection : serverConnections)
			configureService(serverConnection.getURI());

		serverConnections.clear();
	}

	public synchronized void bindServerConnection(IServerConnection serverConnection)
	{
		if (configurationAdmin != null)
			configureService(serverConnection.getURI());
		else
			serverConnections.add(serverConnection);
	}

	public synchronized void unbindConfigurationAdmin(ConfigurationAdmin configurationAdmin)
	{
		this.configurationAdmin = null;
	}

	public synchronized void unbindServerConnection(IServerConnection serverConnection)
	{
		serverConnections.remove(serverConnection);

		try
		{
			Configuration[] configurations = configurationAdmin.listConfigurations("(&(service.pid=" + factoryPid + "*)(" + ServerClient.PROP_URI + "=" + serverConnection.getURI() + "))");

			if (configurations != null)
			{
				for (Configuration configuration : configurations)
					configuration.delete();
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvalidSyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void configureService(String uri)
	{
		try
		{
			Configuration[] configurations = configurationAdmin.listConfigurations("(&(service.pid=" + factoryPid + "*)(" + ServerClient.PROP_URI + "=" + uri + "))");

			if (configurations != null)
				return;

			Configuration configuration = configurationAdmin.createFactoryConfiguration(factoryPid);
			Dictionary<String, Object> properties = configuration.getProperties();

			if (properties == null)
				properties = new Hashtable<String, Object>();

			properties.put(ServerClient.PROP_URI, uri);
			configuration.update(properties);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InvalidSyntaxException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
