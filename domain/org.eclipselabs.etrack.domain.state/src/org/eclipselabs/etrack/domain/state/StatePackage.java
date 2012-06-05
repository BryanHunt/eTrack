/**
 */
package org.eclipselabs.etrack.domain.state;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipselabs.etrack.domain.audit.AuditPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.state.StateFactory
 * @model kind="package"
 * @generated
 */
public class StatePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "state";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/state";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.state";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatePackage eINSTANCE = org.eclipselabs.etrack.domain.state.StatePackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.state.State <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.state.State
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getState()
	 * @generated
	 */
	public static final int STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.state.StateTransition <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.state.StateTransition
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransition()
	 * @generated
	 */
	public static final int STATE_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION__TARGET_STATE = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.state.StateTransitionMapping <em>Transition Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.state.StateTransitionMapping
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransitionMapping()
	 * @generated
	 */
	public static final int STATE_TRANSITION_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAPPING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Transition Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_TRANSITION_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.state.StateChange <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.state.StateChange
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateChange()
	 * @generated
	 */
	public static final int STATE_CHANGE = 3;

	/**
	 * The feature id for the '<em><b>Initiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_CHANGE__INITIATED_ON = AuditPackage.ACTION__INITIATED_ON;

	/**
	 * The feature id for the '<em><b>Initiated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_CHANGE__INITIATED_BY = AuditPackage.ACTION__INITIATED_BY;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_CHANGE__TRANSITION = AuditPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_CHANGE_FEATURE_COUNT = AuditPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.state.StateMachine <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.state.StateMachine
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine()
	 * @generated
	 */
	public static final int STATE_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Transitions By State</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE__TRANSITIONS_BY_STATE = 2;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.etrack.domain.state.StatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatePackage()
	{
		super(eNS_URI, StateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatePackage init()
	{
		if (isInited) return (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Obtain or create and register package
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatePackage());

		isInited = true;

		// Initialize simple dependencies
		AuditPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, theStatePackage);
		return theStatePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.state.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipselabs.etrack.domain.state.State
	 * @generated
	 */
	public EClass getState()
	{
		return stateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.state.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.state.State#getName()
	 * @see #getState()
	 * @generated
	 */
	public EAttribute getState_Name()
	{
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.state.StateTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateTransition
	 * @generated
	 */
	public EClass getStateTransition()
	{
		return stateTransitionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.state.StateTransition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateTransition#getName()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EAttribute getStateTransition_Name()
	{
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.state.StateTransition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateTransition#getTargetState()
	 * @see #getStateTransition()
	 * @generated
	 */
	public EReference getStateTransition_TargetState()
	{
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Transition Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Mapping</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipselabs.etrack.domain.state.State"
	 *        valueType="org.eclipselabs.etrack.domain.state.StateTransition" valueMany="true"
	 * @generated
	 */
	public EClass getStateTransitionMapping()
	{
		return stateTransitionMappingEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateTransitionMapping()
	 * @generated
	 */
	public EReference getStateTransitionMapping_Key()
	{
		return (EReference)stateTransitionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStateTransitionMapping()
	 * @generated
	 */
	public EReference getStateTransitionMapping_Value()
	{
		return (EReference)stateTransitionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.state.StateChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateChange
	 * @generated
	 */
	public EClass getStateChange()
	{
		return stateChangeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.state.StateChange#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateChange#getTransition()
	 * @see #getStateChange()
	 * @generated
	 */
	public EReference getStateChange_Transition()
	{
		return (EReference)stateChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.state.StateMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateMachine
	 * @generated
	 */
	public EClass getStateMachine()
	{
		return stateMachineEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.state.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_States()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.state.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateMachine#getTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_Transitions()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.etrack.domain.state.StateMachine#getTransitionsByState <em>Transitions By State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Transitions By State</em>'.
	 * @see org.eclipselabs.etrack.domain.state.StateMachine#getTransitionsByState()
	 * @see #getStateMachine()
	 * @generated
	 */
	public EReference getStateMachine_TransitionsByState()
	{
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StateFactory getStateFactory()
	{
		return (StateFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__NAME);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TARGET_STATE);

		stateTransitionMappingEClass = createEClass(STATE_TRANSITION_MAPPING);
		createEReference(stateTransitionMappingEClass, STATE_TRANSITION_MAPPING__KEY);
		createEReference(stateTransitionMappingEClass, STATE_TRANSITION_MAPPING__VALUE);

		stateChangeEClass = createEClass(STATE_CHANGE);
		createEReference(stateChangeEClass, STATE_CHANGE__TRANSITION);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATES);
		createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__TRANSITIONS_BY_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AuditPackage theAuditPackage = (AuditPackage)EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateChangeEClass.getESuperTypes().add(theAuditPackage.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateTransition_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_TargetState(), this.getState(), null, "targetState", null, 0, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionMappingEClass, Map.Entry.class, "StateTransitionMapping", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransitionMapping_Key(), this.getState(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransitionMapping_Value(), this.getStateTransition(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateChangeEClass, StateChange.class, "StateChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateChange_Transition(), this.getStateTransition(), null, "transition", null, 0, 1, StateChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_States(), this.getState(), null, "states", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Transitions(), this.getStateTransition(), null, "transitions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_TransitionsByState(), this.getStateTransitionMapping(), null, "transitionsByState", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.state.State <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.state.State
		 * @see org.eclipselabs.etrack.domain.state.StatePackage#getState()
		 * @generated
		 */
		public static final EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.state.StateTransition <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.state.StateTransition
		 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransition()
		 * @generated
		 */
		public static final EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STATE_TRANSITION__NAME = eINSTANCE.getStateTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION__TARGET_STATE = eINSTANCE.getStateTransition_TargetState();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.state.StateTransitionMapping <em>Transition Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.state.StateTransitionMapping
		 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateTransitionMapping()
		 * @generated
		 */
		public static final EClass STATE_TRANSITION_MAPPING = eINSTANCE.getStateTransitionMapping();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION_MAPPING__KEY = eINSTANCE.getStateTransitionMapping_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_TRANSITION_MAPPING__VALUE = eINSTANCE.getStateTransitionMapping_Value();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.state.StateChange <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.state.StateChange
		 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateChange()
		 * @generated
		 */
		public static final EClass STATE_CHANGE = eINSTANCE.getStateChange();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_CHANGE__TRANSITION = eINSTANCE.getStateChange_Transition();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.state.StateMachine <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.state.StateMachine
		 * @see org.eclipselabs.etrack.domain.state.StatePackage#getStateMachine()
		 * @generated
		 */
		public static final EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__TRANSITIONS = eINSTANCE.getStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>Transitions By State</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STATE_MACHINE__TRANSITIONS_BY_STATE = eINSTANCE.getStateMachine_TransitionsByState();

	}

} //StatePackage
