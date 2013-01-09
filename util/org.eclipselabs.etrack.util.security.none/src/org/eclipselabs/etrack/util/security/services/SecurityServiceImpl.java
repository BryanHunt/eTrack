/*******************************************************************************
 * Copyright (c) 2013 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.util.security.services;

import org.eclipselabs.etrack.util.security.ISecurityService;

/**
 * @author bhunt
 * 
 */
public class SecurityServiceImpl implements ISecurityService
{
	@Override
	public boolean authenticate(String id, char[] password)
	{
		return true;
	}
}
