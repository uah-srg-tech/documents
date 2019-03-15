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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DParagraph Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getNumber <em>Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraphProperties()
 * @model
 * @generated
 */
public interface DParagraphProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' reference.
	 * @see #setNumber(DNum)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraphProperties_Number()
	 * @model required="true"
	 * @generated
	 */
	DNum getNumber();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getNumber <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(DNum value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(DLevel)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraphProperties_Level()
	 * @model required="true"
	 * @generated
	 */
	DLevel getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(DLevel value);

} // DParagraphProperties
