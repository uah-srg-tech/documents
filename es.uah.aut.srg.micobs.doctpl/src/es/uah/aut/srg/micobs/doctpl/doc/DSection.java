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
 * A representation of the model object '<em><b>DSection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DSection#getOutlineLvl <em>Outline Lvl</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DSection#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDSection()
 * @model
 * @generated
 */
public interface DSection extends DParagraph {
	/**
	 * Returns the value of the '<em><b>Outline Lvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Lvl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Lvl</em>' attribute.
	 * @see #setOutlineLvl(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDSection_OutlineLvl()
	 * @model required="true"
	 * @generated
	 */
	String getOutlineLvl();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DSection#getOutlineLvl <em>Outline Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Lvl</em>' attribute.
	 * @see #getOutlineLvl()
	 * @generated
	 */
	void setOutlineLvl(String value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(DDocumentTemplate)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDSection_Document()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	DDocumentTemplate getDocument();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DSection#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(DDocumentTemplate value);

} // DSection
