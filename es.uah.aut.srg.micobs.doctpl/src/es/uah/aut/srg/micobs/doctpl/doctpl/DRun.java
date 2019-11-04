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
 * A representation of the model object '<em><b>DRun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getText <em>Text</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isBold <em>Bold</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isItalics <em>Italics</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isUnderline <em>Underline</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun()
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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DText getText();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DText value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Bold()
	 * @model
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italics</em>' attribute.
	 * @see #setItalics(boolean)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Italics()
	 * @model
	 * @generated
	 */
	boolean isItalics();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isItalics <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italics</em>' attribute.
	 * @see #isItalics()
	 * @generated
	 */
	void setItalics(boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Underline()
	 * @model
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

} // DRun