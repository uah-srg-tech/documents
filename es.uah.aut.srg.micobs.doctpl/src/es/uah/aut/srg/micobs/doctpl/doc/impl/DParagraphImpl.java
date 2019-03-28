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

import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraphContent;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DParagraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl#getParagraphContent <em>Paragraph Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DParagraphImpl extends DBodyContentImpl implements DParagraph {
	/**
	 * The cached value of the '{@link #getParagraphContent() <em>Paragraph Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DParagraphContent> paragraphContent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DPARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DParagraphContent> getParagraphContent() {
		if (paragraphContent == null) {
			paragraphContent = new EObjectContainmentEList<DParagraphContent>(DParagraphContent.class, this, docPackage.DPARAGRAPH__PARAGRAPH_CONTENT);
		}
		return paragraphContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case docPackage.DPARAGRAPH__PARAGRAPH_CONTENT:
				return ((InternalEList<?>)getParagraphContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case docPackage.DPARAGRAPH__PARAGRAPH_CONTENT:
				return getParagraphContent();
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
			case docPackage.DPARAGRAPH__PARAGRAPH_CONTENT:
				getParagraphContent().clear();
				getParagraphContent().addAll((Collection<? extends DParagraphContent>)newValue);
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
			case docPackage.DPARAGRAPH__PARAGRAPH_CONTENT:
				getParagraphContent().clear();
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
			case docPackage.DPARAGRAPH__PARAGRAPH_CONTENT:
				return paragraphContent != null && !paragraphContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DParagraphImpl
