/**
 * Copyright (c) 2010 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclipselabs.etrack.domain.links;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.eclipselabs.etrack.domain.links.LinksFactory
 * @model kind="package"
 * @generated
 */
public class LinksPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "links";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/links";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.links";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LinksPackage eINSTANCE = org.eclipselabs.etrack.domain.links.LinksPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.links.LinkedContent <em>Linked Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.links.LinkedContent
	 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkedContent()
	 * @generated
	 */
	public static final int LINKED_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CONTENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CONTENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Linked Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.etrack.domain.links.LinkMap <em>Link Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.etrack.domain.links.LinkMap
	 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkMap()
	 * @generated
	 */
	public static final int LINK_MAP = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Link Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAP_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkMapEClass = null;

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
	 * @see org.eclipselabs.etrack.domain.links.LinksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinksPackage()
	{
		super(eNS_URI, LinksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LinksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinksPackage init()
	{
		if (isInited) return (LinksPackage)EPackage.Registry.INSTANCE.getEPackage(LinksPackage.eNS_URI);

		// Obtain or create and register package
		LinksPackage theLinksPackage = (LinksPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LinksPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LinksPackage());

		isInited = true;

		// Create package meta-data objects
		theLinksPackage.createPackageContents();

		// Initialize created meta-data
		theLinksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinksPackage.eNS_URI, theLinksPackage);
		return theLinksPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.etrack.domain.links.LinkedContent <em>Linked Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Content</em>'.
	 * @see org.eclipselabs.etrack.domain.links.LinkedContent
	 * @generated
	 */
	public EClass getLinkedContent()
	{
		return linkedContentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.links.LinkedContent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.etrack.domain.links.LinkedContent#getName()
	 * @see #getLinkedContent()
	 * @generated
	 */
	public EAttribute getLinkedContent_Name()
	{
		return (EAttribute)linkedContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.etrack.domain.links.LinkedContent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipselabs.etrack.domain.links.LinkedContent#getDescription()
	 * @see #getLinkedContent()
	 * @generated
	 */
	public EAttribute getLinkedContent_Description()
	{
		return (EAttribute)linkedContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Link Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipselabs.etrack.domain.links.LinkedContent" valueContainment="true" valueResolveProxies="true"
	 * @generated
	 */
	public EClass getLinkMap()
	{
		return linkMapEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkMap()
	 * @generated
	 */
	public EAttribute getLinkMap_Key()
	{
		return (EAttribute)linkMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkMap()
	 * @generated
	 */
	public EReference getLinkMap_Value()
	{
		return (EReference)linkMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LinksFactory getLinksFactory()
	{
		return (LinksFactory)getEFactoryInstance();
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
		linkedContentEClass = createEClass(LINKED_CONTENT);
		createEAttribute(linkedContentEClass, LINKED_CONTENT__NAME);
		createEAttribute(linkedContentEClass, LINKED_CONTENT__DESCRIPTION);

		linkMapEClass = createEClass(LINK_MAP);
		createEAttribute(linkMapEClass, LINK_MAP__KEY);
		createEReference(linkMapEClass, LINK_MAP__VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(linkedContentEClass, LinkedContent.class, "LinkedContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkedContent_Name(), ecorePackage.getEString(), "name", null, 0, 1, LinkedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkedContent_Description(), ecorePackage.getEString(), "description", null, 0, 1, LinkedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMapEClass, Map.Entry.class, "LinkMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMap_Value(), this.getLinkedContent(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.links.LinkedContent <em>Linked Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.links.LinkedContent
		 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkedContent()
		 * @generated
		 */
		public static final EClass LINKED_CONTENT = eINSTANCE.getLinkedContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINKED_CONTENT__NAME = eINSTANCE.getLinkedContent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINKED_CONTENT__DESCRIPTION = eINSTANCE.getLinkedContent_Description();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.etrack.domain.links.LinkMap <em>Link Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.etrack.domain.links.LinkMap
		 * @see org.eclipselabs.etrack.domain.links.LinksPackage#getLinkMap()
		 * @generated
		 */
		public static final EClass LINK_MAP = eINSTANCE.getLinkMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINK_MAP__KEY = eINSTANCE.getLinkMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINK_MAP__VALUE = eINSTANCE.getLinkMap_Value();

	}

} //LinksPackage
