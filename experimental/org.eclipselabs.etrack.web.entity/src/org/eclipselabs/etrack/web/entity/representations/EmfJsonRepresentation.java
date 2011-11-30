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

package org.eclipselabs.etrack.web.entity.representations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipselabs.emfjson.resource.JsResourceImpl;
import org.restlet.data.MediaType;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;

/**
 * @author bhunt
 * 
 */
public class EmfJsonRepresentation<T extends EObject> extends EmfRepresentation<T>
{
	/**
	 * @param mediaType
	 * @param object
	 */
	public EmfJsonRepresentation(MediaType mediaType, T object)
	{
		super(mediaType, object);
	}

	/**
	 * @param representation
	 */
	public EmfJsonRepresentation(Representation representation)
	{
		super(representation);
	}

	@Override
	protected Resource createEmfResource(MediaType mediaType)
	{
		return new JsResourceImpl();
	}

// @Override
// public void write(OutputStream outputStream) throws IOException
// {
// Resource emfResource = createEmfResource(getMediaType());
// emfResource.getContents().add(getObject());
// emfResource.save(outputStream, getSaveOptions());
// }
}
