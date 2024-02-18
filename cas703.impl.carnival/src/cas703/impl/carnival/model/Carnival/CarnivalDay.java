/**
 */
package cas703.impl.carnival.model.Carnival;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cas703.impl.carnival.model.Carnival.CarnivalDay#getN <em>N</em>}</li>
 *   <li>{@link cas703.impl.carnival.model.Carnival.CarnivalDay#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnivalDay()
 * @model annotation="gmf.node label='name,n' label.pattern='Day {1}: {0}'"
 * @generated
 */
public interface CarnivalDay extends NamedElement {
	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(String)
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnivalDay_N()
	 * @model
	 * @generated
	 */
	String getN();

	/**
	 * Sets the value of the '{@link cas703.impl.carnival.model.Carnival.CarnivalDay#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link cas703.impl.carnival.model.Carnival.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getCarnivalDay_Activities()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Activity> getActivities();

} // CarnivalDay
