/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.etrack.domain.account;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipselabs.etrack.domain.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getCredential <em>Credential</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest()
 * @model kind="class"
 * @generated
 */
public class AccountRequest extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredential()
	 * @generated
	 * @ordered
	 */
	protected Credential credential;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountRequest()
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
		return AccountPackage.Literals.ACCOUNT_REQUEST;
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
	 * @see #setCredential(Credential)
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest_Credential()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Credential getCredential()
	{
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredential(Credential newCredential, NotificationChain msgs)
	{
		Credential oldCredential = credential;
		credential = newCredential;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__CREDENTIAL, oldCredential, newCredential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getCredential <em>Credential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential</em>' containment reference.
	 * @see #getCredential()
	 * @generated
	 */
	public void setCredential(Credential newCredential)
	{
		if (newCredential != credential)
		{
			NotificationChain msgs = null;
			if (credential != null)
				msgs = ((InternalEObject)credential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountPackage.ACCOUNT_REQUEST__CREDENTIAL, null, msgs);
			if (newCredential != null)
				msgs = ((InternalEObject)newCredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountPackage.ACCOUNT_REQUEST__CREDENTIAL, null, msgs);
			msgs = basicSetCredential(newCredential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__CREDENTIAL, newCredential, newCredential));
	}

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest_ExpirationDate()
	 * @model required="true"
	 * @generated
	 */
	public Date getExpirationDate()
	{
		return expirationDate;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate)
	{
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest_Entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Entity getEntity()
	{
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs)
	{
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	public void setEntity(Entity newEntity)
	{
		if (newEntity != entity)
		{
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AccountPackage.ACCOUNT_REQUEST__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AccountPackage.ACCOUNT_REQUEST__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__ENTITY, newEntity, newEntity));
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
			case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
				return basicSetCredential(null, msgs);
			case AccountPackage.ACCOUNT_REQUEST__ENTITY:
				return basicSetEntity(null, msgs);
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
			case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
				return getCredential();
			case AccountPackage.ACCOUNT_REQUEST__EXPIRATION_DATE:
				return getExpirationDate();
			case AccountPackage.ACCOUNT_REQUEST__ENTITY:
				return getEntity();
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
			case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
				setCredential((Credential)newValue);
				return;
			case AccountPackage.ACCOUNT_REQUEST__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
				return;
			case AccountPackage.ACCOUNT_REQUEST__ENTITY:
				setEntity((Entity)newValue);
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
			case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
				setCredential((Credential)null);
				return;
			case AccountPackage.ACCOUNT_REQUEST__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case AccountPackage.ACCOUNT_REQUEST__ENTITY:
				setEntity((Entity)null);
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
			case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
				return credential != null;
			case AccountPackage.ACCOUNT_REQUEST__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case AccountPackage.ACCOUNT_REQUEST__ENTITY:
				return entity != null;
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
		result.append(" (expirationDate: ");
		result.append(expirationDate);
		result.append(')');
		return result.toString();
	}

} // AccountRequest
