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

package org.eclipselabs.etrack.web.security;

import org.eclipselabs.etrack.util.security.ISecurityService;
import org.restlet.security.SecretVerifier;

/**
 * @author bhunt
 * 
 */
public class CredentialVerifier extends SecretVerifier
{
	public CredentialVerifier(ISecurityService securityService)
	{
		assert (securityService != null);
		this.securityService = securityService;
	}

	@Override
	public int verify(String identifier, char[] secret)
	{
		return securityService.authenticate(identifier, secret) ? SecretVerifier.RESULT_VALID : SecretVerifier.RESULT_INVALID;
	}

	private ISecurityService securityService;
}
