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
package es.uah.aut.srg.micobs.doctpl.doctpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplFactory
 * @model kind="package"
 * @generated
 */
public interface doctplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "doctpl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/doctpl/doctpl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "micobs.doctpl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	doctplPackage eINSTANCE = es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl <em>DDocument Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDDocumentTemplate()
	 * @generated
	 */
	int DDOCUMENT_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE__FIGURES = 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE__TABLES = 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE__SECTIONS = 4;

	/**
	 * The number of structural features of the '<em>DDocument Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>DDocument Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceableObjectImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDReferenceableObject()
	 * @generated
	 */
	int DREFERENCEABLE_OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCEABLE_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>DReferenceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCEABLE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DReferenceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCEABLE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractRelatedDocumentImpl <em>DAbstract Related Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractRelatedDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractRelatedDocument()
	 * @generated
	 */
	int DABSTRACT_RELATED_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__NAME = DREFERENCEABLE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__TITLE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__ID = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__ISSUE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__REVISION = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__DATE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DAbstract Related Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DAbstract Related Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT = DREFERENCEABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DApplicableDocumentImpl <em>DApplicable Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DApplicableDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDApplicableDocument()
	 * @generated
	 */
	int DAPPLICABLE_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__NAME = DABSTRACT_RELATED_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__TITLE = DABSTRACT_RELATED_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__ID = DABSTRACT_RELATED_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__ISSUE = DABSTRACT_RELATED_DOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__REVISION = DABSTRACT_RELATED_DOCUMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__DATE = DABSTRACT_RELATED_DOCUMENT__DATE;

	/**
	 * The number of structural features of the '<em>DApplicable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT_FEATURE_COUNT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DApplicable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT_OPERATION_COUNT = DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceDocumentImpl <em>DReference Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDReferenceDocument()
	 * @generated
	 */
	int DREFERENCE_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__NAME = DABSTRACT_RELATED_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__TITLE = DABSTRACT_RELATED_DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__ID = DABSTRACT_RELATED_DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__ISSUE = DABSTRACT_RELATED_DOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__REVISION = DABSTRACT_RELATED_DOCUMENT__REVISION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__DATE = DABSTRACT_RELATED_DOCUMENT__DATE;

	/**
	 * The number of structural features of the '<em>DReference Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT_FEATURE_COUNT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DReference Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT_OPERATION_COUNT = DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyContentImpl <em>DBody Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBodyContent()
	 * @generated
	 */
	int DBODY_CONTENT = 15;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_CONTENT__ALIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>DBody Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DBody Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractFigureImpl <em>DAbstract Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractFigureImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractFigure()
	 * @generated
	 */
	int DABSTRACT_FIGURE = 4;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__ALIGNMENT = DBODY_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__NAME = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__CAPTION = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFigureFromFileImpl <em>DFigure From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFigureFromFileImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDFigureFromFile()
	 * @generated
	 */
	int DFIGURE_FROM_FILE = 5;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__ALIGNMENT = DABSTRACT_FIGURE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__NAME = DABSTRACT_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__CAPTION = DABSTRACT_FIGURE__CAPTION;

	/**
	 * The feature id for the '<em><b>Reference File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__REFERENCE_FILE = DABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__WIDTH = DABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE__HEIGHT = DABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DFigure From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE_FEATURE_COUNT = DABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DFigure From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FROM_FILE_OPERATION_COUNT = DABSTRACT_FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractTableImpl <em>DAbstract Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractTable()
	 * @generated
	 */
	int DABSTRACT_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__ALIGNMENT = DBODY_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__NAME = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__CAPTION = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAbstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DAbstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTableFromFileImpl <em>DTable From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTableFromFileImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDTableFromFile()
	 * @generated
	 */
	int DTABLE_FROM_FILE = 7;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__ALIGNMENT = DABSTRACT_TABLE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__NAME = DABSTRACT_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Reference File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__REFERENCE_FILE = DABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__WIDTH = DABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE__HEIGHT = DABSTRACT_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTable From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE_FEATURE_COUNT = DABSTRACT_TABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DTable From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_FILE_OPERATION_COUNT = DABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBasicTableImpl <em>DBasic Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBasicTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBasicTable()
	 * @generated
	 */
	int DBASIC_TABLE = 8;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__ALIGNMENT = DABSTRACT_TABLE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__NAME = DABSTRACT_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__ROWS = DABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DBasic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE_FEATURE_COUNT = DABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DBasic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE_OPERATION_COUNT = DABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRowImpl <em>DRow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRowImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDRow()
	 * @generated
	 */
	int DROW = 9;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>DRow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DRow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyImpl <em>DBody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBody()
	 * @generated
	 */
	int DBODY = 14;

	/**
	 * The feature id for the '<em><b>Body Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY__BODY_CONTENT = 0;

	/**
	 * The number of structural features of the '<em>DBody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DBody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl <em>DCell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDCell()
	 * @generated
	 */
	int DCELL = 10;

	/**
	 * The feature id for the '<em><b>Body Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__BODY_CONTENT = DBODY__BODY_CONTENT;

	/**
	 * The feature id for the '<em><b>Grid Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__GRID_SPAN = DBODY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VMerge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__VMERGE = DBODY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_FEATURE_COUNT = DBODY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_OPERATION_COUNT = DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractSectionImpl <em>DAbstract Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractSection()
	 * @generated
	 */
	int DABSTRACT_SECTION = 11;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION__SUBSECTIONS = 0;

	/**
	 * The number of structural features of the '<em>DAbstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DAbstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl <em>DFixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDFixedSection()
	 * @generated
	 */
	int DFIXED_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIXED_SECTION__SUBSECTIONS = DABSTRACT_SECTION__SUBSECTIONS;

	/**
	 * The number of structural features of the '<em>DFixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIXED_SECTION_FEATURE_COUNT = DABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DFixed Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIXED_SECTION_OPERATION_COUNT = DABSTRACT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl <em>DInstantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDInstantiableSection()
	 * @generated
	 */
	int DINSTANTIABLE_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__SUBSECTIONS = DABSTRACT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__NAME = DABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__DESCRIPTION = DABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DInstantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION_FEATURE_COUNT = DABSTRACT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DInstantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION_OPERATION_COUNT = DABSTRACT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphImpl <em>DParagraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDParagraph()
	 * @generated
	 */
	int DPARAGRAPH = 16;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__ALIGNMENT = DBODY_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Paragraph Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__PARAGRAPH_CONTENT = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphContentImpl <em>DParagraph Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDParagraphContent()
	 * @generated
	 */
	int DPARAGRAPH_CONTENT = 17;

	/**
	 * The number of structural features of the '<em>DParagraph Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DParagraph Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl <em>DRun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDRun()
	 * @generated
	 */
	int DRUN = 18;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__TEXT = DPARAGRAPH_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__BOLD = DPARAGRAPH_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Italics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__ITALICS = DPARAGRAPH_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__UNDERLINE = DPARAGRAPH_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DRun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN_FEATURE_COUNT = DPARAGRAPH_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DRun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN_OPERATION_COUNT = DPARAGRAPH_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTextImpl <em>DText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTextImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDText()
	 * @generated
	 */
	int DTEXT = 19;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DHyperlinkImpl <em>DHyperlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DHyperlinkImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDHyperlink()
	 * @generated
	 */
	int DHYPERLINK = 20;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHYPERLINK__RUN = DPARAGRAPH_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHYPERLINK__REFERENCE = DPARAGRAPH_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DHyperlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHYPERLINK_FEATURE_COUNT = DPARAGRAPH_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DHyperlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHYPERLINK_OPERATION_COUNT = DPARAGRAPH_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListContentImpl <em>DList Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDListContent()
	 * @generated
	 */
	int DLIST_CONTENT = 22;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_CONTENT__ALIGNMENT = DBODY_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_CONTENT__ITEMS = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DList Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_CONTENT_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DList Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_CONTENT_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl <em>DList Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDListItem()
	 * @generated
	 */
	int DLIST_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_ITEM__PARAGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Sublist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_ITEM__SUBLIST = 1;

	/**
	 * The number of structural features of the '<em>DList Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DList Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DItemizeImpl <em>DItemize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DItemizeImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDItemize()
	 * @generated
	 */
	int DITEMIZE = 24;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DITEMIZE__ALIGNMENT = DLIST_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DITEMIZE__ITEMS = DLIST_CONTENT__ITEMS;

	/**
	 * The number of structural features of the '<em>DItemize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DITEMIZE_FEATURE_COUNT = DLIST_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DItemize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DITEMIZE_OPERATION_COUNT = DLIST_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DEnumerateImpl <em>DEnumerate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DEnumerateImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDEnumerate()
	 * @generated
	 */
	int DENUMERATE = 25;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATE__ALIGNMENT = DLIST_CONTENT__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATE__ITEMS = DLIST_CONTENT__ITEMS;

	/**
	 * The number of structural features of the '<em>DEnumerate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATE_FEATURE_COUNT = DLIST_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DEnumerate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATE_OPERATION_COUNT = DLIST_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType <em>DMerge Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDMergeType()
	 * @generated
	 */
	int DMERGE_TYPE = 26;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment <em>DAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAlignment()
	 * @generated
	 */
	int DALIGNMENT = 27;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate <em>DDocument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDocument Template</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate
	 * @generated
	 */
	EClass getDDocumentTemplate();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getApplicableDocuments()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_ApplicableDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getReferenceDocuments()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_ReferenceDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Figures</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getFigures()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Figures();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getTables()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Tables();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DDocumentTemplate#getSections()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Sections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument <em>DAbstract Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Related Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument
	 * @generated
	 */
	EClass getDAbstractRelatedDocument();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getTitle()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getId()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getIssue()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getRevision()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Revision();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractRelatedDocument#getDate()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Date();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument <em>DApplicable Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DApplicable Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DApplicableDocument
	 * @generated
	 */
	EClass getDApplicableDocument();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument <em>DReference Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReference Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceDocument
	 * @generated
	 */
	EClass getDReferenceDocument();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure <em>DAbstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Figure</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure
	 * @generated
	 */
	EClass getDAbstractFigure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractFigure#getCaption()
	 * @see #getDAbstractFigure()
	 * @generated
	 */
	EAttribute getDAbstractFigure_Caption();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile <em>DFigure From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFigure From File</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile
	 * @generated
	 */
	EClass getDFigureFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getReferenceFile <em>Reference File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference File</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getReferenceFile()
	 * @see #getDFigureFromFile()
	 * @generated
	 */
	EAttribute getDFigureFromFile_ReferenceFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getWidth()
	 * @see #getDFigureFromFile()
	 * @generated
	 */
	EAttribute getDFigureFromFile_Width();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFigureFromFile#getHeight()
	 * @see #getDFigureFromFile()
	 * @generated
	 */
	EAttribute getDFigureFromFile_Height();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable <em>DAbstract Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Table</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable
	 * @generated
	 */
	EClass getDAbstractTable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractTable#getCaption()
	 * @see #getDAbstractTable()
	 * @generated
	 */
	EAttribute getDAbstractTable_Caption();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile <em>DTable From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTable From File</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile
	 * @generated
	 */
	EClass getDTableFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getReferenceFile <em>Reference File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference File</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getReferenceFile()
	 * @see #getDTableFromFile()
	 * @generated
	 */
	EAttribute getDTableFromFile_ReferenceFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getWidth()
	 * @see #getDTableFromFile()
	 * @generated
	 */
	EAttribute getDTableFromFile_Width();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DTableFromFile#getHeight()
	 * @see #getDTableFromFile()
	 * @generated
	 */
	EAttribute getDTableFromFile_Height();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable <em>DBasic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBasic Table</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable
	 * @generated
	 */
	EClass getDBasicTable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBasicTable#getRows()
	 * @see #getDBasicTable()
	 * @generated
	 */
	EReference getDBasicTable_Rows();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRow <em>DRow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRow</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRow
	 * @generated
	 */
	EClass getDRow();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRow#getCells()
	 * @see #getDRow()
	 * @generated
	 */
	EReference getDRow_Cells();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell <em>DCell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCell</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DCell
	 * @generated
	 */
	EClass getDCell();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getGridSpan <em>Grid Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Span</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getGridSpan()
	 * @see #getDCell()
	 * @generated
	 */
	EAttribute getDCell_GridSpan();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge <em>VMerge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VMerge</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge()
	 * @see #getDCell()
	 * @generated
	 */
	EAttribute getDCell_VMerge();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection <em>DAbstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection
	 * @generated
	 */
	EClass getDAbstractSection();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection#getSubsections <em>Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAbstractSection#getSubsections()
	 * @see #getDAbstractSection()
	 * @generated
	 */
	EReference getDAbstractSection_Subsections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection <em>DFixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DFixedSection
	 * @generated
	 */
	EClass getDFixedSection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection <em>DInstantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInstantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DInstantiableSection
	 * @generated
	 */
	EClass getDInstantiableSection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBody <em>DBody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBody</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBody
	 * @generated
	 */
	EClass getDBody();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBody#getBodyContent <em>Body Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBody#getBodyContent()
	 * @see #getDBody()
	 * @generated
	 */
	EReference getDBody_BodyContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent <em>DBody Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBody Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent
	 * @generated
	 */
	EClass getDBodyContent();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment()
	 * @see #getDBodyContent()
	 * @generated
	 */
	EAttribute getDBodyContent_Alignment();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph <em>DParagraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph
	 * @generated
	 */
	EClass getDParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph#getParagraphContent <em>Paragraph Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraph Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DParagraph#getParagraphContent()
	 * @see #getDParagraph()
	 * @generated
	 */
	EReference getDParagraph_ParagraphContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DParagraphContent <em>DParagraph Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DParagraphContent
	 * @generated
	 */
	EClass getDParagraphContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun <em>DRun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRun</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRun
	 * @generated
	 */
	EClass getDRun();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRun#getText()
	 * @see #getDRun()
	 * @generated
	 */
	EReference getDRun_Text();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isBold()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Bold();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isItalics <em>Italics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italics</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isItalics()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Italics();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DRun#isUnderline()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Underline();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DText <em>DText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DText</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DText
	 * @generated
	 */
	EClass getDText();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DText#getContent()
	 * @see #getDText()
	 * @generated
	 */
	EAttribute getDText_Content();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink <em>DHyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DHyperlink</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink
	 * @generated
	 */
	EClass getDHyperlink();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink#getRun()
	 * @see #getDHyperlink()
	 * @generated
	 */
	EReference getDHyperlink_Run();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DHyperlink#getReference()
	 * @see #getDHyperlink()
	 * @generated
	 */
	EReference getDHyperlink_Reference();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject <em>DReferenceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReferenceable Object</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject
	 * @generated
	 */
	EClass getDReferenceableObject();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DReferenceableObject#getName()
	 * @see #getDReferenceableObject()
	 * @generated
	 */
	EAttribute getDReferenceableObject_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListContent <em>DList Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DList Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DListContent
	 * @generated
	 */
	EClass getDListContent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListContent#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DListContent#getItems()
	 * @see #getDListContent()
	 * @generated
	 */
	EReference getDListContent_Items();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem <em>DList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DList Item</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DListItem
	 * @generated
	 */
	EClass getDListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraph</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getParagraph()
	 * @see #getDListItem()
	 * @generated
	 */
	EReference getDListItem_Paragraph();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getSublist <em>Sublist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sublist</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DListItem#getSublist()
	 * @see #getDListItem()
	 * @generated
	 */
	EReference getDListItem_Sublist();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DItemize <em>DItemize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DItemize</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DItemize
	 * @generated
	 */
	EClass getDItemize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DEnumerate <em>DEnumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEnumerate</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DEnumerate
	 * @generated
	 */
	EClass getDEnumerate();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType <em>DMerge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DMerge Type</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType
	 * @generated
	 */
	EEnum getDMergeType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment <em>DAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAlignment</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment
	 * @generated
	 */
	EEnum getDAlignment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	doctplFactory getdoctplFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl <em>DDocument Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DDocumentTemplateImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDDocumentTemplate()
		 * @generated
		 */
		EClass DDOCUMENT_TEMPLATE = eINSTANCE.getDDocumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT_TEMPLATE__APPLICABLE_DOCUMENTS = eINSTANCE.getDDocumentTemplate_ApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT_TEMPLATE__REFERENCE_DOCUMENTS = eINSTANCE.getDDocumentTemplate_ReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT_TEMPLATE__FIGURES = eINSTANCE.getDDocumentTemplate_Figures();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT_TEMPLATE__TABLES = eINSTANCE.getDDocumentTemplate_Tables();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT_TEMPLATE__SECTIONS = eINSTANCE.getDDocumentTemplate_Sections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractRelatedDocumentImpl <em>DAbstract Related Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractRelatedDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractRelatedDocument()
		 * @generated
		 */
		EClass DABSTRACT_RELATED_DOCUMENT = eINSTANCE.getDAbstractRelatedDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_RELATED_DOCUMENT__TITLE = eINSTANCE.getDAbstractRelatedDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_RELATED_DOCUMENT__ID = eINSTANCE.getDAbstractRelatedDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_RELATED_DOCUMENT__ISSUE = eINSTANCE.getDAbstractRelatedDocument_Issue();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_RELATED_DOCUMENT__REVISION = eINSTANCE.getDAbstractRelatedDocument_Revision();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_RELATED_DOCUMENT__DATE = eINSTANCE.getDAbstractRelatedDocument_Date();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DApplicableDocumentImpl <em>DApplicable Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DApplicableDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDApplicableDocument()
		 * @generated
		 */
		EClass DAPPLICABLE_DOCUMENT = eINSTANCE.getDApplicableDocument();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceDocumentImpl <em>DReference Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDReferenceDocument()
		 * @generated
		 */
		EClass DREFERENCE_DOCUMENT = eINSTANCE.getDReferenceDocument();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractFigureImpl <em>DAbstract Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractFigureImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractFigure()
		 * @generated
		 */
		EClass DABSTRACT_FIGURE = eINSTANCE.getDAbstractFigure();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_FIGURE__CAPTION = eINSTANCE.getDAbstractFigure_Caption();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFigureFromFileImpl <em>DFigure From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFigureFromFileImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDFigureFromFile()
		 * @generated
		 */
		EClass DFIGURE_FROM_FILE = eINSTANCE.getDFigureFromFile();

		/**
		 * The meta object literal for the '<em><b>Reference File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIGURE_FROM_FILE__REFERENCE_FILE = eINSTANCE.getDFigureFromFile_ReferenceFile();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIGURE_FROM_FILE__WIDTH = eINSTANCE.getDFigureFromFile_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFIGURE_FROM_FILE__HEIGHT = eINSTANCE.getDFigureFromFile_Height();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractTableImpl <em>DAbstract Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractTable()
		 * @generated
		 */
		EClass DABSTRACT_TABLE = eINSTANCE.getDAbstractTable();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_TABLE__CAPTION = eINSTANCE.getDAbstractTable_Caption();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTableFromFileImpl <em>DTable From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTableFromFileImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDTableFromFile()
		 * @generated
		 */
		EClass DTABLE_FROM_FILE = eINSTANCE.getDTableFromFile();

		/**
		 * The meta object literal for the '<em><b>Reference File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTABLE_FROM_FILE__REFERENCE_FILE = eINSTANCE.getDTableFromFile_ReferenceFile();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTABLE_FROM_FILE__WIDTH = eINSTANCE.getDTableFromFile_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTABLE_FROM_FILE__HEIGHT = eINSTANCE.getDTableFromFile_Height();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBasicTableImpl <em>DBasic Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBasicTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBasicTable()
		 * @generated
		 */
		EClass DBASIC_TABLE = eINSTANCE.getDBasicTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBASIC_TABLE__ROWS = eINSTANCE.getDBasicTable_Rows();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRowImpl <em>DRow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRowImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDRow()
		 * @generated
		 */
		EClass DROW = eINSTANCE.getDRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROW__CELLS = eINSTANCE.getDRow_Cells();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl <em>DCell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DCellImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDCell()
		 * @generated
		 */
		EClass DCELL = eINSTANCE.getDCell();

		/**
		 * The meta object literal for the '<em><b>Grid Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCELL__GRID_SPAN = eINSTANCE.getDCell_GridSpan();

		/**
		 * The meta object literal for the '<em><b>VMerge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCELL__VMERGE = eINSTANCE.getDCell_VMerge();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractSectionImpl <em>DAbstract Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DAbstractSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAbstractSection()
		 * @generated
		 */
		EClass DABSTRACT_SECTION = eINSTANCE.getDAbstractSection();

		/**
		 * The meta object literal for the '<em><b>Subsections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_SECTION__SUBSECTIONS = eINSTANCE.getDAbstractSection_Subsections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl <em>DFixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDFixedSection()
		 * @generated
		 */
		EClass DFIXED_SECTION = eINSTANCE.getDFixedSection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl <em>DInstantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDInstantiableSection()
		 * @generated
		 */
		EClass DINSTANTIABLE_SECTION = eINSTANCE.getDInstantiableSection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyImpl <em>DBody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBody()
		 * @generated
		 */
		EClass DBODY = eINSTANCE.getDBody();

		/**
		 * The meta object literal for the '<em><b>Body Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBODY__BODY_CONTENT = eINSTANCE.getDBody_BodyContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyContentImpl <em>DBody Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DBodyContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDBodyContent()
		 * @generated
		 */
		EClass DBODY_CONTENT = eINSTANCE.getDBodyContent();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBODY_CONTENT__ALIGNMENT = eINSTANCE.getDBodyContent_Alignment();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphImpl <em>DParagraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDParagraph()
		 * @generated
		 */
		EClass DPARAGRAPH = eINSTANCE.getDParagraph();

		/**
		 * The meta object literal for the '<em><b>Paragraph Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH__PARAGRAPH_CONTENT = eINSTANCE.getDParagraph_ParagraphContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphContentImpl <em>DParagraph Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DParagraphContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDParagraphContent()
		 * @generated
		 */
		EClass DPARAGRAPH_CONTENT = eINSTANCE.getDParagraphContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl <em>DRun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DRunImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDRun()
		 * @generated
		 */
		EClass DRUN = eINSTANCE.getDRun();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRUN__TEXT = eINSTANCE.getDRun_Text();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUN__BOLD = eINSTANCE.getDRun_Bold();

		/**
		 * The meta object literal for the '<em><b>Italics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUN__ITALICS = eINSTANCE.getDRun_Italics();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUN__UNDERLINE = eINSTANCE.getDRun_Underline();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTextImpl <em>DText</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DTextImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDText()
		 * @generated
		 */
		EClass DTEXT = eINSTANCE.getDText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTEXT__CONTENT = eINSTANCE.getDText_Content();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DHyperlinkImpl <em>DHyperlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DHyperlinkImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDHyperlink()
		 * @generated
		 */
		EClass DHYPERLINK = eINSTANCE.getDHyperlink();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DHYPERLINK__RUN = eINSTANCE.getDHyperlink_Run();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DHYPERLINK__REFERENCE = eINSTANCE.getDHyperlink_Reference();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DReferenceableObjectImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDReferenceableObject()
		 * @generated
		 */
		EClass DREFERENCEABLE_OBJECT = eINSTANCE.getDReferenceableObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DREFERENCEABLE_OBJECT__NAME = eINSTANCE.getDReferenceableObject_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListContentImpl <em>DList Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDListContent()
		 * @generated
		 */
		EClass DLIST_CONTENT = eINSTANCE.getDListContent();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DLIST_CONTENT__ITEMS = eINSTANCE.getDListContent_Items();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl <em>DList Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DListItemImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDListItem()
		 * @generated
		 */
		EClass DLIST_ITEM = eINSTANCE.getDListItem();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DLIST_ITEM__PARAGRAPH = eINSTANCE.getDListItem_Paragraph();

		/**
		 * The meta object literal for the '<em><b>Sublist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DLIST_ITEM__SUBLIST = eINSTANCE.getDListItem_Sublist();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DItemizeImpl <em>DItemize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DItemizeImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDItemize()
		 * @generated
		 */
		EClass DITEMIZE = eINSTANCE.getDItemize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.impl.DEnumerateImpl <em>DEnumerate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.DEnumerateImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDEnumerate()
		 * @generated
		 */
		EClass DENUMERATE = eINSTANCE.getDEnumerate();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType <em>DMerge Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDMergeType()
		 * @generated
		 */
		EEnum DMERGE_TYPE = eINSTANCE.getDMergeType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment <em>DAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment
		 * @see es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplPackageImpl#getDAlignment()
		 * @generated
		 */
		EEnum DALIGNMENT = eINSTANCE.getDAlignment();

	}

} //doctplPackage
