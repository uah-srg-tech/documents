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

import es.uah.aut.srg.micobs.doctpl.doctpl.DCell;
import es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getGridSpan <em>Grid Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getVMerge <em>VMerge</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getShadow <em>Shadow</em>}</li>
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadow() <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadow()
	 * @generated
	 * @ordered
	 */
	protected String shadow = SHADOW_EDEFAULT;

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
		return doctplPackage.Literals.DCELL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__GRID_SPAN, oldGridSpan, gridSpan));
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
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__VMERGE, oldVMerge, vMerge, !oldVMergeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, doctplPackage.DCELL__VMERGE, oldVMerge, VMERGE_EDEFAULT, oldVMergeESet));
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
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadow() {
		return shadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadow(String newShadow) {
		String oldShadow = shadow;
		shadow = newShadow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__SHADOW, oldShadow, shadow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case doctplPackage.DCELL__GRID_SPAN:
				return getGridSpan();
			case doctplPackage.DCELL__VMERGE:
				return getVMerge();
			case doctplPackage.DCELL__WIDTH:
				return getWidth();
			case doctplPackage.DCELL__SHADOW:
				return getShadow();
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
			case doctplPackage.DCELL__GRID_SPAN:
				setGridSpan((String)newValue);
				return;
			case doctplPackage.DCELL__VMERGE:
				setVMerge((DMergeType)newValue);
				return;
			case doctplPackage.DCELL__WIDTH:
				setWidth((String)newValue);
				return;
			case doctplPackage.DCELL__SHADOW:
				setShadow((String)newValue);
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
			case doctplPackage.DCELL__GRID_SPAN:
				setGridSpan(GRID_SPAN_EDEFAULT);
				return;
			case doctplPackage.DCELL__VMERGE:
				unsetVMerge();
				return;
			case doctplPackage.DCELL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case doctplPackage.DCELL__SHADOW:
				setShadow(SHADOW_EDEFAULT);
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
			case doctplPackage.DCELL__GRID_SPAN:
				return GRID_SPAN_EDEFAULT == null ? gridSpan != null : !GRID_SPAN_EDEFAULT.equals(gridSpan);
			case doctplPackage.DCELL__VMERGE:
				return isSetVMerge();
			case doctplPackage.DCELL__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case doctplPackage.DCELL__SHADOW:
				return SHADOW_EDEFAULT == null ? shadow != null : !SHADOW_EDEFAULT.equals(shadow);
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
		result.append(", width: ");
		result.append(width);
		result.append(", shadow: ");
		result.append(shadow);
		result.append(')');
		return result.toString();
	}

} //DCellImpl
