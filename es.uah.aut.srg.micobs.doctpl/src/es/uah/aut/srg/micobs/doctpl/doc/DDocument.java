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
 * A representation of the model object '<em><b>DDocument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDDocument()
 * @model abstract="true"
 * @generated
 */
public interface DDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Applicable Documents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDDocument_ApplicableDocuments()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DApplicableDocument> getApplicableDocuments();

	/**
	 * Returns the value of the '<em><b>Reference Documents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDDocument_ReferenceDocuments()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DApplicableDocument> getReferenceDocuments();

	/**
	 * Returns the value of the '<em><b>Figures</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDDocument_Figures()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DAbstractFigure> getFigures();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDDocument_Tables()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DAbstractTable> getTables();

} // DDocument
