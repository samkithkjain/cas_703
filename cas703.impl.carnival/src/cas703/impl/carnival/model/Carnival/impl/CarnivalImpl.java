/**
 */
package cas703.impl.carnival.model.Carnival.impl;

import cas703.impl.carnival.model.Carnival.Carnival;
import cas703.impl.carnival.model.Carnival.CarnivalDay;
import cas703.impl.carnival.model.Carnival.CarnivalPackage;
import cas703.impl.carnival.model.Carnival.Participant;

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
 *   <li>{@link cas703.impl.carnival.model.Carnival.impl.CarnivalImpl#getCarnivalDays <em>Carnival Days</em>}</li>
 *   <li>{@link cas703.impl.carnival.model.Carnival.impl.CarnivalImpl#getVisitors <em>Visitors</em>}</li>
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
	 * The cached value of the '{@link #getVisitors() <em>Visitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitors()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> visitors;

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
	public EList<Participant> getVisitors() {
		if (visitors == null) {
			visitors = new EObjectContainmentEList<Participant>(Participant.class, this, CarnivalPackage.CARNIVAL__VISITORS);
		}
		return visitors;
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
			case CarnivalPackage.CARNIVAL__VISITORS:
				return ((InternalEList<?>)getVisitors()).basicRemove(otherEnd, msgs);
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
			case CarnivalPackage.CARNIVAL__VISITORS:
				return getVisitors();
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
			case CarnivalPackage.CARNIVAL__VISITORS:
				getVisitors().clear();
				getVisitors().addAll((Collection<? extends Participant>)newValue);
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
			case CarnivalPackage.CARNIVAL__VISITORS:
				getVisitors().clear();
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
			case CarnivalPackage.CARNIVAL__VISITORS:
				return visitors != null && !visitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarnivalImpl
