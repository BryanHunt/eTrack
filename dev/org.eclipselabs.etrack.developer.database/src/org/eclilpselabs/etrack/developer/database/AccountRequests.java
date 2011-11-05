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
package org.eclilpselabs.etrack.developer.database;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.account.AccountRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Requests</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.AccountRequests#getAccountRequests <em>Account Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getAccountRequests()
 * @model kind="class"
 * @generated
 */
public class AccountRequests extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getAccountRequests() <em>Account Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountRequest> accountRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountRequests()
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
		return DatabasePackage.Literals.ACCOUNT_REQUESTS;
	}

	/**
	 * Returns the value of the '<em><b>Account Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.account.AccountRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Requests</em>' containment reference list.
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getAccountRequests_AccountRequests()
	 * @model containment="true"
	 * @generated
	 */
	public EList<AccountRequest> getAccountRequests()
	{
		if (accountRequests == null)
		{
			accountRequests = new EObjectContainmentEList<AccountRequest>(AccountRequest.class, this, DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS);
		}
		return accountRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS:
				return ((InternalEList<?>)getAccountRequests()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS:
				return getAccountRequests();
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
			case DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS:
				getAccountRequests().clear();
				getAccountRequests().addAll((Collection<? extends AccountRequest>)newValue);
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
			case DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS:
				getAccountRequests().clear();
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
			case DatabasePackage.ACCOUNT_REQUESTS__ACCOUNT_REQUESTS:
				return accountRequests != null && !accountRequests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AccountRequests
