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
 * A representation of the model object '<em><b>DCell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DCell#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDCell()
 * @model
 * @generated
 */
public interface DCell extends DBody {

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDCell_Span()
	 * @model required="true"
	 * @generated
	 */
	String getSpan();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DCell#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(String value);
} // DCell
