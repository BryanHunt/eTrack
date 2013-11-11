/**
 */
package org.eclipselabs.etrack.domain.scrum;

import org.eclipse.emf.ecore.EClass;

import org.eclipselabs.etrack.domain.task.TaskGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backlog</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklog()
 * @model kind="class"
 * @generated
 */
public class Backlog extends TaskGroup
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Backlog()
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
    return ScrumPackage.Literals.BACKLOG;
  }

} // Backlog
