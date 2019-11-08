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

import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTab;
import es.uah.aut.srg.micobs.doctpl.doctpl.DText;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DRun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#isItalics <em>Italics</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#getColor <em>Color</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#getTab <em>Tab</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DRunImpl extends DParagraphContentImpl implements DRun {
	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalics() <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalics() <em>Italics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalics()
	 * @generated
	 * @ordered
	 */
	protected boolean italics = ITALICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTab() <em>Tab</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTab()
	 * @generated
	 * @ordered
	 */
	protected DTab tab;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected DText text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DRUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTab getTab() {
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTab(DTab newTab, NotificationChain msgs) {
		DTab oldTab = tab;
		tab = newTab;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__TAB, oldTab, newTab);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTab(DTab newTab) {
		if (newTab != tab) {
			NotificationChain msgs = null;
			if (tab != null)
				msgs = ((InternalEObject)tab).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DRUN__TAB, null, msgs);
			if (newTab != null)
				msgs = ((InternalEObject)newTab).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DRUN__TAB, null, msgs);
			msgs = basicSetTab(newTab, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__TAB, newTab, newTab));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DText getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(DText newText, NotificationChain msgs) {
		DText oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(DText newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DRUN__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DRUN__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalics() {
		return italics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalics(boolean newItalics) {
		boolean oldItalics = italics;
		italics = newItalics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__ITALICS, oldItalics, italics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__UNDERLINE, oldUnderline, underline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DRUN__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case doctplPackage.DRUN__TAB:
				return basicSetTab(null, msgs);
			case doctplPackage.DRUN__TEXT:
				return basicSetText(null, msgs);
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
			case doctplPackage.DRUN__BOLD:
				return isBold();
			case doctplPackage.DRUN__ITALICS:
				return isItalics();
			case doctplPackage.DRUN__UNDERLINE:
				return isUnderline();
			case doctplPackage.DRUN__COLOR:
				return getColor();
			case doctplPackage.DRUN__TAB:
				return getTab();
			case doctplPackage.DRUN__TEXT:
				return getText();
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
			case doctplPackage.DRUN__BOLD:
				setBold((Boolean)newValue);
				return;
			case doctplPackage.DRUN__ITALICS:
				setItalics((Boolean)newValue);
				return;
			case doctplPackage.DRUN__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case doctplPackage.DRUN__COLOR:
				setColor((String)newValue);
				return;
			case doctplPackage.DRUN__TAB:
				setTab((DTab)newValue);
				return;
			case doctplPackage.DRUN__TEXT:
				setText((DText)newValue);
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
			case doctplPackage.DRUN__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case doctplPackage.DRUN__ITALICS:
				setItalics(ITALICS_EDEFAULT);
				return;
			case doctplPackage.DRUN__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case doctplPackage.DRUN__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case doctplPackage.DRUN__TAB:
				setTab((DTab)null);
				return;
			case doctplPackage.DRUN__TEXT:
				setText((DText)null);
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
			case doctplPackage.DRUN__BOLD:
				return bold != BOLD_EDEFAULT;
			case doctplPackage.DRUN__ITALICS:
				return italics != ITALICS_EDEFAULT;
			case doctplPackage.DRUN__UNDERLINE:
				return underline != UNDERLINE_EDEFAULT;
			case doctplPackage.DRUN__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case doctplPackage.DRUN__TAB:
				return tab != null;
			case doctplPackage.DRUN__TEXT:
				return text != null;
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
		result.append(" (bold: ");
		result.append(bold);
		result.append(", italics: ");
		result.append(italics);
		result.append(", underline: ");
		result.append(underline);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //DRunImpl
