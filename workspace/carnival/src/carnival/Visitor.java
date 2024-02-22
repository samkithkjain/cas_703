/**
 */
package carnival;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carnival.Visitor#getVisit <em>Visit</em>}</li>
 * </ul>
 *
 * @see carnival.CarnivalPackage#getVisitor()
 * @model annotation="gmf.node label='name' label.pattern='Visitor {0}'"
 * @generated
 */
public interface Visitor extends Participant {
	/**
	 * Returns the value of the '<em><b>Visit</b></em>' reference list.
	 * The list contents are of type {@link carnival.Activity}.
	 * It is bidirectional and its opposite is '{@link carnival.Activity#getVisitors <em>Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit</em>' reference list.
	 * @see carnival.CarnivalPackage#getVisitor_Visit()
	 * @see carnival.Activity#getVisitors
	 * @model opposite="visitors"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dot' width='2' color='128,200,255'"
	 * @generated
	 */
	EList<Activity> getVisit();

} // Visitor
