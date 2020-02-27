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

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractPlaceholder;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBD;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTBD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTBDImpl#getParentTBD <em>Parent TBD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTBDImpl extends DAbstractPlaceholderImpl implements DTBD {
	/**
	 * The cached value of the '{@link #getParentTBD() <em>Parent TBD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTBD()
	 * @generated
	 * @ordered
	 */
	protected DAbstractPlaceholder parentTBD;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTBDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DTBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractPlaceholder getParentTBD() {
		if (parentTBD != null && parentTBD.eIsProxy()) {
			InternalEObject oldParentTBD = (InternalEObject)parentTBD;
			parentTBD = (DAbstractPlaceholder)eResolveProxy(oldParentTBD);
			if (parentTBD != oldParentTBD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, doctplPackage.DTBD__PARENT_TBD, oldParentTBD, parentTBD));
			}
		}
		return parentTBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractPlaceholder basicGetParentTBD() {
		return parentTBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTBD(DAbstractPlaceholder newParentTBD) {
		DAbstractPlaceholder oldParentTBD = parentTBD;
		parentTBD = newParentTBD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DTBD__PARENT_TBD, oldParentTBD, parentTBD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case doctplPackage.DTBD__PARENT_TBD:
				if (resolve) return getParentTBD();
				return basicGetParentTBD();
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
			case doctplPackage.DTBD__PARENT_TBD:
				setParentTBD((DAbstractPlaceholder)newValue);
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
			case doctplPackage.DTBD__PARENT_TBD:
				setParentTBD((DAbstractPlaceholder)null);
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
			case doctplPackage.DTBD__PARENT_TBD:
				return parentTBD != null;
		}
		return super.eIsSet(featureID);
	}

} //DTBDImpl
