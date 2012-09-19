/**
 */
package org.eclipselabs.etrack.domain.scrum;

import org.eclilpselabs.etrack.domain.data.LinkedContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backlog Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.scrum.BacklogLink#getBacklog <em>Backlog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklogLink()
 * @model kind="class"
 * @generated
 */
public class BacklogLink extends LinkedContent
{
	/**
	 * The cached value of the '{@link #getBacklog() <em>Backlog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBacklog()
	 * @generated
	 * @ordered
	 */
	protected Backlog backlog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BacklogLink()
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
		return ScrumPackage.Literals.BACKLOG_LINK;
	}

	/**
	 * Returns the value of the '<em><b>Backlog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backlog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backlog</em>' containment reference.
	 * @see #setBacklog(Backlog)
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getBacklogLink_Backlog()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public Backlog getBacklog()
	{
		if (backlog != null && backlog.eIsProxy())
		{
			InternalEObject oldBacklog = (InternalEObject)backlog;
			backlog = (Backlog)eResolveProxy(oldBacklog);
			if (backlog != oldBacklog)
			{
				InternalEObject newBacklog = (InternalEObject)backlog;
				NotificationChain msgs = oldBacklog.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScrumPackage.BACKLOG_LINK__BACKLOG, null, null);
				if (newBacklog.eInternalContainer() == null)
				{
					msgs = newBacklog.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScrumPackage.BACKLOG_LINK__BACKLOG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScrumPackage.BACKLOG_LINK__BACKLOG, oldBacklog, backlog));
			}
		}
		return backlog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backlog basicGetBacklog()
	{
		return backlog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBacklog(Backlog newBacklog, NotificationChain msgs)
	{
		Backlog oldBacklog = backlog;
		backlog = newBacklog;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScrumPackage.BACKLOG_LINK__BACKLOG, oldBacklog, newBacklog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipselabs.etrack.domain.scrum.BacklogLink#getBacklog <em>Backlog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backlog</em>' containment reference.
	 * @see #getBacklog()
	 * @generated
	 */
	public void setBacklog(Backlog newBacklog)
	{
		if (newBacklog != backlog)
		{
			NotificationChain msgs = null;
			if (backlog != null)
				msgs = ((InternalEObject)backlog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScrumPackage.BACKLOG_LINK__BACKLOG, null, msgs);
			if (newBacklog != null)
				msgs = ((InternalEObject)newBacklog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScrumPackage.BACKLOG_LINK__BACKLOG, null, msgs);
			msgs = basicSetBacklog(newBacklog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScrumPackage.BACKLOG_LINK__BACKLOG, newBacklog, newBacklog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ScrumPackage.BACKLOG_LINK__BACKLOG:
				return basicSetBacklog(null, msgs);
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
		switch (featureID)
		{
			case ScrumPackage.BACKLOG_LINK__BACKLOG:
				if (resolve) return getBacklog();
				return basicGetBacklog();
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
			case ScrumPackage.BACKLOG_LINK__BACKLOG:
				setBacklog((Backlog)newValue);
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
			case ScrumPackage.BACKLOG_LINK__BACKLOG:
				setBacklog((Backlog)null);
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
			case ScrumPackage.BACKLOG_LINK__BACKLOG:
				return backlog != null;
		}
		return super.eIsSet(featureID);
	}

} // BacklogLink
