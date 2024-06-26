/**
 */
package carnival;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Booth#getAvailableSpace <em>Available Space</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getBooth()
 * @model annotation="gmf.node figure='rectangle' label='name'"
 * @generated
 */
public interface Booth extends Activity {
	/**
	 * Returns the value of the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Space</em>' attribute.
	 * @see #setAvailableSpace(int)
	 * @see carnival.CarnivalPackage#getBooth_AvailableSpace()
	 * @model
	 * @generated
	 */
	int getAvailableSpace();

	/**
	 * Sets the value of the '{@link carnival.Booth#getAvailableSpace <em>Available Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Space</em>' attribute.
	 * @see #getAvailableSpace()
	 * @generated
	 */
	void setAvailableSpace(int value);

} // Booth
