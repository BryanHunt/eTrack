/**
 */
package org.eclipselabs.etrack.domain.audit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.entity.EntityPackage;

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
 * @see org.eclipselabs.etrack.domain.audit.AuditFactory
 * @model kind="package"
 * @generated
 */
public class AuditPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "audit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/audit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.ecipselabs.etrack.domain.audit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AuditPackage eINSTANCE = org.eclipselabs.etrack.domain.audit.AuditPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.audit.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.audit.Action
	 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction()
	 * @generated
	 */
	public static final int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Initiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__INITIATED_ON = 0;

	/**
	 * The feature id for the '<em><b>Initiated By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION__INITIATED_BY = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.audit.AuditableItem <em>Auditable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.audit.AuditableItem
	 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAuditableItem()
	 * @generated
	 */
	public static final int AUDITABLE_ITEM = 1;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUDITABLE_ITEM__HISTORY = 0;

	/**
	 * The number of structural features of the '<em>Auditable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUDITABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditableItemEClass = null;

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
	 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuditPackage()
	{
		super(eNS_URI, AuditFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuditPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuditPackage init()
	{
		if (isInited) return (AuditPackage)EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);

		// Obtain or create and register package
		AuditPackage theAuditPackage = (AuditPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuditPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuditPackage());

		isInited = true;

		// Initialize simple dependencies
		EntityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAuditPackage.createPackageContents();

		// Initialize created meta-data
		theAuditPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuditPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuditPackage.eNS_URI, theAuditPackage);
		return theAuditPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.audit.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipselabs.etrack.domain.audit.Action
	 * @generated
	 */
	public EClass getAction()
	{
		return actionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedOn <em>Initiated On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiated On</em>'.
	 * @see org.eclipselabs.etrack.domain.audit.Action#getInitiatedOn()
	 * @see #getAction()
	 * @generated
	 */
	public EAttribute getAction_InitiatedOn()
	{
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.audit.Action#getInitiatedBy <em>Initiated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiated By</em>'.
	 * @see org.eclipselabs.etrack.domain.audit.Action#getInitiatedBy()
	 * @see #getAction()
	 * @generated
	 */
	public EReference getAction_InitiatedBy()
	{
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.audit.AuditableItem <em>Auditable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditable Item</em>'.
	 * @see org.eclipselabs.etrack.domain.audit.AuditableItem
	 * @generated
	 */
	public EClass getAuditableItem()
	{
		return auditableItemEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.audit.AuditableItem#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see org.eclipselabs.etrack.domain.audit.AuditableItem#getHistory()
	 * @see #getAuditableItem()
	 * @generated
	 */
	public EReference getAuditableItem_History()
	{
		return (EReference)auditableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AuditFactory getAuditFactory()
	{
		return (AuditFactory)getEFactoryInstance();
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
		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__INITIATED_ON);
		createEReference(actionEClass, ACTION__INITIATED_BY);

		auditableItemEClass = createEClass(AUDITABLE_ITEM);
		createEReference(auditableItemEClass, AUDITABLE_ITEM__HISTORY);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_InitiatedOn(), ecorePackage.getEDate(), "initiatedOn", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_InitiatedBy(), theEntityPackage.getEntity(), null, "initiatedBy", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auditableItemEClass, AuditableItem.class, "AuditableItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuditableItem_History(), this.getAction(), null, "history", null, 0, -1, AuditableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.audit.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.audit.Action
		 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction()
		 * @generated
		 */
		public static final EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Initiated On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTION__INITIATED_ON = eINSTANCE.getAction_InitiatedOn();

		/**
		 * The meta object literal for the '<em><b>Initiated By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTION__INITIATED_BY = eINSTANCE.getAction_InitiatedBy();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.audit.AuditableItem <em>Auditable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.audit.AuditableItem
		 * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAuditableItem()
		 * @generated
		 */
		public static final EClass AUDITABLE_ITEM = eINSTANCE.getAuditableItem();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUDITABLE_ITEM__HISTORY = eINSTANCE.getAuditableItem_History();

	}

} //AuditPackage
