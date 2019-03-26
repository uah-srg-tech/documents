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
package es.uah.aut.srg.micobs.doctpl.doc;

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
 * @see es.uah.aut.srg.micobs.doctpl.doc.docFactory
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
	String eNS_URI = "http://srg.aut.uah.es/micobs/doctpl/doc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "doctpl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	docPackage eINSTANCE = es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl <em>DDocument Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDDocumentTemplate()
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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceableObject()
	 * @generated
	 */
	int DREFERENCEABLE_OBJECT = 22;

	/**
	 * The number of structural features of the '<em>DReferenceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCEABLE_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DReferenceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCEABLE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractRelatedDocumentImpl <em>DAbstract Related Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractRelatedDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractRelatedDocument()
	 * @generated
	 */
	int DABSTRACT_RELATED_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__TITLE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__ISSUE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__REVISION = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ref Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT__REF_DOCUMENT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DAbstract Related Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DAbstract Related Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT = DREFERENCEABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DApplicableDocumentImpl <em>DApplicable Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DApplicableDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDApplicableDocument()
	 * @generated
	 */
	int DAPPLICABLE_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__TITLE = DABSTRACT_RELATED_DOCUMENT__TITLE;

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
	 * The feature id for the '<em><b>Ref Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__REF_DOCUMENT = DABSTRACT_RELATED_DOCUMENT__REF_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT__DOCUMENT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DApplicable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT_FEATURE_COUNT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DApplicable Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAPPLICABLE_DOCUMENT_OPERATION_COUNT = DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceDocumentImpl <em>DReference Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceDocument()
	 * @generated
	 */
	int DREFERENCE_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__TITLE = DABSTRACT_RELATED_DOCUMENT__TITLE;

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
	 * The feature id for the '<em><b>Ref Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__REF_DOCUMENT = DABSTRACT_RELATED_DOCUMENT__REF_DOCUMENT;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT__DOCUMENT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DReference Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT_FEATURE_COUNT = DABSTRACT_RELATED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DReference Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DREFERENCE_DOCUMENT_OPERATION_COUNT = DABSTRACT_RELATED_DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyContentImpl <em>DBody Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBodyContent()
	 * @generated
	 */
	int DBODY_CONTENT = 16;

	/**
	 * The number of structural features of the '<em>DBody Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DBody Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractFigureImpl <em>DAbstract Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractFigureImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractFigure()
	 * @generated
	 */
	int DABSTRACT_FIGURE = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__REFERENCE = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__CAPTION = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__DOCUMENT = DBODY_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DFigureImpl <em>DFigure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DFigureImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDFigure()
	 * @generated
	 */
	int DFIGURE = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE__REFERENCE = DABSTRACT_FIGURE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE__CAPTION = DABSTRACT_FIGURE__CAPTION;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE__DOCUMENT = DABSTRACT_FIGURE__DOCUMENT;

	/**
	 * The number of structural features of the '<em>DFigure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_FEATURE_COUNT = DABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DFigure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIGURE_OPERATION_COUNT = DABSTRACT_FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl <em>DAbstract Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractTable()
	 * @generated
	 */
	int DABSTRACT_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__CAPTION = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__DOCUMENT = DBODY_CONTENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DPictureAsTableImpl <em>DPicture As Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DPictureAsTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDPictureAsTable()
	 * @generated
	 */
	int DPICTURE_AS_TABLE = 7;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPICTURE_AS_TABLE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPICTURE_AS_TABLE__DOCUMENT = DABSTRACT_TABLE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPICTURE_AS_TABLE__REFERENCE = DABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DPicture As Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPICTURE_AS_TABLE_FEATURE_COUNT = DABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DPicture As Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPICTURE_AS_TABLE_OPERATION_COUNT = DABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBasicTableImpl <em>DBasic Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBasicTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBasicTable()
	 * @generated
	 */
	int DBASIC_TABLE = 8;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBASIC_TABLE__DOCUMENT = DABSTRACT_TABLE__DOCUMENT;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRowImpl <em>DRow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DRowImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRow()
	 * @generated
	 */
	int DROW = 9;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW__SPAN = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>DRow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DRow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl <em>DColumn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDColumn()
	 * @generated
	 */
	int DCOLUMN = 10;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN__SPAN = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN__CELLS = 1;

	/**
	 * The number of structural features of the '<em>DColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl <em>DBody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBody()
	 * @generated
	 */
	int DBODY = 15;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY__BCONTENT = 0;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl <em>DCell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDCell()
	 * @generated
	 */
	int DCELL = 11;

	/**
	 * The feature id for the '<em><b>BContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__BCONTENT = DBODY__BCONTENT;

	/**
	 * The number of structural features of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_FEATURE_COUNT = DBODY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_OPERATION_COUNT = DBODY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractSectionImpl <em>DAbstract Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractSection()
	 * @generated
	 */
	int DABSTRACT_SECTION = 12;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION__SUBSECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION__DOCUMENT = 1;

	/**
	 * The number of structural features of the '<em>DAbstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DAbstract Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl <em>DFixed Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDFixedSection()
	 * @generated
	 */
	int DFIXED_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIXED_SECTION__SUBSECTIONS = DABSTRACT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFIXED_SECTION__DOCUMENT = DABSTRACT_SECTION__DOCUMENT;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DInstantiableSectionImpl <em>DInstantiable Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DInstantiableSectionImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDInstantiableSection()
	 * @generated
	 */
	int DINSTANTIABLE_SECTION = 14;

	/**
	 * The feature id for the '<em><b>Subsections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__SUBSECTIONS = DABSTRACT_SECTION__SUBSECTIONS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__DOCUMENT = DABSTRACT_SECTION__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION__NAME = DABSTRACT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DInstantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION_FEATURE_COUNT = DABSTRACT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DInstantiable Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANTIABLE_SECTION_OPERATION_COUNT = DABSTRACT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl <em>DParagraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraph()
	 * @generated
	 */
	int DPARAGRAPH = 17;

	/**
	 * The feature id for the '<em><b>PContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__PCONTENT = DBODY_CONTENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl <em>DParagraph Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraphContent()
	 * @generated
	 */
	int DPARAGRAPH_CONTENT = 18;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl <em>DRun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRun()
	 * @generated
	 */
	int DRUN = 19;

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
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__ITALIC = DPARAGRAPH_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Underscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__UNDERSCORE = DPARAGRAPH_CONTENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl <em>DText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDText()
	 * @generated
	 */
	int DTEXT = 20;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DHyperlinkImpl <em>DHyperlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DHyperlinkImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDHyperlink()
	 * @generated
	 */
	int DHYPERLINK = 21;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DListContentImpl <em>DList Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DListContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDListContent()
	 * @generated
	 */
	int DLIST_CONTENT = 23;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DListItemImpl <em>DList Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DListItemImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDListItem()
	 * @generated
	 */
	int DLIST_ITEM = 24;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DItemizeImpl <em>DItemize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DItemizeImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDItemize()
	 * @generated
	 */
	int DITEMIZE = 25;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DEnumerateImpl <em>DEnumerate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DEnumerateImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDEnumerate()
	 * @generated
	 */
	int DENUMERATE = 26;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable <em>DRun Format Enable Disable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRunFormatEnableDisable()
	 * @generated
	 */
	int DRUN_FORMAT_ENABLE_DISABLE = 27;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate <em>DDocument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDocument Template</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate
	 * @generated
	 */
	EClass getDDocumentTemplate();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getApplicableDocuments()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_ApplicableDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getReferenceDocuments()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_ReferenceDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Figures</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getFigures()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Figures();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getTables()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Tables();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocumentTemplate#getSections()
	 * @see #getDDocumentTemplate()
	 * @generated
	 */
	EReference getDDocumentTemplate_Sections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument <em>DAbstract Related Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Related Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument
	 * @generated
	 */
	EClass getDAbstractRelatedDocument();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getTitle()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getIssue()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Issue();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getRevision()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EAttribute getDAbstractRelatedDocument_Revision();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getRefDocument <em>Ref Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractRelatedDocument#getRefDocument()
	 * @see #getDAbstractRelatedDocument()
	 * @generated
	 */
	EReference getDAbstractRelatedDocument_RefDocument();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument <em>DApplicable Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DApplicable Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument
	 * @generated
	 */
	EClass getDApplicableDocument();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DApplicableDocument#getDocument()
	 * @see #getDApplicableDocument()
	 * @generated
	 */
	EReference getDApplicableDocument_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument <em>DReference Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReference Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument
	 * @generated
	 */
	EClass getDReferenceDocument();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DReferenceDocument#getDocument()
	 * @see #getDReferenceDocument()
	 * @generated
	 */
	EReference getDReferenceDocument_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure <em>DAbstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Figure</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure
	 * @generated
	 */
	EClass getDAbstractFigure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getReference()
	 * @see #getDAbstractFigure()
	 * @generated
	 */
	EAttribute getDAbstractFigure_Reference();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getCaption()
	 * @see #getDAbstractFigure()
	 * @generated
	 */
	EAttribute getDAbstractFigure_Caption();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractFigure#getDocument()
	 * @see #getDAbstractFigure()
	 * @generated
	 */
	EReference getDAbstractFigure_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DFigure <em>DFigure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFigure</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DFigure
	 * @generated
	 */
	EClass getDFigure();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable <em>DAbstract Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Table</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable
	 * @generated
	 */
	EClass getDAbstractTable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable#getCaption()
	 * @see #getDAbstractTable()
	 * @generated
	 */
	EAttribute getDAbstractTable_Caption();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractTable#getDocument()
	 * @see #getDAbstractTable()
	 * @generated
	 */
	EReference getDAbstractTable_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DPictureAsTable <em>DPicture As Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPicture As Table</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DPictureAsTable
	 * @generated
	 */
	EClass getDPictureAsTable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DPictureAsTable#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DPictureAsTable#getReference()
	 * @see #getDPictureAsTable()
	 * @generated
	 */
	EAttribute getDPictureAsTable_Reference();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBasicTable <em>DBasic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBasic Table</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBasicTable
	 * @generated
	 */
	EClass getDBasicTable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DBasicTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBasicTable#getRows()
	 * @see #getDBasicTable()
	 * @generated
	 */
	EReference getDBasicTable_Rows();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DRow <em>DRow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRow</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRow
	 * @generated
	 */
	EClass getDRow();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DRow#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRow#getSpan()
	 * @see #getDRow()
	 * @generated
	 */
	EAttribute getDRow_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DRow#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRow#getColumns()
	 * @see #getDRow()
	 * @generated
	 */
	EReference getDRow_Columns();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DColumn <em>DColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DColumn</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DColumn
	 * @generated
	 */
	EClass getDColumn();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DColumn#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DColumn#getSpan()
	 * @see #getDColumn()
	 * @generated
	 */
	EAttribute getDColumn_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DColumn#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DColumn#getCells()
	 * @see #getDColumn()
	 * @generated
	 */
	EReference getDColumn_Cells();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DCell <em>DCell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCell</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DCell
	 * @generated
	 */
	EClass getDCell();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection <em>DAbstract Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection
	 * @generated
	 */
	EClass getDAbstractSection();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection#getSubsections <em>Subsections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsections</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection#getSubsections()
	 * @see #getDAbstractSection()
	 * @generated
	 */
	EReference getDAbstractSection_Subsections();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractSection#getDocument()
	 * @see #getDAbstractSection()
	 * @generated
	 */
	EReference getDAbstractSection_Document();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DFixedSection <em>DFixed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFixed Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DFixedSection
	 * @generated
	 */
	EClass getDFixedSection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection <em>DInstantiable Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInstantiable Section</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection
	 * @generated
	 */
	EClass getDInstantiableSection();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DInstantiableSection#getName()
	 * @see #getDInstantiableSection()
	 * @generated
	 */
	EAttribute getDInstantiableSection_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBody <em>DBody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBody</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBody
	 * @generated
	 */
	EClass getDBody();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DBody#getBContent <em>BContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BContent</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBody#getBContent()
	 * @see #getDBody()
	 * @generated
	 */
	EReference getDBody_BContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBodyContent <em>DBody Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBody Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBodyContent
	 * @generated
	 */
	EClass getDBodyContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph <em>DParagraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph
	 * @generated
	 */
	EClass getDParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getPContent <em>PContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PContent</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getPContent()
	 * @see #getDParagraph()
	 * @generated
	 */
	EReference getDParagraph_PContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphContent <em>DParagraph Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraphContent
	 * @generated
	 */
	EClass getDParagraphContent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun <em>DRun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRun</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRun
	 * @generated
	 */
	EClass getDRun();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRun#getText()
	 * @see #getDRun()
	 * @generated
	 */
	EReference getDRun_Text();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRun#getBold()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Bold();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRun#getItalic()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Italic();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DRun#getUnderscore <em>Underscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underscore</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRun#getUnderscore()
	 * @see #getDRun()
	 * @generated
	 */
	EAttribute getDRun_Underscore();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DText <em>DText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DText</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DText
	 * @generated
	 */
	EClass getDText();

	/**
	 * Returns the meta object for the attribute list '{@link es.uah.aut.srg.micobs.doctpl.doc.DText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DText#getContent()
	 * @see #getDText()
	 * @generated
	 */
	EAttribute getDText_Content();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink <em>DHyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DHyperlink</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DHyperlink
	 * @generated
	 */
	EClass getDHyperlink();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getRun()
	 * @see #getDHyperlink()
	 * @generated
	 */
	EReference getDHyperlink_Run();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getReference()
	 * @see #getDHyperlink()
	 * @generated
	 */
	EReference getDHyperlink_Reference();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DReferenceableObject <em>DReferenceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReferenceable Object</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DReferenceableObject
	 * @generated
	 */
	EClass getDReferenceableObject();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DListContent <em>DList Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DList Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DListContent
	 * @generated
	 */
	EClass getDListContent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DListContent#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DListContent#getItems()
	 * @see #getDListContent()
	 * @generated
	 */
	EReference getDListContent_Items();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DListItem <em>DList Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DList Item</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DListItem
	 * @generated
	 */
	EClass getDListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DListItem#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraph</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DListItem#getParagraph()
	 * @see #getDListItem()
	 * @generated
	 */
	EReference getDListItem_Paragraph();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DListItem#getSublist <em>Sublist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sublist</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DListItem#getSublist()
	 * @see #getDListItem()
	 * @generated
	 */
	EReference getDListItem_Sublist();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DItemize <em>DItemize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DItemize</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DItemize
	 * @generated
	 */
	EClass getDItemize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DEnumerate <em>DEnumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEnumerate</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DEnumerate
	 * @generated
	 */
	EClass getDEnumerate();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable <em>DRun Format Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DRun Format Enable Disable</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
	 * @generated
	 */
	EEnum getDRunFormatEnableDisable();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl <em>DDocument Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentTemplateImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDDocumentTemplate()
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractRelatedDocumentImpl <em>DAbstract Related Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractRelatedDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractRelatedDocument()
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
		 * The meta object literal for the '<em><b>Ref Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_RELATED_DOCUMENT__REF_DOCUMENT = eINSTANCE.getDAbstractRelatedDocument_RefDocument();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DApplicableDocumentImpl <em>DApplicable Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DApplicableDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDApplicableDocument()
		 * @generated
		 */
		EClass DAPPLICABLE_DOCUMENT = eINSTANCE.getDApplicableDocument();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAPPLICABLE_DOCUMENT__DOCUMENT = eINSTANCE.getDApplicableDocument_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceDocumentImpl <em>DReference Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceDocument()
		 * @generated
		 */
		EClass DREFERENCE_DOCUMENT = eINSTANCE.getDReferenceDocument();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DREFERENCE_DOCUMENT__DOCUMENT = eINSTANCE.getDReferenceDocument_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractFigureImpl <em>DAbstract Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractFigureImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractFigure()
		 * @generated
		 */
		EClass DABSTRACT_FIGURE = eINSTANCE.getDAbstractFigure();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_FIGURE__REFERENCE = eINSTANCE.getDAbstractFigure_Reference();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_FIGURE__CAPTION = eINSTANCE.getDAbstractFigure_Caption();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_FIGURE__DOCUMENT = eINSTANCE.getDAbstractFigure_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DFigureImpl <em>DFigure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DFigureImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDFigure()
		 * @generated
		 */
		EClass DFIGURE = eINSTANCE.getDFigure();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl <em>DAbstract Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractTable()
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
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_TABLE__DOCUMENT = eINSTANCE.getDAbstractTable_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DPictureAsTableImpl <em>DPicture As Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DPictureAsTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDPictureAsTable()
		 * @generated
		 */
		EClass DPICTURE_AS_TABLE = eINSTANCE.getDPictureAsTable();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPICTURE_AS_TABLE__REFERENCE = eINSTANCE.getDPictureAsTable_Reference();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBasicTableImpl <em>DBasic Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBasicTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBasicTable()
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRowImpl <em>DRow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DRowImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRow()
		 * @generated
		 */
		EClass DROW = eINSTANCE.getDRow();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROW__SPAN = eINSTANCE.getDRow_Span();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROW__COLUMNS = eINSTANCE.getDRow_Columns();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl <em>DColumn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDColumn()
		 * @generated
		 */
		EClass DCOLUMN = eINSTANCE.getDColumn();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCOLUMN__SPAN = eINSTANCE.getDColumn_Span();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCOLUMN__CELLS = eINSTANCE.getDColumn_Cells();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl <em>DCell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DCellImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDCell()
		 * @generated
		 */
		EClass DCELL = eINSTANCE.getDCell();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractSectionImpl <em>DAbstract Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractSection()
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
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_SECTION__DOCUMENT = eINSTANCE.getDAbstractSection_Document();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl <em>DFixed Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DFixedSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDFixedSection()
		 * @generated
		 */
		EClass DFIXED_SECTION = eINSTANCE.getDFixedSection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DInstantiableSectionImpl <em>DInstantiable Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DInstantiableSectionImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDInstantiableSection()
		 * @generated
		 */
		EClass DINSTANTIABLE_SECTION = eINSTANCE.getDInstantiableSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DINSTANTIABLE_SECTION__NAME = eINSTANCE.getDInstantiableSection_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl <em>DBody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBody()
		 * @generated
		 */
		EClass DBODY = eINSTANCE.getDBody();

		/**
		 * The meta object literal for the '<em><b>BContent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBODY__BCONTENT = eINSTANCE.getDBody_BContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyContentImpl <em>DBody Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBodyContent()
		 * @generated
		 */
		EClass DBODY_CONTENT = eINSTANCE.getDBodyContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl <em>DParagraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraph()
		 * @generated
		 */
		EClass DPARAGRAPH = eINSTANCE.getDParagraph();

		/**
		 * The meta object literal for the '<em><b>PContent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH__PCONTENT = eINSTANCE.getDParagraph_PContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl <em>DParagraph Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraphContent()
		 * @generated
		 */
		EClass DPARAGRAPH_CONTENT = eINSTANCE.getDParagraphContent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl <em>DRun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DRunImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRun()
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
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUN__ITALIC = eINSTANCE.getDRun_Italic();

		/**
		 * The meta object literal for the '<em><b>Underscore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRUN__UNDERSCORE = eINSTANCE.getDRun_Underscore();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl <em>DText</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDText()
		 * @generated
		 */
		EClass DTEXT = eINSTANCE.getDText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTEXT__CONTENT = eINSTANCE.getDText_Content();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DHyperlinkImpl <em>DHyperlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DHyperlinkImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDHyperlink()
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceableObject()
		 * @generated
		 */
		EClass DREFERENCEABLE_OBJECT = eINSTANCE.getDReferenceableObject();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DListContentImpl <em>DList Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DListContentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDListContent()
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DListItemImpl <em>DList Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DListItemImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDListItem()
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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DItemizeImpl <em>DItemize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DItemizeImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDItemize()
		 * @generated
		 */
		EClass DITEMIZE = eINSTANCE.getDItemize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DEnumerateImpl <em>DEnumerate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DEnumerateImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDEnumerate()
		 * @generated
		 */
		EClass DENUMERATE = eINSTANCE.getDEnumerate();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable <em>DRun Format Enable Disable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.DRunFormatEnableDisable
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDRunFormatEnableDisable()
		 * @generated
		 */
		EEnum DRUN_FORMAT_ENABLE_DISABLE = eINSTANCE.getDRunFormatEnableDisable();

	}

} //docPackage
