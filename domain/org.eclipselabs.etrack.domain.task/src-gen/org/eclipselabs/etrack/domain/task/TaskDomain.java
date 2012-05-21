/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStateTransitions <em>State Transitions</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes <em>Task Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
 * @model kind="class"
 * @generated
 */
public class TaskDomain extends MinimalEObjectImpl.Container implements EObject
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
   * The cached value of the '{@link #getStateTransitions() <em>State Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateTransitions()
   * @generated
   * @ordered
   */
  protected EList<StateTransition> stateTransitions;

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
   * @model unique="false"
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
   * @model containment="true"
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
   * Returns the value of the '<em><b>State Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.state.StateTransition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Transitions</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_StateTransitions()
   * @model containment="true"
   * @generated
   */
  public EList<StateTransition> getStateTransitions()
  {
    if (stateTransitions == null)
    {
      stateTransitions = new EObjectContainmentEList<StateTransition>(StateTransition.class, this, TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS);
    }
    return stateTransitions;
  }

  /**
   * Returns the value of the '<em><b>Task Types</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Types</em>' containment reference list isn't clear,
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
      case TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS:
        return ((InternalEList<?>)getStateTransitions()).basicRemove(otherEnd, msgs);
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
      case TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS:
        return getStateTransitions();
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        return getTaskTypes();
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
      case TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS:
        getStateTransitions().clear();
        getStateTransitions().addAll((Collection<? extends StateTransition>)newValue);
        return;
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        getTaskTypes().clear();
        getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
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
      case TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS:
        getStateTransitions().clear();
        return;
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        getTaskTypes().clear();
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
      case TaskPackage.TASK_DOMAIN__STATE_TRANSITIONS:
        return stateTransitions != null && !stateTransitions.isEmpty();
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        return taskTypes != null && !taskTypes.isEmpty();
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
