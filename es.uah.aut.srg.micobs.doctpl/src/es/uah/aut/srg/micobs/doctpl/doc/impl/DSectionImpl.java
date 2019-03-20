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

import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DSection;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DSectionImpl#getOutlineLvl <em>Outline Lvl</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DSectionImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSectionImpl extends DParagraphImpl implements DSection {
	/**
	 * The default value of the '{@link #getOutlineLvl() <em>Outline Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLvl()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLINE_LVL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineLvl() <em>Outline Lvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLvl()
	 * @generated
	 * @ordered
	 */
	protected String outlineLvl = OUTLINE_LVL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DSECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutlineLvl() {
		return outlineLvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLvl(String newOutlineLvl) {
		String oldOutlineLvl = outlineLvl;
		outlineLvl = newOutlineLvl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DSECTION__OUTLINE_LVL, oldOutlineLvl, outlineLvl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDocumentTemplate getDocument() {
		DDocumentTemplate document = basicGetDocument();
		return document != null && document.eIsProxy() ? (DDocumentTemplate)eResolveProxy((InternalEObject)document) : document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDocumentTemplate basicGetDocument() {
		// TODO: implement this method to return the 'Document' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DDocumentTemplate newDocument) {
		// TODO: implement this method to set the 'Document' reference
		// Ensure that you remove @generated or mark it @generated NOT
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
			case docPackage.DSECTION__OUTLINE_LVL:
				return getOutlineLvl();
			case docPackage.DSECTION__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case docPackage.DSECTION__OUTLINE_LVL:
				setOutlineLvl((String)newValue);
				return;
			case docPackage.DSECTION__DOCUMENT:
				setDocument((DDocumentTemplate)newValue);
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
			case docPackage.DSECTION__OUTLINE_LVL:
				setOutlineLvl(OUTLINE_LVL_EDEFAULT);
				return;
			case docPackage.DSECTION__DOCUMENT:
				setDocument((DDocumentTemplate)null);
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
			case docPackage.DSECTION__OUTLINE_LVL:
				return OUTLINE_LVL_EDEFAULT == null ? outlineLvl != null : !OUTLINE_LVL_EDEFAULT.equals(outlineLvl);
			case docPackage.DSECTION__DOCUMENT:
				return basicGetDocument() != null;
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
		result.append(" (outlineLvl: ");
		result.append(outlineLvl);
		result.append(')');
		return result.toString();
	}

} //DSectionImpl
