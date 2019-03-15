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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum;
import es.uah.aut.srg.micobs.doctpl.doc.DNum;
import es.uah.aut.srg.micobs.doctpl.doc.DNumbering;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNumbering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl#getAbstractNum <em>Abstract Num</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DNumberingImpl extends MinimalEObjectImpl.Container implements DNumbering {
	/**
	 * The cached value of the '{@link #getAbstractNum() <em>Abstract Num</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractNum()
	 * @generated
	 * @ordered
	 */
	protected EList<DAbstractNum> abstractNum;

	/**
	 * The cached value of the '{@link #getNum() <em>Num</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected EList<DNum> num;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNumberingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return docPackage.Literals.DNUMBERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAbstractNum> getAbstractNum() {
		if (abstractNum == null) {
			abstractNum = new EObjectContainmentEList<DAbstractNum>(DAbstractNum.class, this, docPackage.DNUMBERING__ABSTRACT_NUM);
		}
		return abstractNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNum> getNum() {
		if (num == null) {
			num = new EObjectContainmentEList<DNum>(DNum.class, this, docPackage.DNUMBERING__NUM);
		}
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case docPackage.DNUMBERING__ABSTRACT_NUM:
				return ((InternalEList<?>)getAbstractNum()).basicRemove(otherEnd, msgs);
			case docPackage.DNUMBERING__NUM:
				return ((InternalEList<?>)getNum()).basicRemove(otherEnd, msgs);
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
			case docPackage.DNUMBERING__ABSTRACT_NUM:
				return getAbstractNum();
			case docPackage.DNUMBERING__NUM:
				return getNum();
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
			case docPackage.DNUMBERING__ABSTRACT_NUM:
				getAbstractNum().clear();
				getAbstractNum().addAll((Collection<? extends DAbstractNum>)newValue);
				return;
			case docPackage.DNUMBERING__NUM:
				getNum().clear();
				getNum().addAll((Collection<? extends DNum>)newValue);
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
			case docPackage.DNUMBERING__ABSTRACT_NUM:
				getAbstractNum().clear();
				return;
			case docPackage.DNUMBERING__NUM:
				getNum().clear();
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
			case docPackage.DNUMBERING__ABSTRACT_NUM:
				return abstractNum != null && !abstractNum.isEmpty();
			case docPackage.DNUMBERING__NUM:
				return num != null && !num.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DNumberingImpl
