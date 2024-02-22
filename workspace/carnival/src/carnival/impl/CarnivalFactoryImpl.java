/**
 */
package carnival.impl;

import carnival.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarnivalFactoryImpl extends EFactoryImpl implements CarnivalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarnivalFactory init() {
		try {
			CarnivalFactory theCarnivalFactory = (CarnivalFactory)EPackage.Registry.INSTANCE.getEFactory(CarnivalPackage.eNS_URI);
			if (theCarnivalFactory != null) {
				return theCarnivalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CarnivalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarnivalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CarnivalPackage.CARNIVAL: return createCarnival();
			case CarnivalPackage.CARNIVAL_DAY: return createCarnivalDay();
			case CarnivalPackage.BOOTH: return createBooth();
			case CarnivalPackage.EVENT: return createEvent();
			case CarnivalPackage.VISITOR: return createVisitor();
			case CarnivalPackage.SPONSOR: return createSponsor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Carnival createCarnival() {
		CarnivalImpl carnival = new CarnivalImpl();
		return carnival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarnivalDay createCarnivalDay() {
		CarnivalDayImpl carnivalDay = new CarnivalDayImpl();
		return carnivalDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Booth createBooth() {
		BoothImpl booth = new BoothImpl();
		return booth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visitor createVisitor() {
		VisitorImpl visitor = new VisitorImpl();
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sponsor createSponsor() {
		SponsorImpl sponsor = new SponsorImpl();
		return sponsor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarnivalPackage getCarnivalPackage() {
		return (CarnivalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CarnivalPackage getPackage() {
		return CarnivalPackage.eINSTANCE;
	}

} //CarnivalFactoryImpl
