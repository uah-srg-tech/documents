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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage
 * @generated
 */
public interface doctplFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	doctplFactory eINSTANCE = es.uah.aut.srg.micobs.doctpl.doctpl.impl.doctplFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DTBC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTBC</em>'.
	 * @generated
	 */
	DTBC createDTBC();

	/**
	 * Returns a new object of class '<em>DTBD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTBD</em>'.
	 * @generated
	 */
	DTBD createDTBD();

	/**
	 * Returns a new object of class '<em>DApplicable Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DApplicable Document</em>'.
	 * @generated
	 */
	DApplicableDocument createDApplicableDocument();

	/**
	 * Returns a new object of class '<em>DReference Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DReference Document</em>'.
	 * @generated
	 */
	DReferenceDocument createDReferenceDocument();

	/**
	 * Returns a new object of class '<em>DFigure From File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFigure From File</em>'.
	 * @generated
	 */
	DFigureFromFile createDFigureFromFile();

	/**
	 * Returns a new object of class '<em>DTable From File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTable From File</em>'.
	 * @generated
	 */
	DTableFromFile createDTableFromFile();

	/**
	 * Returns a new object of class '<em>DBasic Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBasic Table</em>'.
	 * @generated
	 */
	DBasicTable createDBasicTable();

	/**
	 * Returns a new object of class '<em>DRow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DRow</em>'.
	 * @generated
	 */
	DRow createDRow();

	/**
	 * Returns a new object of class '<em>DCell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCell</em>'.
	 * @generated
	 */
	DCell createDCell();

	/**
	 * Returns a new object of class '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAbstract Section</em>'.
	 * @generated
	 */
	DAbstractSection createDAbstractSection();

	/**
	 * Returns a new object of class '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFixed Section</em>'.
	 * @generated
	 */
	DFixedSection createDFixedSection();

	/**
	 * Returns a new object of class '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DInstantiable Section</em>'.
	 * @generated
	 */
	DInstantiableSection createDInstantiableSection();

	/**
	 * Returns a new object of class '<em>DBody</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBody</em>'.
	 * @generated
	 */
	DBody createDBody();

	/**
	 * Returns a new object of class '<em>DParagraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DParagraph</em>'.
	 * @generated
	 */
	DParagraph createDParagraph();

	/**
	 * Returns a new object of class '<em>DRun</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DRun</em>'.
	 * @generated
	 */
	DRun createDRun();

	/**
	 * Returns a new object of class '<em>DTab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTab</em>'.
	 * @generated
	 */
	DTab createDTab();

	/**
	 * Returns a new object of class '<em>DText</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DText</em>'.
	 * @generated
	 */
	DText createDText();

	/**
	 * Returns a new object of class '<em>DHyperlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DHyperlink</em>'.
	 * @generated
	 */
	DHyperlink createDHyperlink();

	/**
	 * Returns a new object of class '<em>DReferenceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DReferenceable Object</em>'.
	 * @generated
	 */
	DReferenceableObject createDReferenceableObject();

	/**
	 * Returns a new object of class '<em>DList Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DList Item</em>'.
	 * @generated
	 */
	DListItem createDListItem();

	/**
	 * Returns a new object of class '<em>DItemize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DItemize</em>'.
	 * @generated
	 */
	DItemize createDItemize();

	/**
	 * Returns a new object of class '<em>DEnumerate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DEnumerate</em>'.
	 * @generated
	 */
	DEnumerate createDEnumerate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	doctplPackage getdoctplPackage();

} //doctplFactory
