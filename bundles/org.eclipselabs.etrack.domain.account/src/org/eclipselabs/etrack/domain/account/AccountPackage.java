/**
 * Copyright (c) 2011 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclipselabs.etrack.domain.account;

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
 * @see org.eclipselabs.etrack.domain.account.AccountFactory
 * @model kind="package"
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
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/account";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.account";

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
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT__CREATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.AccountRequest <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.account.AccountRequest
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccountRequest()
	 * @generated
	 */
	public static final int ACCOUNT_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_REQUEST__CREDENTIAL = 0;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_REQUEST__EXPIRATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_REQUEST__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.Credential <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.account.Credential
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getCredential()
	 * @generated
	 */
	public static final int CREDENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDENTIAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDENTIAL__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDENTIAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.account.LocalAccount <em>Local Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.account.LocalAccount
	 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getLocalAccount()
	 * @generated
	 */
	public static final int LOCAL_ACCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_ACCOUNT__CREATION_DATE = ACCOUNT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
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
	private EClass accountRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass credentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAccountEClass = null;

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
		EntityPackage.eINSTANCE.eClass();

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
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.Account#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.eclipselabs.etrack.domain.account.Account#getCreationDate()
	 * @see #getAccount()
	 * @generated
	 */
	public EAttribute getAccount_CreationDate()
	{
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.account.Account#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.eclipselabs.etrack.domain.account.Account#getEntity()
	 * @see #getAccount()
	 * @generated
	 */
	public EReference getAccount_Entity()
	{
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
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
		return (EReference)accountRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.AccountRequest#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see org.eclipselabs.etrack.domain.account.AccountRequest#getExpirationDate()
	 * @see #getAccountRequest()
	 * @generated
	 */
	public EAttribute getAccountRequest_ExpirationDate()
	{
		return (EAttribute)accountRequestEClass.getEStructuralFeatures().get(1);
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
		return (EReference)accountRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.account.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see org.eclipselabs.etrack.domain.account.Credential
	 * @generated
	 */
	public EClass getCredential()
	{
		return credentialEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.Credential#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipselabs.etrack.domain.account.Credential#getId()
	 * @see #getCredential()
	 * @generated
	 */
	public EAttribute getCredential_Id()
	{
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.account.Credential#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.eclipselabs.etrack.domain.account.Credential#getPassword()
	 * @see #getCredential()
	 * @generated
	 */
	public EAttribute getCredential_Password()
	{
		return (EAttribute)credentialEClass.getEStructuralFeatures().get(1);
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
		createEAttribute(accountEClass, ACCOUNT__CREATION_DATE);
		createEReference(accountEClass, ACCOUNT__ENTITY);

		accountRequestEClass = createEClass(ACCOUNT_REQUEST);
		createEReference(accountRequestEClass, ACCOUNT_REQUEST__CREDENTIAL);
		createEAttribute(accountRequestEClass, ACCOUNT_REQUEST__EXPIRATION_DATE);
		createEReference(accountRequestEClass, ACCOUNT_REQUEST__ENTITY);

		credentialEClass = createEClass(CREDENTIAL);
		createEAttribute(credentialEClass, CREDENTIAL__ID);
		createEAttribute(credentialEClass, CREDENTIAL__PASSWORD);

		localAccountEClass = createEClass(LOCAL_ACCOUNT);
		createEReference(localAccountEClass, LOCAL_ACCOUNT__CREDENTIAL);
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
		localAccountEClass.getESuperTypes().add(this.getAccount());

		// Initialize classes and features; add operations and parameters
		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_Entity(), theEntityPackage.getEntity(), null, "entity", null, 1, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountRequestEClass, AccountRequest.class, "AccountRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountRequest_Credential(), this.getCredential(), null, "credential", null, 1, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccountRequest_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccountRequest_Entity(), theEntityPackage.getEntity(), null, "entity", null, 1, 1, AccountRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(credentialEClass, Credential.class, "Credential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCredential_Id(), ecorePackage.getEString(), "id", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCredential_Password(), ecorePackage.getEString(), "password", null, 1, 1, Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAccountEClass, LocalAccount.class, "LocalAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAccount_Credential(), this.getCredential(), null, "credential", null, 1, 1, LocalAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.account.Account <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.account.Account
		 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getAccount()
		 * @generated
		 */
		public static final EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNT__CREATION_DATE = eINSTANCE.getAccount_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCOUNT__ENTITY = eINSTANCE.getAccount_Entity();

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
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCOUNT_REQUEST__CREDENTIAL = eINSTANCE.getAccountRequest_Credential();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNT_REQUEST__EXPIRATION_DATE = eINSTANCE.getAccountRequest_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCOUNT_REQUEST__ENTITY = eINSTANCE.getAccountRequest_Entity();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.account.Credential <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.account.Credential
		 * @see org.eclipselabs.etrack.domain.account.AccountPackage#getCredential()
		 * @generated
		 */
		public static final EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDENTIAL__ID = eINSTANCE.getCredential_Id();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDENTIAL__PASSWORD = eINSTANCE.getCredential_Password();

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

	}

} //AccountPackage
