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

package org.eclipselabs.etrack.client.web.security.authentication.basic;

import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.eclipselabs.etrack.domain.security.PasswordCredential;
import org.eclipselabs.etrack.util.security.IPasswordCredentialProvider;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;

/**
 * @author bhunt
 * 
 */
public class BasicChallengeResponsseFactory implements IChallengeResponseFactory
{
	@Override
	public ChallengeResponse createChallengeResponse(String uri)
	{
		PasswordCredential credentials = getCredentials(uri);

		if (credentials == null)
			return null;

		ChallengeResponse challengeResponse = new ChallengeResponse(ChallengeScheme.HTTP_BASIC, credentials.getID(), credentials.getPassword());
		return challengeResponse;
	}

	void bindPasswordCredentialProvider(IPasswordCredentialProvider passwordCredentialProvider)
	{
		synchronized (credentialProviders)
		{
			credentialProviders.put(passwordCredentialProvider.getURI(), passwordCredentialProvider);
		}
	}

	void unbindPasswordCredentialProvider(IPasswordCredentialProvider passwordCredentialProvider)
	{
		synchronized (credentialProviders)
		{
			credentialProviders.remove(passwordCredentialProvider.getURI());
		}
	}

	private PasswordCredential getCredentials(String uri)
	{
		synchronized (credentialProviders)
		{
			IPasswordCredentialProvider provider = credentialProviders.get(uri);

			if (provider == null)
			{
				for (Entry<String, IPasswordCredentialProvider> entry : credentialProviders.entrySet())
				{
					if (uri.startsWith(entry.getKey()))
					{
						provider = entry.getValue();
						break;
					}
				}
			}

			return provider != null ? provider.getCredentials() : null;
		}
	}

	private HashMap<String, IPasswordCredentialProvider> credentialProviders = new HashMap<String, IPasswordCredentialProvider>();
}
