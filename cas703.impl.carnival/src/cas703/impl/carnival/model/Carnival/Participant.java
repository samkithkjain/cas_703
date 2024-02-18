/**
 */
package cas703.impl.carnival.model.Carnival;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cas703.impl.carnival.model.Carnival.Participant#getAge <em>Age</em>}</li>
 *   <li>{@link cas703.impl.carnival.model.Carnival.Participant#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getParticipant()
 * @model abstract="true"
 * @generated
 */
public interface Participant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getParticipant_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link cas703.impl.carnival.model.Carnival.Participant#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getParticipant_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cas703.impl.carnival.model.Carnival.Participant#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Participant
