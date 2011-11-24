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

package org.eclipselabs.etrack.web.app;

import org.restlet.Context;
import org.restlet.ext.wadl.WadlApplication;
import org.restlet.representation.Representation;

/**
 * @author bhunt
 * 
 */
public class ETrackApplication extends WadlApplication
{
	public ETrackApplication()
	{}

	/**
	 * @param context
	 */
	public ETrackApplication(Context context)
	{
		super(context);
	}

	/**
	 * @param wadl
	 */
	public ETrackApplication(Representation wadl)
	{
		super(wadl);
	}

	/**
	 * @param context
	 * @param wadl
	 */
	public ETrackApplication(Context context, Representation wadl)
	{
		super(context, wadl);
	}
}
