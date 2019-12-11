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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DList Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getSublist <em>Sublist</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDListItem()
 * @model
 * @generated
 */
public interface DListItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' containment reference.
	 * @see #setParagraph(DParagraph)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDListItem_Paragraph()
	 * @model containment="true"
	 * @generated
	 */
	DParagraph getParagraph();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getParagraph <em>Paragraph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' containment reference.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(DParagraph value);

	/**
	 * Returns the value of the '<em><b>Sublist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sublist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublist</em>' containment reference.
	 * @see #setSublist(DListContent)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDListItem_Sublist()
	 * @model containment="true"
	 * @generated
	 */
	DListContent getSublist();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getSublist <em>Sublist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sublist</em>' containment reference.
	 * @see #getSublist()
	 * @generated
	 */
	void setSublist(DListContent value);
	
} // DListItem
