/**
 */
package org.eclipselabs.etrack.domain.security;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipselabs.etrack.domain.entity.Group;
import org.eclipselabs.etrack.domain.entity.Identity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.security.PermissionGroup#getAdmins <em>Admins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getPermissionGroup()
 * @model kind="class"
 * @generated
 */
public class PermissionGroup extends EObjectImpl implements Group
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identity> members;

	/**
	 * The cached value of the '{@link #getAdmins() <em>Admins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmins()
	 * @generated
	 * @ordered
	 */
	protected EList<Identity> admins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionGroup()
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
		return SecurityPackage.Literals.PERMISSION_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.security.PermissionGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.PERMISSION_GROUP__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getGroup_Members()
	 * @model
	 * @generated
	 */
	public EList<Identity> getMembers()
	{
		if (members == null) {
			members = new EObjectResolvingEList<Identity>(Identity.class, this, SecurityPackage.PERMISSION_GROUP__MEMBERS);
		}
		return members;
	}

	/**
	 * Returns the value of the '<em><b>Admins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admins</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getPermissionGroup_Admins()
	 * @model
	 * @generated
	 */
	public EList<Identity> getAdmins()
	{
		if (admins == null) {
			admins = new EObjectResolvingEList<Identity>(Identity.class, this, SecurityPackage.PERMISSION_GROUP__ADMINS);
		}
		return admins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case SecurityPackage.PERMISSION_GROUP__NAME:
				return getName();
			case SecurityPackage.PERMISSION_GROUP__MEMBERS:
				return getMembers();
			case SecurityPackage.PERMISSION_GROUP__ADMINS:
				return getAdmins();
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
		switch (featureID) {
			case SecurityPackage.PERMISSION_GROUP__NAME:
				setName((String)newValue);
				return;
			case SecurityPackage.PERMISSION_GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Identity>)newValue);
				return;
			case SecurityPackage.PERMISSION_GROUP__ADMINS:
				getAdmins().clear();
				getAdmins().addAll((Collection<? extends Identity>)newValue);
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
		switch (featureID) {
			case SecurityPackage.PERMISSION_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPackage.PERMISSION_GROUP__MEMBERS:
				getMembers().clear();
				return;
			case SecurityPackage.PERMISSION_GROUP__ADMINS:
				getAdmins().clear();
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
		switch (featureID) {
			case SecurityPackage.PERMISSION_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPackage.PERMISSION_GROUP__MEMBERS:
				return members != null && !members.isEmpty();
			case SecurityPackage.PERMISSION_GROUP__ADMINS:
				return admins != null && !admins.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // PermissionGroup
