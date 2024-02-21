/**
 */
package carnival;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carnival</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Carnival#getCarnivalDays <em>Carnival Days</em>}</li>
 *   <li>{@link carnival.Carnival#getAttendees <em>Attendees</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getCarnival()
 * @model annotation="gmf.diagram model.extension='Carnival'"
 * @generated
 */
public interface Carnival extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Carnival Days</b></em>' containment reference list.
	 * The list contents are of type {@link carnival.CarnivalDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carnival Days</em>' containment reference list.
	 * @see carnival.CarnivalPackage#getCarnival_CarnivalDays()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarnivalDay> getCarnivalDays();

	/**
	 * Returns the value of the '<em><b>Attendees</b></em>' containment reference list.
	 * The list contents are of type {@link carnival.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendees</em>' containment reference list.
	 * @see carnival.CarnivalPackage#getCarnival_Attendees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getAttendees();

} // Carnival
