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

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.StateHistory#getTransitionTime <em>Transition Time</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.StateHistory#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateHistory()
 * @model kind="class"
 * @generated
 */
public class StateHistory extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSITION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitionTime() <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTime()
	 * @generated
	 * @ordered
	 */
	protected Date transitionTime = TRANSITION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateHistory()
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
		return TaskPackage.Literals.STATE_HISTORY;
	}

	/**
	 * Returns the value of the '<em><b>Transition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Time</em>' attribute.
	 * @see #setTransitionTime(Date)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateHistory_TransitionTime()
	 * @model required="true"
	 * @generated
	 */
	public Date getTransitionTime()
	{
		return transitionTime;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.StateHistory#getTransitionTime <em>Transition Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Time</em>' attribute.
	 * @see #getTransitionTime()
	 * @generated
	 */
	public void setTransitionTime(Date newTransitionTime)
	{
		Date oldTransitionTime = transitionTime;
		transitionTime = newTransitionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE_HISTORY__TRANSITION_TIME, oldTransitionTime, transitionTime));
	}

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateHistory_State()
	 * @model
	 * @generated
	 */
	public State getState()
	{
		if (state != null && state.eIsProxy())
		{
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.STATE_HISTORY__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState()
	{
		return state;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.StateHistory#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	public void setState(State newState)
	{
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE_HISTORY__STATE, oldState, state));
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
			case TaskPackage.STATE_HISTORY__TRANSITION_TIME:
				return getTransitionTime();
			case TaskPackage.STATE_HISTORY__STATE:
				if (resolve) return getState();
				return basicGetState();
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
			case TaskPackage.STATE_HISTORY__TRANSITION_TIME:
				setTransitionTime((Date)newValue);
				return;
			case TaskPackage.STATE_HISTORY__STATE:
				setState((State)newValue);
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
			case TaskPackage.STATE_HISTORY__TRANSITION_TIME:
				setTransitionTime(TRANSITION_TIME_EDEFAULT);
				return;
			case TaskPackage.STATE_HISTORY__STATE:
				setState((State)null);
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
			case TaskPackage.STATE_HISTORY__TRANSITION_TIME:
				return TRANSITION_TIME_EDEFAULT == null ? transitionTime != null : !TRANSITION_TIME_EDEFAULT.equals(transitionTime);
			case TaskPackage.STATE_HISTORY__STATE:
				return state != null;
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
		result.append(" (transitionTime: ");
		result.append(transitionTime);
		result.append(')');
		return result.toString();
	}

} // StateHistory
