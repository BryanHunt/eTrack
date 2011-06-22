/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclilpselabs.etrack.developer.database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.account.AccountPackage;

import org.eclipselabs.etrack.domain.entity.EntityPackage;

import org.eclipselabs.etrack.domain.task.TaskPackage;

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
 * @see org.eclilpselabs.etrack.developer.database.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public class DatabasePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/database";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatabasePackage eINSTANCE = org.eclilpselabs.etrack.developer.database.DatabasePackage.init();

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.developer.database.Database <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.developer.database.Database
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase()
	 * @generated
	 */
	public static final int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Task Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__TASK_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__TASKS = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Account Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__ACCOUNT_REQUESTS = 4;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE__ACCOUNTS = 5;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_FEATURE_COUNT = 6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

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
	 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabasePackage()
	{
		super(eNS_URI, DatabaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabasePackage init()
	{
		if (isInited) return (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);

		// Obtain or create and register package
		DatabasePackage theDatabasePackage = (DatabasePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabasePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabasePackage());

		isInited = true;

		// Initialize simple dependencies
		AccountPackage.eINSTANCE.eClass();
		TaskPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatabasePackage.createPackageContents();

		// Initialize created meta-data
		theDatabasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabasePackage.eNS_URI, theDatabasePackage);
		return theDatabasePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.developer.database.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database
	 * @generated
	 */
	public EClass getDatabase()
	{
		return databaseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.developer.database.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	public EAttribute getDatabase_Name()
	{
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclilpselabs.etrack.developer.database.Database#getTaskDomain <em>Task Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Domain</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getTaskDomain()
	 * @see #getDatabase()
	 * @generated
	 */
	public EReference getDatabase_TaskDomain()
	{
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclilpselabs.etrack.developer.database.Database#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getTasks()
	 * @see #getDatabase()
	 * @generated
	 */
	public EReference getDatabase_Tasks()
	{
		return (EReference)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclilpselabs.etrack.developer.database.Database#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getEntities()
	 * @see #getDatabase()
	 * @generated
	 */
	public EReference getDatabase_Entities()
	{
		return (EReference)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclilpselabs.etrack.developer.database.Database#getAccountRequests <em>Account Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Account Requests</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getAccountRequests()
	 * @see #getDatabase()
	 * @generated
	 */
	public EReference getDatabase_AccountRequests()
	{
		return (EReference)databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclilpselabs.etrack.developer.database.Database#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.eclilpselabs.etrack.developer.database.Database#getAccounts()
	 * @see #getDatabase()
	 * @generated
	 */
	public EReference getDatabase_Accounts()
	{
		return (EReference)databaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DatabaseFactory getDatabaseFactory()
	{
		return (DatabaseFactory)getEFactoryInstance();
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
		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__NAME);
		createEReference(databaseEClass, DATABASE__TASK_DOMAIN);
		createEReference(databaseEClass, DATABASE__TASKS);
		createEReference(databaseEClass, DATABASE__ENTITIES);
		createEReference(databaseEClass, DATABASE__ACCOUNT_REQUESTS);
		createEReference(databaseEClass, DATABASE__ACCOUNTS);
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
		TaskPackage theTaskPackage = (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		AccountPackage theAccountPackage = (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_TaskDomain(), theTaskPackage.getTaskDomain(), null, "taskDomain", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Tasks(), theTaskPackage.getTask(), null, "tasks", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Entities(), theEntityPackage.getEntity(), null, "entities", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_AccountRequests(), theAccountPackage.getAccountRequest(), null, "accountRequests", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Accounts(), theAccountPackage.getAccount(), null, "accounts", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.developer.database.Database <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.developer.database.Database
		 * @see org.eclilpselabs.etrack.developer.database.DatabasePackage#getDatabase()
		 * @generated
		 */
		public static final EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Task Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE__TASK_DOMAIN = eINSTANCE.getDatabase_TaskDomain();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE__TASKS = eINSTANCE.getDatabase_Tasks();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE__ENTITIES = eINSTANCE.getDatabase_Entities();

		/**
		 * The meta object literal for the '<em><b>Account Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE__ACCOUNT_REQUESTS = eINSTANCE.getDatabase_AccountRequests();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATABASE__ACCOUNTS = eINSTANCE.getDatabase_Accounts();

	}

} //DatabasePackage
