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
package org.eclipselabs.etrack.domain.task;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.etrack.domain.entity.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.AssignableItem#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface AssignableItem extends EObject
{
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Person)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem_Owner()
	 * @model required="true"
	 * @generated
	 */
	Person getOwner();

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.AssignableItem#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Person value);

} // AssignableItem
