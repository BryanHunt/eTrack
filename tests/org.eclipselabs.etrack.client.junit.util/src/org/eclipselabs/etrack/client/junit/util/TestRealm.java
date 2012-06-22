/*******************************************************************************
 * Copyright (c) 2012 NVIDIA CORPORATION.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    NVIDIA - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.client.junit.util;

import org.eclipse.core.databinding.observable.Realm;

/**
 * This databind Realm is to be used with JUnit tests involving observables.
 * 
 * <pre>
 * &#064;BeforeClass
 * public static void globalSetup()
 * {
 * 	new TestRealm();
 * }
 * </pre>
 * 
 * @author bhunt
 * 
 */
public class TestRealm extends Realm
{
	public TestRealm()
	{
		setDefault(this);
	}

	@Override
	public boolean isCurrent()
	{
		return true;
	}
}
