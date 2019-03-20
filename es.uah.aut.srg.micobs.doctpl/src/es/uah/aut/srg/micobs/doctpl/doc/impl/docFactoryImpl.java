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
import org.eclipse.emf.ecore.EDataType;
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
			case docPackage.DSECTION: return createDSection();
			case docPackage.DAPPLICABLE_DOCUMENT: return createDApplicableDocument();
			case docPackage.DREFERENCE_DOCUMENT: return createDReferenceDocument();
			case docPackage.DROW: return createDRow();
			case docPackage.DCOLUMN: return createDColumn();
			case docPackage.DCELL: return createDCell();
			case docPackage.DBODY: return createDBody();
			case docPackage.DPARAGRAPH: return createDParagraph();
			case docPackage.DPARAGRAPH_PROPERTIES: return createDParagraphProperties();
			case docPackage.DRUN: return createDRun();
			case docPackage.DTEXT: return createDText();
			case docPackage.DHYPERLINK: return createDHyperlink();
			case docPackage.DREFERENCEABLE_OBJECT: return createDReferenceableObject();
			case docPackage.DNUMBERING: return createDNumbering();
			case docPackage.DABSTRACT_NUM: return createDAbstractNum();
			case docPackage.DLEVEL: return createDLevel();
			case docPackage.DNUM: return createDNum();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case docPackage.DNUMBER_FORMAT:
				return createDNumberFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case docPackage.DNUMBER_FORMAT:
				return convertDNumberFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSection createDSection() {
		DSectionImpl dSection = new DSectionImpl();
		return dSection;
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
	public DBody createDBody() {
		DBodyImpl dBody = new DBodyImpl();
		return dBody;
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
	public DParagraphProperties createDParagraphProperties() {
		DParagraphPropertiesImpl dParagraphProperties = new DParagraphPropertiesImpl();
		return dParagraphProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRun createDRun() {
		DRunImpl dRun = new DRunImpl();
		return dRun;
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
	public DHyperlink createDHyperlink() {
		DHyperlinkImpl dHyperlink = new DHyperlinkImpl();
		return dHyperlink;
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
	public DNumbering createDNumbering() {
		DNumberingImpl dNumbering = new DNumberingImpl();
		return dNumbering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractNum createDAbstractNum() {
		DAbstractNumImpl dAbstractNum = new DAbstractNumImpl();
		return dAbstractNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLevel createDLevel() {
		DLevelImpl dLevel = new DLevelImpl();
		return dLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNum createDNum() {
		DNumImpl dNum = new DNumImpl();
		return dNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNumberFormat createDNumberFormatFromString(EDataType eDataType, String initialValue) {
		DNumberFormat result = DNumberFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDNumberFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
