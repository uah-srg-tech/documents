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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentImpl <em>DDocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDDocument()
	 * @generated
	 */
	int DDOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Applicable Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__APPLICABLE_DOCUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Reference Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__REFERENCE_DOCUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__FIGURES = 2;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT__TABLES = 3;

	/**
	 * The number of structural features of the '<em>DDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceableObject()
	 * @generated
	 */
	int DREFERENCEABLE_OBJECT = 14;

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
	int DABSTRACT_FIGURE__REFERENCE = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__CAPTION = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE__DOCUMENT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_FEATURE_COUNT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DAbstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_FIGURE_OPERATION_COUNT = DREFERENCEABLE_OBJECT_OPERATION_COUNT + 0;

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
	int DABSTRACT_TABLE__CAPTION = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE__DOCUMENT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAbstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE_FEATURE_COUNT = DREFERENCEABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DAbstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DABSTRACT_TABLE_OPERATION_COUNT = DREFERENCEABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTableFromPictureImpl <em>DTable From Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTableFromPictureImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDTableFromPicture()
	 * @generated
	 */
	int DTABLE_FROM_PICTURE = 7;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_PICTURE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_PICTURE__DOCUMENT = DABSTRACT_TABLE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_PICTURE__REFERENCE = DABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DTable From Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_PICTURE_FEATURE_COUNT = DABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DTable From Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FROM_PICTURE_OPERATION_COUNT = DABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTableImpl <em>DTable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTableImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDTable()
	 * @generated
	 */
	int DTABLE = 8;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__CAPTION = DABSTRACT_TABLE__CAPTION;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__DOCUMENT = DABSTRACT_TABLE__DOCUMENT;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE__ROWS = DABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_FEATURE_COUNT = DABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTABLE_OPERATION_COUNT = DABSTRACT_TABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROW__COLUMNS = 0;

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
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl <em>DColumn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DColumnImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDColumn()
	 * @generated
	 */
	int DCOLUMN = 10;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN__CELLS = 0;

	/**
	 * The number of structural features of the '<em>DColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl <em>DParagraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraph()
	 * @generated
	 */
	int DPARAGRAPH = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH__TEXT = 0;

	/**
	 * The number of structural features of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DParagraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPARAGRAPH_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL__TEXT = DPARAGRAPH__TEXT;

	/**
	 * The number of structural features of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_FEATURE_COUNT = DPARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DCell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCELL_OPERATION_COUNT = DPARAGRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl <em>DText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTextImpl
	 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDText()
	 * @generated
	 */
	int DTEXT = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument <em>DDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDocument</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocument
	 * @generated
	 */
	EClass getDDocument();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getApplicableDocuments <em>Applicable Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applicable Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocument#getApplicableDocuments()
	 * @see #getDDocument()
	 * @generated
	 */
	EReference getDDocument_ApplicableDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getReferenceDocuments <em>Reference Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference Documents</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocument#getReferenceDocuments()
	 * @see #getDDocument()
	 * @generated
	 */
	EReference getDDocument_ReferenceDocuments();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Figures</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocument#getFigures()
	 * @see #getDDocument()
	 * @generated
	 */
	EReference getDDocument_Figures();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DDocument#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tables</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DDocument#getTables()
	 * @see #getDDocument()
	 * @generated
	 */
	EReference getDDocument_Tables();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DTableFromPicture <em>DTable From Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTable From Picture</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DTableFromPicture
	 * @generated
	 */
	EClass getDTableFromPicture();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.doctpl.doc.DTableFromPicture#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DTableFromPicture#getReference()
	 * @see #getDTableFromPicture()
	 * @generated
	 */
	EAttribute getDTableFromPicture_Reference();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DTable <em>DTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTable</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DTable
	 * @generated
	 */
	EClass getDTable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DTable#getRows()
	 * @see #getDTable()
	 * @generated
	 */
	EReference getDTable_Rows();

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
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph <em>DParagraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DParagraph</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph
	 * @generated
	 */
	EClass getDParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DParagraph#getText()
	 * @see #getDParagraph()
	 * @generated
	 */
	EReference getDParagraph_Text();

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
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.doctpl.doc.DText#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see es.uah.aut.srg.micobs.doctpl.doc.DText#getReference()
	 * @see #getDText()
	 * @generated
	 */
	EReference getDText_Reference();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentImpl <em>DDocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DDocumentImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDDocument()
		 * @generated
		 */
		EClass DDOCUMENT = eINSTANCE.getDDocument();

		/**
		 * The meta object literal for the '<em><b>Applicable Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT__APPLICABLE_DOCUMENTS = eINSTANCE.getDDocument_ApplicableDocuments();

		/**
		 * The meta object literal for the '<em><b>Reference Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT__REFERENCE_DOCUMENTS = eINSTANCE.getDDocument_ReferenceDocuments();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT__FIGURES = eINSTANCE.getDDocument_Figures();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOCUMENT__TABLES = eINSTANCE.getDDocument_Tables();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTableFromPictureImpl <em>DTable From Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTableFromPictureImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDTableFromPicture()
		 * @generated
		 */
		EClass DTABLE_FROM_PICTURE = eINSTANCE.getDTableFromPicture();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTABLE_FROM_PICTURE__REFERENCE = eINSTANCE.getDTableFromPicture_Reference();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DTableImpl <em>DTable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DTableImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDTable()
		 * @generated
		 */
		EClass DTABLE = eINSTANCE.getDTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTABLE__ROWS = eINSTANCE.getDTable_Rows();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl <em>DParagraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DParagraphImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDParagraph()
		 * @generated
		 */
		EClass DPARAGRAPH = eINSTANCE.getDParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPARAGRAPH__TEXT = eINSTANCE.getDParagraph_Text();

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
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTEXT__REFERENCE = eINSTANCE.getDText_Reference();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl <em>DReferenceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.DReferenceableObjectImpl
		 * @see es.uah.aut.srg.micobs.doctpl.doc.impl.docPackageImpl#getDReferenceableObject()
		 * @generated
		 */
		EClass DREFERENCEABLE_OBJECT = eINSTANCE.getDReferenceableObject();

	}

} //docPackage
