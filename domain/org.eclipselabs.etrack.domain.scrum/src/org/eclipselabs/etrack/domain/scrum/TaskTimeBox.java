/**
 */
package org.eclipselabs.etrack.domain.scrum;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.etrack.domain.task.TaskGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Time Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getBeginsOn <em>Begins On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getEndsOn <em>Ends On</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getTaskTimeBox()
 * @model kind="class"
 * @generated
 */
public class TaskTimeBox extends TaskGroup
{
	/**
	 * The default value of the '{@link #getBeginsOn() <em>Begins On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginsOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date BEGINS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginsOn() <em>Begins On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginsOn()
	 * @generated
	 * @ordered
	 */
	protected Date beginsOn = BEGINS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndsOn() <em>Ends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndsOn() <em>Ends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsOn()
	 * @generated
	 * @ordered
	 */
	protected Date endsOn = ENDS_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTimeBox()
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
		return ScrumPackage.Literals.TASK_TIME_BOX;
	}

	/**
	 * Returns the value of the '<em><b>Begins On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begins On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begins On</em>' attribute.
	 * @see #setBeginsOn(Date)
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getTaskTimeBox_BeginsOn()
	 * @model
	 * @generated
	 */
	public Date getBeginsOn()
	{
		return beginsOn;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getBeginsOn <em>Begins On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begins On</em>' attribute.
	 * @see #getBeginsOn()
	 * @generated
	 */
	public void setBeginsOn(Date newBeginsOn)
	{
		Date oldBeginsOn = beginsOn;
		beginsOn = newBeginsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScrumPackage.TASK_TIME_BOX__BEGINS_ON, oldBeginsOn, beginsOn));
	}

	/**
	 * Returns the value of the '<em><b>Ends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends On</em>' attribute.
	 * @see #setEndsOn(Date)
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getTaskTimeBox_EndsOn()
	 * @model
	 * @generated
	 */
	public Date getEndsOn()
	{
		return endsOn;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getEndsOn <em>Ends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends On</em>' attribute.
	 * @see #getEndsOn()
	 * @generated
	 */
	public void setEndsOn(Date newEndsOn)
	{
		Date oldEndsOn = endsOn;
		endsOn = newEndsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScrumPackage.TASK_TIME_BOX__ENDS_ON, oldEndsOn, endsOn));
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
			case ScrumPackage.TASK_TIME_BOX__BEGINS_ON:
				return getBeginsOn();
			case ScrumPackage.TASK_TIME_BOX__ENDS_ON:
				return getEndsOn();
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
			case ScrumPackage.TASK_TIME_BOX__BEGINS_ON:
				setBeginsOn((Date)newValue);
				return;
			case ScrumPackage.TASK_TIME_BOX__ENDS_ON:
				setEndsOn((Date)newValue);
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
			case ScrumPackage.TASK_TIME_BOX__BEGINS_ON:
				setBeginsOn(BEGINS_ON_EDEFAULT);
				return;
			case ScrumPackage.TASK_TIME_BOX__ENDS_ON:
				setEndsOn(ENDS_ON_EDEFAULT);
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
			case ScrumPackage.TASK_TIME_BOX__BEGINS_ON:
				return BEGINS_ON_EDEFAULT == null ? beginsOn != null : !BEGINS_ON_EDEFAULT.equals(beginsOn);
			case ScrumPackage.TASK_TIME_BOX__ENDS_ON:
				return ENDS_ON_EDEFAULT == null ? endsOn != null : !ENDS_ON_EDEFAULT.equals(endsOn);
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
		result.append(" (beginsOn: ");
		result.append(beginsOn);
		result.append(", endsOn: ");
		result.append(endsOn);
		result.append(')');
		return result.toString();
	}

} // TaskTimeBox
