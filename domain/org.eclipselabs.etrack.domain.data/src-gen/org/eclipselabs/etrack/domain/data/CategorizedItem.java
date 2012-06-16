/**
 */
package org.eclipselabs.etrack.domain.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorized Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.data.CategorizedItem#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.data.DataPackage#getCategorizedItem()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface CategorizedItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see #setCategory(String)
   * @see org.eclipselabs.etrack.domain.data.DataPackage#getCategorizedItem_Category()
   * @model unique="false"
   * @generated
   */
  String getCategory();

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.data.CategorizedItem#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see #getCategory()
   * @generated
   */
  void setCategory(String value);

} // CategorizedItem
