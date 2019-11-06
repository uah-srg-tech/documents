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

import es.uah.aut.srg.micobs.doctpl.doctpl.*;

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
public class doctplFactoryImpl extends EFactoryImpl implements doctplFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static doctplFactory init() {
		try {
			doctplFactory thedoctplFactory = (doctplFactory)EPackage.Registry.INSTANCE.getEFactory(doctplPackage.eNS_URI);
			if (thedoctplFactory != null) {
				return thedoctplFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new doctplFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctplFactoryImpl() {
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
			case doctplPackage.DAPPLICABLE_DOCUMENT: return createDApplicableDocument();
			case doctplPackage.DREFERENCE_DOCUMENT: return createDReferenceDocument();
			case doctplPackage.DFIGURE_FROM_FILE: return createDFigureFromFile();
			case doctplPackage.DTABLE_FROM_FILE: return createDTableFromFile();
			case doctplPackage.DBASIC_TABLE: return createDBasicTable();
			case doctplPackage.DROW: return createDRow();
			case doctplPackage.DCELL: return createDCell();
			case doctplPackage.DABSTRACT_SECTION: return createDAbstractSection();
			case doctplPackage.DFIXED_SECTION: return createDFixedSection();
			case doctplPackage.DINSTANTIABLE_SECTION: return createDInstantiableSection();
			case doctplPackage.DBODY: return createDBody();
			case doctplPackage.DPARAGRAPH: return createDParagraph();
			case doctplPackage.DRUN: return createDRun();
			case doctplPackage.DTAB: return createDTab();
			case doctplPackage.DTEXT: return createDText();
			case doctplPackage.DHYPERLINK: return createDHyperlink();
			case doctplPackage.DREFERENCEABLE_OBJECT: return createDReferenceableObject();
			case doctplPackage.DLIST_ITEM: return createDListItem();
			case doctplPackage.DITEMIZE: return createDItemize();
			case doctplPackage.DENUMERATE: return createDEnumerate();
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
			case doctplPackage.DMERGE_TYPE:
				return createDMergeTypeFromString(eDataType, initialValue);
			case doctplPackage.DALIGNMENT:
				return createDAlignmentFromString(eDataType, initialValue);
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
			case doctplPackage.DMERGE_TYPE:
				return convertDMergeTypeToString(eDataType, instanceValue);
			case doctplPackage.DALIGNMENT:
				return convertDAlignmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public DFigureFromFile createDFigureFromFile() {
		DFigureFromFileImpl dFigureFromFile = new DFigureFromFileImpl();
		return dFigureFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTableFromFile createDTableFromFile() {
		DTableFromFileImpl dTableFromFile = new DTableFromFileImpl();
		return dTableFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBasicTable createDBasicTable() {
		DBasicTableImpl dBasicTable = new DBasicTableImpl();
		return dBasicTable;
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
	public DCell createDCell() {
		DCellImpl dCell = new DCellImpl();
		return dCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAbstractSection createDAbstractSection() {
		DAbstractSectionImpl dAbstractSection = new DAbstractSectionImpl();
		return dAbstractSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFixedSection createDFixedSection() {
		DFixedSectionImpl dFixedSection = new DFixedSectionImpl();
		return dFixedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DInstantiableSection createDInstantiableSection() {
		DInstantiableSectionImpl dInstantiableSection = new DInstantiableSectionImpl();
		return dInstantiableSection;
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
	public DRun createDRun() {
		DRunImpl dRun = new DRunImpl();
		return dRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTab createDTab() {
		DTabImpl dTab = new DTabImpl();
		return dTab;
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
	public DListItem createDListItem() {
		DListItemImpl dListItem = new DListItemImpl();
		return dListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DItemize createDItemize() {
		DItemizeImpl dItemize = new DItemizeImpl();
		return dItemize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEnumerate createDEnumerate() {
		DEnumerateImpl dEnumerate = new DEnumerateImpl();
		return dEnumerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMergeType createDMergeTypeFromString(EDataType eDataType, String initialValue) {
		DMergeType result = DMergeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMergeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAlignment createDAlignmentFromString(EDataType eDataType, String initialValue) {
		DAlignment result = DAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctplPackage getdoctplPackage() {
		return (doctplPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static doctplPackage getPackage() {
		return doctplPackage.eINSTANCE;
	}

} //doctplFactoryImpl
