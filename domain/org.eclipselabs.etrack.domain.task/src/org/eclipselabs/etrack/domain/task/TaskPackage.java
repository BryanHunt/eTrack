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

import org.eclilpselabs.etrack.domain.data.DataPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.etrack.domain.audit.AuditPackage;
import org.eclipselabs.etrack.domain.entity.EntityPackage;
import org.eclipselabs.etrack.domain.project.ProjectPackage;
import org.eclipselabs.etrack.domain.state.StatePackage;

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
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Artifact <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Artifact
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getArtifact()
	 * @generated
	 */
	public static final int ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT__CREATED_ON = 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Task
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
	 * @generated
	 */
	public static final int TASK = 5;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomain()
	 * @generated
	 */
	public static final int TASK_DOMAIN = 6;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Comment
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getComment()
	 * @generated
	 */
	public static final int COMMENT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Attachment
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
	 * @generated
	 */
	public static final int ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__CREATED_ON = ARTIFACT__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__OWNER = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__DESCRIPTION = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__SIZE_IN_BYTES = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT__DATA_CONTAINER = ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachmentData()
	 * @generated
	 */
	public static final int ATTACHMENT_DATA = 1;

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
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.Duration <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.Duration
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getDuration()
	 * @generated
	 */
	public static final int DURATION = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DURATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DURATION__UNITS = 1;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Links By Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__LINKS_BY_NAME = DataPackage.LINKABLE__LINKS_BY_NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__OWNER = DataPackage.LINKABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__HISTORY = DataPackage.LINKABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__CATEGORY = DataPackage.LINKABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__TAGS = DataPackage.LINKABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__SUMMARY = DataPackage.LINKABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__DESCRIPTION = DataPackage.LINKABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__CREATED_ON = DataPackage.LINKABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__CREATED_BY = DataPackage.LINKABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__ATTACHMENTS = DataPackage.LINKABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__COMMENTS = DataPackage.LINKABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__CURRENT_STATE = DataPackage.LINKABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__SUBSCRIBERS = DataPackage.LINKABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__TYPE = DataPackage.LINKABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__PROJECT = DataPackage.LINKABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Related Tasks</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__RELATED_TASKS = DataPackage.LINKABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__RESOLUTION = DataPackage.LINKABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Resolved On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__RESOLVED_ON = DataPackage.LINKABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__RESOLVED_BY = DataPackage.LINKABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Due On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__DUE_ON = DataPackage.LINKABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Started On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__STARTED_ON = DataPackage.LINKABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Estimate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__ESTIMATE = DataPackage.LINKABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Corrected Estimate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__CORRECTED_ESTIMATE = DataPackage.LINKABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__PRIORITY = DataPackage.LINKABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Planned For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK__PLANNED_FOR = DataPackage.LINKABLE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_FEATURE_COUNT = DataPackage.LINKABLE_FEATURE_COUNT + 24;

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
	 * The feature id for the '<em><b>State Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__STATE_GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__RELATIONSHIPS = 4;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__RESOLUTIONS = 5;

	/**
	 * The feature id for the '<em><b>Task Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__TASK_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN__EXTENSIONS = 7;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__CLASS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__STARTING_STATE = 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__RELATIONSHIPS = 4;

	/**
	 * The feature id for the '<em><b>Resolved States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__RESOLVED_STATES = 5;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__RESOLUTIONS = 6;

	/**
	 * The feature id for the '<em><b>Starting Resolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE__STARTING_RESOLUTION = 7;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion <em>Model Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskModelVersion
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskModelVersion()
	 * @generated
	 */
	public static final int TASK_MODEL_VERSION = 8;

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
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange <em>Attribute Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskAttributeChange()
	 * @generated
	 */
	public static final int TASK_ATTRIBUTE_CHANGE = 9;

	/**
	 * The feature id for the '<em><b>Initiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ATTRIBUTE_CHANGE__INITIATED_ON = AuditPackage.ACTION__INITIATED_ON;

	/**
	 * The feature id for the '<em><b>Initiated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ATTRIBUTE_CHANGE__INITIATED_BY = AuditPackage.ACTION__INITIATED_BY;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ATTRIBUTE_CHANGE__OLD_VALUE = AuditPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ATTRIBUTE_CHANGE__ATTRIBUTE_NAME = AuditPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ATTRIBUTE_CHANGE_FEATURE_COUNT = AuditPackage.ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink <em>Domain Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskDomainLink
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomainLink()
	 * @generated
	 */
	public static final int TASK_DOMAIN_LINK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_LINK__NAME = DataPackage.LINKED_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_LINK__DESCRIPTION = DataPackage.LINKED_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_LINK__TASK_DOMAIN = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_DOMAIN_LINK_FEATURE_COUNT = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.RelatedTasksMapping <em>Related Tasks Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.RelatedTasksMapping
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getRelatedTasksMapping()
	 * @generated
	 */
	public static final int RELATED_TASKS_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_TASKS_MAPPING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_TASKS_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Related Tasks Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_TASKS_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskRelationship <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskRelationship
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskRelationship()
	 * @generated
	 */
	public static final int TASK_RELATIONSHIP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RELATIONSHIP__OPPOSITE = 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskResolution <em>Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskResolution
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskResolution()
	 * @generated
	 */
	public static final int TASK_RESOLUTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RESOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RESOLUTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_RESOLUTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskGroup <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskGroup
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup()
	 * @generated
	 */
	public static final int TASK_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_GROUP__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_GROUP__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.TaskQuery <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.TaskQuery
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskQuery()
	 * @generated
	 */
	public static final int TASK_QUERY = 15;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_QUERY__OWNER = EntityPackage.ASSIGNABLE_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_QUERY__QUERY = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_QUERY_FEATURE_COUNT = EntityPackage.ASSIGNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.task.DurationUnit <em>Duration Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.task.DurationUnit
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getDurationUnit()
	 * @generated
	 */
	public static final int DURATION_UNIT = 16;

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
	private EClass durationEClass = null;

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
	private EClass taskModelVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAttributeChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDomainLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedTasksMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationUnitEEnum = null;

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
	private EClass artifactEClass = null;

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
		ProjectPackage.eINSTANCE.eClass();
		StatePackage.eINSTANCE.eClass();

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
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getCreatedBy()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_CreatedBy()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
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
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
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
		return (EReference)taskEClass.getEStructuralFeatures().get(7);
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
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
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
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.etrack.domain.task.Task#getRelatedTasks <em>Related Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Related Tasks</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getRelatedTasks()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_RelatedTasks()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolution</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getResolution()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Resolution()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getResolvedOn <em>Resolved On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved On</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getResolvedOn()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_ResolvedOn()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved By</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getResolvedBy()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_ResolvedBy()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(13);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getDueOn <em>Due On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due On</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getDueOn()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_DueOn()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(14);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getStartedOn <em>Started On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started On</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getStartedOn()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_StartedOn()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(15);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.task.Task#getEstimate <em>Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Estimate</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getEstimate()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_Estimate()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(16);
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.task.Task#getCorrectedEstimate <em>Corrected Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corrected Estimate</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getCorrectedEstimate()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_CorrectedEstimate()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(17);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	public EAttribute getTask_Priority()
	{
		return (EAttribute)taskEClass.getEStructuralFeatures().get(18);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.Task#getPlannedFor <em>Planned For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned For</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Task#getPlannedFor()
	 * @see #getTask()
	 * @generated
	 */
	public EReference getTask_PlannedFor()
	{
		return (EReference)taskEClass.getEStructuralFeatures().get(19);
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
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getExtensions()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_Extensions()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getStateGroups <em>State Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Groups</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getStateGroups()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_StateGroups()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getRelationships()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_Relationships()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.task.TaskDomain#getResolutions <em>Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolutions</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain#getResolutions()
	 * @see #getTaskDomain()
	 * @generated
	 */
	public EReference getTaskDomain_Resolutions()
	{
		return (EReference)taskDomainEClass.getEStructuralFeatures().get(5);
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
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Duration
	 * @generated
	 */
	public EClass getDuration()
	{
		return durationEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Duration#getValue()
	 * @see #getDuration()
	 * @generated
	 */
	public EAttribute getDuration_Value()
	{
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Duration#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Duration#getUnits()
	 * @see #getDuration()
	 * @generated
	 */
	public EAttribute getDuration_Units()
	{
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
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
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskType#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Type</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getClassType()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_ClassType()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getStartingState()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_StartingState()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.TaskType#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationships</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getRelationships()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_Relationships()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.TaskType#getResolvedStates <em>Resolved States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved States</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getResolvedStates()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_ResolvedStates()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.TaskType#getResolutions <em>Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolutions</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getResolutions()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_Resolutions()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskType#getStartingResolution <em>Starting Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting Resolution</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskType#getStartingResolution()
	 * @see #getTaskType()
	 * @generated
	 */
	public EReference getTaskType_StartingResolution()
	{
		return (EReference)taskTypeEClass.getEStructuralFeatures().get(7);
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
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Change</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange
	 * @generated
	 */
	public EClass getTaskAttributeChange()
	{
		return taskAttributeChangeEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange#getOldValue()
	 * @see #getTaskAttributeChange()
	 * @generated
	 */
	public EAttribute getTaskAttributeChange_OldValue()
	{
		return (EAttribute)taskAttributeChangeEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange#getAttributeName()
	 * @see #getTaskAttributeChange()
	 * @generated
	 */
	public EAttribute getTaskAttributeChange_AttributeName()
	{
		return (EAttribute)taskAttributeChangeEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink <em>Domain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Link</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomainLink
	 * @generated
	 */
	public EClass getTaskDomainLink()
	{
		return taskDomainLinkEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink#getTaskDomain <em>Task Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Domain</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomainLink#getTaskDomain()
	 * @see #getTaskDomainLink()
	 * @generated
	 */
	public EReference getTaskDomainLink_TaskDomain()
	{
		return (EReference)taskDomainLinkEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Related Tasks Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Tasks Mapping</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipselabs.etrack.domain.task.TaskRelationship"
	 *        valueType="org.eclipselabs.etrack.domain.task.Task" valueMany="true"
	 * @generated
	 */
	public EClass getRelatedTasksMapping()
	{
		return relatedTasksMappingEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRelatedTasksMapping()
	 * @generated
	 */
	public EReference getRelatedTasksMapping_Key()
	{
		return (EReference)relatedTasksMappingEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRelatedTasksMapping()
	 * @generated
	 */
	public EReference getRelatedTasksMapping_Value()
	{
		return (EReference)relatedTasksMappingEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskRelationship
	 * @generated
	 */
	public EClass getTaskRelationship()
	{
		return taskRelationshipEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskRelationship#getName()
	 * @see #getTaskRelationship()
	 * @generated
	 */
	public EAttribute getTaskRelationship_Name()
	{
		return (EAttribute)taskRelationshipEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskRelationship#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskRelationship#getOpposite()
	 * @see #getTaskRelationship()
	 * @generated
	 */
	public EReference getTaskRelationship_Opposite()
	{
		return (EReference)taskRelationshipEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskResolution
	 * @generated
	 */
	public EClass getTaskResolution()
	{
		return taskResolutionEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskResolution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskResolution#getName()
	 * @see #getTaskResolution()
	 * @generated
	 */
	public EAttribute getTaskResolution_Name()
	{
		return (EAttribute)taskResolutionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskResolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskResolution#getDescription()
	 * @see #getTaskResolution()
	 * @generated
	 */
	public EAttribute getTaskResolution_Description()
	{
		return (EAttribute)taskResolutionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskGroup
	 * @generated
	 */
	public EClass getTaskGroup()
	{
		return taskGroupEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskGroup#getName()
	 * @see #getTaskGroup()
	 * @generated
	 */
	public EAttribute getTaskGroup_Name()
	{
		return (EAttribute)taskGroupEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.task.TaskGroup#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskGroup#getProject()
	 * @see #getTaskGroup()
	 * @generated
	 */
	public EReference getTaskGroup_Project()
	{
		return (EReference)taskGroupEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.task.TaskGroup#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskGroup#getTasks()
	 * @see #getTaskGroup()
	 * @generated
	 */
	public EReference getTaskGroup_Tasks()
	{
		return (EReference)taskGroupEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.TaskQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskQuery
	 * @generated
	 */
	public EClass getTaskQuery()
	{
		return taskQueryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.TaskQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipselabs.etrack.domain.task.TaskQuery#getQuery()
	 * @see #getTaskQuery()
	 * @generated
	 */
	public EAttribute getTaskQuery_Query()
	{
		return (EAttribute)taskQueryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.etrack.domain.task.DurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Duration Unit</em>'.
	 * @see org.eclipselabs.etrack.domain.task.DurationUnit
	 * @generated
	 */
	public EEnum getDurationUnit()
	{
		return durationUnitEEnum;
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
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.task.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Artifact
	 * @generated
	 */
	public EClass getArtifact()
	{
		return artifactEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	public EAttribute getArtifact_Name()
	{
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.task.Artifact#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see org.eclipselabs.etrack.domain.task.Artifact#getCreatedOn()
	 * @see #getArtifact()
	 * @generated
	 */
	public EAttribute getArtifact_CreatedOn()
	{
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
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
		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__DESCRIPTION);
		createEAttribute(attachmentEClass, ATTACHMENT__SIZE_IN_BYTES);
		createEReference(attachmentEClass, ATTACHMENT__DATA_CONTAINER);

		attachmentDataEClass = createEClass(ATTACHMENT_DATA);
		createEAttribute(attachmentDataEClass, ATTACHMENT_DATA__DATA);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__CREATED_ON);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);
		createEAttribute(commentEClass, COMMENT__CREATED_ON);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__UNITS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__SUMMARY);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__CREATED_ON);
		createEReference(taskEClass, TASK__CREATED_BY);
		createEReference(taskEClass, TASK__ATTACHMENTS);
		createEReference(taskEClass, TASK__COMMENTS);
		createEReference(taskEClass, TASK__CURRENT_STATE);
		createEReference(taskEClass, TASK__SUBSCRIBERS);
		createEReference(taskEClass, TASK__TYPE);
		createEReference(taskEClass, TASK__PROJECT);
		createEReference(taskEClass, TASK__RELATED_TASKS);
		createEReference(taskEClass, TASK__RESOLUTION);
		createEAttribute(taskEClass, TASK__RESOLVED_ON);
		createEReference(taskEClass, TASK__RESOLVED_BY);
		createEAttribute(taskEClass, TASK__DUE_ON);
		createEAttribute(taskEClass, TASK__STARTED_ON);
		createEReference(taskEClass, TASK__ESTIMATE);
		createEReference(taskEClass, TASK__CORRECTED_ESTIMATE);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEReference(taskEClass, TASK__PLANNED_FOR);

		taskDomainEClass = createEClass(TASK_DOMAIN);
		createEAttribute(taskDomainEClass, TASK_DOMAIN__NAME);
		createEReference(taskDomainEClass, TASK_DOMAIN__STATES);
		createEReference(taskDomainEClass, TASK_DOMAIN__TRANSITIONS);
		createEReference(taskDomainEClass, TASK_DOMAIN__STATE_GROUPS);
		createEReference(taskDomainEClass, TASK_DOMAIN__RELATIONSHIPS);
		createEReference(taskDomainEClass, TASK_DOMAIN__RESOLUTIONS);
		createEReference(taskDomainEClass, TASK_DOMAIN__TASK_TYPES);
		createEReference(taskDomainEClass, TASK_DOMAIN__EXTENSIONS);

		taskTypeEClass = createEClass(TASK_TYPE);
		createEAttribute(taskTypeEClass, TASK_TYPE__NAME);
		createEReference(taskTypeEClass, TASK_TYPE__STATES);
		createEReference(taskTypeEClass, TASK_TYPE__CLASS_TYPE);
		createEReference(taskTypeEClass, TASK_TYPE__STARTING_STATE);
		createEReference(taskTypeEClass, TASK_TYPE__RELATIONSHIPS);
		createEReference(taskTypeEClass, TASK_TYPE__RESOLVED_STATES);
		createEReference(taskTypeEClass, TASK_TYPE__RESOLUTIONS);
		createEReference(taskTypeEClass, TASK_TYPE__STARTING_RESOLUTION);

		taskModelVersionEClass = createEClass(TASK_MODEL_VERSION);
		createEAttribute(taskModelVersionEClass, TASK_MODEL_VERSION__VERSION);

		taskAttributeChangeEClass = createEClass(TASK_ATTRIBUTE_CHANGE);
		createEAttribute(taskAttributeChangeEClass, TASK_ATTRIBUTE_CHANGE__OLD_VALUE);
		createEAttribute(taskAttributeChangeEClass, TASK_ATTRIBUTE_CHANGE__ATTRIBUTE_NAME);

		taskDomainLinkEClass = createEClass(TASK_DOMAIN_LINK);
		createEReference(taskDomainLinkEClass, TASK_DOMAIN_LINK__TASK_DOMAIN);

		relatedTasksMappingEClass = createEClass(RELATED_TASKS_MAPPING);
		createEReference(relatedTasksMappingEClass, RELATED_TASKS_MAPPING__KEY);
		createEReference(relatedTasksMappingEClass, RELATED_TASKS_MAPPING__VALUE);

		taskRelationshipEClass = createEClass(TASK_RELATIONSHIP);
		createEAttribute(taskRelationshipEClass, TASK_RELATIONSHIP__NAME);
		createEReference(taskRelationshipEClass, TASK_RELATIONSHIP__OPPOSITE);

		taskResolutionEClass = createEClass(TASK_RESOLUTION);
		createEAttribute(taskResolutionEClass, TASK_RESOLUTION__NAME);
		createEAttribute(taskResolutionEClass, TASK_RESOLUTION__DESCRIPTION);

		taskGroupEClass = createEClass(TASK_GROUP);
		createEAttribute(taskGroupEClass, TASK_GROUP__NAME);
		createEReference(taskGroupEClass, TASK_GROUP__PROJECT);
		createEReference(taskGroupEClass, TASK_GROUP__TASKS);

		taskQueryEClass = createEClass(TASK_QUERY);
		createEAttribute(taskQueryEClass, TASK_QUERY__QUERY);

		// Create enums
		durationUnitEEnum = createEEnum(DURATION_UNIT);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		AuditPackage theAuditPackage = (AuditPackage)EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		ProjectPackage theProjectPackage = (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attachmentEClass.getESuperTypes().add(this.getArtifact());
		attachmentEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());
		commentEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());
		taskEClass.getESuperTypes().add(theDataPackage.getLinkable());
		taskEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());
		taskEClass.getESuperTypes().add(theAuditPackage.getAuditableItem());
		taskEClass.getESuperTypes().add(theDataPackage.getCategorizedItem());
		taskEClass.getESuperTypes().add(theDataPackage.getTaggableItem());
		taskAttributeChangeEClass.getESuperTypes().add(theAuditPackage.getAction());
		taskDomainLinkEClass.getESuperTypes().add(theDataPackage.getLinkedContent());
		taskQueryEClass.getESuperTypes().add(theEntityPackage.getAssignableItem());

		// Initialize classes and features; add operations and parameters
		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Description(), ecorePackage.getEString(), "description", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_SizeInBytes(), ecorePackage.getELong(), "sizeInBytes", null, 1, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_DataContainer(), this.getAttachmentData(), null, "dataContainer", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentDataEClass, AttachmentData.class, "AttachmentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachmentData_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, AttachmentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 1, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 1, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Units(), this.getDurationUnit(), "units", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CreatedBy(), theEntityPackage.getPerson(), null, "createdBy", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Attachments(), this.getAttachment(), null, "attachments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Comments(), this.getComment(), null, "comments", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CurrentState(), theStatePackage.getState(), null, "currentState", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Subscribers(), theEntityPackage.getPerson(), null, "subscribers", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Type(), this.getTaskType(), null, "type", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Project(), theProjectPackage.getProject(), null, "project", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_RelatedTasks(), this.getRelatedTasksMapping(), null, "relatedTasks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Resolution(), this.getTaskResolution(), null, "resolution", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ResolvedOn(), ecorePackage.getEDate(), "resolvedOn", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ResolvedBy(), theEntityPackage.getPerson(), null, "resolvedBy", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_DueOn(), ecorePackage.getEDate(), "dueOn", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_StartedOn(), ecorePackage.getEDate(), "startedOn", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Estimate(), this.getDuration(), null, "estimate", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_CorrectedEstimate(), this.getDuration(), null, "correctedEstimate", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_PlannedFor(), this.getTaskGroup(), null, "plannedFor", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDomainEClass, TaskDomain.class, "TaskDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDomain_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_States(), theStatePackage.getState(), null, "states", null, 1, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_Transitions(), theStatePackage.getStateTransition(), null, "transitions", null, 1, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_StateGroups(), theStatePackage.getStateGroup(), null, "stateGroups", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_Relationships(), this.getTaskRelationship(), null, "relationships", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_Resolutions(), this.getTaskResolution(), null, "resolutions", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_TaskTypes(), this.getTaskType(), null, "taskTypes", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDomain_Extensions(), ecorePackage.getEPackage(), null, "extensions", null, 0, -1, TaskDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskTypeEClass, TaskType.class, "TaskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskType_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_States(), theStatePackage.getStateTransitionMapping(), null, "states", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_ClassType(), ecorePackage.getEClass(), null, "classType", null, 0, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_StartingState(), theStatePackage.getState(), null, "startingState", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Relationships(), this.getTaskRelationship(), null, "relationships", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_ResolvedStates(), theStatePackage.getState(), null, "resolvedStates", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_Resolutions(), this.getTaskResolution(), null, "resolutions", null, 0, -1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskType_StartingResolution(), this.getTaskResolution(), null, "startingResolution", null, 1, 1, TaskType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskModelVersionEClass, TaskModelVersion.class, "TaskModelVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskModelVersion_Version(), ecorePackage.getEInt(), "version", "1", 0, 1, TaskModelVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAttributeChangeEClass, TaskAttributeChange.class, "TaskAttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskAttributeChange_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1, TaskAttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskAttributeChange_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, TaskAttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDomainLinkEClass, TaskDomainLink.class, "TaskDomainLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskDomainLink_TaskDomain(), this.getTaskDomain(), null, "taskDomain", null, 1, 1, TaskDomainLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedTasksMappingEClass, Map.Entry.class, "RelatedTasksMapping", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedTasksMapping_Key(), this.getTaskRelationship(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedTasksMapping_Value(), this.getTask(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRelationshipEClass, TaskRelationship.class, "TaskRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskRelationship_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRelationship_Opposite(), this.getTaskRelationship(), null, "opposite", null, 0, 1, TaskRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskResolutionEClass, TaskResolution.class, "TaskResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskResolution_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResolution_Description(), ecorePackage.getEString(), "description", null, 0, 1, TaskResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskGroupEClass, TaskGroup.class, "TaskGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskGroup_Project(), theProjectPackage.getProject(), null, "project", null, 1, 1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskGroup_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TaskGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskQueryEClass, TaskQuery.class, "TaskQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, TaskQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(durationUnitEEnum, DurationUnit.class, "DurationUnit");
		addEEnumLiteral(durationUnitEEnum, DurationUnit.MINUTES);
		addEEnumLiteral(durationUnitEEnum, DurationUnit.HOURS);
		addEEnumLiteral(durationUnitEEnum, DurationUnit.DAYS);
		addEEnumLiteral(durationUnitEEnum, DurationUnit.WEEKS);

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
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__CREATED_BY = eINSTANCE.getTask_CreatedBy();

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
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__CURRENT_STATE = eINSTANCE.getTask_CurrentState();

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
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__PROJECT = eINSTANCE.getTask_Project();

		/**
		 * The meta object literal for the '<em><b>Related Tasks</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__RELATED_TASKS = eINSTANCE.getTask_RelatedTasks();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__RESOLUTION = eINSTANCE.getTask_Resolution();

		/**
		 * The meta object literal for the '<em><b>Resolved On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__RESOLVED_ON = eINSTANCE.getTask_ResolvedOn();

		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__RESOLVED_BY = eINSTANCE.getTask_ResolvedBy();

		/**
		 * The meta object literal for the '<em><b>Due On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__DUE_ON = eINSTANCE.getTask_DueOn();

		/**
		 * The meta object literal for the '<em><b>Started On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__STARTED_ON = eINSTANCE.getTask_StartedOn();

		/**
		 * The meta object literal for the '<em><b>Estimate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__ESTIMATE = eINSTANCE.getTask_Estimate();

		/**
		 * The meta object literal for the '<em><b>Corrected Estimate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__CORRECTED_ESTIMATE = eINSTANCE.getTask_CorrectedEstimate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Planned For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK__PLANNED_FOR = eINSTANCE.getTask_PlannedFor();

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
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__EXTENSIONS = eINSTANCE.getTaskDomain_Extensions();

		/**
		 * The meta object literal for the '<em><b>State Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__STATE_GROUPS = eINSTANCE.getTaskDomain_StateGroups();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__RELATIONSHIPS = eINSTANCE.getTaskDomain_Relationships();

		/**
		 * The meta object literal for the '<em><b>Resolutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN__RESOLUTIONS = eINSTANCE.getTaskDomain_Resolutions();

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.Duration <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.Duration
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getDuration()
		 * @generated
		 */
		public static final EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DURATION__VALUE = eINSTANCE.getDuration_Value();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DURATION__UNITS = eINSTANCE.getDuration_Units();

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
		 * The meta object literal for the '<em><b>Class Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__CLASS_TYPE = eINSTANCE.getTaskType_ClassType();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__STARTING_STATE = eINSTANCE.getTaskType_StartingState();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__RELATIONSHIPS = eINSTANCE.getTaskType_Relationships();

		/**
		 * The meta object literal for the '<em><b>Resolved States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__RESOLVED_STATES = eINSTANCE.getTaskType_ResolvedStates();

		/**
		 * The meta object literal for the '<em><b>Resolutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__RESOLUTIONS = eINSTANCE.getTaskType_Resolutions();

		/**
		 * The meta object literal for the '<em><b>Starting Resolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_TYPE__STARTING_RESOLUTION = eINSTANCE.getTaskType_StartingResolution();

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange <em>Attribute Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskAttributeChange()
		 * @generated
		 */
		public static final EClass TASK_ATTRIBUTE_CHANGE = eINSTANCE.getTaskAttributeChange();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ATTRIBUTE_CHANGE__OLD_VALUE = eINSTANCE.getTaskAttributeChange_OldValue();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ATTRIBUTE_CHANGE__ATTRIBUTE_NAME = eINSTANCE.getTaskAttributeChange_AttributeName();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink <em>Domain Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskDomainLink
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomainLink()
		 * @generated
		 */
		public static final EClass TASK_DOMAIN_LINK = eINSTANCE.getTaskDomainLink();

		/**
		 * The meta object literal for the '<em><b>Task Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_DOMAIN_LINK__TASK_DOMAIN = eINSTANCE.getTaskDomainLink_TaskDomain();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.RelatedTasksMapping <em>Related Tasks Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.RelatedTasksMapping
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getRelatedTasksMapping()
		 * @generated
		 */
		public static final EClass RELATED_TASKS_MAPPING = eINSTANCE.getRelatedTasksMapping();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATED_TASKS_MAPPING__KEY = eINSTANCE.getRelatedTasksMapping_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATED_TASKS_MAPPING__VALUE = eINSTANCE.getRelatedTasksMapping_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskRelationship <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskRelationship
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskRelationship()
		 * @generated
		 */
		public static final EClass TASK_RELATIONSHIP = eINSTANCE.getTaskRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_RELATIONSHIP__NAME = eINSTANCE.getTaskRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_RELATIONSHIP__OPPOSITE = eINSTANCE.getTaskRelationship_Opposite();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskResolution <em>Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskResolution
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskResolution()
		 * @generated
		 */
		public static final EClass TASK_RESOLUTION = eINSTANCE.getTaskResolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_RESOLUTION__NAME = eINSTANCE.getTaskResolution_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_RESOLUTION__DESCRIPTION = eINSTANCE.getTaskResolution_Description();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskGroup <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskGroup
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup()
		 * @generated
		 */
		public static final EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_GROUP__NAME = eINSTANCE.getTaskGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_GROUP__PROJECT = eINSTANCE.getTaskGroup_Project();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_GROUP__TASKS = eINSTANCE.getTaskGroup_Tasks();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.TaskQuery <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.TaskQuery
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskQuery()
		 * @generated
		 */
		public static final EClass TASK_QUERY = eINSTANCE.getTaskQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_QUERY__QUERY = eINSTANCE.getTaskQuery_Query();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.DurationUnit <em>Duration Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.DurationUnit
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getDurationUnit()
		 * @generated
		 */
		public static final EEnum DURATION_UNIT = eINSTANCE.getDurationUnit();

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

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.task.Artifact <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.task.Artifact
		 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getArtifact()
		 * @generated
		 */
		public static final EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARTIFACT__CREATED_ON = eINSTANCE.getArtifact_CreatedOn();

	}

} //TaskPackage
