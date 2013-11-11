/**
 */
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.etrack.domain.data.CategorizedItem;
import org.eclipselabs.etrack.domain.data.Category;

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
public class Address extends MinimalEObjectImpl.Container implements CategorizedItem
{
  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Category category;

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
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getCategorizedItem_Category()
   * @model
   * @generated
   */
  public Category getCategory()
  {
    if (category != null && category.eIsProxy())
    {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (Category)eResolveProxy(oldCategory);
      if (category != oldCategory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.ADDRESS__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category basicGetCategory()
  {
    return category;
  }

  /**
   * Sets the value of the '{@link org.eclipselabs.etrack.domain.entity.Address#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  public void setCategory(Category newCategory)
  {
    Category oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ADDRESS__CATEGORY, oldCategory, category));
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
   * @model unique="false"
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
   * @model unique="false"
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
   * @model unique="false"
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
   * @model unique="false"
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
   * @model unique="false"
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
   * @model unique="false"
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
      case EntityPackage.ADDRESS__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
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
      case EntityPackage.ADDRESS__CATEGORY:
        setCategory((Category)newValue);
        return;
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
      case EntityPackage.ADDRESS__CATEGORY:
        setCategory((Category)null);
        return;
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
      case EntityPackage.ADDRESS__CATEGORY:
        return category != null;
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
