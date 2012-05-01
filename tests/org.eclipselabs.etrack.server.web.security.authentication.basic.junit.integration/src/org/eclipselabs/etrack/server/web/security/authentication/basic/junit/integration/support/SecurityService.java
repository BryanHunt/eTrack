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

package org.eclipselabs.etrack.server.web.security.authentication.basic.junit.integration.support;

import org.eclipselabs.etrack.util.security.ISecurityService;

/**
 * @author bhunt
 * 
 */
public class SecurityService implements ISecurityService
{
	@Override
	public boolean authenticate(String id, char[] password)
	{
		return "junit".equals(id) && "junit".equals(new String(password));
	}
}
