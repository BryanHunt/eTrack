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

package org.eclipselabs.etrack.web.security.auth.basic;

import org.eclipselabs.etrack.security.ISecurityService;
import org.eclipselabs.etrack.web.security.CredentialVerifier;
import org.restlet.Context;
import org.restlet.data.ChallengeScheme;
import org.restlet.ext.osgi.FilterProvider;
import org.restlet.routing.Filter;
import org.restlet.security.ChallengeAuthenticator;

/**
 * @author bhunt
 * 
 */
public class BasicAuthenticationFilterProvider extends FilterProvider
{
	public void bindSecurityService(ISecurityService securityService)
	{
		this.securityService = securityService;
	}

	@Override
	protected Filter createFilter(Context context)
	{
		ChallengeAuthenticator challengeAuthenticator = new ChallengeAuthenticator(context, ChallengeScheme.HTTP_BASIC, "eTrack");
		challengeAuthenticator.setVerifier(new CredentialVerifier(securityService));
		return challengeAuthenticator;
	}

	public void unbindSecurityService(ISecurityService securityService)
	{
		if (securityService == this.securityService)
			this.securityService = null;
	}

	private ISecurityService securityService;
}
