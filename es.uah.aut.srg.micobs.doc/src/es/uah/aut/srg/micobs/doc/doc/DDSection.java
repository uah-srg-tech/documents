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
package es.uah.aut.srg.micobs.doc.doc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DD Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doc.doc.DDSection#getSectionContent <em>Section Content</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doc.doc.DDSection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doc.doc.docPackage#getDDSection()
 * @model
 * @generated
 */
public interface DDSection extends DDSectionContent {
	/**
	 * Returns the value of the '<em><b>Section Content</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doc.doc.DDSectionContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Content</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.doc.doc.docPackage#getDDSection_SectionContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DDSectionContent> getSectionContent();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.doc.doc.docPackage#getDDSection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doc.doc.DDSection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DDSection
