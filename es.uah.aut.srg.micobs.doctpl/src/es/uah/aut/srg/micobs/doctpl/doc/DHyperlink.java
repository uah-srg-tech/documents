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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DHyperlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getRun <em>Run</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDHyperlink()
 * @model
 * @generated
 */
public interface DHyperlink extends DParagraphContent {
	/**
	 * Returns the value of the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' containment reference.
	 * @see #setRun(DRun)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDHyperlink_Run()
	 * @model containment="true"
	 * @generated
	 */
	DRun getRun();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getRun <em>Run</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' containment reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(DRun value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(DReferenceableObject)
	 * @see es.uah.aut.srg.micobs.doctpl.doc.docPackage#getDHyperlink_Reference()
	 * @model required="true"
	 * @generated
	 */
	DReferenceableObject getReference();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doc.DHyperlink#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(DReferenceableObject value);

} // DHyperlink
