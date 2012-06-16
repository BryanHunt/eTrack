/**
 */
package org.eclipselabs.etrack.domain.state;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateTransition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateTransition#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransition()
 * @model kind="class"
 * @generated
 */
public class StateTransition extends MinimalEObjectImpl.Container implements EObject
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
   * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetState()
   * @generated
   * @ordered
   */
  protected State targetState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateTransition()
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
    return StatePackage.Literals.STATE_TRANSITION;
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
   * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransition_Name()
   * @model unique="false"
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.state.StateTransition#getName <em>Name</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE_TRANSITION__NAME, oldName, name));
  }

  /**
   * Returns the value of the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target State</em>' reference.
   * @see #setTargetState(State)
   * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransition_TargetState()
   * @model
   * @generated
   */
  public State getTargetState()
  {
    if (targetState != null && targetState.eIsProxy())
    {
      InternalEObject oldTargetState = (InternalEObject)targetState;
      targetState = (State)eResolveProxy(oldTargetState);
      if (targetState != oldTargetState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.STATE_TRANSITION__TARGET_STATE, oldTargetState, targetState));
      }
    }
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTargetState()
  {
    return targetState;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.state.StateTransition#getTargetState <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target State</em>' reference.
   * @see #getTargetState()
   * @generated
   */
  public void setTargetState(State newTargetState)
  {
    State oldTargetState = targetState;
    targetState = newTargetState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE_TRANSITION__TARGET_STATE, oldTargetState, targetState));
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
      case StatePackage.STATE_TRANSITION__NAME:
        return getName();
      case StatePackage.STATE_TRANSITION__TARGET_STATE:
        if (resolve) return getTargetState();
        return basicGetTargetState();
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
      case StatePackage.STATE_TRANSITION__NAME:
        setName((String)newValue);
        return;
      case StatePackage.STATE_TRANSITION__TARGET_STATE:
        setTargetState((State)newValue);
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
      case StatePackage.STATE_TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StatePackage.STATE_TRANSITION__TARGET_STATE:
        setTargetState((State)null);
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
      case StatePackage.STATE_TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StatePackage.STATE_TRANSITION__TARGET_STATE:
        return targetState != null;
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

} // StateTransition
