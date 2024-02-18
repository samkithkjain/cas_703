/**
 */
package cas703.impl.carnival.model.Carnival;

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
 *   <li>{@link cas703.impl.carnival.model.Carnival.Carnival#getCarnivalDays <em>Carnival Days</em>}</li>
 *   <li>{@link cas703.impl.carnival.model.Carnival.Carnival#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnival()
 * @model annotation="gmf.diagram model.extension='Carnival'"
 * @generated
 */
public interface Carnival extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Carnival Days</b></em>' containment reference list.
	 * The list contents are of type {@link cas703.impl.carnival.model.Carnival.CarnivalDay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carnival Days</em>' containment reference list.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnival_CarnivalDays()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarnivalDay> getCarnivalDays();

	/**
	 * Returns the value of the '<em><b>Visitors</b></em>' containment reference list.
	 * The list contents are of type {@link cas703.impl.carnival.model.Carnival.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitors</em>' containment reference list.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnival_Visitors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getVisitors();

} // Carnival
