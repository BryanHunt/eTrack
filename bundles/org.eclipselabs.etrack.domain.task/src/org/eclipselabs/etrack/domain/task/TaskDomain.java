/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getTaskTypes() <em>Task Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTypes()
	 * @generated
	 * @ordered
	 */
	protected EPackage taskTypes;

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
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_States()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	public EList<State> getStates()
	{
		if (states == null)
		{
			states = new EObjectContainmentEList.Resolving<State>(State.class, this, TaskPackage.TASK_DOMAIN__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Transitions()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	public EList<StateTransition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectContainmentEList.Resolving<StateTransition>(StateTransition.class, this, TaskPackage.TASK_DOMAIN__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Task Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Types</em>' containment reference.
	 * @see #setTaskTypes(EPackage)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_TaskTypes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EPackage getTaskTypes()
	{
		if (taskTypes != null && taskTypes.eIsProxy())
		{
			InternalEObject oldTaskTypes = (InternalEObject)taskTypes;
			taskTypes = (EPackage)eResolveProxy(oldTaskTypes);
			if (taskTypes != oldTaskTypes)
			{
				InternalEObject newTaskTypes = (InternalEObject)taskTypes;
				NotificationChain msgs = oldTaskTypes.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_DOMAIN__TASK_TYPES, null, null);
				if (newTaskTypes.eInternalContainer() == null)
				{
					msgs = newTaskTypes.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_DOMAIN__TASK_TYPES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_DOMAIN__TASK_TYPES, oldTaskTypes, taskTypes));
			}
		}
		return taskTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetTaskTypes()
	{
		return taskTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskTypes(EPackage newTaskTypes, NotificationChain msgs)
	{
		EPackage oldTaskTypes = taskTypes;
		taskTypes = newTaskTypes;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_DOMAIN__TASK_TYPES, oldTaskTypes, newTaskTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes <em>Task Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Types</em>' containment reference.
	 * @see #getTaskTypes()
	 * @generated
	 */
	public void setTaskTypes(EPackage newTaskTypes)
	{
		if (newTaskTypes != taskTypes)
		{
			NotificationChain msgs = null;
			if (taskTypes != null)
				msgs = ((InternalEObject)taskTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_DOMAIN__TASK_TYPES, null, msgs);
			if (newTaskTypes != null)
				msgs = ((InternalEObject)newTaskTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.TASK_DOMAIN__TASK_TYPES, null, msgs);
			msgs = basicSetTaskTypes(newTaskTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_DOMAIN__TASK_TYPES, newTaskTypes, newTaskTypes));
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
				return basicSetTaskTypes(null, msgs);
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
				if (resolve) return getTaskTypes();
				return basicGetTaskTypes();
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
				setTaskTypes((EPackage)newValue);
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
				setTaskTypes((EPackage)null);
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
				return taskTypes != null;
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
