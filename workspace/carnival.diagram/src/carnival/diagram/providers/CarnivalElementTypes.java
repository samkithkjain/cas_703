/*
 * 
 */
package carnival.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import carnival.CarnivalPackage;
import carnival.diagram.edit.parts.BoothEditPart;
import carnival.diagram.edit.parts.CarnivalDayEditPart;
import carnival.diagram.edit.parts.CarnivalEditPart;
import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.edit.parts.SponsorEditPart;
import carnival.diagram.edit.parts.SponsorWorkEditPart;
import carnival.diagram.edit.parts.VisitorEditPart;
import carnival.diagram.edit.parts.VisitorVisitEditPart;
import carnival.diagram.part.CarnivalDiagramEditorPlugin;

/**
 * @generated
 */
public class CarnivalElementTypes {

	/**
	* @generated
	*/
	private CarnivalElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CarnivalDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Carnival_1000 = getElementType("carnival.diagram.Carnival_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Visitor_2001 = getElementType("carnival.diagram.Visitor_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sponsor_2002 = getElementType("carnival.diagram.Sponsor_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CarnivalDay_2003 = getElementType("carnival.diagram.CarnivalDay_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Booth_3001 = getElementType("carnival.diagram.Booth_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Event_3002 = getElementType("carnival.diagram.Event_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisitorVisit_4001 = getElementType("carnival.diagram.VisitorVisit_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SponsorWork_4002 = getElementType("carnival.diagram.SponsorWork_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Carnival_1000, CarnivalPackage.eINSTANCE.getCarnival());

			elements.put(Visitor_2001, CarnivalPackage.eINSTANCE.getVisitor());

			elements.put(Sponsor_2002, CarnivalPackage.eINSTANCE.getSponsor());

			elements.put(CarnivalDay_2003, CarnivalPackage.eINSTANCE.getCarnivalDay());

			elements.put(Booth_3001, CarnivalPackage.eINSTANCE.getBooth());

			elements.put(Event_3002, CarnivalPackage.eINSTANCE.getEvent());

			elements.put(VisitorVisit_4001, CarnivalPackage.eINSTANCE.getVisitor_Visit());

			elements.put(SponsorWork_4002, CarnivalPackage.eINSTANCE.getSponsor_Work());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Carnival_1000);
			KNOWN_ELEMENT_TYPES.add(Visitor_2001);
			KNOWN_ELEMENT_TYPES.add(Sponsor_2002);
			KNOWN_ELEMENT_TYPES.add(CarnivalDay_2003);
			KNOWN_ELEMENT_TYPES.add(Booth_3001);
			KNOWN_ELEMENT_TYPES.add(Event_3002);
			KNOWN_ELEMENT_TYPES.add(VisitorVisit_4001);
			KNOWN_ELEMENT_TYPES.add(SponsorWork_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CarnivalEditPart.VISUAL_ID:
			return Carnival_1000;
		case VisitorEditPart.VISUAL_ID:
			return Visitor_2001;
		case SponsorEditPart.VISUAL_ID:
			return Sponsor_2002;
		case CarnivalDayEditPart.VISUAL_ID:
			return CarnivalDay_2003;
		case BoothEditPart.VISUAL_ID:
			return Booth_3001;
		case EventEditPart.VISUAL_ID:
			return Event_3002;
		case VisitorVisitEditPart.VISUAL_ID:
			return VisitorVisit_4001;
		case SponsorWorkEditPart.VISUAL_ID:
			return SponsorWork_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return carnival.diagram.providers.CarnivalElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return carnival.diagram.providers.CarnivalElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return carnival.diagram.providers.CarnivalElementTypes.getElement(elementTypeAdapter);
		}
	};

}
