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

package org.eclipselabs.etrack.util.web.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;

/**
 * @author bhunt
 * 
 */
public class EmfXmlRepresentation<T extends EObject> extends EmfRepresentation<T>
{
	/**
	 * @param mediaType
	 * @param object
	 */
	public EmfXmlRepresentation(MediaType mediaType, T object)
	{
		super(mediaType, object);
		setUsingEncodedAttributeStyle(false);
	}

	/**
	 * @param representation
	 */
	public EmfXmlRepresentation(Representation representation)
	{
		super(representation);
		setUsingEncodedAttributeStyle(false);
	}

	@Override
	protected Map<?, ?> getSaveOptions()
	{
		HashMap<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_PROXY_ATTRIBUTES, Boolean.TRUE);
		return saveOptions;
	}
}
