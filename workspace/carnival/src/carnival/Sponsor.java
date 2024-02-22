/**
 */
package carnival;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sponsor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Sponsor#getUid <em>Uid</em>}</li>
 *   <li>{@link carnival.Sponsor#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getSponsor()
 * @model annotation="gmf.node label='name' label.pattern='Sponsor {0}'"
 * @generated
 */
public interface Sponsor extends Participant {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see carnival.CarnivalPackage#getSponsor_Uid()
	 * @model
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link carnival.Sponsor#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference list.
	 * The list contents are of type {@link carnival.Activity}.
	 * It is bidirectional and its opposite is '{@link carnival.Activity#getSponsors <em>Sponsors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference list.
	 * @see carnival.CarnivalPackage#getSponsor_Work()
	 * @see carnival.Activity#getSponsors
	 * @model opposite="sponsors"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' width='2' color='255,200,128'"
	 * @generated
	 */
	EList<Activity> getWork();

} // Sponsor
