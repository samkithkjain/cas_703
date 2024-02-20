/**
 */
package carnival;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volunteer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Volunteer#getUid <em>Uid</em>}</li>
 *   <li>{@link carnival.Volunteer#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getVolunteer()
 * @model annotation="gmf.node label='name' label.pattern='Volunteer {0}'"
 * @generated
 */
public interface Volunteer extends Participant {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see carnival.CarnivalPackage#getVolunteer_Uid()
	 * @model
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link carnival.Volunteer#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link carnival.Activity#getVolunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Activity)
	 * @see carnival.CarnivalPackage#getVolunteer_Work()
	 * @see carnival.Activity#getVolunteer
	 * @model opposite="volunteer"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' width='2' color='241,194,50'"
	 * @generated
	 */
	Activity getWork();

	/**
	 * Sets the value of the '{@link carnival.Volunteer#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Activity value);

} // Volunteer
