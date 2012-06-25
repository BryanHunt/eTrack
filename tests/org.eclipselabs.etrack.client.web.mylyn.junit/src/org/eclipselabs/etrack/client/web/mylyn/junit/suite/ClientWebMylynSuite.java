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

package org.eclipselabs.etrack.client.web.mylyn.junit.suite;

import org.eclipselabs.etrack.client.web.mylyn.junit.tests.TestMylynPasswordCredentialProvider;
import org.eclipselabs.etrack.client.web.mylyn.junit.tests.TestMylynPasswordCredentialProviderManager;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author bhunt
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ TestMylynPasswordCredentialProvider.class, TestMylynPasswordCredentialProviderManager.class })
public class ClientWebMylynSuite
{}
