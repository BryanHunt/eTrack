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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipselabs.etrack.domain.entity.AssignableItem;
import org.eclipselabs.etrack.domain.entity.EntityPackage;
import org.eclipselabs.etrack.domain.entity.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Attachment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Attachment#getSizeInBytes <em>Size In Bytes</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Attachment#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment()
 * @model kind="class"
 * @generated
 */
public class Attachment extends Artifact implements AssignableItem
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
	 * The default value of the '{@link #getSizeInBytes() <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSizeInBytes() <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected long sizeInBytes = SIZE_IN_BYTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataContainer() <em>Data Container</em>}' containment reference.
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
	 * @model
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.ATTACHMENT__OWNER, oldOwner, owner));
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
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Attachment#getOwner <em>Owner</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__OWNER, oldOwner, owner));
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
	 * Returns the value of the '<em><b>Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bytes</em>' attribute.
	 * @see #setSizeInBytes(long)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment_SizeInBytes()
	 * @model required="true"
	 * @generated
	 */
	public long getSizeInBytes()
	{
		return sizeInBytes;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Attachment#getSizeInBytes <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Bytes</em>' attribute.
	 * @see #getSizeInBytes()
	 * @generated
	 */
	public void setSizeInBytes(long newSizeInBytes)
	{
		long oldSizeInBytes = sizeInBytes;
		sizeInBytes = newSizeInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__SIZE_IN_BYTES, oldSizeInBytes, sizeInBytes));
	}

	/**
	 * Returns the value of the '<em><b>Data Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Container</em>' containment reference.
	 * @see #setDataContainer(AttachmentData)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAttachment_DataContainer()
	 * @model containment="true"
	 * @generated
	 */
	public AttachmentData getDataContainer()
	{
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataContainer(AttachmentData newDataContainer, NotificationChain msgs)
	{
		AttachmentData oldDataContainer = dataContainer;
		dataContainer = newDataContainer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__DATA_CONTAINER, oldDataContainer, newDataContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Attachment#getDataContainer <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Container</em>' containment reference.
	 * @see #getDataContainer()
	 * @generated
	 */
	public void setDataContainer(AttachmentData newDataContainer)
	{
		if (newDataContainer != dataContainer)
		{
			NotificationChain msgs = null;
			if (dataContainer != null)
				msgs = ((InternalEObject)dataContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.ATTACHMENT__DATA_CONTAINER, null, msgs);
			if (newDataContainer != null)
				msgs = ((InternalEObject)newDataContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.ATTACHMENT__DATA_CONTAINER, null, msgs);
			msgs = basicSetDataContainer(newDataContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ATTACHMENT__DATA_CONTAINER, newDataContainer, newDataContainer));
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
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				return basicSetDataContainer(null, msgs);
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
			case TaskPackage.ATTACHMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				return getDescription();
			case TaskPackage.ATTACHMENT__SIZE_IN_BYTES:
				return getSizeInBytes();
			case TaskPackage.ATTACHMENT__DATA_CONTAINER:
				return getDataContainer();
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
			case TaskPackage.ATTACHMENT__OWNER:
				setOwner((Person)newValue);
				return;
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.ATTACHMENT__SIZE_IN_BYTES:
				setSizeInBytes((Long)newValue);
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
			case TaskPackage.ATTACHMENT__OWNER:
				setOwner((Person)null);
				return;
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.ATTACHMENT__SIZE_IN_BYTES:
				setSizeInBytes(SIZE_IN_BYTES_EDEFAULT);
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
			case TaskPackage.ATTACHMENT__OWNER:
				return owner != null;
			case TaskPackage.ATTACHMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.ATTACHMENT__SIZE_IN_BYTES:
				return sizeInBytes != SIZE_IN_BYTES_EDEFAULT;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == AssignableItem.class)
		{
			switch (derivedFeatureID)
			{
				case TaskPackage.ATTACHMENT__OWNER: return EntityPackage.ASSIGNABLE_ITEM__OWNER;
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
		if (baseClass == AssignableItem.class)
		{
			switch (baseFeatureID)
			{
				case EntityPackage.ASSIGNABLE_ITEM__OWNER: return TaskPackage.ATTACHMENT__OWNER;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", sizeInBytes: ");
		result.append(sizeInBytes);
		result.append(')');
		return result.toString();
	}

} // Attachment
