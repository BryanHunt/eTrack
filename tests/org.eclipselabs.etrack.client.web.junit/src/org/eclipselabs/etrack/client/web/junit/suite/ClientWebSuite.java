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

package org.eclipselabs.etrack.client.web.junit.suite;

import org.eclipselabs.etrack.client.web.junit.tests.TestClientResourceFactoryWithChallengeResponse;
import org.eclipselabs.etrack.client.web.junit.tests.TestClientResourceFactoryWithoutChallengeResponse;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author bhunt
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ TestClientResourceFactoryWithChallengeResponse.class, TestClientResourceFactoryWithoutChallengeResponse.class })
public class ClientWebSuite
{}
