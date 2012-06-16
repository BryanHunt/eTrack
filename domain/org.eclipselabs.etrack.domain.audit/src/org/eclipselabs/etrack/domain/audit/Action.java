/**
 */
package org.eclipselabs.etrack.domain.audit;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipselabs.etrack.domain.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedOn <em>Initiated On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedBy <em>Initiated By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction()
 * @model kind="class"
 * @generated
 */
public class Action extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getInitiatedOn() <em>Initiated On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date INITIATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatedOn() <em>Initiated On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date initiatedOn = INITIATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitiatedBy() <em>Initiated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatedBy()
	 * @generated
	 * @ordered
	 */
	protected Entity initiatedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action()
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
		return AuditPackage.Literals.ACTION;
	}

	/**
	 * Returns the value of the '<em><b>Initiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiated On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiated On</em>' attribute.
	 * @see #setInitiatedOn(Date)
	 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction_InitiatedOn()
	 * @model
	 * @generated
	 */
	public Date getInitiatedOn()
	{
		return initiatedOn;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedOn <em>Initiated On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiated On</em>' attribute.
	 * @see #getInitiatedOn()
	 * @generated
	 */
	public void setInitiatedOn(Date newInitiatedOn)
	{
		Date oldInitiatedOn = initiatedOn;
		initiatedOn = newInitiatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ACTION__INITIATED_ON, oldInitiatedOn, initiatedOn));
	}

	/**
	 * Returns the value of the '<em><b>Initiated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiated By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiated By</em>' reference.
	 * @see #setInitiatedBy(Entity)
	 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction_InitiatedBy()
	 * @model
	 * @generated
	 */
	public Entity getInitiatedBy()
	{
		if (initiatedBy != null && initiatedBy.eIsProxy()) {
			InternalEObject oldInitiatedBy = (InternalEObject)initiatedBy;
			initiatedBy = (Entity)eResolveProxy(oldInitiatedBy);
			if (initiatedBy != oldInitiatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuditPackage.ACTION__INITIATED_BY, oldInitiatedBy, initiatedBy));
			}
		}
		return initiatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetInitiatedBy()
	{
		return initiatedBy;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedBy <em>Initiated By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiated By</em>' reference.
	 * @see #getInitiatedBy()
	 * @generated
	 */
	public void setInitiatedBy(Entity newInitiatedBy)
	{
		Entity oldInitiatedBy = initiatedBy;
		initiatedBy = newInitiatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuditPackage.ACTION__INITIATED_BY, oldInitiatedBy, initiatedBy));
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
			case AuditPackage.ACTION__INITIATED_ON:
				return getInitiatedOn();
			case AuditPackage.ACTION__INITIATED_BY:
				if (resolve) return getInitiatedBy();
				return basicGetInitiatedBy();
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
		switch (featureID) {
			case AuditPackage.ACTION__INITIATED_ON:
				setInitiatedOn((Date)newValue);
				return;
			case AuditPackage.ACTION__INITIATED_BY:
				setInitiatedBy((Entity)newValue);
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
			case AuditPackage.ACTION__INITIATED_ON:
				setInitiatedOn(INITIATED_ON_EDEFAULT);
				return;
			case AuditPackage.ACTION__INITIATED_BY:
				setInitiatedBy((Entity)null);
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
			case AuditPackage.ACTION__INITIATED_ON:
				return INITIATED_ON_EDEFAULT == null ? initiatedOn != null : !INITIATED_ON_EDEFAULT.equals(initiatedOn);
			case AuditPackage.ACTION__INITIATED_BY:
				return initiatedBy != null;
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
		result.append(" (initiatedOn: ");
		result.append(initiatedOn);
		result.append(')');
		return result.toString();
	}

} // Action
