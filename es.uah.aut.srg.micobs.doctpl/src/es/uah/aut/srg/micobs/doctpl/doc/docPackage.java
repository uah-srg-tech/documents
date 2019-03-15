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
	 * The number of structural features of the '<em>DDocument Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_TEMPLATE_FEATURE_COUNT = 4;

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
	int DREFERENCEABLE_OBJECT = 20;

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
	int DBODY_CONTENT = 13;

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
	int DBODY = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBODY__CONTENT = 0;

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
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__CONTENT = DBODY__CONTENT;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl <em>DParagraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraph()
	 * @generated
	 */
	int DPARAGRAPH = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__PROPERTIES = DBODY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__CONTENT = DBODY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_FEATURE_COUNT = DBODY_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_OPERATION_COUNT = DBODY_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl <em>DParagraph Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraphProperties()
	 * @generated
	 */
	int DPARAGRAPH_PROPERTIES = 15;

	/**
	 * The feature id for the '<em><b>Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_PROPERTIES__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_PROPERTIES__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>DParagraph Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DParagraph Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl <em>DParagraph Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphContentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraphContent()
	 * @generated
	 */
	int DPARAGRAPH_CONTENT = 16;

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
	int DRUN = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN__TEXT = DPARAGRAPH_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DRun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRUN_FEATURE_COUNT = DPARAGRAPH_CONTENT_FEATURE_COUNT + 1;

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
	int DTEXT = 18;

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
	int DHYPERLINK = 19;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl <em>DNumbering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNumbering()
	 * @generated
	 */
	int DNUMBERING = 21;

	/**
	 * The feature id for the '<em><b>Abstract Num</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUMBERING__ABSTRACT_NUM = 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUMBERING__NUM = 1;

	/**
	 * The number of structural features of the '<em>DNumbering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUMBERING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DNumbering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUMBERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractNumImpl <em>DAbstract Num</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractNumImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractNum()
	 * @generated
	 */
	int DABSTRACT_NUM = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_NUM__ID = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_NUM__LEVEL = 1;

	/**
	 * The number of structural features of the '<em>DAbstract Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_NUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DAbstract Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_NUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DLevelImpl <em>DLevel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DLevelImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDLevel()
	 * @generated
	 */
	int DLEVEL = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLEVEL__FORMAT = 1;

	/**
	 * The number of structural features of the '<em>DLevel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLEVEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DLevel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumImpl <em>DNum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DNumImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNum()
	 * @generated
	 */
	int DNUM = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUM__ID = 0;

	/**
	 * The feature id for the '<em><b>Abstract Num</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUM__ABSTRACT_NUM = 1;

	/**
	 * The number of structural features of the '<em>DNum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DNum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat <em>DNumber Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNumberFormat()
	 * @generated
	 */
	int DNUMBER_FORMAT = 25;


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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DBody <em>DBody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBody</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBody
	 * @generated
	 */
	EClass getDBody();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DBody#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DBody#getContent()
	 * @see #getDBody()
	 * @generated
	 */
	EReference getDBody_Content();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getProperties()
	 * @see #getDParagraph()
	 * @generated
	 */
	EReference getDParagraph_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getContent()
	 * @see #getDParagraph()
	 * @generated
	 */
	EReference getDParagraph_Content();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties <em>DParagraph Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph Properties</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties
	 * @generated
	 */
	EClass getDParagraphProperties();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Number</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getNumber()
	 * @see #getDParagraphProperties()
	 * @generated
	 */
	EReference getDParagraphProperties_Number();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraphProperties#getLevel()
	 * @see #getDParagraphProperties()
	 * @generated
	 */
	EReference getDParagraphProperties_Level();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumbering <em>DNumbering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNumbering</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumbering
	 * @generated
	 */
	EClass getDNumbering();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumbering#getAbstractNum <em>Abstract Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Num</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumbering#getAbstractNum()
	 * @see #getDNumbering()
	 * @generated
	 */
	EReference getDNumbering_AbstractNum();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumbering#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Num</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumbering#getNum()
	 * @see #getDNumbering()
	 * @generated
	 */
	EReference getDNumbering_Num();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum <em>DAbstract Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAbstract Num</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum
	 * @generated
	 */
	EClass getDAbstractNum();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum#getId()
	 * @see #getDAbstractNum()
	 * @generated
	 */
	EAttribute getDAbstractNum_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DAbstractNum#getLevel()
	 * @see #getDAbstractNum()
	 * @generated
	 */
	EReference getDAbstractNum_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DLevel <em>DLevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLevel</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DLevel
	 * @generated
	 */
	EClass getDLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DLevel#getId()
	 * @see #getDLevel()
	 * @generated
	 */
	EAttribute getDLevel_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DLevel#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DLevel#getFormat()
	 * @see #getDLevel()
	 * @generated
	 */
	EAttribute getDLevel_Format();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DNum <em>DNum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNum</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNum
	 * @generated
	 */
	EClass getDNum();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DNum#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNum#getId()
	 * @see #getDNum()
	 * @generated
	 */
	EAttribute getDNum_Id();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DNum#getAbstractNum <em>Abstract Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Num</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNum#getAbstractNum()
	 * @see #getDNum()
	 * @generated
	 */
	EReference getDNum_AbstractNum();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat <em>DNumber Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DNumber Format</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat
	 * @generated
	 */
	EEnum getDNumberFormat();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl <em>DBody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DBodyImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDBody()
		 * @generated
		 */
		EClass DBODY = eINSTANCE.getDBody();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBODY__CONTENT = eINSTANCE.getDBody_Content();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH__PROPERTIES = eINSTANCE.getDParagraph_Properties();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH__CONTENT = eINSTANCE.getDParagraph_Content();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl <em>DParagraph Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphPropertiesImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraphProperties()
		 * @generated
		 */
		EClass DPARAGRAPH_PROPERTIES = eINSTANCE.getDParagraphProperties();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH_PROPERTIES__NUMBER = eINSTANCE.getDParagraphProperties_Number();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH_PROPERTIES__LEVEL = eINSTANCE.getDParagraphProperties_Level();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl <em>DNumbering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DNumberingImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNumbering()
		 * @generated
		 */
		EClass DNUMBERING = eINSTANCE.getDNumbering();

		/**
		 * The meta object literal for the '<em><b>Abstract Num</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNUMBERING__ABSTRACT_NUM = eINSTANCE.getDNumbering_AbstractNum();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNUMBERING__NUM = eINSTANCE.getDNumbering_Num();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractNumImpl <em>DAbstract Num</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DAbstractNumImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDAbstractNum()
		 * @generated
		 */
		EClass DABSTRACT_NUM = eINSTANCE.getDAbstractNum();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DABSTRACT_NUM__ID = eINSTANCE.getDAbstractNum_Id();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DABSTRACT_NUM__LEVEL = eINSTANCE.getDAbstractNum_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DLevelImpl <em>DLevel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DLevelImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDLevel()
		 * @generated
		 */
		EClass DLEVEL = eINSTANCE.getDLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DLEVEL__ID = eINSTANCE.getDLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DLEVEL__FORMAT = eINSTANCE.getDLevel_Format();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DNumImpl <em>DNum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DNumImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNum()
		 * @generated
		 */
		EClass DNUM = eINSTANCE.getDNum();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNUM__ID = eINSTANCE.getDNum_Id();

		/**
		 * The meta object literal for the '<em><b>Abstract Num</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNUM__ABSTRACT_NUM = eINSTANCE.getDNum_AbstractNum();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat <em>DNumber Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.DNumberFormat
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDNumberFormat()
		 * @generated
		 */
		EEnum DNUMBER_FORMAT = eINSTANCE.getDNumberFormat();

	}

} //docPackage
