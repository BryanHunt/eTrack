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

package org.eclipselabs.etrack.client.task.mylyn.junit.support;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;

import org.eclipselabs.etrack.client.entity.IEntityService;
import org.eclipselabs.etrack.client.task.ITaskService;
import org.eclipselabs.etrack.client.task.mylyn.IQueryFactory;
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
	private String filter;
	private ServiceReference<ITaskService> taskServiceReference;
	private ServiceReference<IEntityService> entitiServiceReference;
	private ServiceReference<IQueryFactory> queryFactoryReference;
	private ITaskService taskService;
	private IEntityService entityService;
	private IQueryFactory queryFactory;
	private boolean throwException;

	public BundleContextTestHarness(String filter, ServiceReference<ITaskService> taskServiceReference, ServiceReference<IEntityService> entitiServiceReference, ServiceReference<IQueryFactory> queryFactoryReference, ITaskService taskService, IEntityService entityService, IQueryFactory queryFactory)
	{
		this.filter = filter;
		this.taskServiceReference = taskServiceReference;
		this.entitiServiceReference = entitiServiceReference;
		this.queryFactoryReference = queryFactoryReference;
		this.taskService = taskService;
		this.entityService = entityService;
		this.queryFactory = queryFactory;
	}

	public void setThrowException(boolean throwException)
	{
		this.throwException = throwException;
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

	@Override
	public <S> ServiceRegistration<S> registerService(Class<S> clazz, S service, Dictionary<String, ?> properties)
	{
		return null;
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

	@SuppressWarnings("unchecked")
	@Override
	public <S> ServiceReference<S> getServiceReference(Class<S> clazz)
	{
		if (clazz == IQueryFactory.class)
			return (ServiceReference<S>) queryFactoryReference;

		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S> Collection<ServiceReference<S>> getServiceReferences(Class<S> clazz, String filter) throws InvalidSyntaxException
	{
		if (throwException)
			throw new InvalidSyntaxException("", "");

		ArrayList<ServiceReference<S>> references = new ArrayList<ServiceReference<S>>();

		if (clazz == ITaskService.class && this.filter.equals(filter))
			references.add((ServiceReference<S>) taskServiceReference);
		else if (clazz == IEntityService.class && this.filter.equals(filter))
			references.add((ServiceReference<S>) entitiServiceReference);

		return references;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S> S getService(ServiceReference<S> reference)
	{
		if (reference == taskServiceReference)
			return (S) taskService;

		if (reference == entitiServiceReference)
			return (S) entityService;

		if (reference == queryFactoryReference)
			return (S) queryFactory;

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
