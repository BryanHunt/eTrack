/**
 */
package org.eclipselabs.etrack.domain.entity;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.etrack.domain.data.DataPackage;
import org.eclipselabs.etrack.domain.data.LinkMapping;
import org.eclipselabs.etrack.domain.data.Linkable;
import org.eclipselabs.etrack.domain.data.LinkedContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.entity.Entity#getEmails <em>Emails</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity()
 * @model kind="class"
 * @generated
 */
public class Entity extends MinimalEObjectImpl.Container implements Identity, Linkable
{
  /**
   * The cached value of the '{@link #getLinksByName() <em>Links By Name</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinksByName()
   * @generated
   * @ordered
   */
  protected EMap<String, LinkedContent> linksByName;

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
   * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhoneNumbers()
   * @generated
   * @ordered
   */
  protected EList<Phone> phoneNumbers;

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
   * Returns the value of the '<em><b>Links By Name</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link org.eclipselabs.etrack.domain.data.LinkedContent},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links By Name</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links By Name</em>' map.
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getLinkable_LinksByName()
   * @model mapType="org.eclipselabs.etrack.domain.data.LinkMapping<org.eclipse.emf.ecore.EString, org.eclipselabs.etrack.domain.data.LinkedContent>"
   * @generated
   */
  public EMap<String, LinkedContent> getLinksByName()
  {
    if (linksByName == null)
    {
      linksByName = new EcoreEMap<String,LinkedContent>(DataPackage.Literals.LINK_MAPPING, LinkMapping.class, this, EntityPackage.ENTITY__LINKS_BY_NAME);
    }
    return linksByName;
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" unique="false"
   * @generated
   */
  public String getDisplayName()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case EntityPackage.ENTITY__LINKS_BY_NAME:
        return ((InternalEList<?>)getLinksByName()).basicRemove(otherEnd, msgs);
      case EntityPackage.ENTITY__ADDRESSES:
        return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
      case EntityPackage.ENTITY__PHONE_NUMBERS:
        return ((InternalEList<?>)getPhoneNumbers()).basicRemove(otherEnd, msgs);
      case EntityPackage.ENTITY__EMAILS:
        return ((InternalEList<?>)getEmails()).basicRemove(otherEnd, msgs);
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
      case EntityPackage.ENTITY__LINKS_BY_NAME:
        if (coreType) return getLinksByName();
        else return getLinksByName().map();
      case EntityPackage.ENTITY__ADDRESSES:
        return getAddresses();
      case EntityPackage.ENTITY__PHONE_NUMBERS:
        return getPhoneNumbers();
      case EntityPackage.ENTITY__EMAILS:
        return getEmails();
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
      case EntityPackage.ENTITY__LINKS_BY_NAME:
        ((EStructuralFeature.Setting)getLinksByName()).set(newValue);
        return;
      case EntityPackage.ENTITY__ADDRESSES:
        getAddresses().clear();
        getAddresses().addAll((Collection<? extends Address>)newValue);
        return;
      case EntityPackage.ENTITY__PHONE_NUMBERS:
        getPhoneNumbers().clear();
        getPhoneNumbers().addAll((Collection<? extends Phone>)newValue);
        return;
      case EntityPackage.ENTITY__EMAILS:
        getEmails().clear();
        getEmails().addAll((Collection<? extends Email>)newValue);
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
      case EntityPackage.ENTITY__LINKS_BY_NAME:
        getLinksByName().clear();
        return;
      case EntityPackage.ENTITY__ADDRESSES:
        getAddresses().clear();
        return;
      case EntityPackage.ENTITY__PHONE_NUMBERS:
        getPhoneNumbers().clear();
        return;
      case EntityPackage.ENTITY__EMAILS:
        getEmails().clear();
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
      case EntityPackage.ENTITY__LINKS_BY_NAME:
        return linksByName != null && !linksByName.isEmpty();
      case EntityPackage.ENTITY__ADDRESSES:
        return addresses != null && !addresses.isEmpty();
      case EntityPackage.ENTITY__PHONE_NUMBERS:
        return phoneNumbers != null && !phoneNumbers.isEmpty();
      case EntityPackage.ENTITY__EMAILS:
        return emails != null && !emails.isEmpty();
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
        case EntityPackage.ENTITY__LINKS_BY_NAME: return DataPackage.LINKABLE__LINKS_BY_NAME;
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
        case DataPackage.LINKABLE__LINKS_BY_NAME: return EntityPackage.ENTITY__LINKS_BY_NAME;
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case EntityPackage.ENTITY___GET_DISPLAY_NAME:
        return getDisplayName();
    }
    return super.eInvoke(operationID, arguments);
  }

} // Entity
