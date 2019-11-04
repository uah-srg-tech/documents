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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getGridSpan <em>Grid Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge <em>VMerge</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell()
 * @model
 * @generated
 */
public interface DCell extends DBody {
	/**
	 * Returns the value of the '<em><b>Grid Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Span</em>' attribute.
	 * @see #setGridSpan(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_GridSpan()
	 * @model
	 * @generated
	 */
	String getGridSpan();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getGridSpan <em>Grid Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Span</em>' attribute.
	 * @see #getGridSpan()
	 * @generated
	 */
	void setGridSpan(String value);

	/**
	 * Returns the value of the '<em><b>VMerge</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VMerge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VMerge</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType
	 * @see #isSetVMerge()
	 * @see #unsetVMerge()
	 * @see #setVMerge(DMergeType)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_VMerge()
	 * @model unsettable="true"
	 * @generated
	 */
	DMergeType getVMerge();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge <em>VMerge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMerge</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DMergeType
	 * @see #isSetVMerge()
	 * @see #unsetVMerge()
	 * @see #getVMerge()
	 * @generated
	 */
	void setVMerge(DMergeType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge <em>VMerge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVMerge()
	 * @see #getVMerge()
	 * @see #setVMerge(DMergeType)
	 * @generated
	 */
	void unsetVMerge();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getVMerge <em>VMerge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>VMerge</em>' attribute is set.
	 * @see #unsetVMerge()
	 * @see #getVMerge()
	 * @see #setVMerge(DMergeType)
	 * @generated
	 */
	boolean isSetVMerge();

} // DCell
