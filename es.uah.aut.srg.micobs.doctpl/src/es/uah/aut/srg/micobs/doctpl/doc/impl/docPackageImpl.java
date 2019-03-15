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

import es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DBasicTable;
import es.uah.aut.srg.micobs.doctpl.doc.DBody;
import es.uah.aut.srg.micobs.doctpl.doc.DBodyContent;
import es.uah.aut.srg.micobs.doctpl.doc.DCell;
import es.uah.aut.srg.micobs.doctpl.doc.DColumn;
import es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate;
import es.uah.aut.srg.micobs.doctpl.doc.DFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DHyperlink;
import es.uah.aut.srg.micobs.doctpl.doc.DLevel;
import es.uah.aut.srg.micobs.doctpl.doc.DNum;
import es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat;
import es.uah.aut.srg.micobs.doctpl.doc.DNumbering;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraphContent;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties;
import es.uah.aut.srg.micobs.doctpl.doc.DPictureAsTable;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doc.DRow;
import es.uah.aut.srg.micobs.doctpl.doc.DRun;
import es.uah.aut.srg.micobs.doctpl.doc.DText;
import es.uah.aut.srg.micobs.doctpl.doc.docFactory;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

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
public class docPackageImpl extends EPackageImpl implements docPackage {
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
	private EClass dAbstractFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFigureEClass = null;

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
	private EClass dPictureAsTableEClass = null;

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
	private EClass dColumnEClass = null;

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
	private EClass dParagraphPropertiesEClass = null;

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
	private EClass dNumberingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAbstractNumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dNumberFormatEEnum = null;

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
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private docPackageImpl() {
		super(eNS_URI, docFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link docPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static docPackage init() {
		if (isInited) return (docPackage)EPackage.Registry.INSTANCE.getEPackage(docPackage.eNS_URI);

		// Obtain or create and register package
		docPackageImpl thedocPackage = (docPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof docPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new docPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thedocPackage.createPackageContents();

		// Initialize created meta-data
		thedocPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(docPackage.eNS_URI, thedocPackage);
		return thedocPackage;
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
	public EReference getDDocumentTemplate_ApplicableDocuments() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_ReferenceDocuments() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Figures() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocumentTemplate_Tables() {
		return (EReference)dDocumentTemplateEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDAbstractRelatedDocument_Issue() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractRelatedDocument_Revision() {
		return (EAttribute)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAbstractRelatedDocument_RefDocument() {
		return (EReference)dAbstractRelatedDocumentEClass.getEStructuralFeatures().get(3);
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
	public EReference getDApplicableDocument_Document() {
		return (EReference)dApplicableDocumentEClass.getEStructuralFeatures().get(0);
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
	public EReference getDReferenceDocument_Document() {
		return (EReference)dReferenceDocumentEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDAbstractFigure_Reference() {
		return (EAttribute)dAbstractFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractFigure_Caption() {
		return (EAttribute)dAbstractFigureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAbstractFigure_Document() {
		return (EReference)dAbstractFigureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFigure() {
		return dFigureEClass;
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
	public EReference getDAbstractTable_Document() {
		return (EReference)dAbstractTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPictureAsTable() {
		return dPictureAsTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDPictureAsTable_Reference() {
		return (EAttribute)dPictureAsTableEClass.getEStructuralFeatures().get(0);
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
	public EReference getDBasicTable_Rows() {
		return (EReference)dBasicTableEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDRow_Span() {
		return (EAttribute)dRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDRow_Columns() {
		return (EReference)dRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDColumn() {
		return dColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDColumn_Span() {
		return (EAttribute)dColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDColumn_Cells() {
		return (EReference)dColumnEClass.getEStructuralFeatures().get(1);
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
	public EClass getDBody() {
		return dBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBody_Content() {
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
	public EClass getDParagraph() {
		return dParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraph_Properties() {
		return (EReference)dParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraph_Content() {
		return (EReference)dParagraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDParagraphProperties() {
		return dParagraphPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraphProperties_Number() {
		return (EReference)dParagraphPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraphProperties_Level() {
		return (EReference)dParagraphPropertiesEClass.getEStructuralFeatures().get(1);
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
	public EReference getDRun_Text() {
		return (EReference)dRunEClass.getEStructuralFeatures().get(0);
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
	public EClass getDNumbering() {
		return dNumberingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDNumbering_AbstractNum() {
		return (EReference)dNumberingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDNumbering_Num() {
		return (EReference)dNumberingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAbstractNum() {
		return dAbstractNumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAbstractNum_Id() {
		return (EAttribute)dAbstractNumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAbstractNum_Level() {
		return (EReference)dAbstractNumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDLevel() {
		return dLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDLevel_Id() {
		return (EAttribute)dLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDLevel_Format() {
		return (EAttribute)dLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDNum() {
		return dNumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDNum_Id() {
		return (EAttribute)dNumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDNum_AbstractNum() {
		return (EReference)dNumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDNumberFormat() {
		return dNumberFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public docFactory getdocFactory() {
		return (docFactory)getEFactoryInstance();
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
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__FIGURES);
		createEReference(dDocumentTemplateEClass, DDOCUMENT_TEMPLATE__TABLES);

		dAbstractRelatedDocumentEClass = createEClass(DABSTRACT_RELATED_DOCUMENT);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__TITLE);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__ISSUE);
		createEAttribute(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__REVISION);
		createEReference(dAbstractRelatedDocumentEClass, DABSTRACT_RELATED_DOCUMENT__REF_DOCUMENT);

		dApplicableDocumentEClass = createEClass(DAPPLICABLE_DOCUMENT);
		createEReference(dApplicableDocumentEClass, DAPPLICABLE_DOCUMENT__DOCUMENT);

		dReferenceDocumentEClass = createEClass(DREFERENCE_DOCUMENT);
		createEReference(dReferenceDocumentEClass, DREFERENCE_DOCUMENT__DOCUMENT);

		dAbstractFigureEClass = createEClass(DABSTRACT_FIGURE);
		createEAttribute(dAbstractFigureEClass, DABSTRACT_FIGURE__REFERENCE);
		createEAttribute(dAbstractFigureEClass, DABSTRACT_FIGURE__CAPTION);
		createEReference(dAbstractFigureEClass, DABSTRACT_FIGURE__DOCUMENT);

		dFigureEClass = createEClass(DFIGURE);

		dAbstractTableEClass = createEClass(DABSTRACT_TABLE);
		createEAttribute(dAbstractTableEClass, DABSTRACT_TABLE__CAPTION);
		createEReference(dAbstractTableEClass, DABSTRACT_TABLE__DOCUMENT);

		dPictureAsTableEClass = createEClass(DPICTURE_AS_TABLE);
		createEAttribute(dPictureAsTableEClass, DPICTURE_AS_TABLE__REFERENCE);

		dBasicTableEClass = createEClass(DBASIC_TABLE);
		createEReference(dBasicTableEClass, DBASIC_TABLE__ROWS);

		dRowEClass = createEClass(DROW);
		createEAttribute(dRowEClass, DROW__SPAN);
		createEReference(dRowEClass, DROW__COLUMNS);

		dColumnEClass = createEClass(DCOLUMN);
		createEAttribute(dColumnEClass, DCOLUMN__SPAN);
		createEReference(dColumnEClass, DCOLUMN__CELLS);

		dCellEClass = createEClass(DCELL);

		dBodyEClass = createEClass(DBODY);
		createEReference(dBodyEClass, DBODY__CONTENT);

		dBodyContentEClass = createEClass(DBODY_CONTENT);

		dParagraphEClass = createEClass(DPARAGRAPH);
		createEReference(dParagraphEClass, DPARAGRAPH__PROPERTIES);
		createEReference(dParagraphEClass, DPARAGRAPH__CONTENT);

		dParagraphPropertiesEClass = createEClass(DPARAGRAPH_PROPERTIES);
		createEReference(dParagraphPropertiesEClass, DPARAGRAPH_PROPERTIES__NUMBER);
		createEReference(dParagraphPropertiesEClass, DPARAGRAPH_PROPERTIES__LEVEL);

		dParagraphContentEClass = createEClass(DPARAGRAPH_CONTENT);

		dRunEClass = createEClass(DRUN);
		createEReference(dRunEClass, DRUN__TEXT);

		dTextEClass = createEClass(DTEXT);
		createEAttribute(dTextEClass, DTEXT__CONTENT);

		dHyperlinkEClass = createEClass(DHYPERLINK);
		createEReference(dHyperlinkEClass, DHYPERLINK__RUN);
		createEReference(dHyperlinkEClass, DHYPERLINK__REFERENCE);

		dReferenceableObjectEClass = createEClass(DREFERENCEABLE_OBJECT);

		dNumberingEClass = createEClass(DNUMBERING);
		createEReference(dNumberingEClass, DNUMBERING__ABSTRACT_NUM);
		createEReference(dNumberingEClass, DNUMBERING__NUM);

		dAbstractNumEClass = createEClass(DABSTRACT_NUM);
		createEAttribute(dAbstractNumEClass, DABSTRACT_NUM__ID);
		createEReference(dAbstractNumEClass, DABSTRACT_NUM__LEVEL);

		dLevelEClass = createEClass(DLEVEL);
		createEAttribute(dLevelEClass, DLEVEL__ID);
		createEAttribute(dLevelEClass, DLEVEL__FORMAT);

		dNumEClass = createEClass(DNUM);
		createEAttribute(dNumEClass, DNUM__ID);
		createEReference(dNumEClass, DNUM__ABSTRACT_NUM);

		// Create enums
		dNumberFormatEEnum = createEEnum(DNUMBER_FORMAT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dAbstractRelatedDocumentEClass.getESuperTypes().add(this.getDReferenceableObject());
		dApplicableDocumentEClass.getESuperTypes().add(this.getDAbstractRelatedDocument());
		dReferenceDocumentEClass.getESuperTypes().add(this.getDAbstractRelatedDocument());
		dAbstractFigureEClass.getESuperTypes().add(this.getDBodyContent());
		dAbstractFigureEClass.getESuperTypes().add(this.getDReferenceableObject());
		dFigureEClass.getESuperTypes().add(this.getDAbstractFigure());
		dAbstractTableEClass.getESuperTypes().add(this.getDBodyContent());
		dAbstractTableEClass.getESuperTypes().add(this.getDReferenceableObject());
		dPictureAsTableEClass.getESuperTypes().add(this.getDAbstractTable());
		dBasicTableEClass.getESuperTypes().add(this.getDAbstractTable());
		dCellEClass.getESuperTypes().add(this.getDBody());
		dParagraphEClass.getESuperTypes().add(this.getDBodyContent());
		dRunEClass.getESuperTypes().add(this.getDParagraphContent());
		dHyperlinkEClass.getESuperTypes().add(this.getDParagraphContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(dDocumentTemplateEClass, DDocumentTemplate.class, "DDocumentTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDocumentTemplate_ApplicableDocuments(), this.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_ReferenceDocuments(), this.getDApplicableDocument(), null, "referenceDocuments", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Figures(), this.getDAbstractFigure(), null, "figures", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocumentTemplate_Tables(), this.getDAbstractTable(), null, "tables", null, 0, -1, DDocumentTemplate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractRelatedDocumentEClass, DAbstractRelatedDocument.class, "DAbstractRelatedDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractRelatedDocument_Title(), ecorePackage.getEString(), "title", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractRelatedDocument_RefDocument(), this.getDDocumentTemplate(), null, "refDocument", null, 1, 1, DAbstractRelatedDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dApplicableDocumentEClass, DApplicableDocument.class, "DApplicableDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDApplicableDocument_Document(), this.getDDocumentTemplate(), null, "document", null, 1, 1, DApplicableDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dReferenceDocumentEClass, DReferenceDocument.class, "DReferenceDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDReferenceDocument_Document(), this.getDDocumentTemplate(), null, "document", null, 1, 1, DReferenceDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractFigureEClass, DAbstractFigure.class, "DAbstractFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractFigure_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, DAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractFigure_Caption(), ecorePackage.getEString(), "caption", null, 1, 1, DAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractFigure_Document(), this.getDDocumentTemplate(), null, "document", null, 1, 1, DAbstractFigure.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dFigureEClass, DFigure.class, "DFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dAbstractTableEClass, DAbstractTable.class, "DAbstractTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractTable_Caption(), ecorePackage.getEString(), "caption", null, 1, 1, DAbstractTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractTable_Document(), this.getDDocumentTemplate(), null, "document", null, 1, 1, DAbstractTable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dPictureAsTableEClass, DPictureAsTable.class, "DPictureAsTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDPictureAsTable_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, DPictureAsTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBasicTableEClass, DBasicTable.class, "DBasicTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBasicTable_Rows(), this.getDRow(), null, "rows", null, 1, -1, DBasicTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dRowEClass, DRow.class, "DRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDRow_Span(), ecorePackage.getEString(), "span", null, 1, 1, DRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDRow_Columns(), this.getDColumn(), null, "columns", null, 1, -1, DRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dColumnEClass, DColumn.class, "DColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDColumn_Span(), ecorePackage.getEString(), "span", null, 1, 1, DColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDColumn_Cells(), this.getDCell(), null, "cells", null, 1, -1, DColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dCellEClass, DCell.class, "DCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dBodyEClass, DBody.class, "DBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBody_Content(), this.getDBodyContent(), null, "content", null, 1, -1, DBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBodyContentEClass, DBodyContent.class, "DBodyContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dParagraphEClass, DParagraph.class, "DParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDParagraph_Properties(), this.getDParagraphProperties(), null, "properties", null, 0, 1, DParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDParagraph_Content(), this.getDParagraphContent(), null, "content", null, 1, -1, DParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dParagraphPropertiesEClass, DParagraphProperties.class, "DParagraphProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDParagraphProperties_Number(), this.getDNum(), null, "number", null, 1, 1, DParagraphProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDParagraphProperties_Level(), this.getDLevel(), null, "level", null, 1, 1, DParagraphProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dParagraphContentEClass, DParagraphContent.class, "DParagraphContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dRunEClass, DRun.class, "DRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRun_Text(), this.getDText(), null, "text", null, 1, 1, DRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTextEClass, DText.class, "DText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDText_Content(), ecorePackage.getEString(), "content", null, 1, -1, DText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dHyperlinkEClass, DHyperlink.class, "DHyperlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDHyperlink_Run(), this.getDRun(), null, "run", null, 1, 1, DHyperlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDHyperlink_Reference(), this.getDReferenceableObject(), null, "reference", null, 1, 1, DHyperlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dReferenceableObjectEClass, DReferenceableObject.class, "DReferenceableObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dNumberingEClass, DNumbering.class, "DNumbering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNumbering_AbstractNum(), this.getDAbstractNum(), null, "abstractNum", null, 0, -1, DNumbering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNumbering_Num(), this.getDNum(), null, "num", null, 0, -1, DNumbering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractNumEClass, DAbstractNum.class, "DAbstractNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractNum_Id(), ecorePackage.getEString(), "id", null, 1, 1, DAbstractNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractNum_Level(), this.getDLevel(), null, "level", null, 1, -1, DAbstractNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dLevelEClass, DLevel.class, "DLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDLevel_Id(), ecorePackage.getEString(), "id", null, 1, 1, DLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDLevel_Format(), this.getDNumberFormat(), "format", null, 1, 1, DLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNumEClass, DNum.class, "DNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDNum_Id(), ecorePackage.getEString(), "id", null, 1, 1, DNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNum_AbstractNum(), this.getDAbstractNum(), null, "abstractNum", null, 1, 1, DNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dNumberFormatEEnum, DNumberFormat.class, "DNumberFormat");
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.BULLET);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.DECIMAL);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.ORDINAL);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.UPPER_ROMAN);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.LOWER_ROMAN);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.UPPER_LETTER);
		addEEnumLiteral(dNumberFormatEEnum, DNumberFormat.LOWER_LETTER);

		// Create resource
		createResource(eNS_URI);
	}

} //docPackageImpl
