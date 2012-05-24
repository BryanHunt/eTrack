/**
 */
package org.eclipselabs.etrack.domain.state;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateMachine#getTransitionsByState <em>Transitions By State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine()
 * @model kind="class"
 * @generated
 */
public class StateMachine extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> transitions;

	/**
	 * The cached value of the '{@link #getTransitionsByState() <em>Transitions By State</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionsByState()
	 * @generated
	 * @ordered
	 */
	protected EMap<State, StateTransition> transitionsByState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachine()
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
		return StatePackage.Literals.STATE_MACHINE;
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	public EList<State> getStates()
	{
		if (states == null)
		{
			states = new EObjectContainmentEList<State>(State.class, this, StatePackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	public EList<StateTransition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectContainmentEList<StateTransition>(StateTransition.class, this, StatePackage.STATE_MACHINE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Transitions By State</b></em>' map.
	 * The key is of type {@link org.eclipselabs.etrack.domain.state.State},
	 * and the value is of type {@link org.eclipselabs.etrack.domain.state.StateTransition},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions By State</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions By State</em>' map.
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine_TransitionsByState()
	 * @model mapType="org.eclipselabs.etrack.domain.state.StateTransitionMapping<org.eclipselabs.etrack.domain.state.State, org.eclipselabs.etrack.domain.state.StateTransition>"
	 * @generated
	 */
	public EMap<State, StateTransition> getTransitionsByState()
	{
		if (transitionsByState == null)
		{
			transitionsByState = new EcoreEMap<State,StateTransition>(StatePackage.Literals.STATE_TRANSITION_MAPPING, StateTransitionMapping.class, this, StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE);
		}
		return transitionsByState;
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
			case StatePackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				return ((InternalEList<?>)getTransitionsByState()).basicRemove(otherEnd, msgs);
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
			case StatePackage.STATE_MACHINE__STATES:
				return getStates();
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				if (coreType) return getTransitionsByState();
				else return getTransitionsByState().map();
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
			case StatePackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends StateTransition>)newValue);
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				((EStructuralFeature.Setting)getTransitionsByState()).set(newValue);
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
			case StatePackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				getTransitionsByState().clear();
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
			case StatePackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				return transitionsByState != null && !transitionsByState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
