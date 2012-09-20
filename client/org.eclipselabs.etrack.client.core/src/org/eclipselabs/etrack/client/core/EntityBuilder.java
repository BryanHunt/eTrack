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

import org.eclipse.emf.ecore.EObject;

/**
 * @author bhunt
 * 
 */
public abstract class EntityBuilder<T extends EObject> extends Builder<T>
{
	@Override
	protected void undoBuild()
	{
		try
		{
			getObject().eResource().delete(null);
		}
		catch (IOException e)
		{}
	}
}
