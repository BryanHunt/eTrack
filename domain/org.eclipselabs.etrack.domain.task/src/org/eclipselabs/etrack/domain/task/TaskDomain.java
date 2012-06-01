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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StateTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getOpenStates <em>Open States</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getClosedStates <em>Closed States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
 * @model kind="class"
 * @generated
 */
public class TaskDomain extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> transitions;

	/**
	 * The cached value of the '{@link #getTaskTypes() <em>Task Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskType> taskTypes;

	/**
	 * The cached value of the '{@link #getOpenStates() <em>Open States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> openStates;

	/**
	 * The cached value of the '{@link #getClosedStates() <em>Closed States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> closedStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDomain()
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
		return TaskPackage.Literals.TASK_DOMAIN;
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
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_DOMAIN__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public EList<State> getStates()
	{
		if (states == null)
		{
			states = new EObjectContainmentEList<State>(State.class, this, TaskPackage.TASK_DOMAIN__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public EList<StateTransition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectContainmentEList<StateTransition>(StateTransition.class, this, TaskPackage.TASK_DOMAIN__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Task Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Types</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_TaskTypes()
	 * @model containment="true"
	 * @generated
	 */
	public EList<TaskType> getTaskTypes()
	{
		if (taskTypes == null)
		{
			taskTypes = new EObjectContainmentEList<TaskType>(TaskType.class, this, TaskPackage.TASK_DOMAIN__TASK_TYPES);
		}
		return taskTypes;
	}

	/**
	 * Returns the value of the '<em><b>Open States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open States</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_OpenStates()
	 * @model
	 * @generated
	 */
	public EList<State> getOpenStates()
	{
		if (openStates == null)
		{
			openStates = new EObjectResolvingEList<State>(State.class, this, TaskPackage.TASK_DOMAIN__OPEN_STATES);
		}
		return openStates;
	}

	/**
	 * Returns the value of the '<em><b>Closed States</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed States</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_ClosedStates()
	 * @model
	 * @generated
	 */
	public EList<State> getClosedStates()
	{
		if (closedStates == null)
		{
			closedStates = new EObjectResolvingEList<State>(State.class, this, TaskPackage.TASK_DOMAIN__CLOSED_STATES);
		}
		return closedStates;
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
			case TaskPackage.TASK_DOMAIN__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK_DOMAIN__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK_DOMAIN__TASK_TYPES:
				return ((InternalEList<?>)getTaskTypes()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.TASK_DOMAIN__NAME:
				return getName();
			case TaskPackage.TASK_DOMAIN__STATES:
				return getStates();
			case TaskPackage.TASK_DOMAIN__TRANSITIONS:
				return getTransitions();
			case TaskPackage.TASK_DOMAIN__TASK_TYPES:
				return getTaskTypes();
			case TaskPackage.TASK_DOMAIN__OPEN_STATES:
				return getOpenStates();
			case TaskPackage.TASK_DOMAIN__CLOSED_STATES:
				return getClosedStates();
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
			case TaskPackage.TASK_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.TASK_DOMAIN__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case TaskPackage.TASK_DOMAIN__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends StateTransition>)newValue);
				return;
			case TaskPackage.TASK_DOMAIN__TASK_TYPES:
				getTaskTypes().clear();
				getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
				return;
			case TaskPackage.TASK_DOMAIN__OPEN_STATES:
				getOpenStates().clear();
				getOpenStates().addAll((Collection<? extends State>)newValue);
				return;
			case TaskPackage.TASK_DOMAIN__CLOSED_STATES:
				getClosedStates().clear();
				getClosedStates().addAll((Collection<? extends State>)newValue);
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
			case TaskPackage.TASK_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.TASK_DOMAIN__STATES:
				getStates().clear();
				return;
			case TaskPackage.TASK_DOMAIN__TRANSITIONS:
				getTransitions().clear();
				return;
			case TaskPackage.TASK_DOMAIN__TASK_TYPES:
				getTaskTypes().clear();
				return;
			case TaskPackage.TASK_DOMAIN__OPEN_STATES:
				getOpenStates().clear();
				return;
			case TaskPackage.TASK_DOMAIN__CLOSED_STATES:
				getClosedStates().clear();
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
			case TaskPackage.TASK_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.TASK_DOMAIN__STATES:
				return states != null && !states.isEmpty();
			case TaskPackage.TASK_DOMAIN__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case TaskPackage.TASK_DOMAIN__TASK_TYPES:
				return taskTypes != null && !taskTypes.isEmpty();
			case TaskPackage.TASK_DOMAIN__OPEN_STATES:
				return openStates != null && !openStates.isEmpty();
			case TaskPackage.TASK_DOMAIN__CLOSED_STATES:
				return closedStates != null && !closedStates.isEmpty();
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

} // TaskDomain
