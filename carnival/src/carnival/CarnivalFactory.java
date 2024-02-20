/**
 */
package carnival;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see carnival.CarnivalPackage
 * @generated
 */
public interface CarnivalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarnivalFactory eINSTANCE = carnival.impl.CarnivalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carnival</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carnival</em>'.
	 * @generated
	 */
	Carnival createCarnival();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	CarnivalDay createCarnivalDay();

	/**
	 * Returns a new object of class '<em>Booth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booth</em>'.
	 * @generated
	 */
	Booth createBooth();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visitor</em>'.
	 * @generated
	 */
	Visitor createVisitor();

	/**
	 * Returns a new object of class '<em>Volunteer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volunteer</em>'.
	 * @generated
	 */
	Volunteer createVolunteer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CarnivalPackage getCarnivalPackage();

} //CarnivalFactory
