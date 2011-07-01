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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getAdditional <em>Additional</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getState <em>State</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getZip <em>Zip</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Address#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress()
 * @model kind="class"
 * @generated
 */
public class Address extends CategorizedItem
{
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected String additional = ADDITIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final int ZIP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected int zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Address()
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
		return EntityPackage.Literals.ADDRESS;
	}

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_Street()
	 * @model
	 * @generated
	 */
	public String getStreet()
	{
		return street;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	public void setStreet(String newStreet)
	{
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * Returns the value of the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional</em>' attribute.
	 * @see #setAdditional(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_Additional()
	 * @model
	 * @generated
	 */
	public String getAdditional()
	{
		return additional;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getAdditional <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional</em>' attribute.
	 * @see #getAdditional()
	 * @generated
	 */
	public void setAdditional(String newAdditional)
	{
		String oldAdditional = additional;
		additional = newAdditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__ADDITIONAL, oldAdditional, additional));
	}

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_City()
	 * @model
	 * @generated
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	public void setCity(String newCity)
	{
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_State()
	 * @model
	 * @generated
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	public void setState(String newState)
	{
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__STATE, oldState, state));
	}

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #setZip(int)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_Zip()
	 * @model
	 * @generated
	 */
	public int getZip()
	{
		return zip;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #getZip()
	 * @generated
	 */
	public void setZip(int newZip)
	{
		int oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__ZIP, oldZip, zip));
	}

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress_Country()
	 * @model
	 * @generated
	 */
	public String getCountry()
	{
		return country;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	public void setCountry(String newCountry)
	{
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__COUNTRY, oldCountry, country));
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
			case EntityPackage.ADDRESS__STREET:
				return getStreet();
			case EntityPackage.ADDRESS__ADDITIONAL:
				return getAdditional();
			case EntityPackage.ADDRESS__CITY:
				return getCity();
			case EntityPackage.ADDRESS__STATE:
				return getState();
			case EntityPackage.ADDRESS__ZIP:
				return getZip();
			case EntityPackage.ADDRESS__COUNTRY:
				return getCountry();
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
			case EntityPackage.ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case EntityPackage.ADDRESS__ADDITIONAL:
				setAdditional((String)newValue);
				return;
			case EntityPackage.ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case EntityPackage.ADDRESS__STATE:
				setState((String)newValue);
				return;
			case EntityPackage.ADDRESS__ZIP:
				setZip((Integer)newValue);
				return;
			case EntityPackage.ADDRESS__COUNTRY:
				setCountry((String)newValue);
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
			case EntityPackage.ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case EntityPackage.ADDRESS__ADDITIONAL:
				setAdditional(ADDITIONAL_EDEFAULT);
				return;
			case EntityPackage.ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case EntityPackage.ADDRESS__STATE:
				setState(STATE_EDEFAULT);
				return;
			case EntityPackage.ADDRESS__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case EntityPackage.ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case EntityPackage.ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case EntityPackage.ADDRESS__ADDITIONAL:
				return ADDITIONAL_EDEFAULT == null ? additional != null : !ADDITIONAL_EDEFAULT.equals(additional);
			case EntityPackage.ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case EntityPackage.ADDRESS__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case EntityPackage.ADDRESS__ZIP:
				return zip != ZIP_EDEFAULT;
			case EntityPackage.ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (street: ");
		result.append(street);
		result.append(", additional: ");
		result.append(additional);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", zip: ");
		result.append(zip);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} // Address
