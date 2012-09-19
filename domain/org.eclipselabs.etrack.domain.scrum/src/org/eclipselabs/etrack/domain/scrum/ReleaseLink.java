/**
 */
package org.eclipselabs.etrack.domain.scrum;

import java.util.Collection;

import org.eclilpselabs.etrack.domain.data.LinkedContent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.etrack.domain.scrum.ReleaseLink#getReleases <em>Releases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getReleaseLink()
 * @model kind="class"
 * @generated
 */
public class ReleaseLink extends LinkedContent
{
	/**
	 * The cached value of the '{@link #getReleases() <em>Releases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleases()
	 * @generated
	 * @ordered
	 */
	protected EList<Release> releases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseLink()
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
		return ScrumPackage.Literals.RELEASE_LINK;
	}

	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.etrack.domain.scrum.Release}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.eclipselabs.etrack.domain.scrum.ScrumPackage#getReleaseLink_Releases()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	public EList<Release> getReleases()
	{
		if (releases == null)
		{
			releases = new EObjectContainmentEList.Resolving<Release>(Release.class, this, ScrumPackage.RELEASE_LINK__RELEASES);
		}
		return releases;
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
			case ScrumPackage.RELEASE_LINK__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
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
			case ScrumPackage.RELEASE_LINK__RELEASES:
				return getReleases();
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
			case ScrumPackage.RELEASE_LINK__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
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
			case ScrumPackage.RELEASE_LINK__RELEASES:
				getReleases().clear();
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
			case ScrumPackage.RELEASE_LINK__RELEASES:
				return releases != null && !releases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ReleaseLink
