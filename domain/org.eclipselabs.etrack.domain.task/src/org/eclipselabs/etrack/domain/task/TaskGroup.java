/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipselabs.etrack.domain.project.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskGroup#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskGroup#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup()
 * @model kind="class"
 * @generated
 */
public class TaskGroup extends EObjectImpl implements EObject
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskGroup()
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
		return TaskPackage.Literals.TASK_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_GROUP__NAME, oldName, name));
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
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup_Project()
	 * @model required="true"
	 * @generated
	 */
	public Project getProject()
	{
		if (project != null && project.eIsProxy())
		{
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_GROUP__PROJECT, oldProject, project));
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
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskGroup#getProject <em>Project</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_GROUP__PROJECT, oldProject, project));
	}

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskGroup_Tasks()
	 * @model
	 * @generated
	 */
	public EList<Task> getTasks()
	{
		if (tasks == null)
		{
			tasks = new EObjectResolvingEList<Task>(Task.class, this, TaskPackage.TASK_GROUP__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case TaskPackage.TASK_GROUP__NAME:
				return getName();
			case TaskPackage.TASK_GROUP__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case TaskPackage.TASK_GROUP__TASKS:
				return getTasks();
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
		switch (featureID)
		{
			case TaskPackage.TASK_GROUP__NAME:
				setName((String)newValue);
				return;
			case TaskPackage.TASK_GROUP__PROJECT:
				setProject((Project)newValue);
				return;
			case TaskPackage.TASK_GROUP__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
		switch (featureID)
		{
			case TaskPackage.TASK_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskPackage.TASK_GROUP__PROJECT:
				setProject((Project)null);
				return;
			case TaskPackage.TASK_GROUP__TASKS:
				getTasks().clear();
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
		switch (featureID)
		{
			case TaskPackage.TASK_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskPackage.TASK_GROUP__PROJECT:
				return project != null;
			case TaskPackage.TASK_GROUP__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // TaskGroup
