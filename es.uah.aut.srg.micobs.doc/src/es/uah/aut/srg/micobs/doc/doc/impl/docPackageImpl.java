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
package es.uah.aut.srg.micobs.doc.doc.impl;

import es.uah.aut.srg.micobs.doc.doc.DDBody;
import es.uah.aut.srg.micobs.doc.doc.DDSection;
import es.uah.aut.srg.micobs.doc.doc.DDSectionContent;
import es.uah.aut.srg.micobs.doc.doc.DDocument;
import es.uah.aut.srg.micobs.doc.doc.docFactory;
import es.uah.aut.srg.micobs.doc.doc.docPackage;

import es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage;

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
	private EClass ddSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddSectionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddBodyEClass = null;

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
	 * @see es.uah.aut.srg.micobs.doc.doc.docPackage#eNS_URI
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

		// Initialize simple dependencies
		doctplPackage.eINSTANCE.eClass();

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
	public EReference getDDocument_Section() {
		return (EReference)dDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocument_Name() {
		return (EAttribute)dDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocument_Id() {
		return (EAttribute)dDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocument_Issue() {
		return (EAttribute)dDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocument_Revision() {
		return (EAttribute)dDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDocument_Date() {
		return (EAttribute)dDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDSection() {
		return ddSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDDSection_SectionContent() {
		return (EReference)ddSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDDSection_Name() {
		return (EAttribute)ddSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDSectionContent() {
		return ddSectionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDDBody() {
		return ddBodyEClass;
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
		createEReference(dDocumentEClass, DDOCUMENT__SECTION);
		createEAttribute(dDocumentEClass, DDOCUMENT__NAME);
		createEAttribute(dDocumentEClass, DDOCUMENT__ID);
		createEAttribute(dDocumentEClass, DDOCUMENT__ISSUE);
		createEAttribute(dDocumentEClass, DDOCUMENT__REVISION);
		createEAttribute(dDocumentEClass, DDOCUMENT__DATE);

		ddSectionEClass = createEClass(DD_SECTION);
		createEReference(ddSectionEClass, DD_SECTION__SECTION_CONTENT);
		createEAttribute(ddSectionEClass, DD_SECTION__NAME);

		ddSectionContentEClass = createEClass(DD_SECTION_CONTENT);

		ddBodyEClass = createEClass(DD_BODY);
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
		doctplPackage thedoctplPackage = (doctplPackage)EPackage.Registry.INSTANCE.getEPackage(doctplPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddSectionEClass.getESuperTypes().add(this.getDDSectionContent());
		ddBodyEClass.getESuperTypes().add(this.getDDSectionContent());
		ddBodyEClass.getESuperTypes().add(thedoctplPackage.getDBody());

		// Initialize classes, features, and operations; add parameters
		initEClass(dDocumentEClass, DDocument.class, "DDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDocument_Section(), this.getDDSection(), null, "section", null, 0, -1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocument_Name(), ecorePackage.getEString(), "name", null, 1, 1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocument_Id(), ecorePackage.getEString(), "id", null, 1, 1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocument_Issue(), ecorePackage.getEString(), "issue", null, 1, 1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocument_Revision(), ecorePackage.getEString(), "revision", null, 1, 1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDocument_Date(), ecorePackage.getEString(), "date", null, 1, 1, DDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddSectionEClass, DDSection.class, "DDSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDSection_SectionContent(), this.getDDSectionContent(), null, "sectionContent", null, 0, -1, DDSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDDSection_Name(), ecorePackage.getEString(), "name", null, 1, 1, DDSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddSectionContentEClass, DDSectionContent.class, "DDSectionContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddBodyEClass, DDBody.class, "DDBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //docPackageImpl
