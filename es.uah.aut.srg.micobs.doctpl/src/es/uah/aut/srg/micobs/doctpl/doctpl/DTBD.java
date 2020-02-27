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
 * A representation of the model object '<em><b>DTBD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBD#getParentTBD <em>Parent TBD</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDTBD()
 * @model
 * @generated
 */
public interface DTBD extends DAbstractPlaceholder {

	/**
	 * Returns the value of the '<em><b>Parent TBD</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent TBD</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent TBD</em>' reference.
	 * @see #setParentTBD(DAbstractPlaceholder)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDTBD_ParentTBD()
	 * @model
	 * @generated
	 */
	DAbstractPlaceholder getParentTBD();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBD#getParentTBD <em>Parent TBD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent TBD</em>' reference.
	 * @see #getParentTBD()
	 * @generated
	 */
	void setParentTBD(DAbstractPlaceholder value);
} // DTBD
