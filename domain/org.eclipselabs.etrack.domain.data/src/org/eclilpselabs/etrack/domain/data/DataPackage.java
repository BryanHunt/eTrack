/**
 * Copyright (c) 2011 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclilpselabs.etrack.domain.data;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclilpselabs.etrack.domain.data.DataFactory
 * @model kind="package"
 * @generated
 */
public class DataPackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipselabs.org/etrack/domain/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipselabs.etrack.domain.data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DataPackage eINSTANCE = org.eclilpselabs.etrack.domain.data.DataPackage.init();

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.LinkedContent <em>Linked Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.LinkedContent
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkedContent()
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
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.LinkMapping <em>Link Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.LinkMapping
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkMapping()
	 * @generated
	 */
	public static final int LINK_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAPPING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINK_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.Linkable <em>Linkable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.Linkable
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkable()
	 * @generated
	 */
	public static final int LINKABLE = 2;

	/**
	 * The feature id for the '<em><b>Links By Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKABLE__LINKS_BY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.Category <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.Category
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getCategory()
	 * @generated
	 */
	public static final int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.CategorizedItem <em>Categorized Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.CategorizedItem
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getCategorizedItem()
	 * @generated
	 */
	public static final int CATEGORIZED_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORIZED_ITEM__CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Categorized Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORIZED_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.TaggableItem <em>Taggable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.TaggableItem
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getTaggableItem()
	 * @generated
	 */
	public static final int TAGGABLE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAGGABLE_ITEM__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Taggable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAGGABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.Artifact <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.Artifact
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getArtifact()
	 * @generated
	 */
	public static final int ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT__CREATED_ON = 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.Resource
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getResource()
	 * @generated
	 */
	public static final int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__CREATED_ON = ARTIFACT__CREATED_ON;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE__URI = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclilpselabs.etrack.domain.data.LinkedCategories <em>Linked Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclilpselabs.etrack.domain.data.LinkedCategories
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkedCategories()
	 * @generated
	 */
	public static final int LINKED_CATEGORIES = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CATEGORIES__NAME = LINKED_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CATEGORIES__DESCRIPTION = LINKED_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CATEGORIES__CATEGORIES = LINKED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linked Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_CATEGORIES_FEATURE_COUNT = LINKED_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getURI()
	 * @generated
	 */
	public static final int URI = 9;

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
	private EClass linkMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorizedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedCategoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

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
	 * @see org.eclilpselabs.etrack.domain.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackage()
	{
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init()
	{
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackage theDataPackage = (DataPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackage());

		isInited = true;

		// Create package meta-data objects
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.LinkedContent <em>Linked Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Content</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedContent
	 * @generated
	 */
	public EClass getLinkedContent()
	{
		return linkedContentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.LinkedContent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedContent#getName()
	 * @see #getLinkedContent()
	 * @generated
	 */
	public EAttribute getLinkedContent_Name()
	{
		return (EAttribute)linkedContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.LinkedContent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedContent#getDescription()
	 * @see #getLinkedContent()
	 * @generated
	 */
	public EAttribute getLinkedContent_Description()
	{
		return (EAttribute)linkedContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Mapping</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclilpselabs.etrack.domain.data.LinkedContent" valueContainment="true" valueResolveProxies="true"
	 * @generated
	 */
	public EClass getLinkMapping()
	{
		return linkMappingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkMapping()
	 * @generated
	 */
	public EAttribute getLinkMapping_Key()
	{
		return (EAttribute)linkMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkMapping()
	 * @generated
	 */
	public EReference getLinkMapping_Value()
	{
		return (EReference)linkMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Linkable
	 * @generated
	 */
	public EClass getLinkable()
	{
		return linkableEClass;
	}

	/**
	 * Returns the meta object for the map '{@link org.eclilpselabs.etrack.domain.data.Linkable#getLinksByName <em>Links By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Links By Name</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Linkable#getLinksByName()
	 * @see #getLinkable()
	 * @generated
	 */
	public EReference getLinkable_LinksByName()
	{
		return (EReference)linkableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Category
	 * @generated
	 */
	public EClass getCategory()
	{
		return categoryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	public EAttribute getCategory_Name()
	{
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.CategorizedItem <em>Categorized Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorized Item</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.CategorizedItem
	 * @generated
	 */
	public EClass getCategorizedItem()
	{
		return categorizedItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclilpselabs.etrack.domain.data.CategorizedItem#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.CategorizedItem#getCategory()
	 * @see #getCategorizedItem()
	 * @generated
	 */
	public EReference getCategorizedItem_Category()
	{
		return (EReference)categorizedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.TaggableItem <em>Taggable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taggable Item</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.TaggableItem
	 * @generated
	 */
	public EClass getTaggableItem()
	{
		return taggableItemEClass;
	}


	/**
	 * Returns the meta object for the attribute list '{@link org.eclilpselabs.etrack.domain.data.TaggableItem#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.TaggableItem#getTags()
	 * @see #getTaggableItem()
	 * @generated
	 */
	public EAttribute getTaggableItem_Tags()
	{
		return (EAttribute)taggableItemEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Artifact
	 * @generated
	 */
	public EClass getArtifact()
	{
		return artifactEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	public EAttribute getArtifact_Name()
	{
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.Artifact#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Artifact#getCreatedOn()
	 * @see #getArtifact()
	 * @generated
	 */
	public EAttribute getArtifact_CreatedOn()
	{
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Resource
	 * @generated
	 */
	public EClass getResource()
	{
		return resourceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclilpselabs.etrack.domain.data.Resource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.Resource#getUri()
	 * @see #getResource()
	 * @generated
	 */
	public EAttribute getResource_Uri()
	{
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.eclilpselabs.etrack.domain.data.LinkedCategories <em>Linked Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked Categories</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedCategories
	 * @generated
	 */
	public EClass getLinkedCategories()
	{
		return linkedCategoriesEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclilpselabs.etrack.domain.data.LinkedCategories#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclilpselabs.etrack.domain.data.LinkedCategories#getCategories()
	 * @see #getLinkedCategories()
	 * @generated
	 */
	public EReference getLinkedCategories_Categories()
	{
		return (EReference)linkedCategoriesEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	public EDataType getURI()
	{
		return uriEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DataFactory getDataFactory()
	{
		return (DataFactory)getEFactoryInstance();
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

		linkMappingEClass = createEClass(LINK_MAPPING);
		createEAttribute(linkMappingEClass, LINK_MAPPING__KEY);
		createEReference(linkMappingEClass, LINK_MAPPING__VALUE);

		linkableEClass = createEClass(LINKABLE);
		createEReference(linkableEClass, LINKABLE__LINKS_BY_NAME);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);

		categorizedItemEClass = createEClass(CATEGORIZED_ITEM);
		createEReference(categorizedItemEClass, CATEGORIZED_ITEM__CATEGORY);

		taggableItemEClass = createEClass(TAGGABLE_ITEM);
		createEAttribute(taggableItemEClass, TAGGABLE_ITEM__TAGS);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__NAME);
		createEAttribute(artifactEClass, ARTIFACT__CREATED_ON);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__URI);

		linkedCategoriesEClass = createEClass(LINKED_CATEGORIES);
		createEReference(linkedCategoriesEClass, LINKED_CATEGORIES__CATEGORIES);

		// Create data types
		uriEDataType = createEDataType(URI);
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
		resourceEClass.getESuperTypes().add(this.getArtifact());
		linkedCategoriesEClass.getESuperTypes().add(this.getLinkedContent());

		// Initialize classes and features; add operations and parameters
		initEClass(linkedContentEClass, LinkedContent.class, "LinkedContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkedContent_Name(), ecorePackage.getEString(), "name", null, 0, 1, LinkedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkedContent_Description(), ecorePackage.getEString(), "description", null, 0, 1, LinkedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkMappingEClass, Map.Entry.class, "LinkMapping", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkMapping_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMapping_Value(), this.getLinkedContent(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkableEClass, Linkable.class, "Linkable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkable_LinksByName(), this.getLinkMapping(), null, "linksByName", null, 0, -1, Linkable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorizedItemEClass, CategorizedItem.class, "CategorizedItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategorizedItem_Category(), this.getCategory(), null, "category", null, 0, 1, CategorizedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggableItemEClass, TaggableItem.class, "TaggableItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggableItem_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, TaggableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Uri(), this.getURI(), "uri", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkedCategoriesEClass, LinkedCategories.class, "LinkedCategories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkedCategories_Categories(), this.getCategory(), null, "categories", null, 0, -1, LinkedCategories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.LinkedContent <em>Linked Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.LinkedContent
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkedContent()
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
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.LinkMapping <em>Link Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.LinkMapping
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkMapping()
		 * @generated
		 */
		public static final EClass LINK_MAPPING = eINSTANCE.getLinkMapping();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINK_MAPPING__KEY = eINSTANCE.getLinkMapping_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINK_MAPPING__VALUE = eINSTANCE.getLinkMapping_Value();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.Linkable <em>Linkable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.Linkable
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkable()
		 * @generated
		 */
		public static final EClass LINKABLE = eINSTANCE.getLinkable();

		/**
		 * The meta object literal for the '<em><b>Links By Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINKABLE__LINKS_BY_NAME = eINSTANCE.getLinkable_LinksByName();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.Category <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.Category
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getCategory()
		 * @generated
		 */
		public static final EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.CategorizedItem <em>Categorized Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.CategorizedItem
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getCategorizedItem()
		 * @generated
		 */
		public static final EClass CATEGORIZED_ITEM = eINSTANCE.getCategorizedItem();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CATEGORIZED_ITEM__CATEGORY = eINSTANCE.getCategorizedItem_Category();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.TaggableItem <em>Taggable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.TaggableItem
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getTaggableItem()
		 * @generated
		 */
		public static final EClass TAGGABLE_ITEM = eINSTANCE.getTaggableItem();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAGGABLE_ITEM__TAGS = eINSTANCE.getTaggableItem_Tags();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.Artifact <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.Artifact
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getArtifact()
		 * @generated
		 */
		public static final EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ARTIFACT__CREATED_ON = eINSTANCE.getArtifact_CreatedOn();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.Resource <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.Resource
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getResource()
		 * @generated
		 */
		public static final EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESOURCE__URI = eINSTANCE.getResource_Uri();

		/**
		 * The meta object literal for the '{@link org.eclilpselabs.etrack.domain.data.LinkedCategories <em>Linked Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclilpselabs.etrack.domain.data.LinkedCategories
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getLinkedCategories()
		 * @generated
		 */
		public static final EClass LINKED_CATEGORIES = eINSTANCE.getLinkedCategories();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINKED_CATEGORIES__CATEGORIES = eINSTANCE.getLinkedCategories_Categories();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.eclilpselabs.etrack.domain.data.DataPackage#getURI()
		 * @generated
		 */
		public static final EDataType URI = eINSTANCE.getURI();

	}

} //DataPackage
