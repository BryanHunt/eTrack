/**
 */

package org.eclipselabs.etrack.domain.task;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipselabs.etrack.domain.security.PermissionGroup;
import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StateTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Transition Mapping Per Role</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link java.util.Map.Entry#getTypedKey <em>Key</em>}</li>
 * <li>{@link java.util.Map.Entry#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMappingPerRole()
 * @model keyType="org.eclipselabs.etrack.domain.security.PermissionGroup"
 *        valueMapType=
 *        "org.eclipselabs.etrack.domain.state.StateTransitionMapping<org.eclipselabs.etrack.domain.state.State, org.eclipselabs.etrack.domain.state.StateTransition>"
 * @generated
 */
public class StateTransitionMappingPerRole extends MinimalEObjectImpl.Container implements BasicEMap.Entry<PermissionGroup, Entry<State, StateTransition>>, EObject
{
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected PermissionGroup key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<State, StateTransition> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected StateTransitionMappingPerRole()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return TaskPackage.Literals.STATE_TRANSITION_MAPPING_PER_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setTypedKey(PermissionGroup)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMappingPerRole_Key()
	 * @model
	 * @generated
	 */
	public PermissionGroup getTypedKey()
	{
		if (key != null && key.eIsProxy())
		{
			InternalEObject oldKey = (InternalEObject) key;
			key = (PermissionGroup) eResolveProxy(oldKey);
			if (key != oldKey)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PermissionGroup basicGetTypedKey()
	{
		return key;
	}

	/**
	 * Sets the value of the '{@link java.util.Map.Entry#getTypedKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getTypedKey()
	 * @generated
	 */
	public void setTypedKey(PermissionGroup newKey)
	{
		PermissionGroup oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY, oldKey, key));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setTypedValue(Map.Entry)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMappingPerRole_Value()
	 * @model mapType=
	 *        "org.eclipselabs.etrack.domain.state.StateTransitionMapping<org.eclipselabs.etrack.domain.state.State, org.eclipselabs.etrack.domain.state.StateTransition>"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Map.Entry<State, StateTransition> getTypedValue()
	{
		if (value != null && ((EObject) value).eIsProxy())
		{
			InternalEObject oldValue = (InternalEObject) value;
			value = (Map.Entry<State, StateTransition>) eResolveProxy(oldValue);
			if (value != oldValue)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<State, StateTransition> basicGetTypedValue()
	{
		return value;
	}

	/**
	 * Sets the value of the '{@link java.util.Map.Entry#getTypedValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getTypedValue()
	 * @generated
	 */
	public void setTypedValue(Map.Entry<State, StateTransition> newValue)
	{
		Map.Entry<State, StateTransition> oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY:
				if (resolve)
					return getTypedKey();
				return basicGetTypedKey();
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE:
				if (resolve)
					return getTypedValue();
				return basicGetTypedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY:
				setTypedKey((PermissionGroup) newValue);
				return;
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE:
				setTypedValue((Map.Entry<State, StateTransition>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY:
				setTypedKey((PermissionGroup) null);
				return;
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE:
				setTypedValue((Map.Entry<State, StateTransition>) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__KEY:
				return key != null;
			case TaskPackage.STATE_TRANSITION_MAPPING_PER_ROLE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public void setHash(int hash)
	{
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PermissionGroup getKey()
	{
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKey(PermissionGroup key)
	{
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<State, StateTransition> getValue()
	{
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map.Entry<State, StateTransition> setValue(Map.Entry<State, StateTransition> value)
	{
		Map.Entry<State, StateTransition> oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<PermissionGroup, Map.Entry<State, StateTransition>> getEMap()
	{
		EObject container = eContainer();
		return container == null ? null : (EMap<PermissionGroup, Map.Entry<State, StateTransition>>) container.eGet(eContainmentFeature());
	}

} // StateTransitionMappingPerRole
