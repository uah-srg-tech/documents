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

import es.uah.aut.srg.micobs.doctpl.doc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class docFactoryImpl extends EFactoryImpl implements docFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static docFactory init() {
		try {
			docFactory thedocFactory = (docFactory)EPackage.Registry.INSTANCE.getEFactory(docPackage.eNS_URI);
			if (thedocFactory != null) {
				return thedocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new docFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public docFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case docPackage.DAPPLICABLE_DOCUMENT: return createDApplicableDocument();
			case docPackage.DREFERENCE_DOCUMENT: return createDReferenceDocument();
			case docPackage.DROW: return createDRow();
			case docPackage.DCOLUMN: return createDColumn();
			case docPackage.DCELL: return createDCell();
			case docPackage.DPARAGRAPH: return createDParagraph();
			case docPackage.DTEXT: return createDText();
			case docPackage.DREFERENCEABLE_OBJECT: return createDReferenceableObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DApplicableDocument createDApplicableDocument() {
		DApplicableDocumentImpl dApplicableDocument = new DApplicableDocumentImpl();
		return dApplicableDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DReferenceDocument createDReferenceDocument() {
		DReferenceDocumentImpl dReferenceDocument = new DReferenceDocumentImpl();
		return dReferenceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRow createDRow() {
		DRowImpl dRow = new DRowImpl();
		return dRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DColumn createDColumn() {
		DColumnImpl dColumn = new DColumnImpl();
		return dColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCell createDCell() {
		DCellImpl dCell = new DCellImpl();
		return dCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DParagraph createDParagraph() {
		DParagraphImpl dParagraph = new DParagraphImpl();
		return dParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DText createDText() {
		DTextImpl dText = new DTextImpl();
		return dText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DReferenceableObject createDReferenceableObject() {
		DReferenceableObjectImpl dReferenceableObject = new DReferenceableObjectImpl();
		return dReferenceableObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public docPackage getdocPackage() {
		return (docPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static docPackage getPackage() {
		return docPackage.eINSTANCE;
	}

} //docFactoryImpl
