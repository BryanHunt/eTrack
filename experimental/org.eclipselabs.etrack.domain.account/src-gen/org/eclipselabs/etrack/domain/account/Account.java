/**
 */
package org.eclipselabs.etrack.domain.account;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.etrack.domain.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.account.Account#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.account.Account#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount()
 * @model kind="class"
 * @generated
 */
public class Account extends MinimalEObjectImpl.Container implements EObject
{
  /**
   * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedOn()
   * @generated
   * @ordered
   */
  protected static final Date CREATED_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatedOn()
   * @generated
   * @ordered
   */
  protected Date createdOn = CREATED_ON_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
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
  protected Account()
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
    return AccountPackage.Literals.ACCOUNT;
  }

  /**
   * Returns the value of the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Created On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created On</em>' attribute.
   * @see #setCreatedOn(Date)
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount_CreatedOn()
   * @model unique="false"
   * @generated
   */
  public Date getCreatedOn()
  {
    return createdOn;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.Account#getCreatedOn <em>Created On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created On</em>' attribute.
   * @see #getCreatedOn()
   * @generated
   */
  public void setCreatedOn(Date newCreatedOn)
  {
    Date oldCreatedOn = createdOn;
    createdOn = newCreatedOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT__CREATED_ON, oldCreatedOn, createdOn));
  }

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount_Entity()
   * @model
   * @generated
   */
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountPackage.ACCOUNT__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.account.Account#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.ACCOUNT__ENTITY, oldEntity, entity));
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
      case AccountPackage.ACCOUNT__CREATED_ON:
        return getCreatedOn();
      case AccountPackage.ACCOUNT__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
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
      case AccountPackage.ACCOUNT__CREATED_ON:
        setCreatedOn((Date)newValue);
        return;
      case AccountPackage.ACCOUNT__ENTITY:
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
      case AccountPackage.ACCOUNT__CREATED_ON:
        setCreatedOn(CREATED_ON_EDEFAULT);
        return;
      case AccountPackage.ACCOUNT__ENTITY:
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
      case AccountPackage.ACCOUNT__CREATED_ON:
        return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
      case AccountPackage.ACCOUNT__ENTITY:
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
    result.append(" (createdOn: ");
    result.append(createdOn);
    result.append(')');
    return result.toString();
  }

} // Account
