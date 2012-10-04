/**
 */
package org.eclipselabs.etrack.domain.scrum;

import org.eclilpselabs.etrack.domain.data.DataPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.eclipselabs.etrack.domain.scrum.ScrumFactory
 * @model kind="package"
 * @generated
 */
public class ScrumPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "scrum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/scrum";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.scrum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScrumPackage eINSTANCE = org.eclipselabs.etrack.domain.scrum.ScrumPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.Backlog <em>Backlog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.Backlog
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklog()
	 * @generated
	 */
	public static final int BACKLOG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG__NAME = TaskPackage.TASK_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG__PROJECT = TaskPackage.TASK_GROUP__PROJECT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG__TASKS = TaskPackage.TASK_GROUP__TASKS;

	/**
	 * The number of structural features of the '<em>Backlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG_FEATURE_COUNT = TaskPackage.TASK_GROUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox <em>Task Time Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getTaskTimeBox()
	 * @generated
	 */
	public static final int TASK_TIME_BOX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX__NAME = TaskPackage.TASK_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX__PROJECT = TaskPackage.TASK_GROUP__PROJECT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX__TASKS = TaskPackage.TASK_GROUP__TASKS;

	/**
	 * The feature id for the '<em><b>Begins On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX__BEGINS_ON = TaskPackage.TASK_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX__ENDS_ON = TaskPackage.TASK_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Time Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TIME_BOX_FEATURE_COUNT = TaskPackage.TASK_GROUP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.Release <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.Release
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getRelease()
	 * @generated
	 */
	public static final int RELEASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__NAME = TASK_TIME_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__PROJECT = TASK_TIME_BOX__PROJECT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__TASKS = TASK_TIME_BOX__TASKS;

	/**
	 * The feature id for the '<em><b>Begins On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__BEGINS_ON = TASK_TIME_BOX__BEGINS_ON;

	/**
	 * The feature id for the '<em><b>Ends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__ENDS_ON = TASK_TIME_BOX__ENDS_ON;

	/**
	 * The feature id for the '<em><b>Milestones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE__MILESTONES = TASK_TIME_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_FEATURE_COUNT = TASK_TIME_BOX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.Milestone <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.Milestone
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getMilestone()
	 * @generated
	 */
	public static final int MILESTONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE__NAME = TASK_TIME_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE__PROJECT = TASK_TIME_BOX__PROJECT;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE__TASKS = TASK_TIME_BOX__TASKS;

	/**
	 * The feature id for the '<em><b>Begins On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE__BEGINS_ON = TASK_TIME_BOX__BEGINS_ON;

	/**
	 * The feature id for the '<em><b>Ends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE__ENDS_ON = TASK_TIME_BOX__ENDS_ON;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONE_FEATURE_COUNT = TASK_TIME_BOX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.BacklogLink <em>Backlog Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.BacklogLink
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklogLink()
	 * @generated
	 */
	public static final int BACKLOG_LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG_LINK__NAME = DataPackage.LINKED_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG_LINK__DESCRIPTION = DataPackage.LINKED_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Backlog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG_LINK__BACKLOG = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Backlog Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BACKLOG_LINK_FEATURE_COUNT = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink <em>Release Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.scrum.ReleaseLink
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getReleaseLink()
	 * @generated
	 */
	public static final int RELEASE_LINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_LINK__NAME = DataPackage.LINKED_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_LINK__DESCRIPTION = DataPackage.LINKED_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_LINK__RELEASES = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_LINK_FEATURE_COUNT = DataPackage.LINKED_CONTENT_FEATURE_COUNT + 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backlogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTimeBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backlogLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseLinkEClass = null;

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
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScrumPackage()
	{
		super(eNS_URI, ScrumFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScrumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScrumPackage init()
	{
		if (isInited) return (ScrumPackage)EPackage.Registry.INSTANCE.getEPackage(ScrumPackage.eNS_URI);

		// Obtain or create and register package
		ScrumPackage theScrumPackage = (ScrumPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScrumPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScrumPackage());

		isInited = true;

		// Initialize simple dependencies
		TaskPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theScrumPackage.createPackageContents();

		// Initialize created meta-data
		theScrumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScrumPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScrumPackage.eNS_URI, theScrumPackage);
		return theScrumPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.Backlog <em>Backlog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backlog</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.Backlog
	 * @generated
	 */
	public EClass getBacklog()
	{
		return backlogEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.Release
	 * @generated
	 */
	public EClass getRelease()
	{
		return releaseEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.scrum.Release#getMilestones <em>Milestones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Milestones</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.Release#getMilestones()
	 * @see #getRelease()
	 * @generated
	 */
	public EReference getRelease_Milestones()
	{
		return (EReference)releaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.Milestone
	 * @generated
	 */
	public EClass getMilestone()
	{
		return milestoneEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox <em>Task Time Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Time Box</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox
	 * @generated
	 */
	public EClass getTaskTimeBox()
	{
		return taskTimeBoxEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getBeginsOn <em>Begins On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begins On</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getBeginsOn()
	 * @see #getTaskTimeBox()
	 * @generated
	 */
	public EAttribute getTaskTimeBox_BeginsOn()
	{
		return (EAttribute)taskTimeBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getEndsOn <em>Ends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ends On</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox#getEndsOn()
	 * @see #getTaskTimeBox()
	 * @generated
	 */
	public EAttribute getTaskTimeBox_EndsOn()
	{
		return (EAttribute)taskTimeBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.BacklogLink <em>Backlog Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backlog Link</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.BacklogLink
	 * @generated
	 */
	public EClass getBacklogLink()
	{
		return backlogLinkEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.etrack.domain.scrum.BacklogLink#getBacklog <em>Backlog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backlog</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.BacklogLink#getBacklog()
	 * @see #getBacklogLink()
	 * @generated
	 */
	public EReference getBacklogLink_Backlog()
	{
		return (EReference)backlogLinkEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink <em>Release Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Link</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.ReleaseLink
	 * @generated
	 */
	public EClass getReleaseLink()
	{
		return releaseLinkEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.eclipselabs.etrack.domain.scrum.ReleaseLink#getReleases()
	 * @see #getReleaseLink()
	 * @generated
	 */
	public EReference getReleaseLink_Releases()
	{
		return (EReference)releaseLinkEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ScrumFactory getScrumFactory()
	{
		return (ScrumFactory)getEFactoryInstance();
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
		backlogEClass = createEClass(BACKLOG);

		releaseEClass = createEClass(RELEASE);
		createEReference(releaseEClass, RELEASE__MILESTONES);

		milestoneEClass = createEClass(MILESTONE);

		taskTimeBoxEClass = createEClass(TASK_TIME_BOX);
		createEAttribute(taskTimeBoxEClass, TASK_TIME_BOX__BEGINS_ON);
		createEAttribute(taskTimeBoxEClass, TASK_TIME_BOX__ENDS_ON);

		backlogLinkEClass = createEClass(BACKLOG_LINK);
		createEReference(backlogLinkEClass, BACKLOG_LINK__BACKLOG);

		releaseLinkEClass = createEClass(RELEASE_LINK);
		createEReference(releaseLinkEClass, RELEASE_LINK__RELEASES);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		backlogEClass.getESuperTypes().add(theTaskPackage.getTaskGroup());
		releaseEClass.getESuperTypes().add(this.getTaskTimeBox());
		milestoneEClass.getESuperTypes().add(this.getTaskTimeBox());
		taskTimeBoxEClass.getESuperTypes().add(theTaskPackage.getTaskGroup());
		backlogLinkEClass.getESuperTypes().add(theDataPackage.getLinkedContent());
		releaseLinkEClass.getESuperTypes().add(theDataPackage.getLinkedContent());

		// Initialize classes and features; add operations and parameters
		initEClass(backlogEClass, Backlog.class, "Backlog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelease_Milestones(), this.getMilestone(), null, "milestones", null, 0, -1, Release.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskTimeBoxEClass, TaskTimeBox.class, "TaskTimeBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskTimeBox_BeginsOn(), ecorePackage.getEDate(), "beginsOn", null, 0, 1, TaskTimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskTimeBox_EndsOn(), ecorePackage.getEDate(), "endsOn", null, 0, 1, TaskTimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backlogLinkEClass, BacklogLink.class, "BacklogLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBacklogLink_Backlog(), this.getBacklog(), null, "backlog", null, 0, 1, BacklogLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseLinkEClass, ReleaseLink.class, "ReleaseLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseLink_Releases(), this.getRelease(), null, "releases", null, 0, -1, ReleaseLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.Backlog <em>Backlog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.Backlog
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklog()
		 * @generated
		 */
		public static final EClass BACKLOG = eINSTANCE.getBacklog();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.Release <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.Release
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getRelease()
		 * @generated
		 */
		public static final EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Milestones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE__MILESTONES = eINSTANCE.getRelease_Milestones();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.Milestone <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.Milestone
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getMilestone()
		 * @generated
		 */
		public static final EClass MILESTONE = eINSTANCE.getMilestone();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.TaskTimeBox <em>Task Time Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.TaskTimeBox
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getTaskTimeBox()
		 * @generated
		 */
		public static final EClass TASK_TIME_BOX = eINSTANCE.getTaskTimeBox();

		/**
		 * The meta object literal for the '<em><b>Begins On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_TIME_BOX__BEGINS_ON = eINSTANCE.getTaskTimeBox_BeginsOn();

		/**
		 * The meta object literal for the '<em><b>Ends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_TIME_BOX__ENDS_ON = eINSTANCE.getTaskTimeBox_EndsOn();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.BacklogLink <em>Backlog Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.BacklogLink
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklogLink()
		 * @generated
		 */
		public static final EClass BACKLOG_LINK = eINSTANCE.getBacklogLink();

		/**
		 * The meta object literal for the '<em><b>Backlog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BACKLOG_LINK__BACKLOG = eINSTANCE.getBacklogLink_Backlog();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink <em>Release Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.scrum.ReleaseLink
		 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getReleaseLink()
		 * @generated
		 */
		public static final EClass RELEASE_LINK = eINSTANCE.getReleaseLink();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_LINK__RELEASES = eINSTANCE.getReleaseLink_Releases();

	}

} //ScrumPackage
