/**
 */
package soccer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soccer.Sport#getCountry <em>Country</em>}</li>
 *   <li>{@link soccer.Sport#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see soccer.SoccerPackage#getSport()
 * @model
 * @generated
 */
public interface Sport extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see soccer.SoccerPackage#getSport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link soccer.Sport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference list.
	 * The list contents are of type {@link soccer.Country}.
	 * It is bidirectional and its opposite is '{@link soccer.Country#getSport <em>Sport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference list.
	 * @see soccer.SoccerPackage#getSport_Country()
	 * @see soccer.Country#getSport
	 * @model opposite="sport" containment="true"
	 * @generated
	 */
	EList<Country> getCountry();

} // Sport