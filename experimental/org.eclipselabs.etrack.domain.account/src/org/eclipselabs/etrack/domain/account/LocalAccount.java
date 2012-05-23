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
package org.eclipselabs.etrack.domain.account;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipselabs.etrack.domain.security.PasswordCredential;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.account.LocalAccount#getCredential <em>Credential</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getLocalAccount()
 * @model kind="class"
 * @generated
 */
public class LocalAccount extends Account
{
	/**
	 * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredential()
	 * @generated
	 * @ordered
	 */
	protected PasswordCredential credential;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAccount()
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
		return AccountPackage.Literals.LOCAL_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credential</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' containment reference.
	 * @see #setCredential(PasswordCredential)
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getLocalAccount_Credential()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public PasswordCredential getCredential()
	{
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredential(PasswordCredential newCredential, NotificationChain msgs)
	{
		PasswordCredential oldCredential = credential;
		credential = newCredential;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountPackage.LOCAL_ACCOUNT__CREDENTIAL, oldCredential, newCredential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.LocalAccount#getCredential <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' containment reference.
	 * @see #getCredential()
	 * @generated
	 */
	public void setCredential(PasswordCredential newCredential)
	{
		if (newCredential != credential)
		{
			NotificationChain msgs = null;
			if (credential != null)
				msgs = ((InternalEObject)credential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountPackage.LOCAL_ACCOUNT__CREDENTIAL, null, msgs);
			if (newCredential != null)
				msgs = ((InternalEObject)newCredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountPackage.LOCAL_ACCOUNT__CREDENTIAL, null, msgs);
			msgs = basicSetCredential(newCredential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.LOCAL_ACCOUNT__CREDENTIAL, newCredential, newCredential));
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
			case AccountPackage.LOCAL_ACCOUNT__CREDENTIAL:
				return basicSetCredential(null, msgs);
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
			case AccountPackage.LOCAL_ACCOUNT__CREDENTIAL:
				return getCredential();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case AccountPackage.LOCAL_ACCOUNT__CREDENTIAL:
				setCredential((PasswordCredential)newValue);
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
			case AccountPackage.LOCAL_ACCOUNT__CREDENTIAL:
				setCredential((PasswordCredential)null);
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
			case AccountPackage.LOCAL_ACCOUNT__CREDENTIAL:
				return credential != null;
		}
		return super.eIsSet(featureID);
	}

} // LocalAccount
