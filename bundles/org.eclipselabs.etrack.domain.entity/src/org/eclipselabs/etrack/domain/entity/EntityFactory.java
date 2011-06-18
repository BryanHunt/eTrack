/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.etrack.domain.entity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.entity.EntityPackage
 * @generated
 */
public class EntityFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EntityFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityFactory init()
	{
		try
		{
			EntityFactory theEntityFactory = (EntityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/etrack/domain/entity"); 
			if (theEntityFactory != null)
			{
				return theEntityFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EntityFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case EntityPackage.ADDRESS: return createAddress();
			case EntityPackage.EMAIL: return createEmail();
			case EntityPackage.GROUP: return createGroup();
			case EntityPackage.PERSON: return createPerson();
			case EntityPackage.PHONE: return createPhone();
			case EntityPackage.CATEGORIZED_ITEM: return createCategorizedItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress()
	{
		Address address = new Address();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Email createEmail()
	{
		Email email = new Email();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup()
	{
		Group group = new Group();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson()
	{
		Person person = new Person();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phone createPhone()
	{
		Phone phone = new Phone();
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorizedItem createCategorizedItem()
	{
		CategorizedItem categorizedItem = new CategorizedItem();
		return categorizedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPackage getEntityPackage()
	{
		return (EntityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EntityPackage getPackage()
	{
		return EntityPackage.eINSTANCE;
	}

} //EntityFactory
