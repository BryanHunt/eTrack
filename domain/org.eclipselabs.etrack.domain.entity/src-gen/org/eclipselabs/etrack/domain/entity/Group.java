/**
 */
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Group#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Group extends EObject
{
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
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Identity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' reference list.
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup_Members()
   * @model
   * @generated
   */
  EList<Identity> getMembers();

} // Group
