/**
 */
package org.eclipselabs.etrack.developer.database;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getTaskDomains <em>Task Domains</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.developer.database.Database#getAccountRequests <em>Account Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase()
 * @model kind="class"
 * @generated
 */
public class Database extends MinimalEObjectImpl.Container implements EObject
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
   * The cached value of the '{@link #getTaskDomains() <em>Task Domains</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDomains()
   * @generated
   * @ordered
   */
  protected EList<TaskDomains> taskDomains;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Tasks> tasks;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entities> entities;

  /**
   * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccounts()
   * @generated
   * @ordered
   */
  protected EList<Accounts> accounts;

  /**
   * The cached value of the '{@link #getAccountRequests() <em>Account Requests</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountRequests()
   * @generated
   * @ordered
   */
  protected EList<AccountRequests> accountRequests;

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
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_Name()
   * @model unique="false"
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.developer.database.Database#getName <em>Name</em>}' attribute.
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
   * Returns the value of the '<em><b>Task Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.developer.database.TaskDomains}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Domains</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_TaskDomains()
   * @model containment="true"
   * @generated
   */
  public EList<TaskDomains> getTaskDomains()
  {
    if (taskDomains == null)
    {
      taskDomains = new EObjectContainmentEList<TaskDomains>(TaskDomains.class, this, DatabasePackage.DATABASE__TASK_DOMAINS);
    }
    return taskDomains;
  }

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.developer.database.Tasks}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_Tasks()
   * @model containment="true"
   * @generated
   */
  public EList<Tasks> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<Tasks>(Tasks.class, this, DatabasePackage.DATABASE__TASKS);
    }
    return tasks;
  }

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.developer.database.Entities}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_Entities()
   * @model containment="true"
   * @generated
   */
  public EList<Entities> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entities>(Entities.class, this, DatabasePackage.DATABASE__ENTITIES);
    }
    return entities;
  }

  /**
   * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.developer.database.Accounts}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accounts</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_Accounts()
   * @model containment="true"
   * @generated
   */
  public EList<Accounts> getAccounts()
  {
    if (accounts == null)
    {
      accounts = new EObjectContainmentEList<Accounts>(Accounts.class, this, DatabasePackage.DATABASE__ACCOUNTS);
    }
    return accounts;
  }

  /**
   * Returns the value of the '<em><b>Account Requests</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.developer.database.AccountRequests}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Requests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Requests</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase_AccountRequests()
   * @model containment="true"
   * @generated
   */
  public EList<AccountRequests> getAccountRequests()
  {
    if (accountRequests == null)
    {
      accountRequests = new EObjectContainmentEList<AccountRequests>(AccountRequests.class, this, DatabasePackage.DATABASE__ACCOUNT_REQUESTS);
    }
    return accountRequests;
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
      case DatabasePackage.DATABASE__TASK_DOMAINS:
        return ((InternalEList<?>)getTaskDomains()).basicRemove(otherEnd, msgs);
      case DatabasePackage.DATABASE__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case DatabasePackage.DATABASE__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case DatabasePackage.DATABASE__ACCOUNTS:
        return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
      case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
        return ((InternalEList<?>)getAccountRequests()).basicRemove(otherEnd, msgs);
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
      case DatabasePackage.DATABASE__TASK_DOMAINS:
        return getTaskDomains();
      case DatabasePackage.DATABASE__TASKS:
        return getTasks();
      case DatabasePackage.DATABASE__ENTITIES:
        return getEntities();
      case DatabasePackage.DATABASE__ACCOUNTS:
        return getAccounts();
      case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
        return getAccountRequests();
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
      case DatabasePackage.DATABASE__TASK_DOMAINS:
        getTaskDomains().clear();
        getTaskDomains().addAll((Collection<? extends TaskDomains>)newValue);
        return;
      case DatabasePackage.DATABASE__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Tasks>)newValue);
        return;
      case DatabasePackage.DATABASE__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entities>)newValue);
        return;
      case DatabasePackage.DATABASE__ACCOUNTS:
        getAccounts().clear();
        getAccounts().addAll((Collection<? extends Accounts>)newValue);
        return;
      case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
        getAccountRequests().clear();
        getAccountRequests().addAll((Collection<? extends AccountRequests>)newValue);
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
      case DatabasePackage.DATABASE__TASK_DOMAINS:
        getTaskDomains().clear();
        return;
      case DatabasePackage.DATABASE__TASKS:
        getTasks().clear();
        return;
      case DatabasePackage.DATABASE__ENTITIES:
        getEntities().clear();
        return;
      case DatabasePackage.DATABASE__ACCOUNTS:
        getAccounts().clear();
        return;
      case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
        getAccountRequests().clear();
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
      case DatabasePackage.DATABASE__TASK_DOMAINS:
        return taskDomains != null && !taskDomains.isEmpty();
      case DatabasePackage.DATABASE__TASKS:
        return tasks != null && !tasks.isEmpty();
      case DatabasePackage.DATABASE__ENTITIES:
        return entities != null && !entities.isEmpty();
      case DatabasePackage.DATABASE__ACCOUNTS:
        return accounts != null && !accounts.isEmpty();
      case DatabasePackage.DATABASE__ACCOUNT_REQUESTS:
        return accountRequests != null && !accountRequests.isEmpty();
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
