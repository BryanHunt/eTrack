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

package org.eclipselabs.etrack.client.data;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipselabs.etrack.client.core.ILinkBuilder;
import org.eclipselabs.etrack.domain.data.DataFactory;
import org.eclipselabs.etrack.domain.data.DataPackage;
import org.eclipselabs.etrack.domain.data.Linkable;
import org.eclipselabs.etrack.domain.data.LinkedCategories;

/**
 * @author bhunt
 * 
 */
public class CategoryLinkBuilder implements ILinkBuilder<IObservableList>
{
	private LinkedCategories linkedCategories;
	private IObservableList linkedCategoriesObservable;

	public CategoryLinkBuilder()
	{
		linkedCategories = DataFactory.eINSTANCE.createLinkedCategories();
		linkedCategoriesObservable = EMFProperties.list(DataPackage.Literals.LINKED_CATEGORIES__CATEGORIES).observe(linkedCategories);
	}

	@Override
	public void buildLink(Linkable linkable)
	{
		linkable.getLinksByName().put(IDataService.LINKED_CATEGORIES_LINK_KEY, linkedCategories);
	}

	@Override
	public IObservableList getLinkedObservable()
	{
		return linkedCategoriesObservable;
	}
}
