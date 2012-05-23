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
package org.eclilpselabs.etrack.domain.data;

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
 *   <li>{@link org.eclilpselabs.etrack.domain.data.Linkable#getLinksByName <em>Links By Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkable()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Linkable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Links By Name</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclilpselabs.etrack.domain.data.LinkedContent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links By Name</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links By Name</em>' map.
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkable_LinksByName()
	 * @model mapType="org.eclilpselabs.etrack.domain.data.LinkMapping<org.eclipse.emf.ecore.EString, org.eclilpselabs.etrack.domain.data.LinkedContent>"
	 * @generated
	 */
	EMap<String, LinkedContent> getLinksByName();

} // Linkable
