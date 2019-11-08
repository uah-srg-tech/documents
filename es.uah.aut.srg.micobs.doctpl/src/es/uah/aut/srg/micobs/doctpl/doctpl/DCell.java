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
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getWidth <em>Width</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getShadow <em>Shadow</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell()
 * @model
 * @generated
 */
public interface DCell extends DBody {
	/**
	 * Returns the value of the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Span</em>' attribute.
	 * @see #setColSpan(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_ColSpan()
	 * @model
	 * @generated
	 */
	String getColSpan();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getColSpan <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Span</em>' attribute.
	 * @see #getColSpan()
	 * @generated
	 */
	void setColSpan(String value);

	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #isSetRowSpan()
	 * @see #unsetRowSpan()
	 * @see #setRowSpan(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_RowSpan()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRowSpan();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #isSetRowSpan()
	 * @see #unsetRowSpan()
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowSpan()
	 * @see #getRowSpan()
	 * @see #setRowSpan(String)
	 * @generated
	 */
	void unsetRowSpan();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getRowSpan <em>Row Span</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Row Span</em>' attribute is set.
	 * @see #unsetRowSpan()
	 * @see #getRowSpan()
	 * @see #setRowSpan(String)
	 * @generated
	 */
	boolean isSetRowSpan();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_Width()
	 * @model
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow</em>' attribute.
	 * @see #setShadow(String)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDCell_Shadow()
	 * @model
	 * @generated
	 */
	String getShadow();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DCell#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow</em>' attribute.
	 * @see #getShadow()
	 * @generated
	 */
	void setShadow(String value);

} // DCell
