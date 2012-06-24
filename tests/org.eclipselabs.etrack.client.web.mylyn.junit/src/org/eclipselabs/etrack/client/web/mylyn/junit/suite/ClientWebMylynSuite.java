/**
 * 
 */

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
