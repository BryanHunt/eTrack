/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.security;

import org.eclipselabs.etrack.domain.security.PasswordCredential;

/**
 * @author bhunt
 * 
 */
public interface IPasswordCredentialProvider
{
	String getURI();

	PasswordCredential getCredentials();
}
