/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Duration Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage#getDurationUnit()
 * @model
 * @generated
 */
public enum DurationUnit implements Enumerator
{
	/**
	 * The '<em><b>MINUTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUTES_VALUE
	 * @generated
	 * @ordered
	 */
	MINUTES(0, "MINUTES", "MINUTES"),

	/**
	 * The '<em><b>HOURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOURS_VALUE
	 * @generated
	 * @ordered
	 */
	HOURS(1, "HOURS", "HOURS"),

	/**
	 * The '<em><b>DAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYS_VALUE
	 * @generated
	 * @ordered
	 */
	DAYS(2, "DAYS", "DAYS"),

	/**
	 * The '<em><b>WEEKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKS(3, "WEEKS", "WEEKS");

	/**
	 * The '<em><b>MINUTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINUTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUTES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINUTES_VALUE = 0;

	/**
	 * The '<em><b>HOURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOURS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOURS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOURS_VALUE = 1;

	/**
	 * The '<em><b>DAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYS_VALUE = 2;

	/**
	 * The '<em><b>WEEKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEEKS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEEKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEEKS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Duration Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DurationUnit[] VALUES_ARRAY =
		new DurationUnit[]
		{
			MINUTES,
			HOURS,
			DAYS,
			WEEKS,
		};

	/**
	 * A public read-only list of all the '<em><b>Duration Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DurationUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Duration Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnit get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DurationUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnit getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DurationUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Duration Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationUnit get(int value)
	{
		switch (value)
		{
			case MINUTES_VALUE: return MINUTES;
			case HOURS_VALUE: return HOURS;
			case DAYS_VALUE: return DAYS;
			case WEEKS_VALUE: return WEEKS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DurationUnit(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //DurationUnit
