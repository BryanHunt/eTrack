/**
 */
package org.eclipselabs.etrack.domain.audit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.entity.EntityPackage;

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
 * @see org.eclipselabs.etrack.domain.audit.AuditFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.eclipselabs.etrack.domain' suppressInterfaces='true'"
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
  public static final String eNS_URI = "org.eclipselabs.etrack.domain.audit";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "audit";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final AuditPackage eINSTANCE = org.eclipselabs.etrack.domain.audit.AuditPackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.audit.AuditableItem <em>Auditable Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.audit.AuditableItem
   * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAuditableItem()
   * @generated
   */
  public static final int AUDITABLE_ITEM = 0;

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
   * The number of operations of the '<em>Auditable Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int AUDITABLE_ITEM_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.audit.Action <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.audit.Action
   * @see org.eclipselabs.etrack.domain.audit.AuditPackage#getAction()
   * @generated
   */
  public static final int ACTION = 1;

  /**
   * The feature id for the '<em><b>On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACTION__ON = 0;

  /**
   * The feature id for the '<em><b>By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACTION__BY = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACTION_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int ACTION_OPERATION_COUNT = 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass auditableItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

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
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.audit.Action#getOn <em>On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On</em>'.
   * @see org.eclipselabs.etrack.domain.audit.Action#getOn()
   * @see #getAction()
   * @generated
   */
  public EAttribute getAction_On()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the reference '{@link org.eclipselabs.etrack.domain.audit.Action#getBy <em>By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>By</em>'.
   * @see org.eclipselabs.etrack.domain.audit.Action#getBy()
   * @see #getAction()
   * @generated
   */
  public EReference getAction_By()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
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
    auditableItemEClass = createEClass(AUDITABLE_ITEM);
    createEReference(auditableItemEClass, AUDITABLE_ITEM__HISTORY);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__ON);
    createEReference(actionEClass, ACTION__BY);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(auditableItemEClass, AuditableItem.class, "AuditableItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAuditableItem_History(), this.getAction(), null, "history", null, 0, -1, AuditableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_On(), theEcorePackage.getEDate(), "on", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_By(), theEntityPackage.getEntity(), null, "by", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
     * The meta object literal for the '<em><b>On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute ACTION__ON = eINSTANCE.getAction_On();

    /**
     * The meta object literal for the '<em><b>By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference ACTION__BY = eINSTANCE.getAction_By();

  }

} //AuditPackage
