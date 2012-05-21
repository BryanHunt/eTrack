/**
 */
package org.eclipse.etrack.domain.project;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.entity.Identity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrack.domain.project.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.etrack.domain.project.Project#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.eclipse.etrack.domain.project.Project#getAdmins <em>Admins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrack.domain.project.ProjectPackage#getProject()
 * @model kind="class"
 * @generated
 */
public class Project extends MinimalEObjectImpl.Container implements EObject
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
   * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeams()
   * @generated
   * @ordered
   */
  protected EList<Team> teams;

  /**
   * The cached value of the '{@link #getAdmins() <em>Admins</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdmins()
   * @generated
   * @ordered
   */
  protected EList<Identity> admins;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Project()
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
    return ProjectPackage.Literals.PROJECT;
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
   * @see org.eclipse.etrack.domain.project.ProjectPackage#getProject_Name()
   * @model unique="false"
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets the value of the '{@link org.eclipse.etrack.domain.project.Project#getName <em>Name</em>}' attribute.
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProjectPackage.PROJECT__NAME, oldName, name));
  }

  /**
   * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrack.domain.project.Team}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teams</em>' containment reference list.
   * @see org.eclipse.etrack.domain.project.ProjectPackage#getProject_Teams()
   * @model containment="true"
   * @generated
   */
  public EList<Team> getTeams()
  {
    if (teams == null)
    {
      teams = new EObjectContainmentEList<Team>(Team.class, this, ProjectPackage.PROJECT__TEAMS);
    }
    return teams;
  }

  /**
   * Returns the value of the '<em><b>Admins</b></em>' reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Identity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Admins</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Admins</em>' reference list.
   * @see org.eclipse.etrack.domain.project.ProjectPackage#getProject_Admins()
   * @model
   * @generated
   */
  public EList<Identity> getAdmins()
  {
    if (admins == null)
    {
      admins = new EObjectResolvingEList<Identity>(Identity.class, this, ProjectPackage.PROJECT__ADMINS);
    }
    return admins;
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
      case ProjectPackage.PROJECT__TEAMS:
        return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
      case ProjectPackage.PROJECT__NAME:
        return getName();
      case ProjectPackage.PROJECT__TEAMS:
        return getTeams();
      case ProjectPackage.PROJECT__ADMINS:
        return getAdmins();
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
      case ProjectPackage.PROJECT__NAME:
        setName((String)newValue);
        return;
      case ProjectPackage.PROJECT__TEAMS:
        getTeams().clear();
        getTeams().addAll((Collection<? extends Team>)newValue);
        return;
      case ProjectPackage.PROJECT__ADMINS:
        getAdmins().clear();
        getAdmins().addAll((Collection<? extends Identity>)newValue);
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
      case ProjectPackage.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProjectPackage.PROJECT__TEAMS:
        getTeams().clear();
        return;
      case ProjectPackage.PROJECT__ADMINS:
        getAdmins().clear();
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
      case ProjectPackage.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProjectPackage.PROJECT__TEAMS:
        return teams != null && !teams.isEmpty();
      case ProjectPackage.PROJECT__ADMINS:
        return admins != null && !admins.isEmpty();
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

} // Project
