/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclilpselabs.etrack.developer.database;

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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.account.Account;
import org.eclipselabs.etrack.domain.account.AccountRequest;

import org.eclipselabs.etrack.domain.entity.Entity;

import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getName <em>Name</em>}</li>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getTaskDomain <em>Task Domain</em>}</li>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getAccountRequests <em>Account Requests</em>}</li>
 *   <li>{@link org.eclilpselabs.etrack.developer.database.Database#getAccounts <em>Accounts</em>}</li>
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
	 * The cached value of the '{@link #getTaskDomain() <em>Task Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDomain()
	 * @generated
	 * @ordered
	 */
	protected TaskDomain taskDomain;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getAccountRequests() <em>Account Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountRequest> accountRequests;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Database()
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
		return DatabasePackage.Literals.DATABASE;
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
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Task Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * @generated
	 */
	public NotificationChain basicSetTaskDomain(TaskDomain newTaskDomain, NotificationChain msgs)
	{
		TaskDomain oldTaskDomain = taskDomain;
		taskDomain = newTaskDomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASK_DOMAIN, oldTaskDomain, newTaskDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclilpselabs.etrack.developer.database.Database#getTaskDomain <em>Task Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				msgs = ((InternalEObject)taskDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASK_DOMAIN, null, msgs);
			if (newTaskDomain != null)
				msgs = ((InternalEObject)newTaskDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.DATABASE__TASK_DOMAIN, null, msgs);
			msgs = basicSetTaskDomain(newTaskDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE__TASK_DOMAIN, newTaskDomain, newTaskDomain));
	}

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Task> getTasks()
	{
		if (tasks == null)
		{
			tasks = new EObjectContainmentEList<Task>(Task.class, this, DatabasePackage.DATABASE__TASKS);
		}
		return tasks;
	}

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Entities()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Entity> getEntities()
	{
		if (entities == null)
		{
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, DatabasePackage.DATABASE__ENTITIES);
		}
		return entities;
	}

	/**
	 * Returns the value of the '<em><b>Account Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.account.AccountRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Requests</em>' containment reference list.
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_AccountRequests()
	 * @model containment="true"
	 * @generated
	 */
	public EList<AccountRequest> getAccountRequests()
	{
		if (accountRequests == null)
		{
			accountRequests = new EObjectContainmentEList<AccountRequest>(AccountRequest.class, this, DatabasePackage.DATABASE__ACCOUNT_REQUESTS);
		}
		return accountRequests;
	}

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.account.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Account> getAccounts()
	{
		if (accounts == null)
		{
			accounts = new EObjectContainmentEList<Account>(Account.class, this, DatabasePackage.DATABASE__ACCOUNTS);
		}
		return accounts;
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
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				return basicSetTaskDomain(null, msgs);
			case DatabasePackage.DATABASE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case DatabasePackage.DATABASE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				return ((InternalEList<?>)getAccountRequests()).basicRemove(otherEnd, msgs);
			case DatabasePackage.DATABASE__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DatabasePackage.DATABASE__NAME:
				setName((String)newValue);
				return;
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				setTaskDomain((TaskDomain)newValue);
				return;
			case DatabasePackage.DATABASE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case DatabasePackage.DATABASE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				getAccountRequests().clear();
				getAccountRequests().addAll((Collection<? extends AccountRequest>)newValue);
				return;
			case DatabasePackage.DATABASE__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
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
			case DatabasePackage.DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				setTaskDomain((TaskDomain)null);
				return;
			case DatabasePackage.DATABASE__TASKS:
				getTasks().clear();
				return;
			case DatabasePackage.DATABASE__ENTITIES:
				getEntities().clear();
				return;
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				getAccountRequests().clear();
				return;
			case DatabasePackage.DATABASE__ACCOUNTS:
				getAccounts().clear();
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
			case DatabasePackage.DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatabasePackage.DATABASE__TASK_DOMAIN:
				return taskDomain != null;
			case DatabasePackage.DATABASE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case DatabasePackage.DATABASE__ENTITIES:
				return entities != null && !entities.isEmpty();
			case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
				return accountRequests != null && !accountRequests.isEmpty();
			case DatabasePackage.DATABASE__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
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

} // Database
