/**
 */
package carnival;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Activity#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link carnival.Activity#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Volunteer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link carnival.Volunteer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volunteer</em>' reference.
	 * @see #setVolunteer(Volunteer)
	 * @see carnival.CarnivalPackage#getActivity_Volunteer()
	 * @see carnival.Volunteer#getWork
	 * @model opposite="work"
	 * @generated
	 */
	Volunteer getVolunteer();

	/**
	 * Sets the value of the '{@link carnival.Activity#getVolunteer <em>Volunteer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volunteer</em>' reference.
	 * @see #getVolunteer()
	 * @generated
	 */
	void setVolunteer(Volunteer value);

	/**
	 * Returns the value of the '<em><b>Visitors</b></em>' reference list.
	 * The list contents are of type {@link carnival.Visitor}.
	 * It is bidirectional and its opposite is '{@link carnival.Visitor#getVisit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitors</em>' reference list.
	 * @see carnival.CarnivalPackage#getActivity_Visitors()
	 * @see carnival.Visitor#getVisit
	 * @model opposite="visit"
	 * @generated
	 */
	EList<Visitor> getVisitors();

} // Activity
