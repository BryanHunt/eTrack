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
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipselabs.etrack.domain.data.Linkable;

/**
 * @author bhunt
 * 
 */
public abstract class Builder<T>
{
	private T object;
	private List<Builder<?>> subContractors = new ArrayList<Builder<?>>();
	private List<ILinkBuilder<? extends IObservable>> linkBuilders = new ArrayList<ILinkBuilder<? extends IObservable>>();

	public Builder()
	{
		object = createObject();
	}

	public void addSubContractor(Builder<?> sub)
	{
		subContractors.add(sub);
	}

	public void removeSubContractor(Builder<?> sub)
	{
		subContractors.remove(sub);
	}

	public void addLinkBuilder(ILinkBuilder<? extends IObservable> linkBuilder)
	{
		linkBuilders.add(linkBuilder);
	}

	public void removeLinkBuilder(ILinkBuilder<? extends IObservable> linkBuilder)
	{
		linkBuilders.remove(linkBuilder);
	}

	public T getObject()
	{
		return object;
	}

	public T build() throws IOException
	{
		ListIterator<Builder<?>> iterator = subContractors.listIterator();

		while (iterator.hasNext())
		{
			try
			{
				iterator.next().build();
			}
			catch (IOException e)
			{
				while (iterator.hasPrevious())
					iterator.previous().undoBuild();

				throw e;
			}
		}

		if (!linkBuilders.isEmpty() && object instanceof Linkable)
		{
			Linkable linkable = (Linkable) object;

			for (ILinkBuilder<? extends IObservable> linkBuilder : linkBuilders)
				linkBuilder.buildLink(linkable);
		}

		doBuild();
		return object;
	}

	protected abstract T createObject();

	protected abstract void doBuild() throws IOException;

	protected abstract void undoBuild();

}
