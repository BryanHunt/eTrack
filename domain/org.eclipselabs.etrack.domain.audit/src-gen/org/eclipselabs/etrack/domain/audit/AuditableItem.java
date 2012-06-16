/**
 */
package org.eclipselabs.etrack.domain.audit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auditable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.audit.AuditableItem#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAuditableItem()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface AuditableItem extends EObject
{
  /**
   * Returns the value of the '<em><b>History</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.etrack.domain.audit.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>History</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>History</em>' containment reference list.
   * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAuditableItem_History()
   * @model containment="true"
   * @generated
   */
  EList<Action> getHistory();

} // AuditableItem
