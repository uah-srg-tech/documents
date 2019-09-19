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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DRow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRow()
 * @model
 * @generated
 */
public interface DRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DCell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDRow_Cells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DCell> getCells();

} // DRow
