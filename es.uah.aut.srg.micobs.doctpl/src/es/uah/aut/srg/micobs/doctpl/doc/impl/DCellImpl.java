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

import es.uah.aut.srg.micobs.doctpl.doc.DCell;
import es.uah.aut.srg.micobs.doctpl.doc.DMergeType;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl#getGridSpan <em>Grid Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl#getVMerge <em>VMerge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCellImpl extends DBodyImpl implements DCell {
	/**
	 * The default value of the '{@link #getGridSpan() <em>Grid Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSpan()
	 * @generated
	 * @ordered
	 */
	protected static final String GRID_SPAN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGridSpan() <em>Grid Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSpan()
	 * @generated
	 * @ordered
	 */
	protected String gridSpan = GRID_SPAN_EDEFAULT;
	/**
	 * The default value of the '{@link #getVMerge() <em>VMerge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMerge()
	 * @generated
	 * @ordered
	 */
	protected static final DMergeType VMERGE_EDEFAULT = DMergeType.RESTART;
	/**
	 * The cached value of the '{@link #getVMerge() <em>VMerge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMerge()
	 * @generated
	 * @ordered
	 */
	protected DMergeType vMerge = VMERGE_EDEFAULT;
	/**
	 * This is true if the VMerge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vMergeESet;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DCELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGridSpan() {
		return gridSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSpan(String newGridSpan) {
		String oldGridSpan = gridSpan;
		gridSpan = newGridSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DCELL__GRID_SPAN, oldGridSpan, gridSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMergeType getVMerge() {
		return vMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVMerge(DMergeType newVMerge) {
		DMergeType oldVMerge = vMerge;
		vMerge = newVMerge == null ? VMERGE_EDEFAULT : newVMerge;
		boolean oldVMergeESet = vMergeESet;
		vMergeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DCELL__VMERGE, oldVMerge, vMerge, !oldVMergeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVMerge() {
		DMergeType oldVMerge = vMerge;
		boolean oldVMergeESet = vMergeESet;
		vMerge = VMERGE_EDEFAULT;
		vMergeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, docPackage.DCELL__VMERGE, oldVMerge, VMERGE_EDEFAULT, oldVMergeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVMerge() {
		return vMergeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case docPackage.DCELL__GRID_SPAN:
				return getGridSpan();
			case docPackage.DCELL__VMERGE:
				return getVMerge();
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
			case docPackage.DCELL__GRID_SPAN:
				setGridSpan((String)newValue);
				return;
			case docPackage.DCELL__VMERGE:
				setVMerge((DMergeType)newValue);
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
			case docPackage.DCELL__GRID_SPAN:
				setGridSpan(GRID_SPAN_EDEFAULT);
				return;
			case docPackage.DCELL__VMERGE:
				unsetVMerge();
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
			case docPackage.DCELL__GRID_SPAN:
				return GRID_SPAN_EDEFAULT == null ? gridSpan != null : !GRID_SPAN_EDEFAULT.equals(gridSpan);
			case docPackage.DCELL__VMERGE:
				return isSetVMerge();
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
		result.append(" (gridSpan: ");
		result.append(gridSpan);
		result.append(", vMerge: ");
		if (vMergeESet) result.append(vMerge); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DCellImpl
