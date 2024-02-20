/**
 */
package carnival.impl;

import carnival.Activity;
import carnival.CarnivalPackage;
import carnival.Visitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carnival.impl.VisitorImpl#getVisit <em>Visit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisitorImpl extends ParticipantImpl implements Visitor {
	/**
	 * The cached value of the '{@link #getVisit() <em>Visit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisit()
	 * @generated
	 * @ordered
	 */
	protected Activity visit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarnivalPackage.Literals.VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getVisit() {
		if (visit != null && visit.eIsProxy()) {
			InternalEObject oldVisit = (InternalEObject)visit;
			visit = (Activity)eResolveProxy(oldVisit);
			if (visit != oldVisit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CarnivalPackage.VISITOR__VISIT, oldVisit, visit));
			}
		}
		return visit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetVisit() {
		return visit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisit(Activity newVisit, NotificationChain msgs) {
		Activity oldVisit = visit;
		visit = newVisit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CarnivalPackage.VISITOR__VISIT, oldVisit, newVisit);
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
	public void setVisit(Activity newVisit) {
		if (newVisit != visit) {
			NotificationChain msgs = null;
			if (visit != null)
				msgs = ((InternalEObject)visit).eInverseRemove(this, CarnivalPackage.ACTIVITY__VISITORS, Activity.class, msgs);
			if (newVisit != null)
				msgs = ((InternalEObject)newVisit).eInverseAdd(this, CarnivalPackage.ACTIVITY__VISITORS, Activity.class, msgs);
			msgs = basicSetVisit(newVisit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarnivalPackage.VISITOR__VISIT, newVisit, newVisit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarnivalPackage.VISITOR__VISIT:
				if (visit != null)
					msgs = ((InternalEObject)visit).eInverseRemove(this, CarnivalPackage.ACTIVITY__VISITORS, Activity.class, msgs);
				return basicSetVisit((Activity)otherEnd, msgs);
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
			case CarnivalPackage.VISITOR__VISIT:
				return basicSetVisit(null, msgs);
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
			case CarnivalPackage.VISITOR__VISIT:
				if (resolve) return getVisit();
				return basicGetVisit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CarnivalPackage.VISITOR__VISIT:
				setVisit((Activity)newValue);
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
			case CarnivalPackage.VISITOR__VISIT:
				setVisit((Activity)null);
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
			case CarnivalPackage.VISITOR__VISIT:
				return visit != null;
		}
		return super.eIsSet(featureID);
	}

} //VisitorImpl
