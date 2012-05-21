/**
 */
package org.eclipselabs.etrack.developer.database;

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
 * @see org.eclipselabs.etrack.developer.database.DatabasePackage
 * @generated
 */
public class DatabaseFactory extends EFactoryImpl
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final DatabaseFactory eINSTANCE = init();

  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DatabaseFactory init()
  {
    try
    {
      DatabaseFactory theDatabaseFactory = (DatabaseFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipselabs.etrack.developer.database"); 
      if (theDatabaseFactory != null)
      {
        return theDatabaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DatabaseFactory();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseFactory()
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
      case DatabasePackage.DATABASE: return createDatabase();
      case DatabasePackage.TASKS: return createTasks();
      case DatabasePackage.TASK_DOMAINS: return createTaskDomains();
      case DatabasePackage.ENTITIES: return createEntities();
      case DatabasePackage.ACCOUNTS: return createAccounts();
      case DatabasePackage.ACCOUNT_REQUESTS: return createAccountRequests();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    Database database = new Database();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tasks createTasks()
  {
    Tasks tasks = new Tasks();
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskDomains createTaskDomains()
  {
    TaskDomains taskDomains = new TaskDomains();
    return taskDomains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entities createEntities()
  {
    Entities entities = new Entities();
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accounts createAccounts()
  {
    Accounts accounts = new Accounts();
    return accounts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountRequests createAccountRequests()
  {
    AccountRequests accountRequests = new AccountRequests();
    return accountRequests;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabasePackage getDatabasePackage()
  {
    return (DatabasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DatabasePackage getPackage()
  {
    return DatabasePackage.eINSTANCE;
  }

} //DatabaseFactory
