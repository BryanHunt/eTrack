/**
 */
package org.eclipselabs.etrack.domain.state;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateMachine#getStateGroups <em>State Groups</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.state.StateMachine#getStartingState <em>Starting State</em>}</li>
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
	protected EMap<State, EList<StateTransition>> transitionsByState;

	/**
	 * The cached value of the '{@link #getStateGroups() <em>State Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<StateGroup> stateGroups;

	/**
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

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
		if (states == null) {
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
		if (transitions == null) {
			transitions = new EObjectContainmentEList<StateTransition>(StateTransition.class, this, StatePackage.STATE_MACHINE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * Returns the value of the '<em><b>Transitions By State</b></em>' map.
	 * The key is of type {@link org.eclipselabs.etrack.domain.state.State},
	 * and the value is of type list of {@link org.eclipselabs.etrack.domain.state.StateTransition},
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
	public EMap<State, EList<StateTransition>> getTransitionsByState()
	{
		if (transitionsByState == null) {
			transitionsByState = new EcoreEMap<State,EList<StateTransition>>(StatePackage.Literals.STATE_TRANSITION_MAPPING, StateTransitionMapping.class, this, StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE);
		}
		return transitionsByState;
	}

	/**
	 * Returns the value of the '<em><b>State Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.state.StateGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Groups</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine_StateGroups()
	 * @model containment="true"
	 * @generated
	 */
	public EList<StateGroup> getStateGroups()
	{
		if (stateGroups == null) {
			stateGroups = new EObjectContainmentEList<StateGroup>(StateGroup.class, this, StatePackage.STATE_MACHINE__STATE_GROUPS);
		}
		return stateGroups;
	}

	/**
	 * Returns the value of the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting State</em>' reference.
	 * @see #setStartingState(State)
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine_StartingState()
	 * @model required="true"
	 * @generated
	 */
	public State getStartingState()
	{
		if (startingState != null && startingState.eIsProxy()) {
			InternalEObject oldStartingState = (InternalEObject)startingState;
			startingState = (State)eResolveProxy(oldStartingState);
			if (startingState != oldStartingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.STATE_MACHINE__STARTING_STATE, oldStartingState, startingState));
			}
		}
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartingState()
	{
		return startingState;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.state.StateMachine#getStartingState <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting State</em>' reference.
	 * @see #getStartingState()
	 * @generated
	 */
	public void setStartingState(State newStartingState)
	{
		State oldStartingState = startingState;
		startingState = newStartingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE_MACHINE__STARTING_STATE, oldStartingState, startingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case StatePackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				return ((InternalEList<?>)getTransitionsByState()).basicRemove(otherEnd, msgs);
			case StatePackage.STATE_MACHINE__STATE_GROUPS:
				return ((InternalEList<?>)getStateGroups()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case StatePackage.STATE_MACHINE__STATES:
				return getStates();
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				if (coreType) return getTransitionsByState();
				else return getTransitionsByState().map();
			case StatePackage.STATE_MACHINE__STATE_GROUPS:
				return getStateGroups();
			case StatePackage.STATE_MACHINE__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
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
			case StatePackage.STATE_MACHINE__STATE_GROUPS:
				getStateGroups().clear();
				getStateGroups().addAll((Collection<? extends StateGroup>)newValue);
				return;
			case StatePackage.STATE_MACHINE__STARTING_STATE:
				setStartingState((State)newValue);
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
			case StatePackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				getTransitionsByState().clear();
				return;
			case StatePackage.STATE_MACHINE__STATE_GROUPS:
				getStateGroups().clear();
				return;
			case StatePackage.STATE_MACHINE__STARTING_STATE:
				setStartingState((State)null);
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
			case StatePackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case StatePackage.STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StatePackage.STATE_MACHINE__TRANSITIONS_BY_STATE:
				return transitionsByState != null && !transitionsByState.isEmpty();
			case StatePackage.STATE_MACHINE__STATE_GROUPS:
				return stateGroups != null && !stateGroups.isEmpty();
			case StatePackage.STATE_MACHINE__STARTING_STATE:
				return startingState != null;
		}
		return super.eIsSet(featureID);
	}

} // StateMachine
