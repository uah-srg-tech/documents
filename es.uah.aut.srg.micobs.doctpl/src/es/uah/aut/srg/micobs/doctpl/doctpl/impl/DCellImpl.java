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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl#getShadow <em>Shadow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCellImpl extends DBodyImpl implements DCell {
	/**
	 * The default value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected static final String COL_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected String colSpan = COL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected String rowSpan = ROW_SPAN_EDEFAULT;

	/**
	 * This is true if the Row Span attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowSpanESet;

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
	public String getColSpan() {
		return colSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColSpan(String newColSpan) {
		String oldColSpan = colSpan;
		colSpan = newColSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__COL_SPAN, oldColSpan, colSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowSpan() {
		return rowSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowSpan(String newRowSpan) {
		String oldRowSpan = rowSpan;
		rowSpan = newRowSpan;
		boolean oldRowSpanESet = rowSpanESet;
		rowSpanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DCELL__ROW_SPAN, oldRowSpan, rowSpan, !oldRowSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRowSpan() {
		String oldRowSpan = rowSpan;
		boolean oldRowSpanESet = rowSpanESet;
		rowSpan = ROW_SPAN_EDEFAULT;
		rowSpanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, doctplPackage.DCELL__ROW_SPAN, oldRowSpan, ROW_SPAN_EDEFAULT, oldRowSpanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRowSpan() {
		return rowSpanESet;
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
			case doctplPackage.DCELL__COL_SPAN:
				return getColSpan();
			case doctplPackage.DCELL__ROW_SPAN:
				return getRowSpan();
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
			case doctplPackage.DCELL__COL_SPAN:
				setColSpan((String)newValue);
				return;
			case doctplPackage.DCELL__ROW_SPAN:
				setRowSpan((String)newValue);
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
			case doctplPackage.DCELL__COL_SPAN:
				setColSpan(COL_SPAN_EDEFAULT);
				return;
			case doctplPackage.DCELL__ROW_SPAN:
				unsetRowSpan();
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
			case doctplPackage.DCELL__COL_SPAN:
				return COL_SPAN_EDEFAULT == null ? colSpan != null : !COL_SPAN_EDEFAULT.equals(colSpan);
			case doctplPackage.DCELL__ROW_SPAN:
				return isSetRowSpan();
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
		result.append(" (colSpan: ");
		result.append(colSpan);
		result.append(", rowSpan: ");
		if (rowSpanESet) result.append(rowSpan); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", shadow: ");
		result.append(shadow);
		result.append(')');
		return result.toString();
	}

} //DCellImpl
