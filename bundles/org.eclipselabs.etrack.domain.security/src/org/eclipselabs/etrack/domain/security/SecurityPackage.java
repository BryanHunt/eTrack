/**
 */
package org.eclipselabs.etrack.domain.security;

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
 * @see org.eclipselabs.etrack.domain.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public class SecurityPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SecurityPackage eINSTANCE = org.eclipselabs.etrack.domain.security.SecurityPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.security.PermissionGroup <em>Permission Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.security.PermissionGroup
	 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getPermissionGroup()
	 * @generated
	 */
	public static final int PERMISSION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_GROUP__NAME = EntityPackage.GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_GROUP__MEMBERS = EntityPackage.GROUP__MEMBERS;

	/**
	 * The feature id for the '<em><b>Admins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_GROUP__ADMINS = EntityPackage.GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Permission Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERMISSION_GROUP_FEATURE_COUNT = EntityPackage.GROUP_FEATURE_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionGroupEClass = null;

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
	 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackage()
	{
		super(eNS_URI, SecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init()
	{
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		SecurityPackage theSecurityPackage = (SecurityPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPackage());

		isInited = true;

		// Initialize simple dependencies
		EntityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.security.PermissionGroup <em>Permission Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission Group</em>'.
	 * @see org.eclipselabs.etrack.domain.security.PermissionGroup
	 * @generated
	 */
	public EClass getPermissionGroup()
	{
		return permissionGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.security.PermissionGroup#getAdmins <em>Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Admins</em>'.
	 * @see org.eclipselabs.etrack.domain.security.PermissionGroup#getAdmins()
	 * @see #getPermissionGroup()
	 * @generated
	 */
	public EReference getPermissionGroup_Admins()
	{
		return (EReference)permissionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SecurityFactory getSecurityFactory()
	{
		return (SecurityFactory)getEFactoryInstance();
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
		permissionGroupEClass = createEClass(PERMISSION_GROUP);
		createEReference(permissionGroupEClass, PERMISSION_GROUP__ADMINS);
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
		permissionGroupEClass.getESuperTypes().add(theEntityPackage.getGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(permissionGroupEClass, PermissionGroup.class, "PermissionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermissionGroup_Admins(), theEntityPackage.getIdentity(), null, "admins", null, 0, -1, PermissionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.security.PermissionGroup <em>Permission Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.security.PermissionGroup
		 * @see org.eclipselabs.etrack.domain.security.SecurityPackage#getPermissionGroup()
		 * @generated
		 */
		public static final EClass PERMISSION_GROUP = eINSTANCE.getPermissionGroup();

		/**
		 * The meta object literal for the '<em><b>Admins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERMISSION_GROUP__ADMINS = eINSTANCE.getPermissionGroup_Admins();

	}

} //SecurityPackage
