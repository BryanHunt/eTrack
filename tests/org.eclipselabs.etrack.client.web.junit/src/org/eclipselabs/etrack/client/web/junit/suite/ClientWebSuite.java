/**
 * 
 */

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
