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
package es.uah.aut.srg.micobs.doctpl.doctpl.util;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

import es.uah.aut.srg.micobs.doctpl.doctpl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage
 * @generated
 */
public class doctplSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static doctplPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doctplSwitch() {
		if (modelPackage == null) {
			modelPackage = doctplPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case doctplPackage.DDOCUMENT_TEMPLATE: {
				DDocumentTemplate dDocumentTemplate = (DDocumentTemplate)theEObject;
				T result = caseDDocumentTemplate(dDocumentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DABSTRACT_RELATED_DOCUMENT: {
				DAbstractRelatedDocument dAbstractRelatedDocument = (DAbstractRelatedDocument)theEObject;
				T result = caseDAbstractRelatedDocument(dAbstractRelatedDocument);
				if (result == null) result = caseDReferenceableObject(dAbstractRelatedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DAPPLICABLE_DOCUMENT: {
				DApplicableDocument dApplicableDocument = (DApplicableDocument)theEObject;
				T result = caseDApplicableDocument(dApplicableDocument);
				if (result == null) result = caseDAbstractRelatedDocument(dApplicableDocument);
				if (result == null) result = caseDReferenceableObject(dApplicableDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DREFERENCE_DOCUMENT: {
				DReferenceDocument dReferenceDocument = (DReferenceDocument)theEObject;
				T result = caseDReferenceDocument(dReferenceDocument);
				if (result == null) result = caseDAbstractRelatedDocument(dReferenceDocument);
				if (result == null) result = caseDReferenceableObject(dReferenceDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DABSTRACT_FIGURE: {
				DAbstractFigure dAbstractFigure = (DAbstractFigure)theEObject;
				T result = caseDAbstractFigure(dAbstractFigure);
				if (result == null) result = caseDBodyContent(dAbstractFigure);
				if (result == null) result = caseDReferenceableObject(dAbstractFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DFIGURE_FROM_FILE: {
				DFigureFromFile dFigureFromFile = (DFigureFromFile)theEObject;
				T result = caseDFigureFromFile(dFigureFromFile);
				if (result == null) result = caseDAbstractFigure(dFigureFromFile);
				if (result == null) result = caseDBodyContent(dFigureFromFile);
				if (result == null) result = caseDReferenceableObject(dFigureFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DABSTRACT_TABLE: {
				DAbstractTable dAbstractTable = (DAbstractTable)theEObject;
				T result = caseDAbstractTable(dAbstractTable);
				if (result == null) result = caseDBodyContent(dAbstractTable);
				if (result == null) result = caseDReferenceableObject(dAbstractTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DTABLE_FROM_FILE: {
				DTableFromFile dTableFromFile = (DTableFromFile)theEObject;
				T result = caseDTableFromFile(dTableFromFile);
				if (result == null) result = caseDAbstractTable(dTableFromFile);
				if (result == null) result = caseDBodyContent(dTableFromFile);
				if (result == null) result = caseDReferenceableObject(dTableFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DBASIC_TABLE: {
				DBasicTable dBasicTable = (DBasicTable)theEObject;
				T result = caseDBasicTable(dBasicTable);
				if (result == null) result = caseDAbstractTable(dBasicTable);
				if (result == null) result = caseDBodyContent(dBasicTable);
				if (result == null) result = caseDReferenceableObject(dBasicTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DROW: {
				DRow dRow = (DRow)theEObject;
				T result = caseDRow(dRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DCELL: {
				DCell dCell = (DCell)theEObject;
				T result = caseDCell(dCell);
				if (result == null) result = caseDBody(dCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DABSTRACT_SECTION: {
				DAbstractSection dAbstractSection = (DAbstractSection)theEObject;
				T result = caseDAbstractSection(dAbstractSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DFIXED_SECTION: {
				DFixedSection dFixedSection = (DFixedSection)theEObject;
				T result = caseDFixedSection(dFixedSection);
				if (result == null) result = caseDAbstractSection(dFixedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DINSTANTIABLE_SECTION: {
				DInstantiableSection dInstantiableSection = (DInstantiableSection)theEObject;
				T result = caseDInstantiableSection(dInstantiableSection);
				if (result == null) result = caseDAbstractSection(dInstantiableSection);
				if (result == null) result = caseMCommonReferenceableObj(dInstantiableSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DBODY: {
				DBody dBody = (DBody)theEObject;
				T result = caseDBody(dBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DBODY_CONTENT: {
				DBodyContent dBodyContent = (DBodyContent)theEObject;
				T result = caseDBodyContent(dBodyContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DPARAGRAPH: {
				DParagraph dParagraph = (DParagraph)theEObject;
				T result = caseDParagraph(dParagraph);
				if (result == null) result = caseDBodyContent(dParagraph);
				if (result == null) result = caseDReferenceableObject(dParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DPARAGRAPH_CONTENT: {
				DParagraphContent dParagraphContent = (DParagraphContent)theEObject;
				T result = caseDParagraphContent(dParagraphContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DRUN: {
				DRun dRun = (DRun)theEObject;
				T result = caseDRun(dRun);
				if (result == null) result = caseDParagraphContent(dRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DTAB: {
				DTab dTab = (DTab)theEObject;
				T result = caseDTab(dTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DTEXT: {
				DText dText = (DText)theEObject;
				T result = caseDText(dText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DHYPERLINK: {
				DHyperlink dHyperlink = (DHyperlink)theEObject;
				T result = caseDHyperlink(dHyperlink);
				if (result == null) result = caseDParagraphContent(dHyperlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DREFERENCEABLE_OBJECT: {
				DReferenceableObject dReferenceableObject = (DReferenceableObject)theEObject;
				T result = caseDReferenceableObject(dReferenceableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DLIST_CONTENT: {
				DListContent dListContent = (DListContent)theEObject;
				T result = caseDListContent(dListContent);
				if (result == null) result = caseDBodyContent(dListContent);
				if (result == null) result = caseDReferenceableObject(dListContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DLIST_ITEM: {
				DListItem dListItem = (DListItem)theEObject;
				T result = caseDListItem(dListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DITEMIZE: {
				DItemize dItemize = (DItemize)theEObject;
				T result = caseDItemize(dItemize);
				if (result == null) result = caseDListContent(dItemize);
				if (result == null) result = caseDBodyContent(dItemize);
				if (result == null) result = caseDReferenceableObject(dItemize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case doctplPackage.DENUMERATE: {
				DEnumerate dEnumerate = (DEnumerate)theEObject;
				T result = caseDEnumerate(dEnumerate);
				if (result == null) result = caseDListContent(dEnumerate);
				if (result == null) result = caseDBodyContent(dEnumerate);
				if (result == null) result = caseDReferenceableObject(dEnumerate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDocument Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDocumentTemplate(DDocumentTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Related Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Related Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractRelatedDocument(DAbstractRelatedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DApplicable Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DApplicable Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDApplicableDocument(DApplicableDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DReference Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DReference Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDReferenceDocument(DReferenceDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractFigure(DAbstractFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFigure From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFigure From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFigureFromFile(DFigureFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractTable(DAbstractTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTable From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTable From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTableFromFile(DTableFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBasic Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBasic Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBasicTable(DBasicTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DRow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRow(DRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCell(DCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractSection(DAbstractSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFixed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFixedSection(DFixedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstantiable Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstantiableSection(DInstantiableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBody</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBody</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBody(DBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBody Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBody Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBodyContent(DBodyContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DParagraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DParagraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDParagraph(DParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DParagraph Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DParagraph Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDParagraphContent(DParagraphContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DRun</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRun</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRun(DRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTab(DTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DText</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DText</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDText(DText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DHyperlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DHyperlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDHyperlink(DHyperlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DReferenceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DReferenceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDReferenceableObject(DReferenceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DList Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DList Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDListContent(DListContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DList Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DList Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDListItem(DListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DItemize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DItemize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDItemize(DItemize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEnumerate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEnumerate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEnumerate(DEnumerate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //doctplSwitch
