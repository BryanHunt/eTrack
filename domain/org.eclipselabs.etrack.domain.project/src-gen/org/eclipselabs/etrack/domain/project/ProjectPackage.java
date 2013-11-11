/**
 */
package org.eclipselabs.etrack.domain.project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.etrack.domain.data.DataPackage;

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
 * @see org.eclipselabs.etrack.domain.project.ProjectFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel suppressInterfaces='true' containmentProxies='true' updateClasspath='false' basePackage='org.eclipselabs.etrack.domain'"
 * @generated
 */
public class ProjectPackage extends EPackageImpl
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNAME = "project";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/project";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String eNS_PREFIX = "project";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final ProjectPackage eINSTANCE = org.eclipselabs.etrack.domain.project.ProjectPackage.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.project.Project <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.project.Project
   * @see org.eclipselabs.etrack.domain.project.ProjectPackage#getProject()
   * @generated
   */
  public static final int PROJECT = 0;

  /**
   * The feature id for the '<em><b>Links By Name</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT__LINKS_BY_NAME = DataPackage.LINKABLE__LINKS_BY_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT__NAME = DataPackage.LINKABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Teams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT__TEAMS = DataPackage.LINKABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Admins</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT__ADMINS = DataPackage.LINKABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT_FEATURE_COUNT = DataPackage.LINKABLE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int PROJECT_OPERATION_COUNT = DataPackage.LINKABLE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.etrack.domain.project.Team <em>Team</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.etrack.domain.project.Team
   * @see org.eclipselabs.etrack.domain.project.ProjectPackage#getTeam()
   * @generated
   */
  public static final int TEAM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM__NAME = SecurityPackage.PERMISSION_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM__MEMBERS = SecurityPackage.PERMISSION_GROUP__MEMBERS;

  /**
   * The feature id for the '<em><b>Admins</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM__ADMINS = SecurityPackage.PERMISSION_GROUP__ADMINS;

  /**
   * The feature id for the '<em><b>Sub Teams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM__SUB_TEAMS = SecurityPackage.PERMISSION_GROUP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Team</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM_FEATURE_COUNT = SecurityPackage.PERMISSION_GROUP_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Team</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  public static final int TEAM_OPERATION_COUNT = SecurityPackage.PERMISSION_GROUP_OPERATION_COUNT + 0;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass teamEClass = null;

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
   * @see org.eclipselabs.etrack.domain.project.ProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProjectPackage()
  {
    super(eNS_URI, ProjectFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ProjectPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProjectPackage init()
  {
    if (isInited) return (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);

    // Obtain or create and register package
    ProjectPackage theProjectPackage = (ProjectPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProjectPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProjectPackage());

    isInited = true;

    // Initialize simple dependencies
    SecurityPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProjectPackage.createPackageContents();

    // Initialize created meta-data
    theProjectPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProjectPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProjectPackage.eNS_URI, theProjectPackage);
    return theProjectPackage;
  }


  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.project.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see org.eclipselabs.etrack.domain.project.Project
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.project.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.etrack.domain.project.Project#getName()
   * @see #getProject()
   * @generated
   */
  public EAttribute getProject_Name()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.project.Project#getTeams <em>Teams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Teams</em>'.
   * @see org.eclipselabs.etrack.domain.project.Project#getTeams()
   * @see #getProject()
   * @generated
   */
  public EReference getProject_Teams()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * Returns the meta object for the reference list '{@link org.eclipselabs.etrack.domain.project.Project#getAdmins <em>Admins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Admins</em>'.
   * @see org.eclipselabs.etrack.domain.project.Project#getAdmins()
   * @see #getProject()
   * @generated
   */
  public EReference getProject_Admins()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.project.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Team</em>'.
   * @see org.eclipselabs.etrack.domain.project.Team
   * @generated
   */
  public EClass getTeam()
  {
    return teamEClass;
  }

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.project.Team#getSubTeams <em>Sub Teams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Teams</em>'.
   * @see org.eclipselabs.etrack.domain.project.Team#getSubTeams()
   * @see #getTeam()
   * @generated
   */
  public EReference getTeam_SubTeams()
  {
    return (EReference)teamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  public ProjectFactory getProjectFactory()
  {
    return (ProjectFactory)getEFactoryInstance();
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
    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__NAME);
    createEReference(projectEClass, PROJECT__TEAMS);
    createEReference(projectEClass, PROJECT__ADMINS);

    teamEClass = createEClass(TEAM);
    createEReference(teamEClass, TEAM__SUB_TEAMS);
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
    DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
    SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    projectEClass.getESuperTypes().add(theDataPackage.getLinkable());
    teamEClass.getESuperTypes().add(theSecurityPackage.getPermissionGroup());

    // Initialize classes, features, and operations; add parameters
    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Teams(), this.getTeam(), null, "teams", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Admins(), theEntityPackage.getIdentity(), null, "admins", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTeam_SubTeams(), this.getTeam(), null, "subTeams", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.project.Project <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.project.Project
     * @see org.eclipselabs.etrack.domain.project.ProjectPackage#getProject()
     * @generated
     */
    public static final EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference PROJECT__TEAMS = eINSTANCE.getProject_Teams();

    /**
     * The meta object literal for the '<em><b>Admins</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference PROJECT__ADMINS = eINSTANCE.getProject_Admins();

    /**
     * The meta object literal for the '{@link org.eclipselabs.etrack.domain.project.Team <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.etrack.domain.project.Team
     * @see org.eclipselabs.etrack.domain.project.ProjectPackage#getTeam()
     * @generated
     */
    public static final EClass TEAM = eINSTANCE.getTeam();

    /**
     * The meta object literal for the '<em><b>Sub Teams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final EReference TEAM__SUB_TEAMS = eINSTANCE.getTeam_SubTeams();

  }

} //ProjectPackage
