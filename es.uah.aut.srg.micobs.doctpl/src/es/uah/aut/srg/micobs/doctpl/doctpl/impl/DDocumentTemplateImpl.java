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
package es.uah.aut.srg.micobs.doctpl.doctpl.impl;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDocument Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getTbcs <em>Tbcs</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getTbds <em>Tbds</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DDocumentTemplateImpl extends MinimalEObjectImpl.Container implements DDocumentTemplate {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDocumentTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DDOCUMENT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DDOCUMENT_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DDOCUMENT_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DDOCUMENT_TEMPLATE__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DDOCUMENT_TEMPLATE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DDOCUMENT_TEMPLATE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTBC> getTbcs() {
		// TODO: implement this method to return the 'Tbcs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTBD> getTbds() {
		// TODO: implement this method to return the 'Tbds' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DApplicableDocument> getApplicableDocuments() {
		// TODO: implement this method to return the 'Applicable Documents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DReferenceDocument> getReferenceDocuments() {
		// TODO: implement this method to return the 'Reference Documents' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractFigure> getFigures() {
		// TODO: implement this method to return the 'Figures' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractTable> getTables() {
		// TODO: implement this method to return the 'Tables' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractSection> getSections() {
		// TODO: implement this method to return the 'Sections' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DParagraph> getParagraphs() {
		// TODO: implement this method to return the 'Paragraphs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case doctplPackage.DDOCUMENT_TEMPLATE__NAME:
				return getName();
			case doctplPackage.DDOCUMENT_TEMPLATE__ID:
				return getId();
			case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE:
				return getIssue();
			case doctplPackage.DDOCUMENT_TEMPLATE__REVISION:
				return getRevision();
			case doctplPackage.DDOCUMENT_TEMPLATE__DATE:
				return getDate();
			case doctplPackage.DDOCUMENT_TEMPLATE__TBCS:
				return getTbcs();
			case doctplPackage.DDOCUMENT_TEMPLATE__TBDS:
				return getTbds();
			case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES:
				return getFigures();
			case doctplPackage.DDOCUMENT_TEMPLATE__TABLES:
				return getTables();
			case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				return getSections();
			case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS:
				return getParagraphs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case doctplPackage.DDOCUMENT_TEMPLATE__NAME:
				setName((String)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE:
				setIssue((String)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__REVISION:
				setRevision((String)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__DATE:
				setDate((String)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TBCS:
				getTbcs().clear();
				getTbcs().addAll((Collection<? extends DTBC>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TBDS:
				getTbds().clear();
				getTbds().addAll((Collection<? extends DTBD>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DReferenceDocument>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends DAbstractTable>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DAbstractSection>)newValue);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends DParagraph>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case doctplPackage.DDOCUMENT_TEMPLATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TBCS:
				getTbcs().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TBDS:
				getTbds().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES:
				getFigures().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__TABLES:
				getTables().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				getSections().clear();
				return;
			case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS:
				getParagraphs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case doctplPackage.DDOCUMENT_TEMPLATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case doctplPackage.DDOCUMENT_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case doctplPackage.DDOCUMENT_TEMPLATE__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case doctplPackage.DDOCUMENT_TEMPLATE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case doctplPackage.DDOCUMENT_TEMPLATE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case doctplPackage.DDOCUMENT_TEMPLATE__TBCS:
				return !getTbcs().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__TBDS:
				return !getTbds().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				return !getApplicableDocuments().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				return !getReferenceDocuments().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__FIGURES:
				return !getFigures().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__TABLES:
				return !getTables().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				return !getSections().isEmpty();
			case doctplPackage.DDOCUMENT_TEMPLATE__PARAGRAPHS:
				return !getParagraphs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", issue: ");
		result.append(issue);
		result.append(", revision: ");
		result.append(revision);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //DDocumentTemplateImpl
