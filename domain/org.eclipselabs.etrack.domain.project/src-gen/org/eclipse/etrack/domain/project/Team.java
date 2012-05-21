/**
 */
package org.eclipse.etrack.domain.project;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.security.PermissionGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.etrack.domain.project.Team#getSubTeams <em>Sub Teams</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.etrack.domain.project.ProjectPackage#getTeam()
 * @model kind="class"
 * @generated
 */
public class Team extends PermissionGroup
{
  /**
   * The cached value of the '{@link #getSubTeams() <em>Sub Teams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubTeams()
   * @generated
   * @ordered
   */
  protected EList<Team> subTeams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Team()
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
    return ProjectPackage.Literals.TEAM;
  }

  /**
   * Returns the value of the '<em><b>Sub Teams</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.etrack.domain.project.Team}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Teams</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Teams</em>' containment reference list.
   * @see org.eclipse.etrack.domain.project.ProjectPackage#getTeam_SubTeams()
   * @model containment="true"
   * @generated
   */
  public EList<Team> getSubTeams()
  {
    if (subTeams == null)
    {
      subTeams = new EObjectContainmentEList<Team>(Team.class, this, ProjectPackage.TEAM__SUB_TEAMS);
    }
    return subTeams;
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
      case ProjectPackage.TEAM__SUB_TEAMS:
        return ((InternalEList<?>)getSubTeams()).basicRemove(otherEnd, msgs);
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
      case ProjectPackage.TEAM__SUB_TEAMS:
        return getSubTeams();
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
      case ProjectPackage.TEAM__SUB_TEAMS:
        getSubTeams().clear();
        getSubTeams().addAll((Collection<? extends Team>)newValue);
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
      case ProjectPackage.TEAM__SUB_TEAMS:
        getSubTeams().clear();
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
      case ProjectPackage.TEAM__SUB_TEAMS:
        return subTeams != null && !subTeams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // Team
