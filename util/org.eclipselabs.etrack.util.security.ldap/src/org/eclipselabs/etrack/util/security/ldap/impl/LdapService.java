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

package org.eclipselabs.etrack.util.security.ldap.impl;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.net.BCodec;
import org.eclipselabs.etrack.util.security.ISecurityService;
import org.eclipselabs.etrack.util.security.ldap.ILdapService;

/**
 * @author bhunt
 * 
 */
public class LdapService implements ILdapService, ISecurityService
{
	@Override
	public boolean authenticate(String id, char[] password)
	{
		String cachedPassword = credentialCache.get(id);
		String encodedPassword = null;

		try
		{
			encodedPassword = codec.encode(new String(password));
		}
		catch (EncoderException e1)
		{}

		if (cachedPassword != null && encodedPassword != null && cachedPassword.equals(encodedPassword))
			return true;

		Hashtable<String, String> environment = new Hashtable<String, String>();
		environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environment.put(Context.PROVIDER_URL, url);
		environment.put(Context.SECURITY_AUTHENTICATION, "simple");
		environment.put(Context.SECURITY_PRINCIPAL, id);
		environment.put(Context.SECURITY_CREDENTIALS, new String(password));

		try
		{
			InitialDirContext context = new InitialDirContext(environment);
			context.close();

			if (encodedPassword != null)
				credentialCache.put(id, encodedPassword);

			return true;
		}
		catch (NamingException e)
		{
			return false;
		}
	}

	void activate(Map<?, ?> configuration) throws NamingException
	{
		this.url = (String) configuration.get(CONFIG_URL);
		this.baseDN = (String) configuration.get(CONFIG_BASE_DN);
		String managerDN = (String) configuration.get(CONFIG_MANAGER_DN);
		String managerPassword = (String) configuration.get(CONFIG_MANAGER_PASSWORD);

		Hashtable<String, String> environment = new Hashtable<String, String>();
		environment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environment.put(Context.PROVIDER_URL, url);

		if (managerDN != null)
		{
			environment.put(Context.SECURITY_AUTHENTICATION, "simple");
			environment.put(Context.SECURITY_PRINCIPAL, managerDN);
			environment.put(Context.SECURITY_CREDENTIALS, managerPassword);
		}
		else
			environment.put(Context.SECURITY_AUTHENTICATION, "none");

		searchContext = new InitialDirContext(environment);
	}

	@Override
	public NamingEnumeration<SearchResult> find(int scope, String path, String filter) throws NamingException
	{
		SearchControls searchControls = new SearchControls();
		searchControls.setSearchScope(scope);
		String searchPath = path != null && !path.isEmpty() ? path + "," + baseDN : baseDN;
		return searchContext.search(searchPath, filter, searchControls);
	}

	@Override
	public Attributes getAttributes(String dn) throws NamingException
	{
		return searchContext.getAttributes(dn);
	}

	private InitialDirContext searchContext;
	private Map<String, String> credentialCache = new HashMap<String, String>();
	private String url;
	private String baseDN;
	private BCodec codec = new BCodec();
}
