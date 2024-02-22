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
 *   <li>{@link carnival.Activity#getSponsors <em>Sponsors</em>}</li>
 *   <li>{@link carnival.Activity#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sponsors</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link carnival.Sponsor#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sponsors</em>' reference.
	 * @see #setSponsors(Sponsor)
	 * @see carnival.CarnivalPackage#getActivity_Sponsors()
	 * @see carnival.Sponsor#getWork
	 * @model opposite="work"
	 * @generated
	 */
	Sponsor getSponsors();

	/**
	 * Sets the value of the '{@link carnival.Activity#getSponsors <em>Sponsors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sponsors</em>' reference.
	 * @see #getSponsors()
	 * @generated
	 */
	void setSponsors(Sponsor value);

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
