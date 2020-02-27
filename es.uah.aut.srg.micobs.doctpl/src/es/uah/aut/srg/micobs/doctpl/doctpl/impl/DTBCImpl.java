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
import es.uah.aut.srg.micobs.doctpl.doctpl.DTBC;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTBC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTBCImpl#getParentTBC <em>Parent TBC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTBCImpl extends DAbstractPlaceholderImpl implements DTBC {
	/**
	 * The cached value of the '{@link #getParentTBC() <em>Parent TBC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTBC()
	 * @generated
	 * @ordered
	 */
	protected DAbstractPlaceholder parentTBC;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTBCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DTBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractPlaceholder getParentTBC() {
		if (parentTBC != null && parentTBC.eIsProxy()) {
			InternalEObject oldParentTBC = (InternalEObject)parentTBC;
			parentTBC = (DAbstractPlaceholder)eResolveProxy(oldParentTBC);
			if (parentTBC != oldParentTBC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, doctplPackage.DTBC__PARENT_TBC, oldParentTBC, parentTBC));
			}
		}
		return parentTBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractPlaceholder basicGetParentTBC() {
		return parentTBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTBC(DAbstractPlaceholder newParentTBC) {
		DAbstractPlaceholder oldParentTBC = parentTBC;
		parentTBC = newParentTBC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DTBC__PARENT_TBC, oldParentTBC, parentTBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case doctplPackage.DTBC__PARENT_TBC:
				if (resolve) return getParentTBC();
				return basicGetParentTBC();
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
			case doctplPackage.DTBC__PARENT_TBC:
				setParentTBC((DAbstractPlaceholder)newValue);
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
			case doctplPackage.DTBC__PARENT_TBC:
				setParentTBC((DAbstractPlaceholder)null);
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
			case doctplPackage.DTBC__PARENT_TBC:
				return parentTBC != null;
		}
		return super.eIsSet(featureID);
	}

} //DTBCImpl
