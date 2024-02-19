/**
 */
package cas703.impl.carnival.model.Carnival;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cas703.impl.carnival.model.Carnival.CarnivalFactory
 * @model kind="package"
 * @generated
 */
public interface CarnivalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Carnival";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "vr/Carnival";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Carnival";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarnivalPackage eINSTANCE = cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl.init();

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.NamedElementImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.CarnivalImpl <em>Carnival</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getCarnival()
	 * @generated
	 */
	int CARNIVAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Carnival Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL__CARNIVAL_DAYS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attendees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL__ATTENDEES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Carnival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Carnival</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.CarnivalDayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalDayImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getCarnivalDay()
	 * @generated
	 */
	int CARNIVAL_DAY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_DAY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_DAY__N = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_DAY__ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_DAY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNIVAL_DAY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.ActivityImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VOLUNTEER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VISITORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.BoothImpl <em>Booth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.BoothImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getBooth()
	 * @generated
	 */
	int BOOTH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH__VOLUNTEER = ACTIVITY__VOLUNTEER;

	/**
	 * The feature id for the '<em><b>Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH__VISITORS = ACTIVITY__VISITORS;

	/**
	 * The feature id for the '<em><b>Available Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH__AVAILABLE_SPACE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Booth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTH_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.EventImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VOLUNTEER = ACTIVITY__VOLUNTEER;

	/**
	 * The feature id for the '<em><b>Visitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VISITORS = ACTIVITY__VISITORS;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.ParticipantImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__AGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EMAIL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.VisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.VisitorImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__AGE = PARTICIPANT__AGE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__EMAIL = PARTICIPANT__EMAIL;

	/**
	 * The feature id for the '<em><b>Visit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__VISIT = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cas703.impl.carnival.model.Carnival.impl.VolunteerImpl <em>Volunteer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cas703.impl.carnival.model.Carnival.impl.VolunteerImpl
	 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getVolunteer()
	 * @generated
	 */
	int VOLUNTEER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__AGE = PARTICIPANT__AGE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__EMAIL = PARTICIPANT__EMAIL;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__UID = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__WORK = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see cas703.impl.carnival.model.Carnival.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cas703.impl.carnival.model.Carnival.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Carnival <em>Carnival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carnival</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Carnival
	 * @generated
	 */
	EClass getCarnival();

	/**
	 * Returns the meta object for the containment reference list '{@link cas703.impl.carnival.model.Carnival.Carnival#getCarnivalDays <em>Carnival Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carnival Days</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Carnival#getCarnivalDays()
	 * @see #getCarnival()
	 * @generated
	 */
	EReference getCarnival_CarnivalDays();

	/**
	 * Returns the meta object for the containment reference list '{@link cas703.impl.carnival.model.Carnival.Carnival#getAttendees <em>Attendees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attendees</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Carnival#getAttendees()
	 * @see #getCarnival()
	 * @generated
	 */
	EReference getCarnival_Attendees();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.CarnivalDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalDay
	 * @generated
	 */
	EClass getCarnivalDay();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.CarnivalDay#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalDay#getN()
	 * @see #getCarnivalDay()
	 * @generated
	 */
	EAttribute getCarnivalDay_N();

	/**
	 * Returns the meta object for the containment reference list '{@link cas703.impl.carnival.model.Carnival.CarnivalDay#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see cas703.impl.carnival.model.Carnival.CarnivalDay#getActivities()
	 * @see #getCarnivalDay()
	 * @generated
	 */
	EReference getCarnivalDay_Activities();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link cas703.impl.carnival.model.Carnival.Activity#getVolunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volunteer</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Activity#getVolunteer()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Volunteer();

	/**
	 * Returns the meta object for the reference list '{@link cas703.impl.carnival.model.Carnival.Activity#getVisitors <em>Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visitors</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Activity#getVisitors()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Visitors();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Booth <em>Booth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booth</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Booth
	 * @generated
	 */
	EClass getBooth();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.Booth#getAvailableSpace <em>Available Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Space</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Booth#getAvailableSpace()
	 * @see #getBooth()
	 * @generated
	 */
	EAttribute getBooth_AvailableSpace();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.Participant#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Participant#getAge()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Age();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.Participant#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Participant#getEmail()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Email();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for the reference '{@link cas703.impl.carnival.model.Carnival.Visitor#getVisit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visit</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Visitor#getVisit()
	 * @see #getVisitor()
	 * @generated
	 */
	EReference getVisitor_Visit();

	/**
	 * Returns the meta object for class '{@link cas703.impl.carnival.model.Carnival.Volunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volunteer</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Volunteer
	 * @generated
	 */
	EClass getVolunteer();

	/**
	 * Returns the meta object for the attribute '{@link cas703.impl.carnival.model.Carnival.Volunteer#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Volunteer#getUid()
	 * @see #getVolunteer()
	 * @generated
	 */
	EAttribute getVolunteer_Uid();

	/**
	 * Returns the meta object for the reference '{@link cas703.impl.carnival.model.Carnival.Volunteer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see cas703.impl.carnival.model.Carnival.Volunteer#getWork()
	 * @see #getVolunteer()
	 * @generated
	 */
	EReference getVolunteer_Work();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarnivalFactory getCarnivalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.NamedElementImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.CarnivalImpl <em>Carnival</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getCarnival()
		 * @generated
		 */
		EClass CARNIVAL = eINSTANCE.getCarnival();

		/**
		 * The meta object literal for the '<em><b>Carnival Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARNIVAL__CARNIVAL_DAYS = eINSTANCE.getCarnival_CarnivalDays();

		/**
		 * The meta object literal for the '<em><b>Attendees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARNIVAL__ATTENDEES = eINSTANCE.getCarnival_Attendees();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.CarnivalDayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalDayImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getCarnivalDay()
		 * @generated
		 */
		EClass CARNIVAL_DAY = eINSTANCE.getCarnivalDay();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARNIVAL_DAY__N = eINSTANCE.getCarnivalDay_N();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARNIVAL_DAY__ACTIVITIES = eINSTANCE.getCarnivalDay_Activities();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.ActivityImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Volunteer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VOLUNTEER = eINSTANCE.getActivity_Volunteer();

		/**
		 * The meta object literal for the '<em><b>Visitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VISITORS = eINSTANCE.getActivity_Visitors();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.BoothImpl <em>Booth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.BoothImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getBooth()
		 * @generated
		 */
		EClass BOOTH = eINSTANCE.getBooth();

		/**
		 * The meta object literal for the '<em><b>Available Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTH__AVAILABLE_SPACE = eINSTANCE.getBooth_AvailableSpace();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.EventImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.ParticipantImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__AGE = eINSTANCE.getParticipant_Age();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__EMAIL = eINSTANCE.getParticipant_Email();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.VisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.VisitorImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISITOR__VISIT = eINSTANCE.getVisitor_Visit();

		/**
		 * The meta object literal for the '{@link cas703.impl.carnival.model.Carnival.impl.VolunteerImpl <em>Volunteer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cas703.impl.carnival.model.Carnival.impl.VolunteerImpl
		 * @see cas703.impl.carnival.model.Carnival.impl.CarnivalPackageImpl#getVolunteer()
		 * @generated
		 */
		EClass VOLUNTEER = eINSTANCE.getVolunteer();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUNTEER__UID = eINSTANCE.getVolunteer_Uid();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUNTEER__WORK = eINSTANCE.getVolunteer_Work();

	}

} //CarnivalPackage
