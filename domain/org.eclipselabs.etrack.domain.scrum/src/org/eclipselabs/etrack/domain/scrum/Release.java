/**
 */
package org.eclipselabs.etrack.domain.scrum;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.scrum.Release#getMilestones <em>Milestones</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getRelease()
 * @model kind="class"
 * @generated
 */
public class Release extends TaskTimeBox
{
	/**
	 * The cached value of the '{@link #getMilestones() <em>Milestones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestones()
	 * @generated
	 * @ordered
	 */
	protected EList<Milestone> milestones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Release()
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
		return ScrumPackage.Literals.RELEASE;
	}

	/**
	 * Returns the value of the '<em><b>Milestones</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.scrum.Milestone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Milestones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestones</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getRelease_Milestones()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<Milestone> getMilestones()
	{
		if (milestones == null)
		{
			milestones = new EObjectContainmentEList.Resolving<Milestone>(Milestone.class, this, ScrumPackage.RELEASE__MILESTONES);
		}
		return milestones;
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
			case ScrumPackage.RELEASE__MILESTONES:
				return ((InternalEList<?>)getMilestones()).basicRemove(otherEnd, msgs);
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
			case ScrumPackage.RELEASE__MILESTONES:
				return getMilestones();
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
			case ScrumPackage.RELEASE__MILESTONES:
				getMilestones().clear();
				getMilestones().addAll((Collection<? extends Milestone>)newValue);
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
			case ScrumPackage.RELEASE__MILESTONES:
				getMilestones().clear();
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
			case ScrumPackage.RELEASE__MILESTONES:
				return milestones != null && !milestones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Release
