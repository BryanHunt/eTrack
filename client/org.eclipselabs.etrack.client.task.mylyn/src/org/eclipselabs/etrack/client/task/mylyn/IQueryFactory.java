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

package org.eclipselabs.etrack.client.task.mylyn;

import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipselabs.emf.query.Expression;

/**
 * @author bhunt
 * 
 */
public interface IQueryFactory
{
	Expression createExpression(IRepositoryQuery query);
}
