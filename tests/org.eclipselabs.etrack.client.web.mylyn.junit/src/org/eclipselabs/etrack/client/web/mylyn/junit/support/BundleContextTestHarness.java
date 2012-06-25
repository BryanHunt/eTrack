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

package org.eclipselabs.etrack.client.web.mylyn.junit.support;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Dictionary;

import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

/**
 * @author bhunt
 * 
 */
public class BundleContextTestHarness implements BundleContext
{
	private ServiceRegistration<IPasswordCredentialProvider> serviceRegistration;

	public BundleContextTestHarness(ServiceRegistration<IPasswordCredentialProvider> serviceRegistration)
	{
		this.serviceRegistration = serviceRegistration;
	}

	@Override
	public String getProperty(String key)
	{
		return null;
	}

	@Override
	public Bundle getBundle()
	{
		return null;
	}

	@Override
	public Bundle installBundle(String location, InputStream input) throws BundleException
	{
		return null;
	}

	@Override
	public Bundle installBundle(String location) throws BundleException
	{
		return null;
	}

	@Override
	public Bundle getBundle(long id)
	{
		return null;
	}

	@Override
	public Bundle[] getBundles()
	{
		return null;
	}

	@Override
	public void addServiceListener(ServiceListener listener, String filter) throws InvalidSyntaxException
	{}

	@Override
	public void addServiceListener(ServiceListener listener)
	{}

	@Override
	public void removeServiceListener(ServiceListener listener)
	{}

	@Override
	public void addBundleListener(BundleListener listener)
	{}

	@Override
	public void removeBundleListener(BundleListener listener)
	{}

	@Override
	public void addFrameworkListener(FrameworkListener listener)
	{}

	@Override
	public void removeFrameworkListener(FrameworkListener listener)
	{}

	@Override
	public ServiceRegistration<?> registerService(String[] clazzes, Object service, Dictionary<String, ?> properties)
	{
		return null;
	}

	@Override
	public ServiceRegistration<?> registerService(String clazz, Object service, Dictionary<String, ?> properties)
	{
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S> ServiceRegistration<S> registerService(Class<S> clazz, S service, Dictionary<String, ?> properties)
	{
		return (ServiceRegistration<S>) serviceRegistration;
	}

	@Override
	public ServiceReference<?>[] getServiceReferences(String clazz, String filter) throws InvalidSyntaxException
	{
		return null;
	}

	@Override
	public ServiceReference<?>[] getAllServiceReferences(String clazz, String filter) throws InvalidSyntaxException
	{
		return null;
	}

	@Override
	public ServiceReference<?> getServiceReference(String clazz)
	{
		return null;
	}

	@Override
	public <S> ServiceReference<S> getServiceReference(Class<S> clazz)
	{
		return null;
	}

	@Override
	public <S> Collection<ServiceReference<S>> getServiceReferences(Class<S> clazz, String filter) throws InvalidSyntaxException
	{
		return null;
	}

	@Override
	public <S> S getService(ServiceReference<S> reference)
	{
		return null;
	}

	@Override
	public boolean ungetService(ServiceReference<?> reference)
	{
		return false;
	}

	@Override
	public File getDataFile(String filename)
	{
		return null;
	}

	@Override
	public Filter createFilter(String filter) throws InvalidSyntaxException
	{
		return null;
	}

	@Override
	public Bundle getBundle(String location)
	{
		return null;
	}
}
