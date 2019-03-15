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

import es.uah.aut.srg.micobs.doctpl.doc.DLevel;
import es.uah.aut.srg.micobs.doctpl.doc.DNum;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DParagraph Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DParagraphPropertiesImpl extends MinimalEObjectImpl.Container implements DParagraphProperties {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected DNum number;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected DLevel level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DParagraphPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DPARAGRAPH_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNum getNumber() {
		if (number != null && number.eIsProxy()) {
			InternalEObject oldNumber = (InternalEObject)number;
			number = (DNum)eResolveProxy(oldNumber);
			if (number != oldNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, docPackage.DPARAGRAPH_PROPERTIES__NUMBER, oldNumber, number));
			}
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNum basicGetNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(DNum newNumber) {
		DNum oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DPARAGRAPH_PROPERTIES__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLevel getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject)level;
			level = (DLevel)eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, docPackage.DPARAGRAPH_PROPERTIES__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLevel basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(DLevel newLevel) {
		DLevel oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DPARAGRAPH_PROPERTIES__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case docPackage.DPARAGRAPH_PROPERTIES__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case docPackage.DPARAGRAPH_PROPERTIES__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
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
			case docPackage.DPARAGRAPH_PROPERTIES__NUMBER:
				setNumber((DNum)newValue);
				return;
			case docPackage.DPARAGRAPH_PROPERTIES__LEVEL:
				setLevel((DLevel)newValue);
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
			case docPackage.DPARAGRAPH_PROPERTIES__NUMBER:
				setNumber((DNum)null);
				return;
			case docPackage.DPARAGRAPH_PROPERTIES__LEVEL:
				setLevel((DLevel)null);
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
			case docPackage.DPARAGRAPH_PROPERTIES__NUMBER:
				return number != null;
			case docPackage.DPARAGRAPH_PROPERTIES__LEVEL:
				return level != null;
		}
		return super.eIsSet(featureID);
	}

} //DParagraphPropertiesImpl
