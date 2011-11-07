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

package org.eclilpselabs.etrack.developer.database;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipselabs.etrack.domain.task.TaskDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getName <em>Name</em>}</li>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getTaskDomain <em>Task Domain
 * </em>}</li>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getTasks <em>Tasks</em>}</li>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getEntities <em>Entities</em>}</li>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getAccountRequests <em>Account
 * Requests</em>}</li>
 * <li>{@link org.eclilpselabs.etrack.developer.database.Database#getAccounts <em>Accounts</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase()
 * @model kind="class"
 * @generated
 */
public class Database extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskDomain() <em>Task Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTaskDomain()
	 * @generated
	 * @ordered
	 */
	protected TaskDomain taskDomain;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected Tasks tasks;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected Entities entities;

	/**
	 * The cached value of the '{@link #getAccountRequests() <em>Account Requests</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAccountRequests()
	 * @generated
	 * @ordered
	 */
	protected AccountRequests accountRequests;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected Accounts accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Database()
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
		return DatabasePackage.Literals.DATABASE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getName
	 * <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Task Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Domain</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Task Domain</em>' containment reference.
	 * @see #setTaskDomain(TaskDomain)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_TaskDomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public TaskDomain getTaskDomain()
	{
		return taskDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTaskDomain(TaskDomain newTaskDomain, NotificationChain msgs)
	{
		TaskDomain oldTaskDomain = taskDomain;
		taskDomain = newTaskDomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASK_DOMAIN, oldTaskDomain, newTaskDomain);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '
	 * {@link org.eclilpselabs.etrack.developer.database.Database#getTaskDomain <em>Task Domain</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Task Domain</em>' containment reference.
	 * @see #getTaskDomain()
	 * @generated
	 */
	public void setTaskDomain(TaskDomain newTaskDomain)
	{
		if (newTaskDomain != taskDomain)
		{
			NotificationChain msgs = null;
			if (taskDomain != null)
				msgs = ((InternalEObject) taskDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASK_DOMAIN, null, msgs);
			if (newTaskDomain != null)
				msgs = ((InternalEObject) newTaskDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASK_DOMAIN, null, msgs);
			msgs = basicSetTaskDomain(newTaskDomain, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASK_DOMAIN, newTaskDomain, newTaskDomain));
	}

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tasks</em>' containment reference.
	 * @see #setTasks(Tasks)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	public Tasks getTasks()
	{
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTasks(Tasks newTasks, NotificationChain msgs)
	{
		Tasks oldTasks = tasks;
		tasks = newTasks;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASKS, oldTasks, newTasks);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getTasks
	 * <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Tasks</em>' containment reference.
	 * @see #getTasks()
	 * @generated
	 */
	public void setTasks(Tasks newTasks)
	{
		if (newTasks != tasks)
		{
			NotificationChain msgs = null;
			if (tasks != null)
				msgs = ((InternalEObject) tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASKS, null, msgs);
			if (newTasks != null)
				msgs = ((InternalEObject) newTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASKS, null, msgs);
			msgs = basicSetTasks(newTasks, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASKS, newTasks, newTasks));
	}

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entities</em>' containment reference.
	 * @see #setEntities(Entities)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Entities()
	 * @model containment="true"
	 * @generated
	 */
	public Entities getEntities()
	{
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntities(Entities newEntities, NotificationChain msgs)
	{
		Entities oldEntities = entities;
		entities = newEntities;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ENTITIES, oldEntities, newEntities);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getEntities
	 * <em>Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Entities</em>' containment reference.
	 * @see #getEntities()
	 * @generated
	 */
	public void setEntities(Entities newEntities)
	{
		if (newEntities != entities)
		{
			NotificationChain msgs = null;
			if (entities != null)
				msgs = ((InternalEObject) entities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ENTITIES, null, msgs);
			if (newEntities != null)
				msgs = ((InternalEObject) newEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ENTITIES, null, msgs);
			msgs = basicSetEntities(newEntities, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ENTITIES, newEntities, newEntities));
	}

	/**
	 * Returns the value of the '<em><b>Account Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Requests</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Account Requests</em>' containment reference.
	 * @see #setAccountRequests(AccountRequests)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_AccountRequests()
	 * @model containment="true"
	 * @generated
	 */
	public AccountRequests getAccountRequests()
	{
		return accountRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAccountRequests(AccountRequests newAccountRequests, NotificationChain msgs)
	{
		AccountRequests oldAccountRequests = accountRequests;
		accountRequests = newAccountRequests;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ACCOUNT_REQUESTS, oldAccountRequests, newAccountRequests);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '
	 * {@link org.eclilpselabs.etrack.developer.database.Database#getAccountRequests
	 * <em>Account Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Account Requests</em>' containment reference.
	 * @see #getAccountRequests()
	 * @generated
	 */
	public void setAccountRequests(AccountRequests newAccountRequests)
	{
		if (newAccountRequests != accountRequests)
		{
			NotificationChain msgs = null;
			if (accountRequests != null)
				msgs = ((InternalEObject) accountRequests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ACCOUNT_REQUESTS, null, msgs);
			if (newAccountRequests != null)
				msgs = ((InternalEObject) newAccountRequests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ACCOUNT_REQUESTS, null, msgs);
			msgs = basicSetAccountRequests(newAccountRequests, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ACCOUNT_REQUESTS, newAccountRequests, newAccountRequests));
	}

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Accounts</em>' containment reference.
	 * @see #setAccounts(Accounts)
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	public Accounts getAccounts()
	{
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAccounts(Accounts newAccounts, NotificationChain msgs)
	{
		Accounts oldAccounts = accounts;
		accounts = newAccounts;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ACCOUNTS, oldAccounts, newAccounts);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getAccounts
	 * <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Accounts</em>' containment reference.
	 * @see #getAccounts()
	 * @generated
	 */
	public void setAccounts(Accounts newAccounts)
	{
		if (newAccounts != accounts)
		{
			NotificationChain msgs = null;
			if (accounts != null)
				msgs = ((InternalEObject) accounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ACCOUNTS, null, msgs);
			if (newAccounts != null)
				msgs = ((InternalEObject) newAccounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__ACCOUNTS, null, msgs);
			msgs = basicSetAccounts(newAccounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__ACCOUNTS, newAccounts, newAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				return basicSetTaskDomain(null, msgs);
			case DatabasePackage.DATABASE__TASKS:
				return basicSetTasks(null, msgs);
			case DatabasePackage.DATABASE__ENTITIES:
				return basicSetEntities(null, msgs);
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				return basicSetAccountRequests(null, msgs);
			case DatabasePackage.DATABASE__ACCOUNTS:
				return basicSetAccounts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case DatabasePackage.DATABASE__NAME:
				return getName();
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				return getTaskDomain();
			case DatabasePackage.DATABASE__TASKS:
				return getTasks();
			case DatabasePackage.DATABASE__ENTITIES:
				return getEntities();
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				return getAccountRequests();
			case DatabasePackage.DATABASE__ACCOUNTS:
				return getAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DatabasePackage.DATABASE__NAME:
				setName((String) newValue);
				return;
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				setTaskDomain((TaskDomain) newValue);
				return;
			case DatabasePackage.DATABASE__TASKS:
				setTasks((Tasks) newValue);
				return;
			case DatabasePackage.DATABASE__ENTITIES:
				setEntities((Entities) newValue);
				return;
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				setAccountRequests((AccountRequests) newValue);
				return;
			case DatabasePackage.DATABASE__ACCOUNTS:
				setAccounts((Accounts) newValue);
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
			case DatabasePackage.DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				setTaskDomain((TaskDomain) null);
				return;
			case DatabasePackage.DATABASE__TASKS:
				setTasks((Tasks) null);
				return;
			case DatabasePackage.DATABASE__ENTITIES:
				setEntities((Entities) null);
				return;
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				setAccountRequests((AccountRequests) null);
				return;
			case DatabasePackage.DATABASE__ACCOUNTS:
				setAccounts((Accounts) null);
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
			case DatabasePackage.DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				return taskDomain != null;
			case DatabasePackage.DATABASE__TASKS:
				return tasks != null;
			case DatabasePackage.DATABASE__ENTITIES:
				return entities != null;
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				return accountRequests != null;
			case DatabasePackage.DATABASE__ACCOUNTS:
				return accounts != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // Database
