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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Group#getAdmins <em>Admins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup()
 * @model kind="class"
 * @generated
 */
public class Group extends Entity
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> members;

	/**
	 * The cached value of the '{@link #getAdmins() <em>Admins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmins()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> admins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return EntityPackage.Literals.GROUP;
	}

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
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.GROUP__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Entity}.
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
	public EList<Entity> getMembers()
	{
		if (members == null)
		{
			members = new EObjectResolvingEList<Entity>(Entity.class, this, EntityPackage.GROUP__MEMBERS);
		}
		return members;
	}

	/**
	 * Returns the value of the '<em><b>Admins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admins</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup_Admins()
	 * @model
	 * @generated
	 */
	public EList<Person> getAdmins()
	{
		if (admins == null)
		{
			admins = new EObjectResolvingEList<Person>(Person.class, this, EntityPackage.GROUP__ADMINS);
		}
		return admins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case EntityPackage.GROUP__NAME:
				return getName();
			case EntityPackage.GROUP__MEMBERS:
				return getMembers();
			case EntityPackage.GROUP__ADMINS:
				return getAdmins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case EntityPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case EntityPackage.GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Entity>)newValue);
				return;
			case EntityPackage.GROUP__ADMINS:
				getAdmins().clear();
				getAdmins().addAll((Collection<? extends Person>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case EntityPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityPackage.GROUP__MEMBERS:
				getMembers().clear();
				return;
			case EntityPackage.GROUP__ADMINS:
				getAdmins().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case EntityPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityPackage.GROUP__MEMBERS:
				return members != null && !members.isEmpty();
			case EntityPackage.GROUP__ADMINS:
				return admins != null && !admins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // Group
