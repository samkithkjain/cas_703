/**
 */
package cas703.impl.carnival.model.Carnival;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cas703.impl.carnival.model.Carnival.Visitor#getVisit <em>Visit</em>}</li>
 * </ul>
 *
 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getVisitor()
 * @model annotation="gmf.node label='name' label.pattern='Guest {0}'"
 * @generated
 */
public interface Visitor extends Participant {
	/**
	 * Returns the value of the '<em><b>Visit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cas703.impl.carnival.model.Carnival.Activity#getVisitors <em>Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit</em>' reference.
	 * @see #setVisit(Activity)
	 * @see cas703.impl.carnival.model.Carnival.CarnivalPackage#getVisitor_Visit()
	 * @see cas703.impl.carnival.model.Carnival.Activity#getVisitors
	 * @model opposite="visitors"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='dot' width='2' color='0,255,0'"
	 * @generated
	 */
	Activity getVisit();

	/**
	 * Sets the value of the '{@link cas703.impl.carnival.model.Carnival.Visitor#getVisit <em>Visit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit</em>' reference.
	 * @see #getVisit()
	 * @generated
	 */
	void setVisit(Activity value);

} // Visitor
