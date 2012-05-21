/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.audit.AuditPackage;

import org.eclipselabs.etrack.domain.data.DataPackage;

import org.eclipselabs.etrack.domain.entity.EntityPackage;

import org.eclipselabs.etrack.domain.project.ProjectPackage;

import org.eclipselabs.etrack.domain.security.SecurityPackage;

import org.eclipselabs.etrack.domain.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipselabs.etrack.domain' suppressInterfaces='true'"
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
  public static final String eNS_URI = "org.eclipselabs.etrack.domain.task";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "task";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final TaskPackage eINSTANCE = org.eclipselabs.etrack.domain.task.TaskPackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.TaskDomain
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
   * @generated
   */
  public static final int TASK_DOMAIN = 0;

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
   * The feature id for the '<em><b>State Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_DOMAIN__STATE_TRANSITIONS = 2;

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
   * The number of operations of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_DOMAIN_OPERATION_COUNT = 0;

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
  public static final int TASK__OWNER = EntityPackage.ASSIGNABLE_ITEM__OWNER;

  /**
   * The feature id for the '<em><b>History</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__HISTORY = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Links By Name</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__LINKS_BY_NAME = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__SUMMARY = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__DESCRIPTION = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__CREATED_ON = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Subscribers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__SUBSCRIBERS = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Comments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__COMMENTS = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__ATTACHMENTS = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Current State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__CURRENT_STATE = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Task Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__TASK_TYPE = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Project</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK__PROJECT = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_FEATURE_COUNT = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 11;

  /**
   * The number of operations of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_OPERATION_COUNT = EntityPackage.ASSIGNABLE_ITEM_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.TaskType
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskType()
   * @generated
   */
  public static final int TASK_TYPE = 2;

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
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.StateTransitionMappingPerRole <em>State Transition Mapping Per Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.StateTransitionMappingPerRole
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMappingPerRole()
   * @generated
   */
  public static final int STATE_TRANSITION_MAPPING_PER_ROLE = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int STATE_TRANSITION_MAPPING_PER_ROLE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int STATE_TRANSITION_MAPPING_PER_ROLE__VALUE = 1;

  /**
   * The number of structural features of the '<em>State Transition Mapping Per Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int STATE_TRANSITION_MAPPING_PER_ROLE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>State Transition Mapping Per Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int STATE_TRANSITION_MAPPING_PER_ROLE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.Comment
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment()
   * @generated
   */
  public static final int COMMENT = 4;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int COMMENT__OWNER = EntityPackage.ASSIGNABLE_ITEM__OWNER;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int COMMENT__TEXT = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int COMMENT__CREATED_ON = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int COMMENT_FEATURE_COUNT = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int COMMENT_OPERATION_COUNT = EntityPackage.ASSIGNABLE_ITEM_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.Attachment
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
   * @generated
   */
  public static final int ATTACHMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT__NAME = DataPackage.ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT__CREATED_ON = DataPackage.ARTIFACT__CREATED_ON;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT__DESCRIPTION = DataPackage.ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size In Bytes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT__SIZE_IN_BYTES = DataPackage.ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT__DATA_CONTAINER = DataPackage.ARTIFACT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attachment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT_FEATURE_COUNT = DataPackage.ARTIFACT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Attachment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT_OPERATION_COUNT = DataPackage.ARTIFACT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.AttachmentData
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachmentData()
   * @generated
   */
  public static final int ATTACHMENT_DATA = 6;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute list.
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
   * The number of operations of the '<em>Attachment Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTACHMENT_DATA_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion <em>Model Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.TaskModelVersion
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskModelVersion()
   * @generated
   */
  public static final int TASK_MODEL_VERSION = 7;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_MODEL_VERSION__VERSION = 0;

  /**
   * The number of structural features of the '<em>Model Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_MODEL_VERSION_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Model Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_MODEL_VERSION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.AttributeChange <em>Attribute Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.task.AttributeChange
   * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttributeChange()
   * @generated
   */
  public static final int ATTRIBUTE_CHANGE = 8;

  /**
   * The feature id for the '<em><b>On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_CHANGE__ON = AuditPackage.ACTION__ON;

  /**
   * The feature id for the '<em><b>By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_CHANGE__BY = AuditPackage.ACTION__BY;

  /**
   * The feature id for the '<em><b>Old Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_CHANGE__OLD_VALUE = AuditPackage.ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_CHANGE_FEATURE_COUNT = AuditPackage.ACTION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Attribute Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_CHANGE_OPERATION_COUNT = AuditPackage.ACTION_OPERATION_COUNT + 0;

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
  private EClass taskEClass = null;

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
  private EClass stateTransitionMappingPerRoleEClass = null;

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
  private EClass attachmentDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskModelVersionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeChangeEClass = null;

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
    StatePackage.eINSTANCE.eClass();
    ProjectPackage.eINSTANCE.eClass();

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
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStateTransitions <em>State Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Transitions</em>'.
   * @see org.eclipselabs.etrack.domain.task.TaskDomain#getStateTransitions()
   * @see #getTaskDomain()
   * @generated
   */
  public EReference getTaskDomain_StateTransitions()
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
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getCreatedOn <em>Created On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Created On</em>'.
   * @see org.eclipselabs.etrack.domain.task.Task#getCreatedOn()
   * @see #getTask()
   * @generated
   */
  public EAttribute getTask_CreatedOn()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
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
    return (EReference)taskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getCurrentState <em>Current State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Current State</em>'.
   * @see org.eclipselabs.etrack.domain.task.Task#getCurrentState()
   * @see #getTask()
   * @generated
   */
  public EReference getTask_CurrentState()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(6);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getTaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Task Type</em>'.
   * @see org.eclipselabs.etrack.domain.task.Task#getTaskType()
   * @see #getTask()
   * @generated
   */
  public EReference getTask_TaskType()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(7);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Project</em>'.
   * @see org.eclipselabs.etrack.domain.task.Task#getProject()
   * @see #getTask()
   * @generated
   */
  public EReference getTask_Project()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(8);
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
   * Returns the meta object for class '{@link java.util.Map.Entry <em>State Transition Mapping Per Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Transition Mapping Per Role</em>'.
   * @see java.util.Map.Entry
   * @model keyType="org.eclipselabs.etrack.domain.security.PermissionGroup"
   *        valueMapType="org.eclipselabs.etrack.domain.state.StateTransitionMapping<org.eclipselabs.etrack.domain.state.State, org.eclipselabs.etrack.domain.state.StateTransition>"
   * @generated
   */
  public EClass getStateTransitionMappingPerRole()
  {
    return stateTransitionMappingPerRoleEClass;
  }

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getStateTransitionMappingPerRole()
   * @generated
   */
  public EReference getStateTransitionMappingPerRole_Key()
  {
    return (EReference)stateTransitionMappingPerRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getStateTransitionMappingPerRole()
   * @generated
   */
  public EReference getStateTransitionMappingPerRole_Value()
  {
    return (EReference)stateTransitionMappingPerRoleEClass.getEStructuralFeatures().get(1);
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
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Comment#getCreatedOn <em>Created On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Created On</em>'.
   * @see org.eclipselabs.etrack.domain.task.Comment#getCreatedOn()
   * @see #getComment()
   * @generated
   */
  public EAttribute getComment_CreatedOn()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
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
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Attachment#getSizeInBytes <em>Size In Bytes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size In Bytes</em>'.
   * @see org.eclipselabs.etrack.domain.task.Attachment#getSizeInBytes()
   * @see #getAttachment()
   * @generated
   */
  public EAttribute getAttachment_SizeInBytes()
  {
    return (EAttribute)attachmentEClass.getEStructuralFeatures().get(1);
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
    return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
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
   * Returns the meta object for the attribute list '{@link org.eclipselabs.etrack.domain.task.AttachmentData#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Data</em>'.
   * @see org.eclipselabs.etrack.domain.task.AttachmentData#getData()
   * @see #getAttachmentData()
   * @generated
   */
  public EAttribute getAttachmentData_Data()
  {
    return (EAttribute)attachmentDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion <em>Model Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Version</em>'.
   * @see org.eclipselabs.etrack.domain.task.TaskModelVersion
   * @generated
   */
  public EClass getTaskModelVersion()
  {
    return taskModelVersionEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipselabs.etrack.domain.task.TaskModelVersion#getVersion()
   * @see #getTaskModelVersion()
   * @generated
   */
  public EAttribute getTaskModelVersion_Version()
  {
    return (EAttribute)taskModelVersionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.AttributeChange <em>Attribute Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Change</em>'.
   * @see org.eclipselabs.etrack.domain.task.AttributeChange
   * @generated
   */
  public EClass getAttributeChange()
  {
    return attributeChangeEClass;
  }


  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.AttributeChange#getOldValue <em>Old Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Old Value</em>'.
   * @see org.eclipselabs.etrack.domain.task.AttributeChange#getOldValue()
   * @see #getAttributeChange()
   * @generated
   */
  public EAttribute getAttributeChange_OldValue()
  {
    return (EAttribute)attributeChangeEClass.getEStructuralFeatures().get(0);
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
    taskDomainEClass = createEClass(TASK_DOMAIN);
    createEAttribute(taskDomainEClass, TASK_DOMAIN__NAME);
    createEReference(taskDomainEClass, TASK_DOMAIN__STATES);
    createEReference(taskDomainEClass, TASK_DOMAIN__STATE_TRANSITIONS);
    createEReference(taskDomainEClass, TASK_DOMAIN__TASK_TYPES);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__SUMMARY);
    createEAttribute(taskEClass, TASK__DESCRIPTION);
    createEAttribute(taskEClass, TASK__CREATED_ON);
    createEReference(taskEClass, TASK__SUBSCRIBERS);
    createEReference(taskEClass, TASK__COMMENTS);
    createEReference(taskEClass, TASK__ATTACHMENTS);
    createEReference(taskEClass, TASK__CURRENT_STATE);
    createEReference(taskEClass, TASK__TASK_TYPE);
    createEReference(taskEClass, TASK__PROJECT);

    taskTypeEClass = createEClass(TASK_TYPE);
    createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
    createEReference(taskTypeEClass, TASK_TYPE__STATES);

    stateTransitionMappingPerRoleEClass = createEClass(STATE_TRANSITION_MAPPING_PER_ROLE);
    createEReference(stateTransitionMappingPerRoleEClass, STATE_TRANSITION_MAPPING_PER_ROLE__KEY);
    createEReference(stateTransitionMappingPerRoleEClass, STATE_TRANSITION_MAPPING_PER_ROLE__VALUE);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__TEXT);
    createEAttribute(commentEClass, COMMENT__CREATED_ON);

    attachmentEClass = createEClass(ATTACHMENT);
    createEAttribute(attachmentEClass, ATTACHMENT__DESCRIPTION);
    createEAttribute(attachmentEClass, ATTACHMENT__SIZE_IN_BYTES);
    createEReference(attachmentEClass, ATTACHMENT__DATA_CONTAINER);

    attachmentDataEClass = createEClass(ATTACHMENT_DATA);
    createEAttribute(attachmentDataEClass, ATTACHMENT_DATA__DATA);

    taskModelVersionEClass = createEClass(TASK_MODEL_VERSION);
    createEAttribute(taskModelVersionEClass, TASK_MODEL_VERSION__VERSION);

    attributeChangeEClass = createEClass(ATTRIBUTE_CHANGE);
    createEAttribute(attributeChangeEClass, ATTRIBUTE_CHANGE__OLD_VALUE);
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
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
    EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
    AuditPackage theAuditPackage = (AuditPackage)EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);
    DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
    ProjectPackage theProjectPackage = (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);
    SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    taskEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());
    taskEClass.getESuperTypes().add(theAuditPackage.getAuditableItem());
    taskEClass.getESuperTypes().add(theDataPackage.getLinkable());
    commentEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());
    attachmentEClass.getESuperTypes().add(theDataPackage.getArtifact());
    attributeChangeEClass.getESuperTypes().add(theAuditPackage.getAction());

    // Initialize classes, features, and operations; add parameters
    initEClass(taskDomainEClass, TaskDomain.class, "TaskDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskDomain_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDomain_States(), theStatePackage.getState(), null, "states", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDomain_StateTransitions(), theStatePackage.getStateTransition(), null, "stateTransitions", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDomain_TaskTypes(), this.getTaskType(), null, "taskTypes", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Summary(), theEcorePackage.getEString(), "summary", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_CreatedOn(), theEcorePackage.getEDate(), "createdOn", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Subscribers(), theEntityPackage.getPerson(), null, "subscribers", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Comments(), this.getComment(), null, "comments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Attachments(), this.getAttachment(), null, "attachments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_CurrentState(), theStatePackage.getState(), null, "currentState", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_TaskType(), this.getTaskType(), null, "taskType", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Project(), theProjectPackage.getProject(), null, "project", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskType_States(), this.getStateTransitionMappingPerRole(), null, "states", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateTransitionMappingPerRoleEClass, Map.Entry.class, "StateTransitionMappingPerRole", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateTransitionMappingPerRole_Key(), theSecurityPackage.getPermissionGroup(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateTransitionMappingPerRole_Value(), theStatePackage.getStateTransitionMapping(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComment_CreatedOn(), theEcorePackage.getEDate(), "createdOn", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttachment_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttachment_SizeInBytes(), theEcorePackage.getELong(), "sizeInBytes", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttachment_DataContainer(), this.getAttachmentData(), null, "dataContainer", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attachmentDataEClass, AttachmentData.class, "AttachmentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttachmentData_Data(), theEcorePackage.getEByteObject(), "data", null, 0, -1, AttachmentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskModelVersionEClass, TaskModelVersion.class, "TaskModelVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTaskModelVersion_Version(), theEcorePackage.getEInt(), "version", null, 0, 1, TaskModelVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeChangeEClass, AttributeChange.class, "AttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeChange_OldValue(), theEcorePackage.getEString(), "oldValue", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  public interface Literals
  {
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
     * The meta object literal for the '<em><b>State Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK_DOMAIN__STATE_TRANSITIONS = eINSTANCE.getTaskDomain_StateTransitions();

    /**
     * The meta object literal for the '<em><b>Task Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK_DOMAIN__TASK_TYPES = eINSTANCE.getTaskDomain_TaskTypes();

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
     * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute TASK__CREATED_ON = eINSTANCE.getTask_CreatedOn();

    /**
     * The meta object literal for the '<em><b>Subscribers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__SUBSCRIBERS = eINSTANCE.getTask_Subscribers();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__COMMENTS = eINSTANCE.getTask_Comments();

    /**
     * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__ATTACHMENTS = eINSTANCE.getTask_Attachments();

    /**
     * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__CURRENT_STATE = eINSTANCE.getTask_CurrentState();

    /**
     * The meta object literal for the '<em><b>Task Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__TASK_TYPE = eINSTANCE.getTask_TaskType();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK__PROJECT = eINSTANCE.getTask_Project();

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
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.StateTransitionMappingPerRole <em>State Transition Mapping Per Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.task.StateTransitionMappingPerRole
     * @see org.eclipselabs.etrack.domain.task.TaskPackage#getStateTransitionMappingPerRole()
     * @generated
     */
    public static final EClass STATE_TRANSITION_MAPPING_PER_ROLE = eINSTANCE.getStateTransitionMappingPerRole();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference STATE_TRANSITION_MAPPING_PER_ROLE__KEY = eINSTANCE.getStateTransitionMappingPerRole_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference STATE_TRANSITION_MAPPING_PER_ROLE__VALUE = eINSTANCE.getStateTransitionMappingPerRole_Value();

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
     * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute COMMENT__CREATED_ON = eINSTANCE.getComment_CreatedOn();

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
     * The meta object literal for the '<em><b>Size In Bytes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ATTACHMENT__SIZE_IN_BYTES = eINSTANCE.getAttachment_SizeInBytes();

    /**
     * The meta object literal for the '<em><b>Data Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ATTACHMENT__DATA_CONTAINER = eINSTANCE.getAttachment_DataContainer();

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
     * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ATTACHMENT_DATA__DATA = eINSTANCE.getAttachmentData_Data();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion <em>Model Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.task.TaskModelVersion
     * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskModelVersion()
     * @generated
     */
    public static final EClass TASK_MODEL_VERSION = eINSTANCE.getTaskModelVersion();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute TASK_MODEL_VERSION__VERSION = eINSTANCE.getTaskModelVersion_Version();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.AttributeChange <em>Attribute Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.task.AttributeChange
     * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttributeChange()
     * @generated
     */
    public static final EClass ATTRIBUTE_CHANGE = eINSTANCE.getAttributeChange();

    /**
     * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ATTRIBUTE_CHANGE__OLD_VALUE = eINSTANCE.getAttributeChange_OldValue();

  }

} //TaskPackage
