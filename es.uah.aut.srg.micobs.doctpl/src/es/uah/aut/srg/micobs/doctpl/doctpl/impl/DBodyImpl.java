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

import es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DCell;
import es.uah.aut.srg.micobs.doctpl.doctpl.DListContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRow;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DBody</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyImpl#getBodyContent <em>Body Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBodyImpl extends MinimalEObjectImpl.Container implements DBody {
	/**
	 * The cached value of the '{@link #getBodyContent() <em>Body Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyContent()
	 * @generated
	 * @ordered
	 */
	protected EList<DBodyContent> bodyContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return doctplPackage.Literals.DBODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DBodyContent> getBodyContent() {
		if (bodyContent == null) {
			bodyContent = new EObjectContainmentEList<DBodyContent>(DBodyContent.class, this, doctplPackage.DBODY__BODY_CONTENT);
		}
		return bodyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case doctplPackage.DBODY__BODY_CONTENT:
				return ((InternalEList<?>)getBodyContent()).basicRemove(otherEnd, msgs);
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
			case doctplPackage.DBODY__BODY_CONTENT:
				return getBodyContent();
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
			case doctplPackage.DBODY__BODY_CONTENT:
				getBodyContent().clear();
				getBodyContent().addAll((Collection<? extends DBodyContent>)newValue);
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
			case doctplPackage.DBODY__BODY_CONTENT:
				getBodyContent().clear();
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
			case doctplPackage.DBODY__BODY_CONTENT:
				return bodyContent != null && !bodyContent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<DReferenceableObject> getReferenceableObjects(String ReferenceableObjectType) {

		EList<DReferenceableObject> objects = new BasicEList<DReferenceableObject>();
		for(DBodyContent bodyContent : getBodyContent()) {
			if((bodyContent.eClass().getName() == ReferenceableObjectType) &&
					(((DReferenceableObject)bodyContent).getName() != null)) {
				objects.add((DReferenceableObject)bodyContent);
			}
			if(bodyContent.eClass().getName() == "DBasicTable") {
				for(DRow row : ((DBasicTable)bodyContent).getRows()) {
					for(DCell cell : row.getCells()) {
						objects.addAll(cell.getReferenceableObjects(ReferenceableObjectType));
					}
				}
			}
			if((ReferenceableObjectType == "DParagraph") &&
					((bodyContent.eClass().getName() == "DItemize") ||
					(bodyContent.eClass().getName() == "DEnumerate"))) {
				objects.addAll(((DListContent)bodyContent).getReferenceableObjects(ReferenceableObjectType));
			}
		}
		return objects;
	}
} //DBodyImpl
