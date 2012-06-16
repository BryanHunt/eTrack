/**
 */
package org.eclipselabs.etrack.domain.data;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.data.Linkable#getLinksByName <em>Links By Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.data.DataPackage#getLinkable()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Linkable extends EObject
{
  /**
   * Returns the value of the '<em><b>Links By Name</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link org.eclipselabs.etrack.domain.data.LinkedContent},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links By Name</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links By Name</em>' map.
   * @see org.eclipselabs.etrack.domain.data.DataPackage#getLinkable_LinksByName()
   * @model mapType="org.eclipselabs.etrack.domain.data.LinkMapping<org.eclipse.emf.ecore.EString, org.eclipselabs.etrack.domain.data.LinkedContent>"
   * @generated
   */
  EMap<String, LinkedContent> getLinksByName();

} // Linkable
