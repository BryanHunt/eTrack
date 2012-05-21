/**
 */
package org.eclipselabs.etrack.domain.account;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.etrack.domain.entity.Entity;

import org.eclipselabs.etrack.domain.security.PasswordCredential;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpiresOn <em>Expires On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.account.AccountRequest#getCredential <em>Credential</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest()
 * @model kind="class"
 * @generated
 */
public class AccountRequest extends MinimalEObjectImpl.Container implements EObject
{
  /**
   * The default value of the '{@link #getExpiresOn() <em>Expires On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpiresOn()
   * @generated
   * @ordered
   */
  protected static final Date EXPIRES_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpiresOn() <em>Expires On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpiresOn()
   * @generated
   * @ordered
   */
  protected Date expiresOn = EXPIRES_ON_EDEFAULT;

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
   * Returns the value of the '<em><b>Expires On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expires On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expires On</em>' attribute.
   * @see #setExpiresOn(Date)
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest_ExpiresOn()
   * @model unique="false"
   * @generated
   */
  public Date getExpiresOn()
  {
    return expiresOn;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpiresOn <em>Expires On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expires On</em>' attribute.
   * @see #getExpiresOn()
   * @generated
   */
  public void setExpiresOn(Date newExpiresOn)
  {
    Date oldExpiresOn = expiresOn;
    expiresOn = newExpiresOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT_REQUEST__EXPIRES_ON, oldExpiresOn, expiresOn));
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
   * @model containment="true"
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
   * Returns the value of the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credential</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credential</em>' containment reference.
   * @see #setCredential(PasswordCredential)
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest_Credential()
   * @model containment="true"
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
  public void setCredential(PasswordCredential newCredential)
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AccountPackage.ACCOUNT_REQUEST__ENTITY:
        return basicSetEntity(null, msgs);
      case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
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
      case AccountPackage.ACCOUNT_REQUEST__EXPIRES_ON:
        return getExpiresOn();
      case AccountPackage.ACCOUNT_REQUEST__ENTITY:
        return getEntity();
      case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
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
      case AccountPackage.ACCOUNT_REQUEST__EXPIRES_ON:
        setExpiresOn((Date)newValue);
        return;
      case AccountPackage.ACCOUNT_REQUEST__ENTITY:
        setEntity((Entity)newValue);
        return;
      case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
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
      case AccountPackage.ACCOUNT_REQUEST__EXPIRES_ON:
        setExpiresOn(EXPIRES_ON_EDEFAULT);
        return;
      case AccountPackage.ACCOUNT_REQUEST__ENTITY:
        setEntity((Entity)null);
        return;
      case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
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
      case AccountPackage.ACCOUNT_REQUEST__EXPIRES_ON:
        return EXPIRES_ON_EDEFAULT == null ? expiresOn != null : !EXPIRES_ON_EDEFAULT.equals(expiresOn);
      case AccountPackage.ACCOUNT_REQUEST__ENTITY:
        return entity != null;
      case AccountPackage.ACCOUNT_REQUEST__CREDENTIAL:
        return credential != null;
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
    result.append(" (expiresOn: ");
    result.append(expiresOn);
    result.append(')');
    return result.toString();
  }

} // AccountRequest
