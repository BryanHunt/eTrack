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
package org.eclipselabs.etrack.domain.entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.links.LinkMap;
import org.eclipselabs.etrack.domain.links.Linkable;
import org.eclipselabs.etrack.domain.links.LinkedContent;
import org.eclipselabs.etrack.domain.links.LinksPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getEmails <em>Emails</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class Entity extends EObjectImpl implements Identity, Linkable
{
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
	 * The cached value of the '{@link #getEmails() <em>Emails</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmails()
	 * @generated
	 * @ordered
	 */
	protected EList<Email> emails;

	/**
	 * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<Phone> phoneNumbers;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entity()
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
		return EntityPackage.Literals.ENTITY;
	}

	/**
	 * Returns the value of the '<em><b>Emails</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Email}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emails</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emails</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity_Emails()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Email> getEmails()
	{
		if (emails == null)
		{
			emails = new EObjectContainmentEList<Email>(Email.class, this, EntityPackage.ENTITY__EMAILS);
		}
		return emails;
	}

	/**
	 * Returns the value of the '<em><b>Phone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Phone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Numbers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Numbers</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity_PhoneNumbers()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Phone> getPhoneNumbers()
	{
		if (phoneNumbers == null)
		{
			phoneNumbers = new EObjectContainmentEList<Phone>(Phone.class, this, EntityPackage.ENTITY__PHONE_NUMBERS);
		}
		return phoneNumbers;
	}

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity_Addresses()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Address> getAddresses()
	{
		if (addresses == null)
		{
			addresses = new EObjectContainmentEList<Address>(Address.class, this, EntityPackage.ENTITY__ADDRESSES);
		}
		return addresses;
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
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getLinkable_Links()
	 * @model mapType="org.eclipselabs.etrack.domain.links.LinkMap<org.eclipse.emf.ecore.EString, org.eclipselabs.etrack.domain.links.LinkedContent>"
	 * @generated
	 */
	public EMap<String, LinkedContent> getLinks()
	{
		if (links == null)
		{
			links = new EcoreEMap<String,LinkedContent>(LinksPackage.Literals.LINK_MAP, LinkMap.class, this, EntityPackage.ENTITY__LINKS);
		}
		return links;
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
			case EntityPackage.ENTITY__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__EMAILS:
				return ((InternalEList<?>)getEmails()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__PHONE_NUMBERS:
				return ((InternalEList<?>)getPhoneNumbers()).basicRemove(otherEnd, msgs);
			case EntityPackage.ENTITY__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
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
			case EntityPackage.ENTITY__LINKS:
				if (coreType) return getLinks();
				else return getLinks().map();
			case EntityPackage.ENTITY__EMAILS:
				return getEmails();
			case EntityPackage.ENTITY__PHONE_NUMBERS:
				return getPhoneNumbers();
			case EntityPackage.ENTITY__ADDRESSES:
				return getAddresses();
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
			case EntityPackage.ENTITY__LINKS:
				((EStructuralFeature.Setting)getLinks()).set(newValue);
				return;
			case EntityPackage.ENTITY__EMAILS:
				getEmails().clear();
				getEmails().addAll((Collection<? extends Email>)newValue);
				return;
			case EntityPackage.ENTITY__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				getPhoneNumbers().addAll((Collection<? extends Phone>)newValue);
				return;
			case EntityPackage.ENTITY__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
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
			case EntityPackage.ENTITY__LINKS:
				getLinks().clear();
				return;
			case EntityPackage.ENTITY__EMAILS:
				getEmails().clear();
				return;
			case EntityPackage.ENTITY__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				return;
			case EntityPackage.ENTITY__ADDRESSES:
				getAddresses().clear();
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
			case EntityPackage.ENTITY__LINKS:
				return links != null && !links.isEmpty();
			case EntityPackage.ENTITY__EMAILS:
				return emails != null && !emails.isEmpty();
			case EntityPackage.ENTITY__PHONE_NUMBERS:
				return phoneNumbers != null && !phoneNumbers.isEmpty();
			case EntityPackage.ENTITY__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
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
				case EntityPackage.ENTITY__LINKS: return LinksPackage.LINKABLE__LINKS;
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
				case LinksPackage.LINKABLE__LINKS: return EntityPackage.ENTITY__LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // Entity
