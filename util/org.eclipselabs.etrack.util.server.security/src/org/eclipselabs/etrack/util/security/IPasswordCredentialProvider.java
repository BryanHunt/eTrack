/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.util.security;

import org.eclipselabs.etrack.domain.security.PasswordCredential;

/**
 * @author bhunt
 * 
 */
public interface IPasswordCredentialProvider extends IServerConnection
{
	String getName();

	PasswordCredential getCredentials();
}
