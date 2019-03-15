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
package es.uah.aut.srg.micobs.doctpl.doc.util;

import es.uah.aut.srg.micobs.doctpl.doc.*;

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
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage
 * @generated
 */
public class docSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static docPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public docSwitch() {
		if (modelPackage == null) {
			modelPackage = docPackage.eINSTANCE;
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
			case docPackage.DDOCUMENT_TEMPLATE: {
				DDocumentTemplate dDocumentTemplate = (DDocumentTemplate)theEObject;
				T result = caseDDocumentTemplate(dDocumentTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DABSTRACT_RELATED_DOCUMENT: {
				DAbstractRelatedDocument dAbstractRelatedDocument = (DAbstractRelatedDocument)theEObject;
				T result = caseDAbstractRelatedDocument(dAbstractRelatedDocument);
				if (result == null) result = caseDReferenceableObject(dAbstractRelatedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DAPPLICABLE_DOCUMENT: {
				DApplicableDocument dApplicableDocument = (DApplicableDocument)theEObject;
				T result = caseDApplicableDocument(dApplicableDocument);
				if (result == null) result = caseDAbstractRelatedDocument(dApplicableDocument);
				if (result == null) result = caseDReferenceableObject(dApplicableDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DREFERENCE_DOCUMENT: {
				DReferenceDocument dReferenceDocument = (DReferenceDocument)theEObject;
				T result = caseDReferenceDocument(dReferenceDocument);
				if (result == null) result = caseDAbstractRelatedDocument(dReferenceDocument);
				if (result == null) result = caseDReferenceableObject(dReferenceDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DABSTRACT_FIGURE: {
				DAbstractFigure dAbstractFigure = (DAbstractFigure)theEObject;
				T result = caseDAbstractFigure(dAbstractFigure);
				if (result == null) result = caseDBodyContent(dAbstractFigure);
				if (result == null) result = caseDReferenceableObject(dAbstractFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DFIGURE: {
				DFigure dFigure = (DFigure)theEObject;
				T result = caseDFigure(dFigure);
				if (result == null) result = caseDAbstractFigure(dFigure);
				if (result == null) result = caseDBodyContent(dFigure);
				if (result == null) result = caseDReferenceableObject(dFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DABSTRACT_TABLE: {
				DAbstractTable dAbstractTable = (DAbstractTable)theEObject;
				T result = caseDAbstractTable(dAbstractTable);
				if (result == null) result = caseDBodyContent(dAbstractTable);
				if (result == null) result = caseDReferenceableObject(dAbstractTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DPICTURE_AS_TABLE: {
				DPictureAsTable dPictureAsTable = (DPictureAsTable)theEObject;
				T result = caseDPictureAsTable(dPictureAsTable);
				if (result == null) result = caseDAbstractTable(dPictureAsTable);
				if (result == null) result = caseDBodyContent(dPictureAsTable);
				if (result == null) result = caseDReferenceableObject(dPictureAsTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DBASIC_TABLE: {
				DBasicTable dBasicTable = (DBasicTable)theEObject;
				T result = caseDBasicTable(dBasicTable);
				if (result == null) result = caseDAbstractTable(dBasicTable);
				if (result == null) result = caseDBodyContent(dBasicTable);
				if (result == null) result = caseDReferenceableObject(dBasicTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DROW: {
				DRow dRow = (DRow)theEObject;
				T result = caseDRow(dRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DCOLUMN: {
				DColumn dColumn = (DColumn)theEObject;
				T result = caseDColumn(dColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DCELL: {
				DCell dCell = (DCell)theEObject;
				T result = caseDCell(dCell);
				if (result == null) result = caseDBody(dCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DBODY: {
				DBody dBody = (DBody)theEObject;
				T result = caseDBody(dBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DBODY_CONTENT: {
				DBodyContent dBodyContent = (DBodyContent)theEObject;
				T result = caseDBodyContent(dBodyContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DPARAGRAPH: {
				DParagraph dParagraph = (DParagraph)theEObject;
				T result = caseDParagraph(dParagraph);
				if (result == null) result = caseDBodyContent(dParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DPARAGRAPH_PROPERTIES: {
				DParagraphProperties dParagraphProperties = (DParagraphProperties)theEObject;
				T result = caseDParagraphProperties(dParagraphProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DPARAGRAPH_CONTENT: {
				DParagraphContent dParagraphContent = (DParagraphContent)theEObject;
				T result = caseDParagraphContent(dParagraphContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DRUN: {
				DRun dRun = (DRun)theEObject;
				T result = caseDRun(dRun);
				if (result == null) result = caseDParagraphContent(dRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DTEXT: {
				DText dText = (DText)theEObject;
				T result = caseDText(dText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DHYPERLINK: {
				DHyperlink dHyperlink = (DHyperlink)theEObject;
				T result = caseDHyperlink(dHyperlink);
				if (result == null) result = caseDParagraphContent(dHyperlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DREFERENCEABLE_OBJECT: {
				DReferenceableObject dReferenceableObject = (DReferenceableObject)theEObject;
				T result = caseDReferenceableObject(dReferenceableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DNUMBERING: {
				DNumbering dNumbering = (DNumbering)theEObject;
				T result = caseDNumbering(dNumbering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DABSTRACT_NUM: {
				DAbstractNum dAbstractNum = (DAbstractNum)theEObject;
				T result = caseDAbstractNum(dAbstractNum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DLEVEL: {
				DLevel dLevel = (DLevel)theEObject;
				T result = caseDLevel(dLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case docPackage.DNUM: {
				DNum dNum = (DNum)theEObject;
				T result = caseDNum(dNum);
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
	 * Returns the result of interpreting the object as an instance of '<em>DFigure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFigure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFigure(DFigure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DPicture As Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPicture As Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPictureAsTable(DPictureAsTable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DColumn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DColumn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDColumn(DColumn object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DParagraph Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DParagraph Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDParagraphProperties(DParagraphProperties object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DNumbering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNumbering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNumbering(DNumbering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAbstract Num</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAbstract Num</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAbstractNum(DAbstractNum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLevel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLevel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLevel(DLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNum(DNum object) {
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

} //docSwitch
