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

package org.eclipselabs.etrack.client.web.authentication.basic;

import org.eclipselabs.etrack.client.web.IChallengeResponseFactory;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;

/**
 * @author bhunt
 * 
 */
public class BasicChallengeResponseFactory implements IChallengeResponseFactory
{
	@Override
	public ChallengeResponse createChallengeResponse(String id, Object secret)
	{
		return new ChallengeResponse(ChallengeScheme.HTTP_BASIC, id, ((String) secret).toCharArray());
	}
}
