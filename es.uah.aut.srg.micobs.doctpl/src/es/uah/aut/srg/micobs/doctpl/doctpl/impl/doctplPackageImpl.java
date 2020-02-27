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

import es.uah.aut.srg.micobs.common.commonPackage;

import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractPlaceholder;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment;
import es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBody;
import es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DCell;
import es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DEnumerate;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile;
import es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink;
import es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection;
import es.uah.aut.srg.micobs.doctpl.doctpl.DItemize;
import es.uah.aut.srg.micobs.doctpl.doctpl.DListContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DListItem;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doctpl.DParagraphContent;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRow;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRun;
import es.uah.aut.srg.micobs.doctpl.doctpl.DRunAttributes;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTab;
import es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile;
import es.uah.aut.srg.micobs.doctpl.doctpl.DText;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplFactory;
import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class doctplPackageImpl extends EPackageImpl implements doctplPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDocumentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtbcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtbdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractRelatedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dApplicableDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dReferenceDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractPlaceholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFigureFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTableFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBasicTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFixedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dInstantiableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBodyContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dParagraphContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dHyperlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dReferenceableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dListContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dItemizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEnumerateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dRunAttributesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private doctplPackageImpl() {
		super(eNS_URI, doctplFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link doctplPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static doctplPackage init() {
		if (isInited) return (doctplPackage)EPackage.Registry.INSTANCE.getEPackage(doctplPackage.eNS_URI);

		// Obtain or create and register package
		doctplPackageImpl thedoctplPackage = (doctplPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof doctplPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new doctplPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thedoctplPackage.createPackageContents();

		// Initialize created meta-data
		thedoctplPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedoctplPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(doctplPackage.eNS_URI, thedoctplPackage);
		return thedoctplPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDocumentTemplate() {
		return dDocumentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocumentTemplate_Name() {
		return (EAttribute)dDocumentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocumentTemplate_Id() {
		return (EAttribute)dDocumentTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocumentTemplate_Issue() {
		return (EAttribute)dDocumentTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocumentTemplate_Revision() {
		return (EAttribute)dDocumentTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocumentTemplate_Date() {
		return (EAttribute)dDocumentTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Tbcs() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Tbds() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_ApplicableDocuments() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_ReferenceDocuments() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Figures() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Tables() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Sections() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Paragraphs() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTBC() {
		return dtbcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTBC_ParentTBC() {
		return (EReference)dtbcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTBD() {
		return dtbdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTBD_ParentTBD() {
		return (EReference)dtbdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractRelatedDocument() {
		return dAbstractRelatedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Title() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Id() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Issue() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Revision() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Date() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Url() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDApplicableDocument() {
		return dApplicableDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDReferenceDocument() {
		return dReferenceDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractPlaceholder() {
		return dAbstractPlaceholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractPlaceholder_Description() {
		return (EAttribute)dAbstractPlaceholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractFigure() {
		return dAbstractFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractFigure_Caption() {
		return (EAttribute)dAbstractFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFigureFromFile() {
		return dFigureFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDFigureFromFile_ReferenceFile() {
		return (EAttribute)dFigureFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDFigureFromFile_Width() {
		return (EAttribute)dFigureFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDFigureFromFile_Height() {
		return (EAttribute)dFigureFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractTable() {
		return dAbstractTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractTable_Caption() {
		return (EAttribute)dAbstractTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTableFromFile() {
		return dTableFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTableFromFile_ReferenceFile() {
		return (EAttribute)dTableFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTableFromFile_Width() {
		return (EAttribute)dTableFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTableFromFile_Height() {
		return (EAttribute)dTableFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBasicTable() {
		return dBasicTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBasicTable_Width() {
		return (EAttribute)dBasicTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBasicTable_Rows() {
		return (EReference)dBasicTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDRow() {
		return dRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDRow_Cells() {
		return (EReference)dRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCell() {
		return dCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCell_ColSpan() {
		return (EAttribute)dCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCell_RowSpan() {
		return (EAttribute)dCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCell_Width() {
		return (EAttribute)dCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCell_Shadow() {
		return (EAttribute)dCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractSection() {
		return dAbstractSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAbstractSection_Subsections() {
		return (EReference)dAbstractSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFixedSection() {
		return dFixedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDInstantiableSection() {
		return dInstantiableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBody() {
		return dBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBody_BodyContent() {
		return (EReference)dBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBodyContent() {
		return dBodyContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBodyContent_Alignment() {
		return (EAttribute)dBodyContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBodyContent_Style() {
		return (EAttribute)dBodyContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBodyContent_Indent() {
		return (EAttribute)dBodyContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDParagraph() {
		return dParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraph_ParagraphContent() {
		return (EReference)dParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDParagraphContent() {
		return dParagraphContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDRun() {
		return dRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDRun_Tab() {
		return (EReference)dRunEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDRun_Text() {
		return (EReference)dRunEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDRun_Bold() {
		return (EAttribute)dRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDRun_Italics() {
		return (EAttribute)dRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDRun_Underline() {
		return (EAttribute)dRunEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDRun_Color() {
		return (EAttribute)dRunEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTab() {
		return dTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDText() {
		return dTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDText_Content() {
		return (EAttribute)dTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDHyperlink() {
		return dHyperlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDHyperlink_Run() {
		return (EReference)dHyperlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDHyperlink_Reference() {
		return (EReference)dHyperlinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDReferenceableObject() {
		return dReferenceableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDReferenceableObject_Name() {
		return (EAttribute)dReferenceableObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDListContent() {
		return dListContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDListContent_Items() {
		return (EReference)dListContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDListItem() {
		return dListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDListItem_Paragraph() {
		return (EReference)dListItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDListItem_Sublist() {
		return (EReference)dListItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDItemize() {
		return dItemizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEnumerate() {
		return dEnumerateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDAlignment() {
		return dAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDRunAttributes() {
		return dRunAttributesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctplFactory getdoctplFactory() {
		return (doctplFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dDocumentTemplateEClass = createEClass(DDOCUMENT_TEMPLATE);
		createEAttribute(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__NAME);
		createEAttribute(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__ID);
		createEAttribute(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__ISSUE);
		createEAttribute(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__REVISION);
		createEAttribute(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__DATE);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__TBCS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__TBDS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__FIGURES);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__TABLES);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__SECTIONS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__PARAGRAPHS);

		dAbstractPlaceholderEClass = createEClass(DABSTRACT_PLACEHOLDER);
		createEAttribute(dAbstractPlaceholderEClass, DABSTRACT_PLACEHOLDER__DESCRIPTION);

		dtbcEClass = createEClass(DTBC);
		createEReference(dtbcEClass, DTBC__PARENT_TBC);

		dtbdEClass = createEClass(DTBD);
		createEReference(dtbdEClass, DTBD__PARENT_TBD);

		dAbstractRelatedDocumentEClass = createEClass(DABSTRACT_RELATED_DOCUMENT);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__TITLE);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__ID);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__ISSUE);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__REVISION);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__DATE);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__URL);

		dApplicableDocumentEClass = createEClass(DAPPLICABLE_DOCUMENT);

		dReferenceDocumentEClass = createEClass(DREFERENCE_DOCUMENT);

		dAbstractFigureEClass = createEClass(DABSTRACT_FIGURE);
		createEAttribute(dAbstractFigureEClass, DABSTRACT_FIGURE__CAPTION);

		dFigureFromFileEClass = createEClass(DFIGURE_FROM_FILE);
		createEAttribute(dFigureFromFileEClass, DFIGURE_FROM_FILE__REFERENCE_FILE);
		createEAttribute(dFigureFromFileEClass, DFIGURE_FROM_FILE__WIDTH);
		createEAttribute(dFigureFromFileEClass, DFIGURE_FROM_FILE__HEIGHT);

		dAbstractTableEClass = createEClass(DABSTRACT_TABLE);
		createEAttribute(dAbstractTableEClass, DABSTRACT_TABLE__CAPTION);

		dTableFromFileEClass = createEClass(DTABLE_FROM_FILE);
		createEAttribute(dTableFromFileEClass, DTABLE_FROM_FILE__REFERENCE_FILE);
		createEAttribute(dTableFromFileEClass, DTABLE_FROM_FILE__WIDTH);
		createEAttribute(dTableFromFileEClass, DTABLE_FROM_FILE__HEIGHT);

		dBasicTableEClass = createEClass(DBASIC_TABLE);
		createEAttribute(dBasicTableEClass, DBASIC_TABLE__WIDTH);
		createEReference(dBasicTableEClass, DBASIC_TABLE__ROWS);

		dRowEClass = createEClass(DROW);
		createEReference(dRowEClass, DROW__CELLS);

		dCellEClass = createEClass(DCELL);
		createEAttribute(dCellEClass, DCELL__COL_SPAN);
		createEAttribute(dCellEClass, DCELL__ROW_SPAN);
		createEAttribute(dCellEClass, DCELL__WIDTH);
		createEAttribute(dCellEClass, DCELL__SHADOW);

		dAbstractSectionEClass = createEClass(DABSTRACT_SECTION);
		createEReference(dAbstractSectionEClass, DABSTRACT_SECTION__SUBSECTIONS);

		dFixedSectionEClass = createEClass(DFIXED_SECTION);

		dInstantiableSectionEClass = createEClass(DINSTANTIABLE_SECTION);

		dBodyEClass = createEClass(DBODY);
		createEReference(dBodyEClass, DBODY__BODY_CONTENT);

		dBodyContentEClass = createEClass(DBODY_CONTENT);
		createEAttribute(dBodyContentEClass, DBODY_CONTENT__ALIGNMENT);
		createEAttribute(dBodyContentEClass, DBODY_CONTENT__STYLE);
		createEAttribute(dBodyContentEClass, DBODY_CONTENT__INDENT);

		dParagraphEClass = createEClass(DPARAGRAPH);
		createEReference(dParagraphEClass, DPARAGRAPH__PARAGRAPH_CONTENT);

		dParagraphContentEClass = createEClass(DPARAGRAPH_CONTENT);

		dRunEClass = createEClass(DRUN);
		createEAttribute(dRunEClass, DRUN__BOLD);
		createEAttribute(dRunEClass, DRUN__ITALICS);
		createEAttribute(dRunEClass, DRUN__UNDERLINE);
		createEAttribute(dRunEClass, DRUN__COLOR);
		createEReference(dRunEClass, DRUN__TAB);
		createEReference(dRunEClass, DRUN__TEXT);

		dTabEClass = createEClass(DTAB);

		dTextEClass = createEClass(DTEXT);
		createEAttribute(dTextEClass, DTEXT__CONTENT);

		dHyperlinkEClass = createEClass(DHYPERLINK);
		createEReference(dHyperlinkEClass, DHYPERLINK__RUN);
		createEReference(dHyperlinkEClass, DHYPERLINK__REFERENCE);

		dReferenceableObjectEClass = createEClass(DREFERENCEABLE_OBJECT);
		createEAttribute(dReferenceableObjectEClass, DREFERENCEABLE_OBJECT__NAME);

		dListContentEClass = createEClass(DLIST_CONTENT);
		createEReference(dListContentEClass, DLIST_CONTENT__ITEMS);

		dListItemEClass = createEClass(DLIST_ITEM);
		createEReference(dListItemEClass, DLIST_ITEM__PARAGRAPH);
		createEReference(dListItemEClass, DLIST_ITEM__SUBLIST);

		dItemizeEClass = createEClass(DITEMIZE);

		dEnumerateEClass = createEClass(DENUMERATE);

		// Create enums
		dAlignmentEEnum = createEEnum(DALIGNMENT);
		dRunAttributesEEnum = createEEnum(DRUN_ATTRIBUTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dAbstractPlaceholderEClass.getESuperTypes().add(this.getDReferenceableObject());
		dtbcEClass.getESuperTypes().add(this.getDAbstractPlaceholder());
		dtbdEClass.getESuperTypes().add(this.getDAbstractPlaceholder());
		dAbstractRelatedDocumentEClass.getESuperTypes().add(this.getDReferenceableObject());
		dApplicableDocumentEClass.getESuperTypes().add(this.getDAbstractRelatedDocument());
		dReferenceDocumentEClass.getESuperTypes().add(this.getDAbstractRelatedDocument());
		dAbstractFigureEClass.getESuperTypes().add(this.getDBodyContent());
		dAbstractFigureEClass.getESuperTypes().add(this.getDReferenceableObject());
		dFigureFromFileEClass.getESuperTypes().add(this.getDAbstractFigure());
		dAbstractTableEClass.getESuperTypes().add(this.getDBodyContent());
		dAbstractTableEClass.getESuperTypes().add(this.getDReferenceableObject());
		dTableFromFileEClass.getESuperTypes().add(this.getDAbstractTable());
		dBasicTableEClass.getESuperTypes().add(this.getDAbstractTable());
		dCellEClass.getESuperTypes().add(this.getDBody());
		dFixedSectionEClass.getESuperTypes().add(this.getDAbstractSection());
		dInstantiableSectionEClass.getESuperTypes().add(this.getDAbstractSection());
		dInstantiableSectionEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		dParagraphEClass.getESuperTypes().add(this.getDBodyContent());
		dParagraphEClass.getESuperTypes().add(this.getDReferenceableObject());
		dRunEClass.getESuperTypes().add(this.getDParagraphContent());
		dHyperlinkEClass.getESuperTypes().add(this.getDParagraphContent());
		dListContentEClass.getESuperTypes().add(this.getDBodyContent());
		dListContentEClass.getESuperTypes().add(this.getDReferenceableObject());
		dItemizeEClass.getESuperTypes().add(this.getDListContent());
		dEnumerateEClass.getESuperTypes().add(this.getDListContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(dDocumentTemplateEClass, DDocumentTemplate.class, "DDocumentTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDDocumentTemplate_Name(), ecorePackage.getEString(), "name", null, 1, 1, DDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocumentTemplate_Id(), ecorePackage.getEString(), "id", null, 1, 1, DDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocumentTemplate_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, DDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocumentTemplate_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, DDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocumentTemplate_Date(), ecorePackage.getEString(), "date", null, 1, 1, DDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Tbcs(), this.getDTBC(), null, "tbcs", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Tbds(), this.getDTBD(), null, "tbds", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_ApplicableDocuments(), this.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_ReferenceDocuments(), this.getDReferenceDocument(), null, "referenceDocuments", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Figures(), this.getDAbstractFigure(), null, "figures", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Tables(), this.getDAbstractTable(), null, "tables", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Sections(), this.getDAbstractSection(), null, "sections", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Paragraphs(), this.getDParagraph(), null, "paragraphs", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractPlaceholderEClass, DAbstractPlaceholder.class, "DAbstractPlaceholder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractPlaceholder_Description(), ecorePackage.getEString(), "description", null, 0, 1, DAbstractPlaceholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtbcEClass, es.uah.aut.srg.micobs.doctpl.doctpl.DTBC.class, "DTBC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTBC_ParentTBC(), this.getDAbstractPlaceholder(), null, "parentTBC", null, 0, 1, es.uah.aut.srg.micobs.doctpl.doctpl.DTBC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtbdEClass, es.uah.aut.srg.micobs.doctpl.doctpl.DTBD.class, "DTBD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTBD_ParentTBD(), this.getDAbstractPlaceholder(), null, "parentTBD", null, 0, 1, es.uah.aut.srg.micobs.doctpl.doctpl.DTBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractRelatedDocumentEClass, DAbstractRelatedDocument.class, "DAbstractRelatedDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractRelatedDocument_Title(), ecorePackage.getEString(), "title", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Issue(), ecorePackage.getEString(), "issue", null, 0, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Revision(), ecorePackage.getEString(), "revision", null, 0, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Date(), ecorePackage.getEString(), "date", null, 0, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Url(), ecorePackage.getEString(), "url", null, 0, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dApplicableDocumentEClass, DApplicableDocument.class, "DApplicableDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dReferenceDocumentEClass, DReferenceDocument.class, "DReferenceDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dAbstractFigureEClass, DAbstractFigure.class, "DAbstractFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractFigure_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, DAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFigureFromFileEClass, DFigureFromFile.class, "DFigureFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDFigureFromFile_ReferenceFile(), ecorePackage.getEString(), "referenceFile", null, 1, 1, DFigureFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDFigureFromFile_Width(), ecorePackage.getEString(), "width", null, 1, 1, DFigureFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDFigureFromFile_Height(), ecorePackage.getEString(), "height", null, 1, 1, DFigureFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractTableEClass, DAbstractTable.class, "DAbstractTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractTable_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, DAbstractTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTableFromFileEClass, DTableFromFile.class, "DTableFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTableFromFile_ReferenceFile(), ecorePackage.getEString(), "referenceFile", null, 1, 1, DTableFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTableFromFile_Width(), ecorePackage.getEString(), "width", null, 1, 1, DTableFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTableFromFile_Height(), ecorePackage.getEString(), "height", null, 1, 1, DTableFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBasicTableEClass, DBasicTable.class, "DBasicTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBasicTable_Width(), ecorePackage.getEString(), "width", null, 0, 1, DBasicTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBasicTable_Rows(), this.getDRow(), null, "rows", null, 1, -1, DBasicTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dRowEClass, DRow.class, "DRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRow_Cells(), this.getDCell(), null, "cells", null, 1, -1, DRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dCellEClass, DCell.class, "DCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCell_ColSpan(), ecorePackage.getEString(), "colSpan", null, 0, 1, DCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCell_RowSpan(), ecorePackage.getEString(), "rowSpan", null, 0, 1, DCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCell_Width(), ecorePackage.getEString(), "width", null, 0, 1, DCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCell_Shadow(), ecorePackage.getEString(), "shadow", null, 0, 1, DCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractSectionEClass, DAbstractSection.class, "DAbstractSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAbstractSection_Subsections(), this.getDAbstractSection(), null, "subsections", null, 0, -1, DAbstractSection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dFixedSectionEClass, DFixedSection.class, "DFixedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dInstantiableSectionEClass, DInstantiableSection.class, "DInstantiableSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dBodyEClass, DBody.class, "DBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBody_BodyContent(), this.getDBodyContent(), null, "bodyContent", null, 1, -1, DBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBodyContentEClass, DBodyContent.class, "DBodyContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBodyContent_Alignment(), this.getDAlignment(), "alignment", null, 0, 1, DBodyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBodyContent_Style(), ecorePackage.getEString(), "style", null, 0, 1, DBodyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBodyContent_Indent(), ecorePackage.getEString(), "indent", null, 0, 1, DBodyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dParagraphEClass, DParagraph.class, "DParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDParagraph_ParagraphContent(), this.getDParagraphContent(), null, "paragraphContent", null, 1, -1, DParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dParagraphContentEClass, DParagraphContent.class, "DParagraphContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dRunEClass, DRun.class, "DRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDRun_Bold(), this.getDRunAttributes(), "bold", null, 0, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDRun_Italics(), this.getDRunAttributes(), "italics", null, 0, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDRun_Underline(), this.getDRunAttributes(), "underline", null, 0, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDRun_Color(), ecorePackage.getEString(), "color", null, 0, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDRun_Tab(), this.getDTab(), null, "tab", null, 0, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDRun_Text(), this.getDText(), null, "text", null, 1, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTabEClass, DTab.class, "DTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dTextEClass, DText.class, "DText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDText_Content(), ecorePackage.getEString(), "content", null, 1, 1, DText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dHyperlinkEClass, DHyperlink.class, "DHyperlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDHyperlink_Run(), this.getDRun(), null, "run", null, 0, 1, DHyperlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDHyperlink_Reference(), this.getDReferenceableObject(), null, "reference", null, 1, 1, DHyperlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dReferenceableObjectEClass, DReferenceableObject.class, "DReferenceableObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDReferenceableObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DReferenceableObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dListContentEClass, DListContent.class, "DListContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDListContent_Items(), this.getDListItem(), null, "items", null, 1, -1, DListContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dListItemEClass, DListItem.class, "DListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDListItem_Paragraph(), this.getDParagraph(), null, "paragraph", null, 0, 1, DListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDListItem_Sublist(), this.getDListContent(), null, "sublist", null, 0, 1, DListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dItemizeEClass, DItemize.class, "DItemize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dEnumerateEClass, DEnumerate.class, "DEnumerate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dAlignmentEEnum, DAlignment.class, "DAlignment");
		addEEnumLiteral(dAlignmentEEnum, DAlignment.LEFT);
		addEEnumLiteral(dAlignmentEEnum, DAlignment.CENTER);
		addEEnumLiteral(dAlignmentEEnum, DAlignment.RIGHT);
		addEEnumLiteral(dAlignmentEEnum, DAlignment.JUSTIFIED);

		initEEnum(dRunAttributesEEnum, DRunAttributes.class, "DRunAttributes");
		addEEnumLiteral(dRunAttributesEEnum, DRunAttributes.FALSE);
		addEEnumLiteral(dRunAttributesEEnum, DRunAttributes.TRUE);

		// Create resource
		createResource(eNS_URI);
	}

} //doctplPackageImpl
