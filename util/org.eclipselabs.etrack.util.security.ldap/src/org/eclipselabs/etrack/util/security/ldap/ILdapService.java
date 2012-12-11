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

package org.eclipselabs.etrack.util.security.ldap;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;

/**
 * @author bhunt
 * 
 */
public interface ILdapService
{
	String CONFIG_MANAGER_PASSWORD = "managerPassword";
	String CONFIG_MANAGER_DN = "managerDN";
	String CONFIG_USER_FILTER = "userFilter";
	String CONFIG_USER_SEARCH_BASE = "userSearchBase";
	String CONFIG_BASE_DN = "baseDN";
	String CONFIG_URL = "url";
	String CONFIG_ID_SUFFIX = "idSuffix";

	NamingEnumeration<SearchResult> find(int scope, String path, String filter) throws NamingException;

	NamingEnumeration<SearchResult> findUser(String filter) throws NamingException;

	/**
	 * @param dn the distinguished name of the object attributes to retrieve
	 * @return the attributes of the LDAP object identified by the DN
	 * @throws NamingException if there was a problem communicating with the LDAP server
	 */
	Attributes getAttributes(String dn) throws NamingException;

	String getBaseDN();
}