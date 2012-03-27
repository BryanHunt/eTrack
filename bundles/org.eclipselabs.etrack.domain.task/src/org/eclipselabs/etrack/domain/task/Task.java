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

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.links.LinkMap;
import org.eclipselabs.etrack.domain.links.Linkable;
import org.eclipselabs.etrack.domain.links.LinkedContent;
import org.eclipselabs.etrack.domain.links.LinksPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getCreated <em>Created</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getState <em>State</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getStateHistory <em>State History</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
 * @model kind="class"
 * @generated
 */
public class Task extends EObjectImpl implements AssignableItem, Linkable
{
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Person owner;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, LinkedContent> links;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachments;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getStateHistory() <em>State History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<StateHistory> stateHistory;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> subscribers;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TaskType type;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> dependsOn;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task()
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
		return TaskPackage.Literals.TASK;
	}

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Person)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem_Owner()
	 * @model required="true"
	 * @generated
	 */
	public Person getOwner()
	{
		if (owner != null && owner.eIsProxy())
		{
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Person)eResolveProxy(oldOwner);
			if (owner != oldOwner)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOwner()
	{
		return owner;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	public void setOwner(Person newOwner)
	{
		Person oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__OWNER, oldOwner, owner));
	}

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Summary()
	 * @model required="true"
	 * @generated
	 */
	public String getSummary()
	{
		return summary;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	public void setSummary(String newSummary)
	{
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__SUMMARY, oldSummary, summary));
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Description()
	 * @model required="true"
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Created()
	 * @model required="true"
	 * @generated
	 */
	public Date getCreated()
	{
		return created;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	public void setCreated(Date newCreated)
	{
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__CREATED, oldCreated, created));
	}

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_LastModified()
	 * @model required="true"
	 * @generated
	 */
	public Date getLastModified()
	{
		return lastModified;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	public void setLastModified(Date newLastModified)
	{
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * Returns the value of the '<em><b>Links</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipselabs.etrack.domain.links.LinkedContent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' map.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getLinkable_Links()
	 * @model mapType="org.eclipselabs.etrack.domain.links.LinkMap<org.eclipse.emf.ecore.EString, org.eclipselabs.etrack.domain.links.LinkedContent>"
	 * @generated
	 */
	public EMap<String, LinkedContent> getLinks()
	{
		if (links == null)
		{
			links = new EcoreEMap<String,LinkedContent>(LinksPackage.Literals.LINK_MAP, LinkMap.class, this, TaskPackage.TASK__LINKS);
		}
		return links;
	}

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Attachment> getAttachments()
	{
		if (attachments == null)
		{
			attachments = new EObjectContainmentEList<Attachment>(Attachment.class, this, TaskPackage.TASK__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Comments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Comment> getComments()
	{
		if (comments == null)
		{
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, TaskPackage.TASK__COMMENTS);
		}
		return comments;
	}

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_State()
	 * @model required="true"
	 * @generated
	 */
	public State getState()
	{
		if (state != null && state.eIsProxy())
		{
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState()
	{
		return state;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	public void setState(State newState)
	{
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__STATE, oldState, state));
	}

	/**
	 * Returns the value of the '<em><b>State History</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.StateHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State History</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_StateHistory()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<StateHistory> getStateHistory()
	{
		if (stateHistory == null)
		{
			stateHistory = new EObjectContainmentEList.Resolving<StateHistory>(StateHistory.class, this, TaskPackage.TASK__STATE_HISTORY);
		}
		return stateHistory;
	}

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Subscribers()
	 * @model
	 * @generated
	 */
	public EList<Person> getSubscribers()
	{
		if (subscribers == null)
		{
			subscribers = new EObjectResolvingEList<Person>(Person.class, this, TaskPackage.TASK__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TaskType)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Type()
	 * @model required="true"
	 * @generated
	 */
	public TaskType getType()
	{
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (TaskType)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType basicGetType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	public void setType(TaskType newType)
	{
		TaskType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Task}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.etrack.domain.task.Task#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_DependsOn()
	 * @see org.eclipselabs.etrack.domain.task.Task#getBlocks
	 * @model opposite="blocks"
	 * @generated
	 */
	public EList<Task> getDependsOn()
	{
		if (dependsOn == null)
		{
			dependsOn = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, TaskPackage.TASK__DEPENDS_ON, TaskPackage.TASK__BLOCKS);
		}
		return dependsOn;
	}

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Task}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.etrack.domain.task.Task#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Blocks()
	 * @see org.eclipselabs.etrack.domain.task.Task#getDependsOn
	 * @model opposite="dependsOn"
	 * @generated
	 */
	public EList<Task> getBlocks()
	{
		if (blocks == null)
		{
			blocks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, TaskPackage.TASK__BLOCKS, TaskPackage.TASK__DEPENDS_ON);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case TaskPackage.TASK__BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__STATE_HISTORY:
				return ((InternalEList<?>)getStateHistory()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case TaskPackage.TASK__LINKS:
				if (coreType) return getLinks();
				else return getLinks().map();
			case TaskPackage.TASK__SUMMARY:
				return getSummary();
			case TaskPackage.TASK__DESCRIPTION:
				return getDescription();
			case TaskPackage.TASK__CREATED:
				return getCreated();
			case TaskPackage.TASK__LAST_MODIFIED:
				return getLastModified();
			case TaskPackage.TASK__ATTACHMENTS:
				return getAttachments();
			case TaskPackage.TASK__COMMENTS:
				return getComments();
			case TaskPackage.TASK__STATE:
				if (resolve) return getState();
				return basicGetState();
			case TaskPackage.TASK__STATE_HISTORY:
				return getStateHistory();
			case TaskPackage.TASK__SUBSCRIBERS:
				return getSubscribers();
			case TaskPackage.TASK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TaskPackage.TASK__DEPENDS_ON:
				return getDependsOn();
			case TaskPackage.TASK__BLOCKS:
				return getBlocks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__OWNER:
				setOwner((Person)newValue);
				return;
			case TaskPackage.TASK__LINKS:
				((EStructuralFeature.Setting)getLinks()).set(newValue);
				return;
			case TaskPackage.TASK__SUMMARY:
				setSummary((String)newValue);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.TASK__CREATED:
				setCreated((Date)newValue);
				return;
			case TaskPackage.TASK__LAST_MODIFIED:
				setLastModified((Date)newValue);
				return;
			case TaskPackage.TASK__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case TaskPackage.TASK__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case TaskPackage.TASK__STATE:
				setState((State)newValue);
				return;
			case TaskPackage.TASK__STATE_HISTORY:
				getStateHistory().clear();
				getStateHistory().addAll((Collection<? extends StateHistory>)newValue);
				return;
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Person>)newValue);
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)newValue);
				return;
			case TaskPackage.TASK__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends Task>)newValue);
				return;
			case TaskPackage.TASK__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__OWNER:
				setOwner((Person)null);
				return;
			case TaskPackage.TASK__LINKS:
				getLinks().clear();
				return;
			case TaskPackage.TASK__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.TASK__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case TaskPackage.TASK__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case TaskPackage.TASK__ATTACHMENTS:
				getAttachments().clear();
				return;
			case TaskPackage.TASK__COMMENTS:
				getComments().clear();
				return;
			case TaskPackage.TASK__STATE:
				setState((State)null);
				return;
			case TaskPackage.TASK__STATE_HISTORY:
				getStateHistory().clear();
				return;
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)null);
				return;
			case TaskPackage.TASK__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case TaskPackage.TASK__BLOCKS:
				getBlocks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case TaskPackage.TASK__OWNER:
				return owner != null;
			case TaskPackage.TASK__LINKS:
				return links != null && !links.isEmpty();
			case TaskPackage.TASK__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case TaskPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.TASK__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case TaskPackage.TASK__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case TaskPackage.TASK__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case TaskPackage.TASK__COMMENTS:
				return comments != null && !comments.isEmpty();
			case TaskPackage.TASK__STATE:
				return state != null;
			case TaskPackage.TASK__STATE_HISTORY:
				return stateHistory != null && !stateHistory.isEmpty();
			case TaskPackage.TASK__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case TaskPackage.TASK__TYPE:
				return type != null;
			case TaskPackage.TASK__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case TaskPackage.TASK__BLOCKS:
				return blocks != null && !blocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Linkable.class)
		{
			switch (derivedFeatureID)
			{
				case TaskPackage.TASK__LINKS: return LinksPackage.LINKABLE__LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Linkable.class)
		{
			switch (baseFeatureID)
			{
				case LinksPackage.LINKABLE__LINKS: return TaskPackage.TASK__LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", created: ");
		result.append(created);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(')');
		return result.toString();
	}

} // Task
