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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getBold <em>Bold</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getItalic <em>Italic</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getUnderscore <em>Underscore</em>}</li>
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
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #setBold(DRunFormatEnableDisable)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun_Bold()
	 * @model required="true"
	 * @generated
	 */
	DRunFormatEnableDisable getBold();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #getBold()
	 * @generated
	 */
	void setBold(DRunFormatEnableDisable value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #setItalic(DRunFormatEnableDisable)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun_Italic()
	 * @model required="true"
	 * @generated
	 */
	DRunFormatEnableDisable getItalic();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #getItalic()
	 * @generated
	 */
	void setItalic(DRunFormatEnableDisable value);

	/**
	 * Returns the value of the '<em><b>Underscore</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underscore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underscore</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #setUnderscore(DRunFormatEnableDisable)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRun_Underscore()
	 * @model required="true"
	 * @generated
	 */
	DRunFormatEnableDisable getUnderscore();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getUnderscore <em>Underscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underscore</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see #getUnderscore()
	 * @generated
	 */
	void setUnderscore(DRunFormatEnableDisable value);

} // DRun
