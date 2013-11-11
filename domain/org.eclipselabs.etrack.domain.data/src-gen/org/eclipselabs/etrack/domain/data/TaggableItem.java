/**
 */
package org.eclipselabs.etrack.domain.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taggable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.data.TaggableItem#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.data.DataPackage#getTaggableItem()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface TaggableItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see org.eclipselabs.etrack.domain.data.DataPackage#getTaggableItem_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

} // TaggableItem
