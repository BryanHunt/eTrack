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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.links.LinkMap;
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
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getState <em>State</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
 * @model kind="class"
 * @generated
 */
public class Task extends AssignableItem
{
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
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, LinkedContent> links;

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
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Links()
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
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<Comment> getComments()
	{
		if (comments == null)
		{
			comments = new EObjectContainmentEList.Resolving<Comment>(Comment.class, this, TaskPackage.TASK__COMMENTS);
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
			case TaskPackage.TASK__SUMMARY:
				return getSummary();
			case TaskPackage.TASK__DESCRIPTION:
				return getDescription();
			case TaskPackage.TASK__LINKS:
				if (coreType) return getLinks();
				else return getLinks().map();
			case TaskPackage.TASK__ATTACHMENTS:
				return getAttachments();
			case TaskPackage.TASK__COMMENTS:
				return getComments();
			case TaskPackage.TASK__STATE:
				if (resolve) return getState();
				return basicGetState();
			case TaskPackage.TASK__SUBSCRIBERS:
				return getSubscribers();
			case TaskPackage.TASK__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case TaskPackage.TASK__SUMMARY:
				setSummary((String)newValue);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.TASK__LINKS:
				((EStructuralFeature.Setting)getLinks()).set(newValue);
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
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Person>)newValue);
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)newValue);
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
			case TaskPackage.TASK__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.TASK__LINKS:
				getLinks().clear();
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
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)null);
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
			case TaskPackage.TASK__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case TaskPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.TASK__LINKS:
				return links != null && !links.isEmpty();
			case TaskPackage.TASK__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case TaskPackage.TASK__COMMENTS:
				return comments != null && !comments.isEmpty();
			case TaskPackage.TASK__STATE:
				return state != null;
			case TaskPackage.TASK__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case TaskPackage.TASK__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} // Task
