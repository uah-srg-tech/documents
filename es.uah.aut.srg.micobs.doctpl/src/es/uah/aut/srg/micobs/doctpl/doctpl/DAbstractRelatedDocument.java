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
 * A representation of the model object '<em><b>DAbstract Related Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getTitle <em>Title</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument()
 * @model abstract="true"
 * @generated
 */
public interface DAbstractRelatedDocument extends DReferenceableObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Issue()
	 * @model
	 * @generated
	 */
	String getIssue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getIssue <em>Issue</em>}' attribute.
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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Revision()
	 * @model
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getRevision <em>Revision</em>}' attribute.
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
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDAbstractRelatedDocument_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // DAbstractRelatedDocument
