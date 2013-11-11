/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.state.State;
import org.eclipselabs.etrack.domain.state.StateGroup;
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
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStateGroups <em>State Groups</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getResolutions <em>Resolutions</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomain#getExtensions <em>Extensions</em>}</li>
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
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<StateTransition> transitions;

  /**
   * The cached value of the '{@link #getStateGroups() <em>State Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateGroups()
   * @generated
   * @ordered
   */
  protected EList<StateGroup> stateGroups;

  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<TaskRelationship> relationships;

  /**
   * The cached value of the '{@link #getResolutions() <em>Resolutions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolutions()
   * @generated
   * @ordered
   */
  protected EList<TaskResolution> resolutions;

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
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<EPackage> extensions;

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
   * @model containment="true"
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
   * Returns the value of the '<em><b>State Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.state.StateGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Groups</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_StateGroups()
   * @model containment="true"
   * @generated
   */
  public EList<StateGroup> getStateGroups()
  {
    if (stateGroups == null)
    {
      stateGroups = new EObjectContainmentEList<StateGroup>(StateGroup.class, this, TaskPackage.TASK_DOMAIN__STATE_GROUPS);
    }
    return stateGroups;
  }

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskRelationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Relationships()
   * @model containment="true"
   * @generated
   */
  public EList<TaskRelationship> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<TaskRelationship>(TaskRelationship.class, this, TaskPackage.TASK_DOMAIN__RELATIONSHIPS);
    }
    return relationships;
  }

  /**
   * Returns the value of the '<em><b>Resolutions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.task.TaskResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolutions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolutions</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Resolutions()
   * @model containment="true"
   * @generated
   */
  public EList<TaskResolution> getResolutions()
  {
    if (resolutions == null)
    {
      resolutions = new EObjectContainmentEList<TaskResolution>(TaskResolution.class, this, TaskPackage.TASK_DOMAIN__RESOLUTIONS);
    }
    return resolutions;
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
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain_Extensions()
   * @model containment="true"
   * @generated
   */
  public EList<EPackage> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<EPackage>(EPackage.class, this, TaskPackage.TASK_DOMAIN__EXTENSIONS);
    }
    return extensions;
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
      case TaskPackage.TASK_DOMAIN__STATE_GROUPS:
        return ((InternalEList<?>)getStateGroups()).basicRemove(otherEnd, msgs);
      case TaskPackage.TASK_DOMAIN__RELATIONSHIPS:
        return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
      case TaskPackage.TASK_DOMAIN__RESOLUTIONS:
        return ((InternalEList<?>)getResolutions()).basicRemove(otherEnd, msgs);
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        return ((InternalEList<?>)getTaskTypes()).basicRemove(otherEnd, msgs);
      case TaskPackage.TASK_DOMAIN__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
      case TaskPackage.TASK_DOMAIN__STATE_GROUPS:
        return getStateGroups();
      case TaskPackage.TASK_DOMAIN__RELATIONSHIPS:
        return getRelationships();
      case TaskPackage.TASK_DOMAIN__RESOLUTIONS:
        return getResolutions();
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        return getTaskTypes();
      case TaskPackage.TASK_DOMAIN__EXTENSIONS:
        return getExtensions();
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
      case TaskPackage.TASK_DOMAIN__STATE_GROUPS:
        getStateGroups().clear();
        getStateGroups().addAll((Collection<? extends StateGroup>)newValue);
        return;
      case TaskPackage.TASK_DOMAIN__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends TaskRelationship>)newValue);
        return;
      case TaskPackage.TASK_DOMAIN__RESOLUTIONS:
        getResolutions().clear();
        getResolutions().addAll((Collection<? extends TaskResolution>)newValue);
        return;
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        getTaskTypes().clear();
        getTaskTypes().addAll((Collection<? extends TaskType>)newValue);
        return;
      case TaskPackage.TASK_DOMAIN__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends EPackage>)newValue);
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
      case TaskPackage.TASK_DOMAIN__STATE_GROUPS:
        getStateGroups().clear();
        return;
      case TaskPackage.TASK_DOMAIN__RELATIONSHIPS:
        getRelationships().clear();
        return;
      case TaskPackage.TASK_DOMAIN__RESOLUTIONS:
        getResolutions().clear();
        return;
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        getTaskTypes().clear();
        return;
      case TaskPackage.TASK_DOMAIN__EXTENSIONS:
        getExtensions().clear();
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
      case TaskPackage.TASK_DOMAIN__STATE_GROUPS:
        return stateGroups != null && !stateGroups.isEmpty();
      case TaskPackage.TASK_DOMAIN__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
      case TaskPackage.TASK_DOMAIN__RESOLUTIONS:
        return resolutions != null && !resolutions.isEmpty();
      case TaskPackage.TASK_DOMAIN__TASK_TYPES:
        return taskTypes != null && !taskTypes.isEmpty();
      case TaskPackage.TASK_DOMAIN__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
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
