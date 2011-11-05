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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Attachment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Attachment#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
 * @model kind="class"
 * @generated
 */
public class Attachment extends AssignableItem
{
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
	 * The cached value of the '{@link #getDataContainer() <em>Data Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContainer()
	 * @generated
	 * @ordered
	 */
	protected AttachmentData dataContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment()
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
		return TaskPackage.Literals.ATTACHMENT;
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
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment_Description()
	 * @model required="true"
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Attachment#getDescription <em>Description</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' reference.
	 * @see #setDataContainer(AttachmentData)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment_DataContainer()
	 * @model
	 * @generated
	 */
	public AttachmentData getDataContainer()
	{
		if (dataContainer != null && dataContainer.eIsProxy())
		{
			InternalEObject oldDataContainer = (InternalEObject)dataContainer;
			dataContainer = (AttachmentData)eResolveProxy(oldDataContainer);
			if (dataContainer != oldDataContainer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.ATTACHMENT__DATA_CONTAINER, oldDataContainer, dataContainer));
			}
		}
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentData basicGetDataContainer()
	{
		return dataContainer;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Attachment#getDataContainer <em>Data Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	public void setDataContainer(AttachmentData newDataContainer)
	{
		AttachmentData oldDataContainer = dataContainer;
		dataContainer = newDataContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__DATA_CONTAINER, oldDataContainer, dataContainer));
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
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				return getDescription();
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				if (resolve) return getDataContainer();
				return basicGetDataContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				setDataContainer((AttachmentData)newValue);
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
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				setDataContainer((AttachmentData)null);
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
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				return dataContainer != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // Attachment
