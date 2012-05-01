/**
 * Copyright (c) 2011 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclipselabs.etrack.domain.links;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.links.Linkable#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkable()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Linkable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Links</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipselabs.etrack.domain.links.LinkedContent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' map.
	 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkable_Links()
	 * @model mapType="org.eclipselabs.etrack.domain.links.LinkMap<org.eclipse.emf.ecore.EString, org.eclipselabs.etrack.domain.links.LinkedContent>"
	 * @generated
	 */
	EMap<String, LinkedContent> getLinks();

} // Linkable
