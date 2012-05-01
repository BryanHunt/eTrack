/*******************************************************************************
 * Copyright (c) 2011 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.server.web.app;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.ext.osgi.ApplicationProvider;

/**
 * @author bhunt
 * 
 */
public class ETrackApplicationProvider extends ApplicationProvider
{
	@Override
	protected Application doCreateApplication(Context context)
	{
		return new ETrackApplication(context);
	}
}
