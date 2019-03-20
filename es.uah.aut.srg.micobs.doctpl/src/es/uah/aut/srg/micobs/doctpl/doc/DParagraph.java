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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DParagraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getProperties <em>Properties</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getPContent <em>PContent</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraph()
 * @model
 * @generated
 */
public interface DParagraph extends DBodyContent {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(DParagraphProperties)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraph_Properties()
	 * @model containment="true"
	 * @generated
	 */
	DParagraphProperties getProperties();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(DParagraphProperties value);

	/**
	 * Returns the value of the '<em><b>PContent</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PContent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PContent</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDParagraph_PContent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DParagraphContent> getPContent();

} // DParagraph
