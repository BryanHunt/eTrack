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

package org.eclipselabs.etrack.app.account.request.junit;

import static org.junit.Assert.fail;

import org.eclipselabs.mongo.emf.developer.junit.MongoDatabase;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author bhunt
 * 
 */
public class TestAccountRequestService
{
	@Rule
	public static MongoDatabase db = new MongoDatabase();

	@Test
	public void testRequestAccount()
	{
		fail("not implemented");
	}
}
