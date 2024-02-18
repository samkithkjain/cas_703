/**
 */
package cas703.impl.carnival.model.Carnival;

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
 *   <li>{@link cas703.impl.carnival.model.Carnival.Activity#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link cas703.impl.carnival.model.Carnival.Activity#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Volunteer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cas703.impl.carnival.model.Carnival.Volunteer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volunteer</em>' reference.
	 * @see #setVolunteer(Volunteer)
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getActivity_Volunteer()
	 * @see cas703.impl.carnival.model.Carnival.Volunteer#getWork
	 * @model opposite="work"
	 * @generated
	 */
	Volunteer getVolunteer();

	/**
	 * Sets the value of the '{@link cas703.impl.carnival.model.Carnival.Activity#getVolunteer <em>Volunteer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volunteer</em>' reference.
	 * @see #getVolunteer()
	 * @generated
	 */
	void setVolunteer(Volunteer value);

	/**
	 * Returns the value of the '<em><b>Visitors</b></em>' reference list.
	 * The list contents are of type {@link cas703.impl.carnival.model.Carnival.Visitor}.
	 * It is bidirectional and its opposite is '{@link cas703.impl.carnival.model.Carnival.Visitor#getVisit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitors</em>' reference list.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getActivity_Visitors()
	 * @see cas703.impl.carnival.model.Carnival.Visitor#getVisit
	 * @model opposite="visit"
	 * @generated
	 */
	EList<Visitor> getVisitors();

} // Activity
