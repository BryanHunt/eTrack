/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.State#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getState()
 * @model kind="class"
 * @generated
 */
public class State extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State()
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
		return TaskPackage.Literals.STATE;
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
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.State#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.STATE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getState_Transitions()
	 * @model required="true"
	 * @generated
	 */
	public EList<StateTransition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectResolvingEList<StateTransition>(StateTransition.class, this, TaskPackage.STATE__TRANSITIONS);
		}
		return transitions;
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
			case TaskPackage.STATE__NAME:
				return getName();
			case TaskPackage.STATE__TRANSITIONS:
				return getTransitions();
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
			case TaskPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends StateTransition>)newValue);
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
			case TaskPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.STATE__TRANSITIONS:
				getTransitions().clear();
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
			case TaskPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
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

} // State
