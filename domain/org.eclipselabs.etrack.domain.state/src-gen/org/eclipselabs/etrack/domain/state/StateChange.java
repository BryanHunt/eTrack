/**
 */
package org.eclipselabs.etrack.domain.state;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.etrack.domain.audit.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateChange#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateChange()
 * @model kind="class"
 * @generated
 */
public class StateChange extends Action
{
  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected StateTransition transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateChange()
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
    return StatePackage.Literals.STATE_CHANGE;
  }

  /**
   * Returns the value of the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' reference.
   * @see #setTransition(StateTransition)
   * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateChange_Transition()
   * @model
   * @generated
   */
  public StateTransition getTransition()
  {
    if (transition != null && transition.eIsProxy())
    {
      InternalEObject oldTransition = (InternalEObject)transition;
      transition = (StateTransition)eResolveProxy(oldTransition);
      if (transition != oldTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.STATE_CHANGE__TRANSITION, oldTransition, transition));
      }
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateTransition basicGetTransition()
  {
    return transition;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.state.StateChange#getTransition <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' reference.
   * @see #getTransition()
   * @generated
   */
  public void setTransition(StateTransition newTransition)
  {
    StateTransition oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE_CHANGE__TRANSITION, oldTransition, transition));
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
      case StatePackage.STATE_CHANGE__TRANSITION:
        if (resolve) return getTransition();
        return basicGetTransition();
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
      case StatePackage.STATE_CHANGE__TRANSITION:
        setTransition((StateTransition)newValue);
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
      case StatePackage.STATE_CHANGE__TRANSITION:
        setTransition((StateTransition)null);
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
      case StatePackage.STATE_CHANGE__TRANSITION:
        return transition != null;
    }
    return super.eIsSet(featureID);
  }

} // StateChange
