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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDocument Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getTbds <em>Tbds</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate()
 * @model abstract="true"
 * @generated
 */
public interface DDocumentTemplate extends EObject {
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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Issue()
	 * @model required="true"
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Revision()
	 * @model required="true"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Tbcs</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbcs</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Tbcs()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DTBC> getTbcs();

	/**
	 * Returns the value of the '<em><b>Tbds</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DTBD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbds</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Tbds()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DTBD> getTbds();

	/**
	 * Returns the value of the '<em><b>Applicable Documents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Documents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_ApplicableDocuments()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DApplicableDocument> getApplicableDocuments();

	/**
	 * Returns the value of the '<em><b>Reference Documents</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Documents</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_ReferenceDocuments()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DReferenceDocument> getReferenceDocuments();

	/**
	 * Returns the value of the '<em><b>Figures</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Figures()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DAbstractFigure> getFigures();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Tables()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DAbstractTable> getTables();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Sections()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DAbstractSection> getSections();

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' reference list.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDDocumentTemplate_Paragraphs()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DParagraph> getParagraphs();

} // DDocumentTemplate
