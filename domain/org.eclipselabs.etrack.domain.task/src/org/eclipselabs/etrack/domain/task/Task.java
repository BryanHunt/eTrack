/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Collection;
import java.util.Date;

import org.eclilpselabs.etrack.domain.data.DataPackage;
import org.eclilpselabs.etrack.domain.data.LinkMapping;
import org.eclilpselabs.etrack.domain.data.Linkable;
import org.eclilpselabs.etrack.domain.data.LinkedContent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipselabs.etrack.domain.audit.Action;
import org.eclipselabs.etrack.domain.audit.AuditPackage;
import org.eclipselabs.etrack.domain.audit.AuditableItem;
import org.eclipselabs.etrack.domain.entity.AssignableItem;
import org.eclipselabs.etrack.domain.entity.EntityPackage;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.domain.state.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.Task#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask()
 * @model kind="class"
 * @generated
 */
public class Task extends EObjectImpl implements Linkable, AssignableItem, AuditableItem
{
	/**
	 * The cached value of the '{@link #getLinksByName() <em>Links By Name</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksByName()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, LinkedContent> linksByName;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Person owner;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> history;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected Person createdBy;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> attachments;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> subscribers;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TaskType type;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return TaskPackage.Literals.TASK;
	}

	/**
	 * Returns the value of the '<em><b>Links By Name</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclilpselabs.etrack.domain.data.LinkedContent},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links By Name</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links By Name</em>' map.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getLinkable_LinksByName()
	 * @model mapType="org.eclilpselabs.etrack.domain.data.LinkMapping<org.eclipse.emf.ecore.EString, org.eclilpselabs.etrack.domain.data.LinkedContent>"
	 * @generated
	 */
	public EMap<String, LinkedContent> getLinksByName()
	{
		if (linksByName == null) {
			linksByName = new EcoreEMap<String,LinkedContent>(DataPackage.Literals.LINK_MAPPING, LinkMapping.class, this, TaskPackage.TASK__LINKS_BY_NAME);
		}
		return linksByName;
	}

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Person)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAssignableItem_Owner()
	 * @model
	 * @generated
	 */
	public Person getOwner()
	{
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Person)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOwner()
	{
		return owner;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	public void setOwner(Person newOwner)
	{
		Person oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__OWNER, oldOwner, owner));
	}

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.audit.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getAuditableItem_History()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Action> getHistory()
	{
		if (history == null) {
			history = new EObjectContainmentEList<Action>(Action.class, this, TaskPackage.TASK__HISTORY);
		}
		return history;
	}

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Summary()
	 * @model required="true"
	 * @generated
	 */
	public String getSummary()
	{
		return summary;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	public void setSummary(String newSummary)
	{
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__SUMMARY, oldSummary, summary));
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Description()
	 * @model required="true"
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_CreatedOn()
	 * @model required="true"
	 * @generated
	 */
	public Date getCreatedOn()
	{
		return createdOn;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	public void setCreatedOn(Date newCreatedOn)
	{
		Date oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(Person)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_CreatedBy()
	 * @model required="true"
	 * @generated
	 */
	public Person getCreatedBy()
	{
		if (createdBy != null && createdBy.eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject)createdBy;
			createdBy = (Person)eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__CREATED_BY, oldCreatedBy, createdBy));
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCreatedBy()
	{
		return createdBy;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	public void setCreatedBy(Person newCreatedBy)
	{
		Person oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Attachment> getAttachments()
	{
		if (attachments == null) {
			attachments = new EObjectContainmentEList<Attachment>(Attachment.class, this, TaskPackage.TASK__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Comments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Comment> getComments()
	{
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, TaskPackage.TASK__COMMENTS);
		}
		return comments;
	}

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_CurrentState()
	 * @model required="true"
	 * @generated
	 */
	public State getCurrentState()
	{
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState()
	{
		return currentState;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	public void setCurrentState(State newCurrentState)
	{
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.entity.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Subscribers()
	 * @model
	 * @generated
	 */
	public EList<Person> getSubscribers()
	{
		if (subscribers == null) {
			subscribers = new EObjectResolvingEList<Person>(Person.class, this, TaskPackage.TASK__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TaskType)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Type()
	 * @model required="true"
	 * @generated
	 */
	public TaskType getType()
	{
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TaskType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType basicGetType()
	{
		return type;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	public void setType(TaskType newType)
	{
		TaskType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTask_Project()
	 * @model
	 * @generated
	 */
	public Project getProject()
	{
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject()
	{
		return project;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.Task#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	public void setProject(Project newProject)
	{
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case TaskPackage.TASK__LINKS_BY_NAME:
				return ((InternalEList<?>)getLinksByName()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case TaskPackage.TASK__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case TaskPackage.TASK__LINKS_BY_NAME:
				if (coreType) return getLinksByName();
				else return getLinksByName().map();
			case TaskPackage.TASK__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case TaskPackage.TASK__HISTORY:
				return getHistory();
			case TaskPackage.TASK__SUMMARY:
				return getSummary();
			case TaskPackage.TASK__DESCRIPTION:
				return getDescription();
			case TaskPackage.TASK__CREATED_ON:
				return getCreatedOn();
			case TaskPackage.TASK__CREATED_BY:
				if (resolve) return getCreatedBy();
				return basicGetCreatedBy();
			case TaskPackage.TASK__ATTACHMENTS:
				return getAttachments();
			case TaskPackage.TASK__COMMENTS:
				return getComments();
			case TaskPackage.TASK__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
			case TaskPackage.TASK__SUBSCRIBERS:
				return getSubscribers();
			case TaskPackage.TASK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TaskPackage.TASK__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case TaskPackage.TASK__LINKS_BY_NAME:
				((EStructuralFeature.Setting)getLinksByName()).set(newValue);
				return;
			case TaskPackage.TASK__OWNER:
				setOwner((Person)newValue);
				return;
			case TaskPackage.TASK__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends Action>)newValue);
				return;
			case TaskPackage.TASK__SUMMARY:
				setSummary((String)newValue);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TaskPackage.TASK__CREATED_ON:
				setCreatedOn((Date)newValue);
				return;
			case TaskPackage.TASK__CREATED_BY:
				setCreatedBy((Person)newValue);
				return;
			case TaskPackage.TASK__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case TaskPackage.TASK__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case TaskPackage.TASK__CURRENT_STATE:
				setCurrentState((State)newValue);
				return;
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Person>)newValue);
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)newValue);
				return;
			case TaskPackage.TASK__PROJECT:
				setProject((Project)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case TaskPackage.TASK__LINKS_BY_NAME:
				getLinksByName().clear();
				return;
			case TaskPackage.TASK__OWNER:
				setOwner((Person)null);
				return;
			case TaskPackage.TASK__HISTORY:
				getHistory().clear();
				return;
			case TaskPackage.TASK__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TaskPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TaskPackage.TASK__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case TaskPackage.TASK__CREATED_BY:
				setCreatedBy((Person)null);
				return;
			case TaskPackage.TASK__ATTACHMENTS:
				getAttachments().clear();
				return;
			case TaskPackage.TASK__COMMENTS:
				getComments().clear();
				return;
			case TaskPackage.TASK__CURRENT_STATE:
				setCurrentState((State)null);
				return;
			case TaskPackage.TASK__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case TaskPackage.TASK__TYPE:
				setType((TaskType)null);
				return;
			case TaskPackage.TASK__PROJECT:
				setProject((Project)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case TaskPackage.TASK__LINKS_BY_NAME:
				return linksByName != null && !linksByName.isEmpty();
			case TaskPackage.TASK__OWNER:
				return owner != null;
			case TaskPackage.TASK__HISTORY:
				return history != null && !history.isEmpty();
			case TaskPackage.TASK__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case TaskPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TaskPackage.TASK__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case TaskPackage.TASK__CREATED_BY:
				return createdBy != null;
			case TaskPackage.TASK__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case TaskPackage.TASK__COMMENTS:
				return comments != null && !comments.isEmpty();
			case TaskPackage.TASK__CURRENT_STATE:
				return currentState != null;
			case TaskPackage.TASK__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case TaskPackage.TASK__TYPE:
				return type != null;
			case TaskPackage.TASK__PROJECT:
				return project != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == AssignableItem.class) {
			switch (derivedFeatureID) {
				case TaskPackage.TASK__OWNER: return EntityPackage.ASSIGNABLE_ITEM__OWNER;
				default: return -1;
			}
		}
		if (baseClass == AuditableItem.class) {
			switch (derivedFeatureID) {
				case TaskPackage.TASK__HISTORY: return AuditPackage.AUDITABLE_ITEM__HISTORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == AssignableItem.class) {
			switch (baseFeatureID) {
				case EntityPackage.ASSIGNABLE_ITEM__OWNER: return TaskPackage.TASK__OWNER;
				default: return -1;
			}
		}
		if (baseClass == AuditableItem.class) {
			switch (baseFeatureID) {
				case AuditPackage.AUDITABLE_ITEM__HISTORY: return TaskPackage.TASK__HISTORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} // Task
