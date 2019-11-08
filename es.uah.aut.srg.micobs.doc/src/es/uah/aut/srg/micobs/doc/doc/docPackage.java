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
package es.uah.aut.srg.micobs.doc.doc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.doc.doc.docFactory
 * @model kind="package"
 * @generated
 */
public interface docPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "doc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/doc/doc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "micobs.doc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	docPackage eINSTANCE = es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDocumentImpl <em>DDocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDocumentImpl
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDocument()
	 * @generated
	 */
	int DDOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__SECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__ISSUE = 3;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__REVISION = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__DATE = 5;

	/**
	 * The number of structural features of the '<em>DDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>DDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDSectionContentImpl <em>DD Section Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDSectionContentImpl
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDSectionContent()
	 * @generated
	 */
	int DD_SECTION_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>DD Section Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DD Section Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDSectionImpl <em>DD Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDSectionImpl
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDSection()
	 * @generated
	 */
	int DD_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Section Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION__SECTION_CONTENT = DD_SECTION_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION__NAME = DD_SECTION_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DD Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION_FEATURE_COUNT = DD_SECTION_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DD Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_SECTION_OPERATION_COUNT = DD_SECTION_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDBodyImpl <em>DD Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDBodyImpl
	 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDBody()
	 * @generated
	 */
	int DD_BODY = 3;

	/**
	 * The feature id for the '<em><b>Body Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_BODY__BODY_CONTENT = DD_SECTION_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DD Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_BODY_FEATURE_COUNT = DD_SECTION_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DD Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_BODY_OPERATION_COUNT = DD_SECTION_CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doc.doc.DDocument <em>DDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDocument</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument
	 * @generated
	 */
	EClass getDDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getSection()
	 * @see #getDDocument()
	 * @generated
	 */
	EReference getDDocument_Section();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getName()
	 * @see #getDDocument()
	 * @generated
	 */
	EAttribute getDDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getId()
	 * @see #getDDocument()
	 * @generated
	 */
	EAttribute getDDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getIssue()
	 * @see #getDDocument()
	 * @generated
	 */
	EAttribute getDDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getRevision()
	 * @see #getDDocument()
	 * @generated
	 */
	EAttribute getDDocument_Revision();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDocument#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDocument#getDate()
	 * @see #getDDocument()
	 * @generated
	 */
	EAttribute getDDocument_Date();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doc.doc.DDSection <em>DD Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DD Section</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDSection
	 * @generated
	 */
	EClass getDDSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doc.doc.DDSection#getSectionContent <em>Section Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section Content</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDSection#getSectionContent()
	 * @see #getDDSection()
	 * @generated
	 */
	EReference getDDSection_SectionContent();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doc.doc.DDSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDSection#getName()
	 * @see #getDDSection()
	 * @generated
	 */
	EAttribute getDDSection_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doc.doc.DDSectionContent <em>DD Section Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DD Section Content</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDSectionContent
	 * @generated
	 */
	EClass getDDSectionContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doc.doc.DDBody <em>DD Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DD Body</em>'.
	 * @see es.uah.aut.srg.micobs.doc.doc.DDBody
	 * @generated
	 */
	EClass getDDBody();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	docFactory getdocFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDocumentImpl <em>DDocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDocumentImpl
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDocument()
		 * @generated
		 */
		EClass DDOCUMENT = eINSTANCE.getDDocument();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT__SECTION = eINSTANCE.getDDocument_Section();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDOCUMENT__NAME = eINSTANCE.getDDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDOCUMENT__ID = eINSTANCE.getDDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDOCUMENT__ISSUE = eINSTANCE.getDDocument_Issue();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDOCUMENT__REVISION = eINSTANCE.getDDocument_Revision();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDOCUMENT__DATE = eINSTANCE.getDDocument_Date();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDSectionImpl <em>DD Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDSectionImpl
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDSection()
		 * @generated
		 */
		EClass DD_SECTION = eINSTANCE.getDDSection();

		/**
		 * The meta object literal for the '<em><b>Section Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DD_SECTION__SECTION_CONTENT = eINSTANCE.getDDSection_SectionContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_SECTION__NAME = eINSTANCE.getDDSection_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDSectionContentImpl <em>DD Section Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDSectionContentImpl
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDSectionContent()
		 * @generated
		 */
		EClass DD_SECTION_CONTENT = eINSTANCE.getDDSectionContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doc.doc.impl.DDBodyImpl <em>DD Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.DDBodyImpl
		 * @see es.uah.aut.srg.micobs.doc.doc.impl.docPackageImpl#getDDBody()
		 * @generated
		 */
		EClass DD_BODY = eINSTANCE.getDDBody();

	}

} //docPackage
