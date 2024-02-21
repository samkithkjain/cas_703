/**
 */
package carnival.impl;

import carnival.Activity;
import carnival.CarnivalPackage;
import carnival.Visitor;
import carnival.Volunteer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carnival.impl.ActivityImpl#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link carnival.impl.ActivityImpl#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getVolunteer() <em>Volunteer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolunteer()
	 * @generated
	 * @ordered
	 */
	protected Volunteer volunteer;

	/**
	 * The cached value of the '{@link #getVisitors() <em>Visitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitors()
	 * @generated
	 * @ordered
	 */
	protected EList<Visitor> visitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarnivalPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volunteer getVolunteer() {
		if (volunteer != null && volunteer.eIsProxy()) {
			InternalEObject oldVolunteer = (InternalEObject)volunteer;
			volunteer = (Volunteer)eResolveProxy(oldVolunteer);
			if (volunteer != oldVolunteer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CarnivalPackage.ACTIVITY__VOLUNTEER, oldVolunteer, volunteer));
			}
		}
		return volunteer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volunteer basicGetVolunteer() {
		return volunteer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolunteer(Volunteer newVolunteer, NotificationChain msgs) {
		Volunteer oldVolunteer = volunteer;
		volunteer = newVolunteer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CarnivalPackage.ACTIVITY__VOLUNTEER, oldVolunteer, newVolunteer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolunteer(Volunteer newVolunteer) {
		if (newVolunteer != volunteer) {
			NotificationChain msgs = null;
			if (volunteer != null)
				msgs = ((InternalEObject)volunteer).eInverseRemove(this, CarnivalPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
			if (newVolunteer != null)
				msgs = ((InternalEObject)newVolunteer).eInverseAdd(this, CarnivalPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
			msgs = basicSetVolunteer(newVolunteer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarnivalPackage.ACTIVITY__VOLUNTEER, newVolunteer, newVolunteer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Visitor> getVisitors() {
		if (visitors == null) {
			visitors = new EObjectWithInverseResolvingEList.ManyInverse<Visitor>(Visitor.class, this, CarnivalPackage.ACTIVITY__VISITORS, CarnivalPackage.VISITOR__VISIT);
		}
		return visitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				if (volunteer != null)
					msgs = ((InternalEObject)volunteer).eInverseRemove(this, CarnivalPackage.VOLUNTEER__WORK, Volunteer.class, msgs);
				return basicSetVolunteer((Volunteer)otherEnd, msgs);
			case CarnivalPackage.ACTIVITY__VISITORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisitors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				return basicSetVolunteer(null, msgs);
			case CarnivalPackage.ACTIVITY__VISITORS:
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
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				if (resolve) return getVolunteer();
				return basicGetVolunteer();
			case CarnivalPackage.ACTIVITY__VISITORS:
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
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				setVolunteer((Volunteer)newValue);
				return;
			case CarnivalPackage.ACTIVITY__VISITORS:
				getVisitors().clear();
				getVisitors().addAll((Collection<? extends Visitor>)newValue);
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
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				setVolunteer((Volunteer)null);
				return;
			case CarnivalPackage.ACTIVITY__VISITORS:
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
			case CarnivalPackage.ACTIVITY__VOLUNTEER:
				return volunteer != null;
			case CarnivalPackage.ACTIVITY__VISITORS:
				return visitors != null && !visitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
