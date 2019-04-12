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
 * A representation of the model object '<em><b>DFigure From File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DFigureFromFile#getReferenceFile <em>Reference File</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDFigureFromFile()
 * @model
 * @generated
 */
public interface DFigureFromFile extends DAbstractFigure {
	/**
	 * Returns the value of the '<em><b>Reference File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference File</em>' attribute.
	 * @see #setReferenceFile(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDFigureFromFile_ReferenceFile()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DFigureFromFile#getReferenceFile <em>Reference File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference File</em>' attribute.
	 * @see #getReferenceFile()
	 * @generated
	 */
	void setReferenceFile(String value);

} // DFigureFromFile
