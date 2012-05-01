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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link java.util.Map.Entry#getTypedKey <em>Key</em>}</li>
 *   <li>{@link java.util.Map.Entry#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMap()
 * @model keyType="org.eclipselabs.etrack.domain.task.State"
 *        valueType="org.eclipselabs.etrack.domain.task.StateTransition" valueMany="true"
 * @generated
 */
public class StateTransitionMap extends EObjectImpl implements BasicEMap.Entry<State,EList<StateTransition>>, EObject
{
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected State key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionMap()
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
		return TaskPackage.Literals.STATE_TRANSITION_MAP;
	}

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setTypedKey(State)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMap_Key()
	 * @model
	 * @generated
	 */
	public State getTypedKey()
	{
		if (key != null && key.eIsProxy())
		{
			InternalEObject oldKey = (InternalEObject)key;
			key = (State)eResolveProxy(oldKey);
			if (key != oldKey)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.STATE_TRANSITION_MAP__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTypedKey()
	{
		return key;
	}

	/**
	 * Sets the value of the '{@link java.util.Map.Entry#getTypedKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getTypedKey()
	 * @generated
	 */
	public void setTypedKey(State newKey)
	{
		State oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE_TRANSITION_MAP__KEY, oldKey, key));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMap_Value()
	 * @model
	 * @generated
	 */
	public EList<StateTransition> getTypedValue()
	{
		if (value == null)
		{
			value = new EObjectResolvingEList<StateTransition>(StateTransition.class, this, TaskPackage.STATE_TRANSITION_MAP__VALUE);
		}
		return value;
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
			case TaskPackage.STATE_TRANSITION_MAP__KEY:
				if (resolve) return getTypedKey();
				return basicGetTypedKey();
			case TaskPackage.STATE_TRANSITION_MAP__VALUE:
				return getTypedValue();
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
			case TaskPackage.STATE_TRANSITION_MAP__KEY:
				setTypedKey((State)newValue);
				return;
			case TaskPackage.STATE_TRANSITION_MAP__VALUE:
				getTypedValue().clear();
				getTypedValue().addAll((Collection<? extends StateTransition>)newValue);
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
			case TaskPackage.STATE_TRANSITION_MAP__KEY:
				setTypedKey((State)null);
				return;
			case TaskPackage.STATE_TRANSITION_MAP__VALUE:
				getTypedValue().clear();
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
			case TaskPackage.STATE_TRANSITION_MAP__KEY:
				return key != null;
			case TaskPackage.STATE_TRANSITION_MAP__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash()
	{
		if (hash == -1)
		{
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash)
	{
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getKey()
	{
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(State key)
	{
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateTransition> getValue()
	{
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateTransition> setValue(EList<StateTransition> value)
	{
		EList<StateTransition> oldValue = getValue();
		getTypedValue().clear();
		getTypedValue().addAll(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<State, EList<StateTransition>> getEMap()
	{
		EObject container = eContainer();
		return container == null ? null : (EMap<State, EList<StateTransition>>)container.eGet(eContainmentFeature());
	}

} // StateTransitionMap
