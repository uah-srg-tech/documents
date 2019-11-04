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

import es.uah.aut.srg.micobs.doctpl.doctpl.DListContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DListItem;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DList Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl#getSublist <em>Sublist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DListItemImpl extends MinimalEObjectImpl.Container implements DListItem {
	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected EList<DParagraph> paragraph;

	/**
	 * The cached value of the '{@link #getSublist() <em>Sublist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSublist()
	 * @generated
	 * @ordered
	 */
	protected DListContent sublist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DLIST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DParagraph> getParagraph() {
		if (paragraph == null) {
			paragraph = new EObjectContainmentEList<DParagraph>(DParagraph.class, this, doctplPackage.DLIST_ITEM__PARAGRAPH);
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DListContent getSublist() {
		return sublist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSublist(DListContent newSublist, NotificationChain msgs) {
		DListContent oldSublist = sublist;
		sublist = newSublist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, doctplPackage.DLIST_ITEM__SUBLIST, oldSublist, newSublist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSublist(DListContent newSublist) {
		if (newSublist != sublist) {
			NotificationChain msgs = null;
			if (sublist != null)
				msgs = ((InternalEObject)sublist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DLIST_ITEM__SUBLIST, null, msgs);
			if (newSublist != null)
				msgs = ((InternalEObject)newSublist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - doctplPackage.DLIST_ITEM__SUBLIST, null, msgs);
			msgs = basicSetSublist(newSublist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, doctplPackage.DLIST_ITEM__SUBLIST, newSublist, newSublist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case doctplPackage.DLIST_ITEM__PARAGRAPH:
				return ((InternalEList<?>)getParagraph()).basicRemove(otherEnd, msgs);
			case doctplPackage.DLIST_ITEM__SUBLIST:
				return basicSetSublist(null, msgs);
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
			case doctplPackage.DLIST_ITEM__PARAGRAPH:
				return getParagraph();
			case doctplPackage.DLIST_ITEM__SUBLIST:
				return getSublist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case doctplPackage.DLIST_ITEM__PARAGRAPH:
				getParagraph().clear();
				getParagraph().addAll((Collection<? extends DParagraph>)newValue);
				return;
			case doctplPackage.DLIST_ITEM__SUBLIST:
				setSublist((DListContent)newValue);
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
			case doctplPackage.DLIST_ITEM__PARAGRAPH:
				getParagraph().clear();
				return;
			case doctplPackage.DLIST_ITEM__SUBLIST:
				setSublist((DListContent)null);
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
			case doctplPackage.DLIST_ITEM__PARAGRAPH:
				return paragraph != null && !paragraph.isEmpty();
			case doctplPackage.DLIST_ITEM__SUBLIST:
				return sublist != null;
		}
		return super.eIsSet(featureID);
	}

} //DListItemImpl
