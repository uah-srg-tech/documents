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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DRun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getText <em>Text</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun()
 * @model
 * @generated
 */
public interface DRun extends DParagraphContent {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(DText)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DText getText();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DText value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormat
	 * @see #setFormat(DRunFormat)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun_Format()
	 * @model
	 * @generated
	 */
	DRunFormat getFormat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(DRunFormat value);

} // DRun
