/**
 * 
 */

package org.eclipselabs.etrack.client.web.security.authentication.basic.junit.suite;

import org.eclipselabs.etrack.client.web.security.authentication.basic.junit.tests.TestBasicChallengeResponseFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author bhunt
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ TestBasicChallengeResponseFactory.class })
public class ClientWebSecurityAuthBasicSuite
{}
