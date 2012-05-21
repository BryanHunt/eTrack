/**
 */
package org.eclipselabs.etrack.developer.database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.developer.database.DatabaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipselabs.etrack.developer' suppressInterfaces='true'"
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
  public static final String eNS_URI = "org.eclipselabs.etrack.developer.database";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "database";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final DatabasePackage eINSTANCE = org.eclipselabs.etrack.developer.database.DatabasePackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.Database <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.Database
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase()
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
   * The feature id for the '<em><b>Task Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DATABASE__TASK_DOMAINS = 1;

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
   * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DATABASE__ACCOUNTS = 4;

  /**
   * The feature id for the '<em><b>Account Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DATABASE__ACCOUNT_REQUESTS = 5;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DATABASE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int DATABASE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.Tasks <em>Tasks</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.Tasks
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTasks()
   * @generated
   */
  public static final int TASKS = 1;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASKS__TASKS = 0;

  /**
   * The number of structural features of the '<em>Tasks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASKS_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Tasks</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASKS_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.TaskDomains <em>Task Domains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.TaskDomains
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTaskDomains()
   * @generated
   */
  public static final int TASK_DOMAINS = 2;

  /**
   * The feature id for the '<em><b>Task Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_DOMAINS__TASK_DOMAINS = 0;

  /**
   * The number of structural features of the '<em>Task Domains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_DOMAINS_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Task Domains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TASK_DOMAINS_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.Entities <em>Entities</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.Entities
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getEntities()
   * @generated
   */
  public static final int ENTITIES = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITIES__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Entities</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITIES_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Entities</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITIES_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.Accounts <em>Accounts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.Accounts
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getAccounts()
   * @generated
   */
  public static final int ACCOUNTS = 4;

  /**
   * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNTS__ACCOUNTS = 0;

  /**
   * The number of structural features of the '<em>Accounts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNTS_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Accounts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNTS_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.developer.database.AccountRequests <em>Account Requests</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.developer.database.AccountRequests
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getAccountRequests()
   * @generated
   */
  public static final int ACCOUNT_REQUESTS = 5;

  /**
   * The feature id for the '<em><b>Account Requests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUESTS__ACCOUNT_REQUESTS = 0;

  /**
   * The number of structural features of the '<em>Account Requests</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUESTS_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Account Requests</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUESTS_OPERATION_COUNT = 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tasksEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDomainsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entitiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountRequestsEClass = null;

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
   * @see org.eclipselabs.etrack.developer.database.DatabasePackage#eNS_URI
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
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database
   * @generated
   */
  public EClass getDatabase()
  {
    return databaseEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.developer.database.Database#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getName()
   * @see #getDatabase()
   * @generated
   */
  public EAttribute getDatabase_Name()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Database#getTaskDomains <em>Task Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Domains</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getTaskDomains()
   * @see #getDatabase()
   * @generated
   */
  public EReference getDatabase_TaskDomains()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Database#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getTasks()
   * @see #getDatabase()
   * @generated
   */
  public EReference getDatabase_Tasks()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Database#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getEntities()
   * @see #getDatabase()
   * @generated
   */
  public EReference getDatabase_Entities()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Database#getAccounts <em>Accounts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accounts</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getAccounts()
   * @see #getDatabase()
   * @generated
   */
  public EReference getDatabase_Accounts()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Database#getAccountRequests <em>Account Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Account Requests</em>'.
   * @see org.eclipselabs.etrack.developer.database.Database#getAccountRequests()
   * @see #getDatabase()
   * @generated
   */
  public EReference getDatabase_AccountRequests()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.Tasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tasks</em>'.
   * @see org.eclipselabs.etrack.developer.database.Tasks
   * @generated
   */
  public EClass getTasks()
  {
    return tasksEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Tasks#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.eclipselabs.etrack.developer.database.Tasks#getTasks()
   * @see #getTasks()
   * @generated
   */
  public EReference getTasks_Tasks()
  {
    return (EReference)tasksEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.TaskDomains <em>Task Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Domains</em>'.
   * @see org.eclipselabs.etrack.developer.database.TaskDomains
   * @generated
   */
  public EClass getTaskDomains()
  {
    return taskDomainsEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.TaskDomains#getTaskDomains <em>Task Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Task Domains</em>'.
   * @see org.eclipselabs.etrack.developer.database.TaskDomains#getTaskDomains()
   * @see #getTaskDomains()
   * @generated
   */
  public EReference getTaskDomains_TaskDomains()
  {
    return (EReference)taskDomainsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entities</em>'.
   * @see org.eclipselabs.etrack.developer.database.Entities
   * @generated
   */
  public EClass getEntities()
  {
    return entitiesEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Entities#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.eclipselabs.etrack.developer.database.Entities#getEntities()
   * @see #getEntities()
   * @generated
   */
  public EReference getEntities_Entities()
  {
    return (EReference)entitiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.Accounts <em>Accounts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accounts</em>'.
   * @see org.eclipselabs.etrack.developer.database.Accounts
   * @generated
   */
  public EClass getAccounts()
  {
    return accountsEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.Accounts#getAccounts <em>Accounts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accounts</em>'.
   * @see org.eclipselabs.etrack.developer.database.Accounts#getAccounts()
   * @see #getAccounts()
   * @generated
   */
  public EReference getAccounts_Accounts()
  {
    return (EReference)accountsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.developer.database.AccountRequests <em>Account Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account Requests</em>'.
   * @see org.eclipselabs.etrack.developer.database.AccountRequests
   * @generated
   */
  public EClass getAccountRequests()
  {
    return accountRequestsEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.developer.database.AccountRequests#getAccountRequests <em>Account Requests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Account Requests</em>'.
   * @see org.eclipselabs.etrack.developer.database.AccountRequests#getAccountRequests()
   * @see #getAccountRequests()
   * @generated
   */
  public EReference getAccountRequests_AccountRequests()
  {
    return (EReference)accountRequestsEClass.getEStructuralFeatures().get(0);
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
    createEReference(databaseEClass, DATABASE__TASK_DOMAINS);
    createEReference(databaseEClass, DATABASE__TASKS);
    createEReference(databaseEClass, DATABASE__ENTITIES);
    createEReference(databaseEClass, DATABASE__ACCOUNTS);
    createEReference(databaseEClass, DATABASE__ACCOUNT_REQUESTS);

    tasksEClass = createEClass(TASKS);
    createEReference(tasksEClass, TASKS__TASKS);

    taskDomainsEClass = createEClass(TASK_DOMAINS);
    createEReference(taskDomainsEClass, TASK_DOMAINS__TASK_DOMAINS);

    entitiesEClass = createEClass(ENTITIES);
    createEReference(entitiesEClass, ENTITIES__ENTITIES);

    accountsEClass = createEClass(ACCOUNTS);
    createEReference(accountsEClass, ACCOUNTS__ACCOUNTS);

    accountRequestsEClass = createEClass(ACCOUNT_REQUESTS);
    createEReference(accountRequestsEClass, ACCOUNT_REQUESTS__ACCOUNT_REQUESTS);
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
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    TaskPackage theTaskPackage = (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);
    EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
    AccountPackage theAccountPackage = (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabase_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_TaskDomains(), this.getTaskDomains(), null, "taskDomains", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Tasks(), this.getTasks(), null, "tasks", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Entities(), this.getEntities(), null, "entities", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Accounts(), this.getAccounts(), null, "accounts", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_AccountRequests(), this.getAccountRequests(), null, "accountRequests", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tasksEClass, Tasks.class, "Tasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTasks_Tasks(), theTaskPackage.getTask(), null, "tasks", null, 0, -1, Tasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskDomainsEClass, TaskDomains.class, "TaskDomains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskDomains_TaskDomains(), theTaskPackage.getTaskDomain(), null, "taskDomains", null, 0, -1, TaskDomains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entitiesEClass, Entities.class, "Entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntities_Entities(), theEntityPackage.getEntity(), null, "entities", null, 0, -1, Entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accountsEClass, Accounts.class, "Accounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccounts_Accounts(), theAccountPackage.getAccount(), null, "accounts", null, 0, -1, Accounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accountRequestsEClass, AccountRequests.class, "AccountRequests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccountRequests_AccountRequests(), theAccountPackage.getAccountRequest(), null, "accountRequests", null, 0, -1, AccountRequests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  public interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.Database <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.Database
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getDatabase()
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
     * The meta object literal for the '<em><b>Task Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference DATABASE__TASK_DOMAINS = eINSTANCE.getDatabase_TaskDomains();

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
     * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference DATABASE__ACCOUNTS = eINSTANCE.getDatabase_Accounts();

    /**
     * The meta object literal for the '<em><b>Account Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference DATABASE__ACCOUNT_REQUESTS = eINSTANCE.getDatabase_AccountRequests();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.Tasks <em>Tasks</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.Tasks
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTasks()
     * @generated
     */
    public static final EClass TASKS = eINSTANCE.getTasks();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASKS__TASKS = eINSTANCE.getTasks_Tasks();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.TaskDomains <em>Task Domains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.TaskDomains
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getTaskDomains()
     * @generated
     */
    public static final EClass TASK_DOMAINS = eINSTANCE.getTaskDomains();

    /**
     * The meta object literal for the '<em><b>Task Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TASK_DOMAINS__TASK_DOMAINS = eINSTANCE.getTaskDomains_TaskDomains();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.Entities <em>Entities</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.Entities
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getEntities()
     * @generated
     */
    public static final EClass ENTITIES = eINSTANCE.getEntities();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ENTITIES__ENTITIES = eINSTANCE.getEntities_Entities();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.Accounts <em>Accounts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.Accounts
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getAccounts()
     * @generated
     */
    public static final EClass ACCOUNTS = eINSTANCE.getAccounts();

    /**
     * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACCOUNTS__ACCOUNTS = eINSTANCE.getAccounts_Accounts();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.developer.database.AccountRequests <em>Account Requests</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.developer.database.AccountRequests
     * @see org.eclipselabs.etrack.developer.database.DatabasePackage#getAccountRequests()
     * @generated
     */
    public static final EClass ACCOUNT_REQUESTS = eINSTANCE.getAccountRequests();

    /**
     * The meta object literal for the '<em><b>Account Requests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACCOUNT_REQUESTS__ACCOUNT_REQUESTS = eINSTANCE.getAccountRequests_AccountRequests();

  }

} //DatabasePackage
