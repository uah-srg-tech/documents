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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getBold <em>Bold</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getItalics <em>Italics</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getUnderline <em>Underline</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getColor <em>Color</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getTab <em>Tab</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun()
 * @model
 * @generated
 */
public interface DRun extends DParagraphContent {
	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #setBold(DRunAttributes)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Bold()
	 * @model
	 * @generated
	 */
	DRunAttributes getBold();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #getBold()
	 * @generated
	 */
	void setBold(DRunAttributes value);

	/**
	 * Returns the value of the '<em><b>Italics</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italics</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #setItalics(DRunAttributes)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Italics()
	 * @model
	 * @generated
	 */
	DRunAttributes getItalics();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getItalics <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italics</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #getItalics()
	 * @generated
	 */
	void setItalics(DRunAttributes value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #setUnderline(DRunAttributes)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Underline()
	 * @model
	 * @generated
	 */
	DRunAttributes getUnderline();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes
	 * @see #getUnderline()
	 * @generated
	 */
	void setUnderline(DRunAttributes value);

	/**
	 * Returns the value of the '<em><b>Tab</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab</em>' containment reference.
	 * @see #setTab(DTab)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Tab()
	 * @model containment="true"
	 * @generated
	 */
	DTab getTab();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getTab <em>Tab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab</em>' containment reference.
	 * @see #getTab()
	 * @generated
	 */
	void setTab(DTab value);

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
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDRun_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // DRun
