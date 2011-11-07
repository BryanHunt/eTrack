/**
 * Copyright (c) 2011 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.etrack.domain.entity.EntityPackage;
import org.eclipselabs.etrack.domain.links.LinksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskFactory
 * @model kind="package"
 * @generated
 */
public class TaskPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "task";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/task";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.task";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TaskPackage eINSTANCE = org.eclipselabs.etrack.domain.task.TaskPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.AssignableItem <em>Assignable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.AssignableItem
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem()
	 * @generated
	 */
	public static final int ASSIGNABLE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNABLE_ITEM__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Assignable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Task
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
	 * @generated
	 */
	public static final int TASK = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__OWNER = ASSIGNABLE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__SUMMARY = ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__DESCRIPTION = ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__LINKS = ASSIGNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__ATTACHMENTS = ASSIGNABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__COMMENTS = ASSIGNABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__STATE = ASSIGNABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__SUBSCRIBERS = ASSIGNABLE_ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__TYPE = ASSIGNABLE_ITEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__DEPENDS_ON = ASSIGNABLE_ITEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__BLOCKS = ASSIGNABLE_ITEM_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_FEATURE_COUNT = ASSIGNABLE_ITEM_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.State
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getState()
	 * @generated
	 */
	public static final int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.StateTransition <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.StateTransition
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransition()
	 * @generated
	 */
	public static final int STATE_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__TARGET_STATE = 1;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
	 * @generated
	 */
	public static final int TASK_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__STATES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__TASK_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Comment
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment()
	 * @generated
	 */
	public static final int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT__OWNER = ASSIGNABLE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT__TEXT = ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT_FEATURE_COUNT = ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Attachment
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
	 * @generated
	 */
	public static final int ATTACHMENT = 6;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__OWNER = ASSIGNABLE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__DESCRIPTION = ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__DATA_CONTAINER = ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_FEATURE_COUNT = ASSIGNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskType
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType()
	 * @generated
	 */
	public static final int TASK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__EXTENSION = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.StateTransitionMap <em>State Transition Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.StateTransitionMap
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMap()
	 * @generated
	 */
	public static final int STATE_TRANSITION_MAP = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>State Transition Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachmentData()
	 * @generated
	 */
	public static final int ATTACHMENT_DATA = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_DATA__DATA = 0;

	/**
	 * The number of structural features of the '<em>Attachment Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_DATA_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskPackage()
	{
		super(eNS_URI, TaskFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TaskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskPackage init()
	{
		if (isInited) return (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Obtain or create and register package
		TaskPackage theTaskPackage = (TaskPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaskPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaskPackage());

		isInited = true;

		// Initialize simple dependencies
		EntityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaskPackage.createPackageContents();

		// Initialize created meta-data
		theTaskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskPackage.eNS_URI, theTaskPackage);
		return theTaskPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.AssignableItem <em>Assignable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable Item</em>'.
	 * @see org.eclipselabs.etrack.domain.task.AssignableItem
	 * @generated
	 */
	public EClass getAssignableItem()
	{
		return assignableItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.AssignableItem#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.eclipselabs.etrack.domain.task.AssignableItem#getOwner()
	 * @see #getAssignableItem()
	 * @generated
	 */
	public EReference getAssignableItem_Owner()
	{
		return (EReference)assignableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task
	 * @generated
	 */
	public EClass getTask()
	{
		return taskEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getSummary()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_Summary()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_Description()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.etrack.domain.task.Task#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Links</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getLinks()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Links()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.Task#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getAttachments()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Attachments()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.Task#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getComments()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Comments()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getState()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_State()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.Task#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribers</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getSubscribers()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Subscribers()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getType()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Type()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.Task#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getDependsOn()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_DependsOn()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.Task#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocks</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getBlocks()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Blocks()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipselabs.etrack.domain.task.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.State#getName()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Name()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.eclipselabs.etrack.domain.task.StateTransition
	 * @generated
	 */
	public EClass getStateTransition()
	{
		return stateTransitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.StateTransition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.StateTransition#getName()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EAttribute getStateTransition_Name()
	{
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.StateTransition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see org.eclipselabs.etrack.domain.task.StateTransition#getTargetState()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EReference getStateTransition_TargetState()
	{
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain
	 * @generated
	 */
	public EClass getTaskDomain()
	{
		return taskDomainEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getName()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EAttribute getTaskDomain_Name()
	{
		return (EAttribute)taskDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getStates()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_States()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getTransitions()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_Transitions()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes <em>Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Types</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getTaskTypes()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_TaskTypes()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Comment
	 * @generated
	 */
	public EClass getComment()
	{
		return commentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	public EAttribute getComment_Text()
	{
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Attachment
	 * @generated
	 */
	public EClass getAttachment()
	{
		return attachmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Attachment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Attachment#getDescription()
	 * @see #getAttachment()
	 * @generated
	 */
	public EAttribute getAttachment_Description()
	{
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.task.Attachment#getDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Container</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Attachment#getDataContainer()
	 * @see #getAttachment()
	 * @generated
	 */
	public EReference getAttachment_DataContainer()
	{
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType
	 * @generated
	 */
	public EClass getTaskType()
	{
		return taskTypeEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	public EAttribute getTaskType_Name()
	{
		return (EAttribute)taskTypeEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.etrack.domain.task.TaskType#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getStates()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_States()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.task.TaskType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getExtension()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_Extension()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>State Transition Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipselabs.etrack.domain.task.State"
	 *        valueType="org.eclipselabs.etrack.domain.task.StateTransition" valueMany="true"
	 * @generated
	 */
	public EClass getStateTransitionMap()
	{
		return stateTransitionMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateTransitionMap()
	 * @generated
	 */
	public EReference getStateTransitionMap_Key()
	{
		return (EReference)stateTransitionMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateTransitionMap()
	 * @generated
	 */
	public EReference getStateTransitionMap_Value()
	{
		return (EReference)stateTransitionMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Data</em>'.
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData
	 * @generated
	 */
	public EClass getAttachmentData()
	{
		return attachmentDataEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.AttachmentData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData#getData()
	 * @see #getAttachmentData()
	 * @generated
	 */
	public EAttribute getAttachmentData_Data()
	{
		return (EAttribute)attachmentDataEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public TaskFactory getTaskFactory()
	{
		return (TaskFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assignableItemEClass = createEClass(ASSIGNABLE_ITEM);
		createEReference(assignableItemEClass, ASSIGNABLE_ITEM__OWNER);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__SUMMARY);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__LINKS);
		createEReference(taskEClass, TASK__ATTACHMENTS);
		createEReference(taskEClass, TASK__COMMENTS);
		createEReference(taskEClass, TASK__STATE);
		createEReference(taskEClass, TASK__SUBSCRIBERS);
		createEReference(taskEClass, TASK__TYPE);
		createEReference(taskEClass, TASK__DEPENDS_ON);
		createEReference(taskEClass, TASK__BLOCKS);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__NAME);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TARGET_STATE);

		taskDomainEClass = createEClass(TASK_DOMAIN);
		createEAttribute(taskDomainEClass, TASK_DOMAIN__NAME);
		createEReference(taskDomainEClass, TASK_DOMAIN__STATES);
		createEReference(taskDomainEClass, TASK_DOMAIN__TRANSITIONS);
		createEReference(taskDomainEClass, TASK_DOMAIN__TASK_TYPES);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);

		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__DESCRIPTION);
		createEReference(attachmentEClass, ATTACHMENT__DATA_CONTAINER);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
		createEReference(taskTypeEClass, TASK_TYPE__STATES);
		createEReference(taskTypeEClass, TASK_TYPE__EXTENSION);

		stateTransitionMapEClass = createEClass(STATE_TRANSITION_MAP);
		createEReference(stateTransitionMapEClass, STATE_TRANSITION_MAP__KEY);
		createEReference(stateTransitionMapEClass, STATE_TRANSITION_MAP__VALUE);

		attachmentDataEClass = createEClass(ATTACHMENT_DATA);
		createEAttribute(attachmentDataEClass, ATTACHMENT_DATA__DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		LinksPackage theLinksPackage = (LinksPackage)EPackage.Registry.INSTANCE.getEPackage(LinksPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskEClass.getESuperTypes().add(this.getAssignableItem());
		commentEClass.getESuperTypes().add(this.getAssignableItem());
		attachmentEClass.getESuperTypes().add(this.getAssignableItem());

		// Initialize classes and features; add operations and parameters
		initEClass(assignableItemEClass, AssignableItem.class, "AssignableItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignableItem_Owner(), theEntityPackage.getPerson(), null, "owner", null, 1, 1, AssignableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Links(), theLinksPackage.getLinkMap(), null, "links", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Attachments(), this.getAttachment(), null, "attachments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Comments(), this.getComment(), null, "comments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_State(), this.getState(), null, "state", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Subscribers(), theEntityPackage.getPerson(), null, "subscribers", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Type(), this.getTaskType(), null, "type", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_DependsOn(), this.getTask(), this.getTask_Blocks(), "dependsOn", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Blocks(), this.getTask(), this.getTask_DependsOn(), "blocks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateTransition_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_TargetState(), this.getState(), null, "targetState", null, 0, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDomainEClass, TaskDomain.class, "TaskDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDomain_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_States(), this.getState(), null, "states", null, 1, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_Transitions(), this.getStateTransition(), null, "transitions", null, 1, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_TaskTypes(), this.getTaskType(), null, "taskTypes", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Description(), ecorePackage.getEString(), "description", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_DataContainer(), this.getAttachmentData(), null, "dataContainer", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskType_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_States(), this.getStateTransitionMap(), null, "states", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Extension(), ecorePackage.getEPackage(), null, "extension", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionMapEClass, Map.Entry.class, "StateTransitionMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransitionMap_Key(), this.getState(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransitionMap_Value(), this.getStateTransition(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentDataEClass, AttachmentData.class, "AttachmentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachmentData_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, AttachmentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.AssignableItem <em>Assignable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.AssignableItem
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem()
		 * @generated
		 */
		public static final EClass ASSIGNABLE_ITEM = eINSTANCE.getAssignableItem();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSIGNABLE_ITEM__OWNER = eINSTANCE.getAssignableItem_Owner();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.Task
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
		 * @generated
		 */
		public static final EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__SUMMARY = eINSTANCE.getTask_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__LINKS = eINSTANCE.getTask_Links();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__ATTACHMENTS = eINSTANCE.getTask_Attachments();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__COMMENTS = eINSTANCE.getTask_Comments();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__STATE = eINSTANCE.getTask_State();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__SUBSCRIBERS = eINSTANCE.getTask_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__TYPE = eINSTANCE.getTask_Type();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__DEPENDS_ON = eINSTANCE.getTask_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__BLOCKS = eINSTANCE.getTask_Blocks();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.State
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.StateTransition <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.StateTransition
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransition()
		 * @generated
		 */
		public static final EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_TRANSITION__NAME = eINSTANCE.getStateTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION__TARGET_STATE = eINSTANCE.getStateTransition_TargetState();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskDomain
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
		 * @generated
		 */
		public static final EClass TASK_DOMAIN = eINSTANCE.getTaskDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_DOMAIN__NAME = eINSTANCE.getTaskDomain_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__STATES = eINSTANCE.getTaskDomain_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__TRANSITIONS = eINSTANCE.getTaskDomain_Transitions();

		/**
		 * The meta object literal for the '<em><b>Task Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__TASK_TYPES = eINSTANCE.getTaskDomain_TaskTypes();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.Comment
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment()
		 * @generated
		 */
		public static final EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.Attachment
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
		 * @generated
		 */
		public static final EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTACHMENT__DESCRIPTION = eINSTANCE.getAttachment_Description();

		/**
		 * The meta object literal for the '<em><b>Data Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATTACHMENT__DATA_CONTAINER = eINSTANCE.getAttachment_DataContainer();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskType
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType()
		 * @generated
		 */
		public static final EClass TASK_TYPE = eINSTANCE.getTaskType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_TYPE__NAME = eINSTANCE.getTaskType_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__STATES = eINSTANCE.getTaskType_States();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__EXTENSION = eINSTANCE.getTaskType_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.StateTransitionMap <em>State Transition Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.StateTransitionMap
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMap()
		 * @generated
		 */
		public static final EClass STATE_TRANSITION_MAP = eINSTANCE.getStateTransitionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION_MAP__KEY = eINSTANCE.getStateTransitionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION_MAP__VALUE = eINSTANCE.getStateTransitionMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.AttachmentData
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachmentData()
		 * @generated
		 */
		public static final EClass ATTACHMENT_DATA = eINSTANCE.getAttachmentData();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATTACHMENT_DATA__DATA = eINSTANCE.getAttachmentData_Data();

	}

} //TaskPackage
