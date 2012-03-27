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
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Group#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Group extends Identity
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup_Members()
	 * @model
	 * @generated
	 */
	EList<Identity> getMembers();

} // Group
