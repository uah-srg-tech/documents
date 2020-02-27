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
package es.uah.aut.srg.micobs.doctpl.doctpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBC#getParentTBC <em>Parent TBC</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDTBC()
 * @model
 * @generated
 */
public interface DTBC extends DAbstractPlaceholder {

	/**
	 * Returns the value of the '<em><b>Parent TBC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent TBC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent TBC</em>' reference.
	 * @see #setParentTBC(DAbstractPlaceholder)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDTBC_ParentTBC()
	 * @model
	 * @generated
	 */
	DAbstractPlaceholder getParentTBC();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBC#getParentTBC <em>Parent TBC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent TBC</em>' reference.
	 * @see #getParentTBC()
	 * @generated
	 */
	void setParentTBC(DAbstractPlaceholder value);
} // DTBC
