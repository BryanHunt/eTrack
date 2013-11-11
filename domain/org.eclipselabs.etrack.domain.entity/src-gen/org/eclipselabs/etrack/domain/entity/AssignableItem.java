/**
 */
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.AssignableItem#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAssignableItem()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface AssignableItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see #setOwner(Person)
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAssignableItem_Owner()
   * @model
   * @generated
   */
  Person getOwner();

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.AssignableItem#getOwner <em>Owner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(Person value);

} // AssignableItem
