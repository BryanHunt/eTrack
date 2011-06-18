/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.etrack.domain.task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage
 * @generated
 */
public class TaskFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TaskFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskFactory init()
	{
		try
		{
			TaskFactory theTaskFactory = (TaskFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/etrack/domain/task"); 
			if (theTaskFactory != null)
			{
				return theTaskFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case TaskPackage.ASSIGNABLE_ITEM: return createAssignableItem();
			case TaskPackage.TASK: return createTask();
			case TaskPackage.STATE: return createState();
			case TaskPackage.STATE_TRANSITION: return createStateTransition();
			case TaskPackage.TASK_DOMAIN: return createTaskDomain();
			case TaskPackage.COMMENT: return createComment();
			case TaskPackage.ATTACHMENT: return createAttachment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignableItem createAssignableItem()
	{
		AssignableItem assignableItem = new AssignableItem();
		return assignableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask()
	{
		Task task = new Task();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState()
	{
		State state = new State();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition()
	{
		StateTransition stateTransition = new StateTransition();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDomain createTaskDomain()
	{
		TaskDomain taskDomain = new TaskDomain();
		return taskDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment()
	{
		Comment comment = new Comment();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment()
	{
		Attachment attachment = new Attachment();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPackage getTaskPackage()
	{
		return (TaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskPackage getPackage()
	{
		return TaskPackage.eINSTANCE;
	}

} //TaskFactory
