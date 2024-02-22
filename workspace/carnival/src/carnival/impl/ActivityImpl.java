/**
 */
package carnival.impl;

import carnival.Activity;
import carnival.CarnivalPackage;
import carnival.Sponsor;
import carnival.Visitor;

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
 *   <li>{@link carnival.impl.ActivityImpl#getSponsors <em>Sponsors</em>}</li>
 *   <li>{@link carnival.impl.ActivityImpl#getVisitors <em>Visitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getSponsors() <em>Sponsors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSponsors()
	 * @generated
	 * @ordered
	 */
	protected Sponsor sponsors;

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
	public Sponsor getSponsors() {
		if (sponsors != null && sponsors.eIsProxy()) {
			InternalEObject oldSponsors = (InternalEObject)sponsors;
			sponsors = (Sponsor)eResolveProxy(oldSponsors);
			if (sponsors != oldSponsors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CarnivalPackage.ACTIVITY__SPONSORS, oldSponsors, sponsors));
			}
		}
		return sponsors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sponsor basicGetSponsors() {
		return sponsors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSponsors(Sponsor newSponsors, NotificationChain msgs) {
		Sponsor oldSponsors = sponsors;
		sponsors = newSponsors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CarnivalPackage.ACTIVITY__SPONSORS, oldSponsors, newSponsors);
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
	public void setSponsors(Sponsor newSponsors) {
		if (newSponsors != sponsors) {
			NotificationChain msgs = null;
			if (sponsors != null)
				msgs = ((InternalEObject)sponsors).eInverseRemove(this, CarnivalPackage.SPONSOR__WORK, Sponsor.class, msgs);
			if (newSponsors != null)
				msgs = ((InternalEObject)newSponsors).eInverseAdd(this, CarnivalPackage.SPONSOR__WORK, Sponsor.class, msgs);
			msgs = basicSetSponsors(newSponsors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarnivalPackage.ACTIVITY__SPONSORS, newSponsors, newSponsors));
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				if (sponsors != null)
					msgs = ((InternalEObject)sponsors).eInverseRemove(this, CarnivalPackage.SPONSOR__WORK, Sponsor.class, msgs);
				return basicSetSponsors((Sponsor)otherEnd, msgs);
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				return basicSetSponsors(null, msgs);
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				if (resolve) return getSponsors();
				return basicGetSponsors();
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				setSponsors((Sponsor)newValue);
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				setSponsors((Sponsor)null);
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
			case CarnivalPackage.ACTIVITY__SPONSORS:
				return sponsors != null;
			case CarnivalPackage.ACTIVITY__VISITORS:
				return visitors != null && !visitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
