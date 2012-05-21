/**
 */
package org.eclipselabs.etrack.domain.account;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.entity.EntityPackage;

import org.eclipselabs.etrack.domain.security.SecurityPackage;

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
 * @see org.eclipselabs.etrack.domain.account.AccountFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipselabs.etrack.domain' suppressInterfaces='true'"
 * @generated
 */
public class AccountPackage extends EPackageImpl
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNAME = "account";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_URI = "org.eclipselabs.etrack.domain.account";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "account";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final AccountPackage eINSTANCE = org.eclipselabs.etrack.domain.account.AccountPackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.Account <em>Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.account.Account
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount()
   * @generated
   */
  public static final int ACCOUNT = 0;

  /**
   * The feature id for the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT__CREATED_ON = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT__ENTITY = 1;

  /**
   * The number of structural features of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.LocalAccount <em>Local Account</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.account.LocalAccount
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getLocalAccount()
   * @generated
   */
  public static final int LOCAL_ACCOUNT = 1;

  /**
   * The feature id for the '<em><b>Created On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int LOCAL_ACCOUNT__CREATED_ON = ACCOUNT__CREATED_ON;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int LOCAL_ACCOUNT__ENTITY = ACCOUNT__ENTITY;

  /**
   * The feature id for the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int LOCAL_ACCOUNT__CREDENTIAL = ACCOUNT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int LOCAL_ACCOUNT_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Local Account</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int LOCAL_ACCOUNT_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.AccountRequest <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.account.AccountRequest
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest()
   * @generated
   */
  public static final int ACCOUNT_REQUEST = 2;

  /**
   * The feature id for the '<em><b>Expires On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUEST__EXPIRES_ON = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUEST__ENTITY = 1;

  /**
   * The feature id for the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUEST__CREDENTIAL = 2;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUEST_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACCOUNT_REQUEST_OPERATION_COUNT = 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localAccountEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accountRequestEClass = null;

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
   * @see org.eclipselabs.etrack.domain.account.AccountPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AccountPackage()
  {
    super(eNS_URI, AccountFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AccountPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AccountPackage init()
  {
    if (isInited) return (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);

    // Obtain or create and register package
    AccountPackage theAccountPackage = (AccountPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AccountPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AccountPackage());

    isInited = true;

    // Initialize simple dependencies
    SecurityPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAccountPackage.createPackageContents();

    // Initialize created meta-data
    theAccountPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAccountPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AccountPackage.eNS_URI, theAccountPackage);
    return theAccountPackage;
  }


  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.account.Account <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Account</em>'.
   * @see org.eclipselabs.etrack.domain.account.Account
   * @generated
   */
  public EClass getAccount()
  {
    return accountEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.Account#getCreatedOn <em>Created On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Created On</em>'.
   * @see org.eclipselabs.etrack.domain.account.Account#getCreatedOn()
   * @see #getAccount()
   * @generated
   */
  public EAttribute getAccount_CreatedOn()
  {
    return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.account.Account#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.eclipselabs.etrack.domain.account.Account#getEntity()
   * @see #getAccount()
   * @generated
   */
  public EReference getAccount_Entity()
  {
    return (EReference)accountEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.account.LocalAccount <em>Local Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Account</em>'.
   * @see org.eclipselabs.etrack.domain.account.LocalAccount
   * @generated
   */
  public EClass getLocalAccount()
  {
    return localAccountEClass;
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.account.LocalAccount#getCredential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credential</em>'.
   * @see org.eclipselabs.etrack.domain.account.LocalAccount#getCredential()
   * @see #getLocalAccount()
   * @generated
   */
  public EReference getLocalAccount_Credential()
  {
    return (EReference)localAccountEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.account.AccountRequest <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see org.eclipselabs.etrack.domain.account.AccountRequest
   * @generated
   */
  public EClass getAccountRequest()
  {
    return accountRequestEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpiresOn <em>Expires On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expires On</em>'.
   * @see org.eclipselabs.etrack.domain.account.AccountRequest#getExpiresOn()
   * @see #getAccountRequest()
   * @generated
   */
  public EAttribute getAccountRequest_ExpiresOn()
  {
    return (EAttribute)accountRequestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.eclipselabs.etrack.domain.account.AccountRequest#getEntity()
   * @see #getAccountRequest()
   * @generated
   */
  public EReference getAccountRequest_Entity()
  {
    return (EReference)accountRequestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getCredential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credential</em>'.
   * @see org.eclipselabs.etrack.domain.account.AccountRequest#getCredential()
   * @see #getAccountRequest()
   * @generated
   */
  public EReference getAccountRequest_Credential()
  {
    return (EReference)accountRequestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  public AccountFactory getAccountFactory()
  {
    return (AccountFactory)getEFactoryInstance();
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
    accountEClass = createEClass(ACCOUNT);
    createEAttribute(accountEClass, ACCOUNT__CREATED_ON);
    createEReference(accountEClass, ACCOUNT__ENTITY);

    localAccountEClass = createEClass(LOCAL_ACCOUNT);
    createEReference(localAccountEClass, LOCAL_ACCOUNT__CREDENTIAL);

    accountRequestEClass = createEClass(ACCOUNT_REQUEST);
    createEAttribute(accountRequestEClass, ACCOUNT_REQUEST__EXPIRES_ON);
    createEReference(accountRequestEClass, ACCOUNT_REQUEST__ENTITY);
    createEReference(accountRequestEClass, ACCOUNT_REQUEST__CREDENTIAL);
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
    EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
    SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    localAccountEClass.getESuperTypes().add(this.getAccount());

    // Initialize classes, features, and operations; add parameters
    initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccount_CreatedOn(), theEcorePackage.getEDate(), "createdOn", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccount_Entity(), theEntityPackage.getEntity(), null, "entity", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localAccountEClass, LocalAccount.class, "LocalAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalAccount_Credential(), theSecurityPackage.getPasswordCredential(), null, "credential", null, 0, 1, LocalAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accountRequestEClass, AccountRequest.class, "AccountRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccountRequest_ExpiresOn(), theEcorePackage.getEDate(), "expiresOn", null, 0, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccountRequest_Entity(), theEntityPackage.getEntity(), null, "entity", null, 0, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccountRequest_Credential(), theSecurityPackage.getPasswordCredential(), null, "credential", null, 0, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.account.Account <em>Account</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.account.Account
     * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount()
     * @generated
     */
    public static final EClass ACCOUNT = eINSTANCE.getAccount();

    /**
     * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ACCOUNT__CREATED_ON = eINSTANCE.getAccount_CreatedOn();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACCOUNT__ENTITY = eINSTANCE.getAccount_Entity();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.account.LocalAccount <em>Local Account</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.account.LocalAccount
     * @see org.eclipselabs.etrack.domain.account.AccountPackage#getLocalAccount()
     * @generated
     */
    public static final EClass LOCAL_ACCOUNT = eINSTANCE.getLocalAccount();

    /**
     * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference LOCAL_ACCOUNT__CREDENTIAL = eINSTANCE.getLocalAccount_Credential();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.account.AccountRequest <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.account.AccountRequest
     * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest()
     * @generated
     */
    public static final EClass ACCOUNT_REQUEST = eINSTANCE.getAccountRequest();

    /**
     * The meta object literal for the '<em><b>Expires On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ACCOUNT_REQUEST__EXPIRES_ON = eINSTANCE.getAccountRequest_ExpiresOn();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACCOUNT_REQUEST__ENTITY = eINSTANCE.getAccountRequest_Entity();

    /**
     * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACCOUNT_REQUEST__CREDENTIAL = eINSTANCE.getAccountRequest_Credential();

  }

} //AccountPackage
