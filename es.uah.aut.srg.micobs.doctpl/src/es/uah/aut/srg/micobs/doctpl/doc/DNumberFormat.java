/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.micobs.doctpl.doc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DNumber Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDNumberFormat()
 * @model
 * @generated
 */
public enum DNumberFormat implements Enumerator {
	/**
	 * The '<em><b>Bullet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BULLET_VALUE
	 * @generated
	 * @ordered
	 */
	BULLET(0, "bullet", "bullet"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(1, "decimal", "decimal"),

	/**
	 * The '<em><b>Ordinal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORDINAL(2, "ordinal", "ordinal"),

	/**
	 * The '<em><b>Upper Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_ROMAN(3, "upperRoman", "upperRoman"),

	/**
	 * The '<em><b>Lower Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_ROMAN(4, "lowerRoman", "lowerRoman"),

	/**
	 * The '<em><b>Upper Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_LETTER(5, "upperLetter", "upperLetter"),

	/**
	 * The '<em><b>Lower Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_LETTER(6, "lowerLetter", "lowerLetter");

	/**
	 * The '<em><b>Bullet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bullet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BULLET
	 * @model name="bullet"
	 * @generated
	 * @ordered
	 */
	public static final int BULLET_VALUE = 0;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 1;

	/**
	 * The '<em><b>Ordinal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ordinal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDINAL
	 * @model name="ordinal"
	 * @generated
	 * @ordered
	 */
	public static final int ORDINAL_VALUE = 2;

	/**
	 * The '<em><b>Upper Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper Roman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_ROMAN
	 * @model name="upperRoman"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_ROMAN_VALUE = 3;

	/**
	 * The '<em><b>Lower Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Roman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_ROMAN
	 * @model name="lowerRoman"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_ROMAN_VALUE = 4;

	/**
	 * The '<em><b>Upper Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upper Letter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_LETTER
	 * @model name="upperLetter"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_LETTER_VALUE = 5;

	/**
	 * The '<em><b>Lower Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lower Letter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_LETTER
	 * @model name="lowerLetter"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_LETTER_VALUE = 6;

	/**
	 * An array of all the '<em><b>DNumber Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DNumberFormat[] VALUES_ARRAY =
		new DNumberFormat[] {
			BULLET,
			DECIMAL,
			ORDINAL,
			UPPER_ROMAN,
			LOWER_ROMAN,
			UPPER_LETTER,
			LOWER_LETTER,
		};

	/**
	 * A public read-only list of all the '<em><b>DNumber Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DNumberFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DNumber Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DNumberFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DNumberFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DNumber Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DNumberFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DNumberFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DNumber Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DNumberFormat get(int value) {
		switch (value) {
			case BULLET_VALUE: return BULLET;
			case DECIMAL_VALUE: return DECIMAL;
			case ORDINAL_VALUE: return ORDINAL;
			case UPPER_ROMAN_VALUE: return UPPER_ROMAN;
			case LOWER_ROMAN_VALUE: return LOWER_ROMAN;
			case UPPER_LETTER_VALUE: return UPPER_LETTER;
			case LOWER_LETTER_VALUE: return LOWER_LETTER;
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
	private DNumberFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DNumberFormat
