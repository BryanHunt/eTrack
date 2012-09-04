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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StatePackage;
import org.eclipselabs.etrack.domain.state.StateTransition;
import org.eclipselabs.etrack.domain.state.StateTransitionMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingState <em>Starting State</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getResolvedStates <em>Resolved States</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getResolutions <em>Resolutions</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingResolution <em>Starting Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType()
 * @model kind="class"
 * @generated
 */
public class TaskType extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EMap<State, EList<StateTransition>> states;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EPackage extension;

	/**
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskRelationship> relationships;

	/**
	 * The cached value of the '{@link #getResolvedStates() <em>Resolved States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> resolvedStates;

	/**
	 * The cached value of the '{@link #getResolutions() <em>Resolutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskResolution> resolutions;

	/**
	 * The cached value of the '{@link #getStartingResolution() <em>Starting Resolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingResolution()
	 * @generated
	 * @ordered
	 */
	protected TaskResolution startingResolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskType()
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
		return TaskPackage.Literals.TASK_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskType#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_TYPE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' map.
	 * The key is of type {@link org.eclipselabs.etrack.domain.state.State},
	 * and the value is of type list of {@link org.eclipselabs.etrack.domain.state.StateTransition},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' map.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_States()
	 * @model mapType="org.eclipselabs.etrack.domain.state.StateTransitionMapping<org.eclipselabs.etrack.domain.state.State, org.eclipselabs.etrack.domain.state.StateTransition>"
	 * @generated
	 */
	public EMap<State, EList<StateTransition>> getStates()
	{
		if (states == null)
		{
			states = new EcoreEMap<State,EList<StateTransition>>(StatePackage.Literals.STATE_TRANSITION_MAPPING, StateTransitionMapping.class, this, TaskPackage.TASK_TYPE__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(EPackage)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_Extension()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EPackage getExtension()
	{
		if (extension != null && extension.eIsProxy())
		{
			InternalEObject oldExtension = (InternalEObject)extension;
			extension = (EPackage)eResolveProxy(oldExtension);
			if (extension != oldExtension)
			{
				InternalEObject newExtension = (InternalEObject)extension;
				NotificationChain msgs = oldExtension.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_TYPE__EXTENSION, null, null);
				if (newExtension.eInternalContainer() == null)
				{
					msgs = newExtension.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_TYPE__EXTENSION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_TYPE__EXTENSION, oldExtension, extension));
			}
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetExtension()
	{
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(EPackage newExtension, NotificationChain msgs)
	{
		EPackage oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_TYPE__EXTENSION, oldExtension, newExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskType#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	public void setExtension(EPackage newExtension)
	{
		if (newExtension != extension)
		{
			NotificationChain msgs = null;
			if (extension != null)
				msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_TYPE__EXTENSION, null, msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_TYPE__EXTENSION, null, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_TYPE__EXTENSION, newExtension, newExtension));
	}

	/**
	 * Returns the value of the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting State</em>' reference.
	 * @see #setStartingState(State)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_StartingState()
	 * @model required="true"
	 * @generated
	 */
	public State getStartingState()
	{
		if (startingState != null && startingState.eIsProxy())
		{
			InternalEObject oldStartingState = (InternalEObject)startingState;
			startingState = (State)eResolveProxy(oldStartingState);
			if (startingState != oldStartingState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_TYPE__STARTING_STATE, oldStartingState, startingState));
			}
		}
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartingState()
	{
		return startingState;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingState <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting State</em>' reference.
	 * @see #getStartingState()
	 * @generated
	 */
	public void setStartingState(State newStartingState)
	{
		State oldStartingState = startingState;
		startingState = newStartingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_TYPE__STARTING_STATE, oldStartingState, startingState));
	}

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_Relationships()
	 * @model
	 * @generated
	 */
	public EList<TaskRelationship> getRelationships()
	{
		if (relationships == null)
		{
			relationships = new EObjectResolvingEList<TaskRelationship>(TaskRelationship.class, this, TaskPackage.TASK_TYPE__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * Returns the value of the '<em><b>Resolved States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved States</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_ResolvedStates()
	 * @model
	 * @generated
	 */
	public EList<State> getResolvedStates()
	{
		if (resolvedStates == null)
		{
			resolvedStates = new EObjectResolvingEList<State>(State.class, this, TaskPackage.TASK_TYPE__RESOLVED_STATES);
		}
		return resolvedStates;
	}

	/**
	 * Returns the value of the '<em><b>Resolutions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolutions</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_Resolutions()
	 * @model
	 * @generated
	 */
	public EList<TaskResolution> getResolutions()
	{
		if (resolutions == null)
		{
			resolutions = new EObjectResolvingEList<TaskResolution>(TaskResolution.class, this, TaskPackage.TASK_TYPE__RESOLUTIONS);
		}
		return resolutions;
	}

	/**
	 * Returns the value of the '<em><b>Starting Resolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Resolution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Resolution</em>' reference.
	 * @see #setStartingResolution(TaskResolution)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType_StartingResolution()
	 * @model required="true"
	 * @generated
	 */
	public TaskResolution getStartingResolution()
	{
		if (startingResolution != null && startingResolution.eIsProxy())
		{
			InternalEObject oldStartingResolution = (InternalEObject)startingResolution;
			startingResolution = (TaskResolution)eResolveProxy(oldStartingResolution);
			if (startingResolution != oldStartingResolution)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_TYPE__STARTING_RESOLUTION, oldStartingResolution, startingResolution));
			}
		}
		return startingResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskResolution basicGetStartingResolution()
	{
		return startingResolution;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingResolution <em>Starting Resolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Resolution</em>' reference.
	 * @see #getStartingResolution()
	 * @generated
	 */
	public void setStartingResolution(TaskResolution newStartingResolution)
	{
		TaskResolution oldStartingResolution = startingResolution;
		startingResolution = newStartingResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_TYPE__STARTING_RESOLUTION, oldStartingResolution, startingResolution));
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
			case TaskPackage.TASK_TYPE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK_TYPE__EXTENSION:
				return basicSetExtension(null, msgs);
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
			case TaskPackage.TASK_TYPE__NAME:
				return getName();
			case TaskPackage.TASK_TYPE__STATES:
				if (coreType) return getStates();
				else return getStates().map();
			case TaskPackage.TASK_TYPE__EXTENSION:
				if (resolve) return getExtension();
				return basicGetExtension();
			case TaskPackage.TASK_TYPE__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
			case TaskPackage.TASK_TYPE__RELATIONSHIPS:
				return getRelationships();
			case TaskPackage.TASK_TYPE__RESOLVED_STATES:
				return getResolvedStates();
			case TaskPackage.TASK_TYPE__RESOLUTIONS:
				return getResolutions();
			case TaskPackage.TASK_TYPE__STARTING_RESOLUTION:
				if (resolve) return getStartingResolution();
				return basicGetStartingResolution();
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
			case TaskPackage.TASK_TYPE__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.TASK_TYPE__STATES:
				((EStructuralFeature.Setting)getStates()).set(newValue);
				return;
			case TaskPackage.TASK_TYPE__EXTENSION:
				setExtension((EPackage)newValue);
				return;
			case TaskPackage.TASK_TYPE__STARTING_STATE:
				setStartingState((State)newValue);
				return;
			case TaskPackage.TASK_TYPE__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends TaskRelationship>)newValue);
				return;
			case TaskPackage.TASK_TYPE__RESOLVED_STATES:
				getResolvedStates().clear();
				getResolvedStates().addAll((Collection<? extends State>)newValue);
				return;
			case TaskPackage.TASK_TYPE__RESOLUTIONS:
				getResolutions().clear();
				getResolutions().addAll((Collection<? extends TaskResolution>)newValue);
				return;
			case TaskPackage.TASK_TYPE__STARTING_RESOLUTION:
				setStartingResolution((TaskResolution)newValue);
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
			case TaskPackage.TASK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.TASK_TYPE__STATES:
				getStates().clear();
				return;
			case TaskPackage.TASK_TYPE__EXTENSION:
				setExtension((EPackage)null);
				return;
			case TaskPackage.TASK_TYPE__STARTING_STATE:
				setStartingState((State)null);
				return;
			case TaskPackage.TASK_TYPE__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case TaskPackage.TASK_TYPE__RESOLVED_STATES:
				getResolvedStates().clear();
				return;
			case TaskPackage.TASK_TYPE__RESOLUTIONS:
				getResolutions().clear();
				return;
			case TaskPackage.TASK_TYPE__STARTING_RESOLUTION:
				setStartingResolution((TaskResolution)null);
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
			case TaskPackage.TASK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.TASK_TYPE__STATES:
				return states != null && !states.isEmpty();
			case TaskPackage.TASK_TYPE__EXTENSION:
				return extension != null;
			case TaskPackage.TASK_TYPE__STARTING_STATE:
				return startingState != null;
			case TaskPackage.TASK_TYPE__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case TaskPackage.TASK_TYPE__RESOLVED_STATES:
				return resolvedStates != null && !resolvedStates.isEmpty();
			case TaskPackage.TASK_TYPE__RESOLUTIONS:
				return resolutions != null && !resolutions.isEmpty();
			case TaskPackage.TASK_TYPE__STARTING_RESOLUTION:
				return startingResolution != null;
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

} // TaskType
