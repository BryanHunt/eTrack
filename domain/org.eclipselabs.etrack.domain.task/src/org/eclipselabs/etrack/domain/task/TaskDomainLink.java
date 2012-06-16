/**
 */
package org.eclipselabs.etrack.domain.task;

import org.eclilpselabs.etrack.domain.data.LinkedContent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.task.TaskDomainLink#getTaskDomain <em>Task Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomainLink()
 * @model kind="class"
 * @generated
 */
public class TaskDomainLink extends LinkedContent
{
	/**
	 * The cached value of the '{@link #getTaskDomain() <em>Task Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDomain()
	 * @generated
	 * @ordered
	 */
	protected TaskDomain taskDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDomainLink()
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
		return TaskPackage.Literals.TASK_DOMAIN_LINK;
	}

	/**
	 * Returns the value of the '<em><b>Task Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Domain</em>' reference.
	 * @see #setTaskDomain(TaskDomain)
	 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getTaskDomainLink_TaskDomain()
	 * @model required="true"
	 * @generated
	 */
	public TaskDomain getTaskDomain()
	{
		if (taskDomain != null && taskDomain.eIsProxy())
		{
			InternalEObject oldTaskDomain = (InternalEObject)taskDomain;
			taskDomain = (TaskDomain)eResolveProxy(oldTaskDomain);
			if (taskDomain != oldTaskDomain)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN, oldTaskDomain, taskDomain));
			}
		}
		return taskDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDomain basicGetTaskDomain()
	{
		return taskDomain;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.task.TaskDomainLink#getTaskDomain <em>Task Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Domain</em>' reference.
	 * @see #getTaskDomain()
	 * @generated
	 */
	public void setTaskDomain(TaskDomain newTaskDomain)
	{
		TaskDomain oldTaskDomain = taskDomain;
		taskDomain = newTaskDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN, oldTaskDomain, taskDomain));
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
			case TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN:
				if (resolve) return getTaskDomain();
				return basicGetTaskDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN:
				setTaskDomain((TaskDomain)newValue);
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
			case TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN:
				setTaskDomain((TaskDomain)null);
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
			case TaskPackage.TASK_DOMAIN_LINK__TASK_DOMAIN:
				return taskDomain != null;
		}
		return super.eIsSet(featureID);
	}

} // TaskDomainLink
