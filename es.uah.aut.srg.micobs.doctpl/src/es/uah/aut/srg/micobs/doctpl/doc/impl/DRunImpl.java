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

import es.uah.aut.srg.micobs.doctpl.doc.DRun;
import es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable;
import es.uah.aut.srg.micobs.doctpl.doc.DText;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl#getText <em>Text</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl#getUnderscore <em>Underscore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DRunImpl extends DParagraphContentImpl implements DRun {
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
	 * The default value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected static final DRunFormatEnableDisable BOLD_EDEFAULT = DRunFormatEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected DRunFormatEnableDisable bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected static final DRunFormatEnableDisable ITALIC_EDEFAULT = DRunFormatEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected DRunFormatEnableDisable italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnderscore() <em>Underscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderscore()
	 * @generated
	 * @ordered
	 */
	protected static final DRunFormatEnableDisable UNDERSCORE_EDEFAULT = DRunFormatEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getUnderscore() <em>Underscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderscore()
	 * @generated
	 * @ordered
	 */
	protected DRunFormatEnableDisable underscore = UNDERSCORE_EDEFAULT;

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
		return docPackage.Literals.DRUN;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, docPackage.DRUN__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - docPackage.DRUN__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - docPackage.DRUN__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DRUN__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRunFormatEnableDisable getBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(DRunFormatEnableDisable newBold) {
		DRunFormatEnableDisable oldBold = bold;
		bold = newBold == null ? BOLD_EDEFAULT : newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DRUN__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRunFormatEnableDisable getItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(DRunFormatEnableDisable newItalic) {
		DRunFormatEnableDisable oldItalic = italic;
		italic = newItalic == null ? ITALIC_EDEFAULT : newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DRUN__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRunFormatEnableDisable getUnderscore() {
		return underscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderscore(DRunFormatEnableDisable newUnderscore) {
		DRunFormatEnableDisable oldUnderscore = underscore;
		underscore = newUnderscore == null ? UNDERSCORE_EDEFAULT : newUnderscore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, docPackage.DRUN__UNDERSCORE, oldUnderscore, underscore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case docPackage.DRUN__TEXT:
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
			case docPackage.DRUN__TEXT:
				return getText();
			case docPackage.DRUN__BOLD:
				return getBold();
			case docPackage.DRUN__ITALIC:
				return getItalic();
			case docPackage.DRUN__UNDERSCORE:
				return getUnderscore();
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
			case docPackage.DRUN__TEXT:
				setText((DText)newValue);
				return;
			case docPackage.DRUN__BOLD:
				setBold((DRunFormatEnableDisable)newValue);
				return;
			case docPackage.DRUN__ITALIC:
				setItalic((DRunFormatEnableDisable)newValue);
				return;
			case docPackage.DRUN__UNDERSCORE:
				setUnderscore((DRunFormatEnableDisable)newValue);
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
			case docPackage.DRUN__TEXT:
				setText((DText)null);
				return;
			case docPackage.DRUN__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case docPackage.DRUN__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case docPackage.DRUN__UNDERSCORE:
				setUnderscore(UNDERSCORE_EDEFAULT);
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
			case docPackage.DRUN__TEXT:
				return text != null;
			case docPackage.DRUN__BOLD:
				return bold != BOLD_EDEFAULT;
			case docPackage.DRUN__ITALIC:
				return italic != ITALIC_EDEFAULT;
			case docPackage.DRUN__UNDERSCORE:
				return underscore != UNDERSCORE_EDEFAULT;
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
		result.append(", italic: ");
		result.append(italic);
		result.append(", underscore: ");
		result.append(underscore);
		result.append(')');
		return result.toString();
	}

} //DRunImpl
