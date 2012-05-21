/**
 */
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.data.DataPackage;

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
 * @see org.eclipselabs.etrack.domain.entity.EntityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipselabs.etrack.domain' suppressInterfaces='true'"
 * @generated
 */
public class EntityPackage extends EPackageImpl
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNAME = "entity";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_URI = "org.eclipselabs.etrack.domain.entity";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "entity";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final EntityPackage eINSTANCE = org.eclipselabs.etrack.domain.entity.EntityPackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Identity <em>Identity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Identity
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getIdentity()
   * @generated
   */
  public static final int IDENTITY = 0;

  /**
   * The number of structural features of the '<em>Identity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int IDENTITY_FEATURE_COUNT = 0;

  /**
   * The operation id for the '<em>Get Display Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int IDENTITY___GET_DISPLAY_NAME = 0;

  /**
   * The number of operations of the '<em>Identity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int IDENTITY_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Group <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Group
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup()
   * @generated
   */
  public static final int GROUP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int GROUP__NAME = IDENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int GROUP__MEMBERS = IDENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int GROUP_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Display Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int GROUP___GET_DISPLAY_NAME = IDENTITY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int GROUP_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.AssignableItem <em>Assignable Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.AssignableItem
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAssignableItem()
   * @generated
   */
  public static final int ASSIGNABLE_ITEM = 2;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ASSIGNABLE_ITEM__OWNER = 0;

  /**
   * The number of structural features of the '<em>Assignable Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ASSIGNABLE_ITEM_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Assignable Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ASSIGNABLE_ITEM_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Entity <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Entity
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity()
   * @generated
   */
  public static final int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Links By Name</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY__LINKS_BY_NAME = IDENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY__ADDRESSES = IDENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Phone Numbers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY__PHONE_NUMBERS = IDENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Emails</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY__EMAILS = IDENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Get Display Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY___GET_DISPLAY_NAME = IDENTITY___GET_DISPLAY_NAME;

  /**
   * The number of operations of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ENTITY_OPERATION_COUNT = IDENTITY_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Person <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Person
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getPerson()
   * @generated
   */
  public static final int PERSON = 4;

  /**
   * The feature id for the '<em><b>Links By Name</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__LINKS_BY_NAME = ENTITY__LINKS_BY_NAME;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__ADDRESSES = ENTITY__ADDRESSES;

  /**
   * The feature id for the '<em><b>Phone Numbers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__PHONE_NUMBERS = ENTITY__PHONE_NUMBERS;

  /**
   * The feature id for the '<em><b>Emails</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__EMAILS = ENTITY__EMAILS;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__FIRST_NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON__LAST_NAME = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Display Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON___GET_DISPLAY_NAME = ENTITY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PERSON_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Organization <em>Organization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Organization
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getOrganization()
   * @generated
   */
  public static final int ORGANIZATION = 5;

  /**
   * The feature id for the '<em><b>Links By Name</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__LINKS_BY_NAME = ENTITY__LINKS_BY_NAME;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__ADDRESSES = ENTITY__ADDRESSES;

  /**
   * The feature id for the '<em><b>Phone Numbers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__PHONE_NUMBERS = ENTITY__PHONE_NUMBERS;

  /**
   * The feature id for the '<em><b>Emails</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__EMAILS = ENTITY__EMAILS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__NAME = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION__MEMBERS = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Organization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get Display Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION___GET_DISPLAY_NAME = ENTITY_OPERATION_COUNT + 0;

  /**
   * The number of operations of the '<em>Organization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ORGANIZATION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Address <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Address
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress()
   * @generated
   */
  public static final int ADDRESS = 6;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__CATEGORY = DataPackage.CATEGORIZED_ITEM__CATEGORY;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__STREET = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Additional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__ADDITIONAL = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__CITY = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__STATE = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__ZIP = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS__COUNTRY = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS_FEATURE_COUNT = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ADDRESS_OPERATION_COUNT = DataPackage.CATEGORIZED_ITEM_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Email <em>Email</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Email
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEmail()
   * @generated
   */
  public static final int EMAIL = 7;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EMAIL__CATEGORY = DataPackage.CATEGORIZED_ITEM__CATEGORY;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EMAIL__ADDRESS = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EMAIL_FEATURE_COUNT = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Email</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int EMAIL_OPERATION_COUNT = DataPackage.CATEGORIZED_ITEM_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.entity.Phone <em>Phone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.entity.Phone
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getPhone()
   * @generated
   */
  public static final int PHONE = 8;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PHONE__CATEGORY = DataPackage.CATEGORIZED_ITEM__CATEGORY;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PHONE__NUMBER = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Phone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PHONE_FEATURE_COUNT = DataPackage.CATEGORIZED_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Phone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PHONE_OPERATION_COUNT = DataPackage.CATEGORIZED_ITEM_OPERATION_COUNT + 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignableItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phoneEClass = null;

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
   * @see org.eclipselabs.etrack.domain.entity.EntityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EntityPackage()
  {
    super(eNS_URI, EntityFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EntityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EntityPackage init()
  {
    if (isInited) return (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

    // Obtain or create and register package
    EntityPackage theEntityPackage = (EntityPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EntityPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EntityPackage());

    isInited = true;

    // Initialize simple dependencies
    DataPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEntityPackage.createPackageContents();

    // Initialize created meta-data
    theEntityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEntityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI, theEntityPackage);
    return theEntityPackage;
  }


  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Identity <em>Identity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Identity
   * @generated
   */
  public EClass getIdentity()
  {
    return identityEClass;
  }

  /**
   * Returns the meta object for the '{@link org.eclipselabs.etrack.domain.entity.Identity#getDisplayName() <em>Get Display Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Display Name</em>' operation.
   * @see org.eclipselabs.etrack.domain.entity.Identity#getDisplayName()
   * @generated
   */
  public EOperation getIdentity__GetDisplayName()
  {
    return identityEClass.getEOperations().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Group
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Group#getName()
   * @see #getGroup()
   * @generated
   */
  public EAttribute getGroup_Name()
  {
    return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.entity.Group#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Members</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Group#getMembers()
   * @see #getGroup()
   * @generated
   */
  public EReference getGroup_Members()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the '{@link org.eclipselabs.etrack.domain.entity.Group#getDisplayName() <em>Get Display Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Display Name</em>' operation.
   * @see org.eclipselabs.etrack.domain.entity.Group#getDisplayName()
   * @generated
   */
  public EOperation getGroup__GetDisplayName()
  {
    return groupEClass.getEOperations().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.AssignableItem <em>Assignable Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable Item</em>'.
   * @see org.eclipselabs.etrack.domain.entity.AssignableItem
   * @generated
   */
  public EClass getAssignableItem()
  {
    return assignableItemEClass;
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.entity.AssignableItem#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner</em>'.
   * @see org.eclipselabs.etrack.domain.entity.AssignableItem#getOwner()
   * @see #getAssignableItem()
   * @generated
   */
  public EReference getAssignableItem_Owner()
  {
    return (EReference)assignableItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Entity
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.entity.Entity#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Addresses</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Entity#getAddresses()
   * @see #getEntity()
   * @generated
   */
  public EReference getEntity_Addresses()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.entity.Entity#getPhoneNumbers <em>Phone Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phone Numbers</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Entity#getPhoneNumbers()
   * @see #getEntity()
   * @generated
   */
  public EReference getEntity_PhoneNumbers()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.entity.Entity#getEmails <em>Emails</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Emails</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Entity#getEmails()
   * @see #getEntity()
   * @generated
   */
  public EReference getEntity_Emails()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Person
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Person#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Person#getFirstName()
   * @see #getPerson()
   * @generated
   */
  public EAttribute getPerson_FirstName()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Person#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Person#getLastName()
   * @see #getPerson()
   * @generated
   */
  public EAttribute getPerson_LastName()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the '{@link org.eclipselabs.etrack.domain.entity.Person#getDisplayName() <em>Get Display Name</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Display Name</em>' operation.
   * @see org.eclipselabs.etrack.domain.entity.Person#getDisplayName()
   * @generated
   */
  public EOperation getPerson__GetDisplayName()
  {
    return personEClass.getEOperations().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Organization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organization</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Organization
   * @generated
   */
  public EClass getOrganization()
  {
    return organizationEClass;
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address
   * @generated
   */
  public EClass getAddress()
  {
    return addressEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getStreet <em>Street</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getStreet()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_Street()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getAdditional <em>Additional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Additional</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getAdditional()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_Additional()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getCity()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_City()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getState()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_State()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getZip <em>Zip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getZip()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_Zip()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Address#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Address#getCountry()
   * @see #getAddress()
   * @generated
   */
  public EAttribute getAddress_Country()
  {
    return (EAttribute)addressEClass.getEStructuralFeatures().get(5);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Email <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Email</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Email
   * @generated
   */
  public EClass getEmail()
  {
    return emailEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Email#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Email#getAddress()
   * @see #getEmail()
   * @generated
   */
  public EAttribute getEmail_Address()
  {
    return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.entity.Phone <em>Phone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phone</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Phone
   * @generated
   */
  public EClass getPhone()
  {
    return phoneEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.entity.Phone#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.eclipselabs.etrack.domain.entity.Phone#getNumber()
   * @see #getPhone()
   * @generated
   */
  public EAttribute getPhone_Number()
  {
    return (EAttribute)phoneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  public EntityFactory getEntityFactory()
  {
    return (EntityFactory)getEFactoryInstance();
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
    identityEClass = createEClass(IDENTITY);
    createEOperation(identityEClass, IDENTITY___GET_DISPLAY_NAME);

    groupEClass = createEClass(GROUP);
    createEAttribute(groupEClass, GROUP__NAME);
    createEReference(groupEClass, GROUP__MEMBERS);
    createEOperation(groupEClass, GROUP___GET_DISPLAY_NAME);

    assignableItemEClass = createEClass(ASSIGNABLE_ITEM);
    createEReference(assignableItemEClass, ASSIGNABLE_ITEM__OWNER);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ADDRESSES);
    createEReference(entityEClass, ENTITY__PHONE_NUMBERS);
    createEReference(entityEClass, ENTITY__EMAILS);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__FIRST_NAME);
    createEAttribute(personEClass, PERSON__LAST_NAME);
    createEOperation(personEClass, PERSON___GET_DISPLAY_NAME);

    organizationEClass = createEClass(ORGANIZATION);

    addressEClass = createEClass(ADDRESS);
    createEAttribute(addressEClass, ADDRESS__STREET);
    createEAttribute(addressEClass, ADDRESS__ADDITIONAL);
    createEAttribute(addressEClass, ADDRESS__CITY);
    createEAttribute(addressEClass, ADDRESS__STATE);
    createEAttribute(addressEClass, ADDRESS__ZIP);
    createEAttribute(addressEClass, ADDRESS__COUNTRY);

    emailEClass = createEClass(EMAIL);
    createEAttribute(emailEClass, EMAIL__ADDRESS);

    phoneEClass = createEClass(PHONE);
    createEAttribute(phoneEClass, PHONE__NUMBER);
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
    DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    groupEClass.getESuperTypes().add(this.getIdentity());
    entityEClass.getESuperTypes().add(this.getIdentity());
    entityEClass.getESuperTypes().add(theDataPackage.getLinkable());
    personEClass.getESuperTypes().add(this.getEntity());
    organizationEClass.getESuperTypes().add(this.getEntity());
    organizationEClass.getESuperTypes().add(this.getGroup());
    addressEClass.getESuperTypes().add(theDataPackage.getCategorizedItem());
    emailEClass.getESuperTypes().add(theDataPackage.getCategorizedItem());
    phoneEClass.getESuperTypes().add(theDataPackage.getCategorizedItem());

    // Initialize classes, features, and operations; add parameters
    initEClass(identityEClass, Identity.class, "Identity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEOperation(getIdentity__GetDisplayName(), theEcorePackage.getEString(), "getDisplayName", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Members(), this.getIdentity(), null, "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getGroup__GetDisplayName(), theEcorePackage.getEString(), "getDisplayName", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(assignableItemEClass, AssignableItem.class, "AssignableItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignableItem_Owner(), this.getPerson(), null, "owner", null, 0, 1, AssignableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Addresses(), this.getAddress(), null, "addresses", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_PhoneNumbers(), this.getPhone(), null, "phoneNumbers", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Emails(), this.getEmail(), null, "emails", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_FirstName(), theEcorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_LastName(), theEcorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getPerson__GetDisplayName(), theEcorePackage.getEString(), "getDisplayName", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddress_Street(), theEcorePackage.getEString(), "street", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Additional(), theEcorePackage.getEString(), "additional", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_City(), theEcorePackage.getEString(), "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_State(), theEcorePackage.getEString(), "state", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Zip(), theEcorePackage.getEInt(), "zip", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddress_Country(), theEcorePackage.getEString(), "country", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmail_Address(), theEcorePackage.getEString(), "address", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPhone_Number(), theEcorePackage.getEString(), "number", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Identity <em>Identity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Identity
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getIdentity()
     * @generated
     */
    public static final EClass IDENTITY = eINSTANCE.getIdentity();

    /**
     * The meta object literal for the '<em><b>Get Display Name</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EOperation IDENTITY___GET_DISPLAY_NAME = eINSTANCE.getIdentity__GetDisplayName();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Group <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Group
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getGroup()
     * @generated
     */
    public static final EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

    /**
     * The meta object literal for the '<em><b>Get Display Name</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EOperation GROUP___GET_DISPLAY_NAME = eINSTANCE.getGroup__GetDisplayName();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.AssignableItem <em>Assignable Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.AssignableItem
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAssignableItem()
     * @generated
     */
    public static final EClass ASSIGNABLE_ITEM = eINSTANCE.getAssignableItem();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ASSIGNABLE_ITEM__OWNER = eINSTANCE.getAssignableItem_Owner();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Entity <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Entity
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEntity()
     * @generated
     */
    public static final EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ENTITY__ADDRESSES = eINSTANCE.getEntity_Addresses();

    /**
     * The meta object literal for the '<em><b>Phone Numbers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ENTITY__PHONE_NUMBERS = eINSTANCE.getEntity_PhoneNumbers();

    /**
     * The meta object literal for the '<em><b>Emails</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ENTITY__EMAILS = eINSTANCE.getEntity_Emails();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Person <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Person
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getPerson()
     * @generated
     */
    public static final EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

    /**
     * The meta object literal for the '<em><b>Get Display Name</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EOperation PERSON___GET_DISPLAY_NAME = eINSTANCE.getPerson__GetDisplayName();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Organization <em>Organization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Organization
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getOrganization()
     * @generated
     */
    public static final EClass ORGANIZATION = eINSTANCE.getOrganization();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Address <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Address
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getAddress()
     * @generated
     */
    public static final EClass ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

    /**
     * The meta object literal for the '<em><b>Additional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__ADDITIONAL = eINSTANCE.getAddress_Additional();

    /**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

    /**
     * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__ZIP = eINSTANCE.getAddress_Zip();

    /**
     * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Email <em>Email</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Email
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getEmail()
     * @generated
     */
    public static final EClass EMAIL = eINSTANCE.getEmail();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute EMAIL__ADDRESS = eINSTANCE.getEmail_Address();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.entity.Phone <em>Phone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.entity.Phone
     * @see org.eclipselabs.etrack.domain.entity.EntityPackage#getPhone()
     * @generated
     */
    public static final EClass PHONE = eINSTANCE.getPhone();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute PHONE__NUMBER = eINSTANCE.getPhone_Number();

  }

} //EntityPackage
