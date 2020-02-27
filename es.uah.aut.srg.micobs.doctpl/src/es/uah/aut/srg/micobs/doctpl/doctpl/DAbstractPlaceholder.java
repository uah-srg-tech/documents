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
 * A representation of the model object '<em><b>DAbstract Placeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractPlaceholder#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractPlaceholder()
 * @model abstract="true"
 * @generated
 */
public interface DAbstractPlaceholder extends DReferenceableObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractPlaceholder_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractPlaceholder#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DAbstractPlaceholder
