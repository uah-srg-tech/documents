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
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable;
import es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DCell;
import es.uah.aut.srg.micobs.doctpl.doc.DColumn;
import es.uah.aut.srg.micobs.doctpl.doc.DDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DFigure;
import es.uah.aut.srg.micobs.doctpl.doc.DParagraph;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument;
import es.uah.aut.srg.micobs.doctpl.doc.DReferenceableObject;
import es.uah.aut.srg.micobs.doctpl.doc.DRow;
import es.uah.aut.srg.micobs.doctpl.doc.DTable;
import es.uah.aut.srg.micobs.doctpl.doc.DTableFromPicture;
import es.uah.aut.srg.micobs.doctpl.doc.DText;
import es.uah.aut.srg.micobs.doctpl.doc.docFactory;
import es.uah.aut.srg.micobs.doctpl.doc.docPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass dDocumentEClass = null;

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
	private EClass dTableFromPictureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTableEClass = null;

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
	private EClass dParagraphEClass = null;

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
	private EClass dReferenceableObjectEClass = null;

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
	public EClass getDDocument() {
		return dDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocument_ApplicableDocuments() {
		return (EReference)dDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocument_ReferenceDocuments() {
		return (EReference)dDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocument_Figures() {
		return (EReference)dDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDocument_Tables() {
		return (EReference)dDocumentEClass.getEStructuralFeatures().get(3);
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
	public EClass getDTableFromPicture() {
		return dTableFromPictureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTableFromPicture_Reference() {
		return (EAttribute)dTableFromPictureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTable() {
		return dTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTable_Rows() {
		return (EReference)dTableEClass.getEStructuralFeatures().get(0);
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
	public EReference getDRow_Columns() {
		return (EReference)dRowEClass.getEStructuralFeatures().get(0);
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
	public EReference getDColumn_Cells() {
		return (EReference)dColumnEClass.getEStructuralFeatures().get(0);
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
	public EClass getDParagraph() {
		return dParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDParagraph_Text() {
		return (EReference)dParagraphEClass.getEStructuralFeatures().get(0);
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
	public EReference getDText_Reference() {
		return (EReference)dTextEClass.getEStructuralFeatures().get(1);
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
		dDocumentEClass = createEClass(DDOCUMENT);
		createEReference(dDocumentEClass, DDOCUMENT__APPLICABLE_DOCUMENTS);
		createEReference(dDocumentEClass, DDOCUMENT__REFERENCE_DOCUMENTS);
		createEReference(dDocumentEClass, DDOCUMENT__FIGURES);
		createEReference(dDocumentEClass, DDOCUMENT__TABLES);

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

		dTableFromPictureEClass = createEClass(DTABLE_FROM_PICTURE);
		createEAttribute(dTableFromPictureEClass, DTABLE_FROM_PICTURE__REFERENCE);

		dTableEClass = createEClass(DTABLE);
		createEReference(dTableEClass, DTABLE__ROWS);

		dRowEClass = createEClass(DROW);
		createEReference(dRowEClass, DROW__COLUMNS);

		dColumnEClass = createEClass(DCOLUMN);
		createEReference(dColumnEClass, DCOLUMN__CELLS);

		dCellEClass = createEClass(DCELL);

		dParagraphEClass = createEClass(DPARAGRAPH);
		createEReference(dParagraphEClass, DPARAGRAPH__TEXT);

		dTextEClass = createEClass(DTEXT);
		createEAttribute(dTextEClass, DTEXT__CONTENT);
		createEReference(dTextEClass, DTEXT__REFERENCE);

		dReferenceableObjectEClass = createEClass(DREFERENCEABLE_OBJECT);
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
		dAbstractFigureEClass.getESuperTypes().add(this.getDReferenceableObject());
		dFigureEClass.getESuperTypes().add(this.getDAbstractFigure());
		dAbstractTableEClass.getESuperTypes().add(this.getDReferenceableObject());
		dTableFromPictureEClass.getESuperTypes().add(this.getDAbstractTable());
		dTableEClass.getESuperTypes().add(this.getDAbstractTable());
		dCellEClass.getESuperTypes().add(this.getDParagraph());

		// Initialize classes, features, and operations; add parameters
		initEClass(dDocumentEClass, DDocument.class, "DDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDocument_ApplicableDocuments(), this.getDApplicableDocument(), null, "applicableDocuments", null, 0, -1, DDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocument_ReferenceDocuments(), this.getDApplicableDocument(), null, "referenceDocuments", null, 0, -1, DDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocument_Figures(), this.getDAbstractFigure(), null, "figures", null, 0, -1, DDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDDocument_Tables(), this.getDAbstractTable(), null, "tables", null, 0, -1, DDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractRelatedDocumentEClass, DAbstractRelatedDocument.class, "DAbstractRelatedDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractRelatedDocument_Title(), ecorePackage.getEString(), "title", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractRelatedDocument_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, DAbstractRelatedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractRelatedDocument_RefDocument(), this.getDDocument(), null, "refDocument", null, 1, 1, DAbstractRelatedDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dApplicableDocumentEClass, DApplicableDocument.class, "DApplicableDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDApplicableDocument_Document(), this.getDDocument(), null, "document", null, 1, 1, DApplicableDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dReferenceDocumentEClass, DReferenceDocument.class, "DReferenceDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDReferenceDocument_Document(), this.getDDocument(), null, "document", null, 1, 1, DReferenceDocument.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dAbstractFigureEClass, DAbstractFigure.class, "DAbstractFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractFigure_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, DAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAbstractFigure_Caption(), ecorePackage.getEString(), "caption", null, 1, 1, DAbstractFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractFigure_Document(), this.getDDocument(), null, "document", null, 1, 1, DAbstractFigure.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dFigureEClass, DFigure.class, "DFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dAbstractTableEClass, DAbstractTable.class, "DAbstractTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAbstractTable_Caption(), ecorePackage.getEString(), "caption", null, 1, 1, DAbstractTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAbstractTable_Document(), this.getDDocument(), null, "document", null, 1, 1, DAbstractTable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dTableFromPictureEClass, DTableFromPicture.class, "DTableFromPicture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTableFromPicture_Reference(), ecorePackage.getEString(), "reference", null, 1, 1, DTableFromPicture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTableEClass, DTable.class, "DTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTable_Rows(), this.getDRow(), null, "rows", null, 0, -1, DTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dRowEClass, DRow.class, "DRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRow_Columns(), this.getDColumn(), null, "columns", null, 0, -1, DRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dColumnEClass, DColumn.class, "DColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDColumn_Cells(), this.getDCell(), null, "cells", null, 0, -1, DColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dCellEClass, DCell.class, "DCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dParagraphEClass, DParagraph.class, "DParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDParagraph_Text(), this.getDText(), null, "text", null, 0, -1, DParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTextEClass, DText.class, "DText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDText_Content(), ecorePackage.getEString(), "content", null, 1, -1, DText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDText_Reference(), this.getDReferenceableObject(), null, "reference", null, 0, 1, DText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dReferenceableObjectEClass, DReferenceableObject.class, "DReferenceableObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //docPackageImpl
