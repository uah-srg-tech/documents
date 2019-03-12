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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DDocument;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAbstract Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DAbstractTableImpl extends DReferenceableObjectImpl implements DAbstractTable {
	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAbstractTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DABSTRACT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DABSTRACT_TABLE__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDocument getDocument() {
		DDocument document = basicGetDocument();
		return document != null && document.eIsProxy() ? (DDocument)eResolveProxy((InternalEObject)document) : document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDocument basicGetDocument() {
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
	public void setDocument(DDocument newDocument) {
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
			case docPackage.DABSTRACT_TABLE__CAPTION:
				return getCaption();
			case docPackage.DABSTRACT_TABLE__DOCUMENT:
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
			case docPackage.DABSTRACT_TABLE__CAPTION:
				setCaption((String)newValue);
				return;
			case docPackage.DABSTRACT_TABLE__DOCUMENT:
				setDocument((DDocument)newValue);
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
			case docPackage.DABSTRACT_TABLE__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case docPackage.DABSTRACT_TABLE__DOCUMENT:
				setDocument((DDocument)null);
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
			case docPackage.DABSTRACT_TABLE__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case docPackage.DABSTRACT_TABLE__DOCUMENT:
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
		result.append(" (caption: ");
		result.append(caption);
		result.append(')');
		return result.toString();
	}

} //DAbstractTableImpl
