/**
 */
package org.eclipselabs.etrack.domain.account;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.account.AccountPackage
 * @generated
 */
public class AccountFactory extends EFactoryImpl
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final AccountFactory eINSTANCE = init();

  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccountFactory init()
  {
    try
    {
      AccountFactory theAccountFactory = (AccountFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipselabs.etrack.domain.account"); 
      if (theAccountFactory != null)
      {
        return theAccountFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AccountFactory();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountFactory()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AccountPackage.ACCOUNT: return createAccount();
      case AccountPackage.LOCAL_ACCOUNT: return createLocalAccount();
      case AccountPackage.ACCOUNT_REQUEST: return createAccountRequest();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account createAccount()
  {
    Account account = new Account();
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalAccount createLocalAccount()
  {
    LocalAccount localAccount = new LocalAccount();
    return localAccount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountRequest createAccountRequest()
  {
    AccountRequest accountRequest = new AccountRequest();
    return accountRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountPackage getAccountPackage()
  {
    return (AccountPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AccountPackage getPackage()
  {
    return AccountPackage.eINSTANCE;
  }

} //AccountFactory
