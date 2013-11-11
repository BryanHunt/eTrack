/**
 */
package org.eclipselabs.etrack.domain.scrum.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.etrack.domain.data.LinkedContent;

import org.eclipselabs.etrack.domain.scrum.*;

import org.eclipselabs.etrack.domain.task.TaskGroup;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage
 * @generated
 */
public class ScrumAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScrumPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScrumAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ScrumPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScrumSwitch<Adapter> modelSwitch =
    new ScrumSwitch<Adapter>()
    {
      @Override
      public Adapter caseBacklog(Backlog object)
      {
        return createBacklogAdapter();
      }
      @Override
      public Adapter caseMilestone(Milestone object)
      {
        return createMilestoneAdapter();
      }
      @Override
      public Adapter caseRelease(Release object)
      {
        return createReleaseAdapter();
      }
      @Override
      public Adapter caseTaskTimeBox(TaskTimeBox object)
      {
        return createTaskTimeBoxAdapter();
      }
      @Override
      public Adapter caseBacklogLlink(BacklogLlink object)
      {
        return createBacklogLlinkAdapter();
      }
      @Override
      public Adapter caseReleaseLink(ReleaseLink object)
      {
        return createReleaseLinkAdapter();
      }
      @Override
      public Adapter caseTaskGroup(TaskGroup object)
      {
        return createTaskGroupAdapter();
      }
      @Override
      public Adapter caseLinkedContent(LinkedContent object)
      {
        return createLinkedContentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.Backlog <em>Backlog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.Backlog
   * @generated
   */
  public Adapter createBacklogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.Milestone <em>Milestone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.Milestone
   * @generated
   */
  public Adapter createMilestoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.Release <em>Release</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.Release
   * @generated
   */
  public Adapter createReleaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox <em>Task Time Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox
   * @generated
   */
  public Adapter createTaskTimeBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.BacklogLlink <em>Backlog Llink</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.BacklogLlink
   * @generated
   */
  public Adapter createBacklogLlinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink <em>Release Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.scrum.ReleaseLink
   * @generated
   */
  public Adapter createReleaseLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.task.TaskGroup
   * @generated
   */
  public Adapter createTaskGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.data.LinkedContent <em>Linked Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.etrack.domain.data.LinkedContent
   * @generated
   */
  public Adapter createLinkedContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ScrumAdapterFactory
