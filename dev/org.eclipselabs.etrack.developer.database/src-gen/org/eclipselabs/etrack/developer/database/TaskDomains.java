/**
 */
package org.eclipselabs.etrack.developer.database;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.task.TaskDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Domains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.developer.database.TaskDomains#getTaskDomains <em>Task Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTaskDomains()
 * @model kind="class"
 * @generated
 */
public class TaskDomains extends MinimalEObjectImpl.Container implements EObject
{
  /**
   * The cached value of the '{@link #getTaskDomains() <em>Task Domains</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDomains()
   * @generated
   * @ordered
   */
  protected EList<TaskDomain> taskDomains;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskDomains()
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
    return DatabasePackage.Literals.TASK_DOMAINS;
  }

  /**
   * Returns the value of the '<em><b>Task Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskDomain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Domains</em>' containment reference list.
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTaskDomains_TaskDomains()
   * @model containment="true"
   * @generated
   */
  public EList<TaskDomain> getTaskDomains()
  {
    if (taskDomains == null)
    {
      taskDomains = new EObjectContainmentEList<TaskDomain>(TaskDomain.class, this, DatabasePackage.TASK_DOMAINS__TASK_DOMAINS);
    }
    return taskDomains;
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
      case DatabasePackage.TASK_DOMAINS__TASK_DOMAINS:
        return ((InternalEList<?>)getTaskDomains()).basicRemove(otherEnd, msgs);
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
      case DatabasePackage.TASK_DOMAINS__TASK_DOMAINS:
        return getTaskDomains();
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
      case DatabasePackage.TASK_DOMAINS__TASK_DOMAINS:
        getTaskDomains().clear();
        getTaskDomains().addAll((Collection<? extends TaskDomain>)newValue);
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
      case DatabasePackage.TASK_DOMAINS__TASK_DOMAINS:
        getTaskDomains().clear();
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
      case DatabasePackage.TASK_DOMAINS__TASK_DOMAINS:
        return taskDomains != null && !taskDomains.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // TaskDomains
