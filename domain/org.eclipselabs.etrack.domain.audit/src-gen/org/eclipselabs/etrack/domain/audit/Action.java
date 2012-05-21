/**
 */
package org.eclipselabs.etrack.domain.audit;

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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.audit.Action#getOn <em>On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.audit.Action#getBy <em>By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction()
 * @model kind="class"
 * @generated
 */
public class Action extends MinimalEObjectImpl.Container implements EObject
{
  /**
   * The default value of the '{@link #getOn() <em>On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected static final Date ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOn() <em>On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected Date on = ON_EDEFAULT;

  /**
   * The cached value of the '{@link #getBy() <em>By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBy()
   * @generated
   * @ordered
   */
  protected Entity by;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Action()
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
    return AuditPackage.Literals.ACTION;
  }

  /**
   * Returns the value of the '<em><b>On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On</em>' attribute.
   * @see #setOn(Date)
   * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction_On()
   * @model unique="false"
   * @generated
   */
  public Date getOn()
  {
    return on;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.audit.Action#getOn <em>On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On</em>' attribute.
   * @see #getOn()
   * @generated
   */
  public void setOn(Date newOn)
  {
    Date oldOn = on;
    on = newOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ACTION__ON, oldOn, on));
  }

  /**
   * Returns the value of the '<em><b>By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By</em>' reference.
   * @see #setBy(Entity)
   * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction_By()
   * @model
   * @generated
   */
  public Entity getBy()
  {
    if (by != null && by.eIsProxy())
    {
      InternalEObject oldBy = (InternalEObject)by;
      by = (Entity)eResolveProxy(oldBy);
      if (by != oldBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuditPackage.ACTION__BY, oldBy, by));
      }
    }
    return by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetBy()
  {
    return by;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.audit.Action#getBy <em>By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By</em>' reference.
   * @see #getBy()
   * @generated
   */
  public void setBy(Entity newBy)
  {
    Entity oldBy = by;
    by = newBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ACTION__BY, oldBy, by));
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
      case AuditPackage.ACTION__ON:
        return getOn();
      case AuditPackage.ACTION__BY:
        if (resolve) return getBy();
        return basicGetBy();
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
      case AuditPackage.ACTION__ON:
        setOn((Date)newValue);
        return;
      case AuditPackage.ACTION__BY:
        setBy((Entity)newValue);
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
      case AuditPackage.ACTION__ON:
        setOn(ON_EDEFAULT);
        return;
      case AuditPackage.ACTION__BY:
        setBy((Entity)null);
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
      case AuditPackage.ACTION__ON:
        return ON_EDEFAULT == null ? on != null : !ON_EDEFAULT.equals(on);
      case AuditPackage.ACTION__BY:
        return by != null;
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
    result.append(" (on: ");
    result.append(on);
    result.append(')');
    return result.toString();
  }

} // Action
