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
package es.uah.aut.srg.micobs.doctpl.doc.impl;

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDocument Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl#getApplicableDocuments <em>Applicable Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl#getReferenceDocuments <em>Reference Documents</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DDocumentTemplateImpl extends MinimalEObjectImpl.Container implements DDocumentTemplate {
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
		return docPackage.Literals.DDOCUMENT_TEMPLATE;
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
	public EList<DApplicableDocument> getReferenceDocuments() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				return getApplicableDocuments();
			case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				return getReferenceDocuments();
			case docPackage.DDOCUMENT_TEMPLATE__FIGURES:
				return getFigures();
			case docPackage.DDOCUMENT_TEMPLATE__TABLES:
				return getTables();
			case docPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				return getSections();
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
			case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				getApplicableDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				getReferenceDocuments().addAll((Collection<? extends DApplicableDocument>)newValue);
				return;
			case docPackage.DDOCUMENT_TEMPLATE__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends DAbstractFigure>)newValue);
				return;
			case docPackage.DDOCUMENT_TEMPLATE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends DAbstractTable>)newValue);
				return;
			case docPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DAbstractSection>)newValue);
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
			case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				getApplicableDocuments().clear();
				return;
			case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				getReferenceDocuments().clear();
				return;
			case docPackage.DDOCUMENT_TEMPLATE__FIGURES:
				getFigures().clear();
				return;
			case docPackage.DDOCUMENT_TEMPLATE__TABLES:
				getTables().clear();
				return;
			case docPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				getSections().clear();
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
			case docPackage.DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS:
				return !getApplicableDocuments().isEmpty();
			case docPackage.DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS:
				return !getReferenceDocuments().isEmpty();
			case docPackage.DDOCUMENT_TEMPLATE__FIGURES:
				return !getFigures().isEmpty();
			case docPackage.DDOCUMENT_TEMPLATE__TABLES:
				return !getTables().isEmpty();
			case docPackage.DDOCUMENT_TEMPLATE__SECTIONS:
				return !getSections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DDocumentTemplateImpl
