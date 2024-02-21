/**
 */
package carnival.impl;

import carnival.Carnival;
import carnival.CarnivalDay;
import carnival.CarnivalPackage;
import carnival.Participant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carnival</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carnival.impl.CarnivalImpl#getCarnivalDays <em>Carnival Days</em>}</li>
 *   <li>{@link carnival.impl.CarnivalImpl#getAttendees <em>Attendees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarnivalImpl extends NamedElementImpl implements Carnival {
	/**
	 * The cached value of the '{@link #getCarnivalDays() <em>Carnival Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarnivalDays()
	 * @generated
	 * @ordered
	 */
	protected EList<CarnivalDay> carnivalDays;

	/**
	 * The cached value of the '{@link #getAttendees() <em>Attendees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendees()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> attendees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarnivalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarnivalPackage.Literals.CARNIVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CarnivalDay> getCarnivalDays() {
		if (carnivalDays == null) {
			carnivalDays = new EObjectContainmentEList<CarnivalDay>(CarnivalDay.class, this, CarnivalPackage.CARNIVAL__CARNIVAL_DAYS);
		}
		return carnivalDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Participant> getAttendees() {
		if (attendees == null) {
			attendees = new EObjectContainmentEList<Participant>(Participant.class, this, CarnivalPackage.CARNIVAL__ATTENDEES);
		}
		return attendees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarnivalPackage.CARNIVAL__CARNIVAL_DAYS:
				return ((InternalEList<?>)getCarnivalDays()).basicRemove(otherEnd, msgs);
			case CarnivalPackage.CARNIVAL__ATTENDEES:
				return ((InternalEList<?>)getAttendees()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CarnivalPackage.CARNIVAL__CARNIVAL_DAYS:
				return getCarnivalDays();
			case CarnivalPackage.CARNIVAL__ATTENDEES:
				return getAttendees();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CarnivalPackage.CARNIVAL__CARNIVAL_DAYS:
				getCarnivalDays().clear();
				getCarnivalDays().addAll((Collection<? extends CarnivalDay>)newValue);
				return;
			case CarnivalPackage.CARNIVAL__ATTENDEES:
				getAttendees().clear();
				getAttendees().addAll((Collection<? extends Participant>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CarnivalPackage.CARNIVAL__CARNIVAL_DAYS:
				getCarnivalDays().clear();
				return;
			case CarnivalPackage.CARNIVAL__ATTENDEES:
				getAttendees().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CarnivalPackage.CARNIVAL__CARNIVAL_DAYS:
				return carnivalDays != null && !carnivalDays.isEmpty();
			case CarnivalPackage.CARNIVAL__ATTENDEES:
				return attendees != null && !attendees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarnivalImpl