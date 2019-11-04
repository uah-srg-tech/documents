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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBody Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDBodyContent()
 * @model abstract="true"
 * @generated
 */
public interface DBodyContent extends EObject {

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(DAlignment)
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.doctplPackage#getDBodyContent_Alignment()
	 * @model unsettable="true"
	 * @generated
	 */
	DAlignment getAlignment();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see es.uah.aut.srg.micobs.doctpl.doctpl.DAlignment
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(DAlignment value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(DAlignment)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.micobs.doctpl.doctpl.DBodyContent#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(DAlignment)
	 * @generated
	 */
	boolean isSetAlignment();
} // DBodyContent
