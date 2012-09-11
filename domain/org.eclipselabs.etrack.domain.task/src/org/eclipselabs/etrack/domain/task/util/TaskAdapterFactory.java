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
package org.eclipselabs.etrack.domain.task.util;

import java.util.Map;
import org.eclilpselabs.etrack.domain.data.Linkable;
import org.eclilpselabs.etrack.domain.data.LinkedContent;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.audit.AuditableItem;
import org.eclipselabs.etrack.domain.entity.AssignableItem;
import org.eclipselabs.etrack.domain.task.*;
import org.eclipselabs.etrack.domain.task.Artifact;
import org.eclipselabs.etrack.domain.task.Attachment;
import org.eclipselabs.etrack.domain.task.AttachmentData;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskAttributeChange;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskDomainLink;
import org.eclipselabs.etrack.domain.task.TaskModelVersion;
import org.eclipselabs.etrack.domain.task.TaskPackage;
import org.eclipselabs.etrack.domain.task.TaskType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage
 * @generated
 */
public class TaskAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = TaskPackage.eINSTANCE;
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
	protected TaskSwitch<Adapter> modelSwitch =
		new TaskSwitch<Adapter>()
		{
			@Override
			public Adapter caseAttachment(Attachment object)
			{
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseAttachmentData(AttachmentData object)
			{
				return createAttachmentDataAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object)
			{
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseComment(Comment object)
			{
				return createCommentAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object)
			{
				return createDurationAdapter();
			}
			@Override
			public Adapter caseTask(Task object)
			{
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskDomain(TaskDomain object)
			{
				return createTaskDomainAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object)
			{
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTaskModelVersion(TaskModelVersion object)
			{
				return createTaskModelVersionAdapter();
			}
			@Override
			public Adapter caseTaskAttributeChange(TaskAttributeChange object)
			{
				return createTaskAttributeChangeAdapter();
			}
			@Override
			public Adapter caseTaskDomainLink(TaskDomainLink object)
			{
				return createTaskDomainLinkAdapter();
			}
			@Override
			public Adapter caseRelatedTasksMapping(Map.Entry<TaskRelationship, EList<Task>> object)
			{
				return createRelatedTasksMappingAdapter();
			}
			@Override
			public Adapter caseTaskRelationship(TaskRelationship object)
			{
				return createTaskRelationshipAdapter();
			}
			@Override
			public Adapter caseTaskResolution(TaskResolution object)
			{
				return createTaskResolutionAdapter();
			}
			@Override
			public Adapter caseTaskGroup(TaskGroup object)
			{
				return createTaskGroupAdapter();
			}
			@Override
			public Adapter caseAssignableItem(AssignableItem object)
			{
				return createAssignableItemAdapter();
			}
			@Override
			public Adapter caseLinkable(Linkable object)
			{
				return createLinkableAdapter();
			}
			@Override
			public Adapter caseAuditableItem(AuditableItem object)
			{
				return createAuditableItemAdapter();
			}
			@Override
			public Adapter caseAction(Action object)
			{
				return createActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.entity.AssignableItem <em>Assignable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.entity.AssignableItem
	 * @generated
	 */
	public Adapter createAssignableItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Task
	 * @generated
	 */
	public Adapter createTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain
	 * @generated
	 */
	public Adapter createTaskDomainAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskModelVersion
	 * @generated
	 */
	public Adapter createTaskModelVersionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskAttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskAttributeChange
	 * @generated
	 */
	public Adapter createTaskAttributeChangeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink <em>Domain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomainLink
	 * @generated
	 */
	public Adapter createTaskDomainLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Related Tasks Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createRelatedTasksMappingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskRelationship
	 * @generated
	 */
	public Adapter createTaskRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskResolution
	 * @generated
	 */
	public Adapter createTaskResolutionAdapter()
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
	 * Creates a new adapter for an object of class '{@link org.eclilpselabs.etrack.domain.data.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclilpselabs.etrack.domain.data.Linkable
	 * @generated
	 */
	public Adapter createLinkableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.audit.AuditableItem <em>Auditable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.audit.AuditableItem
	 * @generated
	 */
	public Adapter createAuditableItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.audit.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.audit.Action
	 * @generated
	 */
	public Adapter createActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclilpselabs.etrack.domain.data.LinkedContent <em>Linked Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedContent
	 * @generated
	 */
	public Adapter createLinkedContentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData
	 * @generated
	 */
	public Adapter createAttachmentDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter()
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

} //TaskAdapterFactory
