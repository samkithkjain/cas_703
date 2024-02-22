/*
* 
*/
package carnival.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import carnival.Carnival;
import carnival.CarnivalPackage;
import carnival.diagram.edit.parts.BoothEditPart;
import carnival.diagram.edit.parts.BoothNameEditPart;
import carnival.diagram.edit.parts.CarnivalDayCarnivalDayActivitiesCompartmentEditPart;
import carnival.diagram.edit.parts.CarnivalDayEditPart;
import carnival.diagram.edit.parts.CarnivalDayNameNEditPart;
import carnival.diagram.edit.parts.CarnivalEditPart;
import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.edit.parts.EventNameTimeEditPart;
import carnival.diagram.edit.parts.SponsorEditPart;
import carnival.diagram.edit.parts.SponsorNameEditPart;
import carnival.diagram.edit.parts.SponsorWorkEditPart;
import carnival.diagram.edit.parts.VisitorEditPart;
import carnival.diagram.edit.parts.VisitorNameEditPart;
import carnival.diagram.edit.parts.VisitorVisitEditPart;
import carnival.diagram.edit.parts.WrappingLabel2EditPart;
import carnival.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CarnivalVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "carnival.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CarnivalEditPart.MODEL_ID.equals(view.getType())) {
				return CarnivalEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return carnival.diagram.part.CarnivalVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CarnivalDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CarnivalPackage.eINSTANCE.getCarnival().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Carnival) domainElement)) {
			return CarnivalEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = carnival.diagram.part.CarnivalVisualIDRegistry.getModelID(containerView);
		if (!CarnivalEditPart.MODEL_ID.equals(containerModelID) && !"Carnival".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CarnivalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = carnival.diagram.part.CarnivalVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CarnivalEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CarnivalEditPart.VISUAL_ID:
			if (CarnivalPackage.eINSTANCE.getVisitor().isSuperTypeOf(domainElement.eClass())) {
				return VisitorEditPart.VISUAL_ID;
			}
			if (CarnivalPackage.eINSTANCE.getSponsor().isSuperTypeOf(domainElement.eClass())) {
				return SponsorEditPart.VISUAL_ID;
			}
			if (CarnivalPackage.eINSTANCE.getCarnivalDay().isSuperTypeOf(domainElement.eClass())) {
				return CarnivalDayEditPart.VISUAL_ID;
			}
			break;
		case CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID:
			if (CarnivalPackage.eINSTANCE.getBooth().isSuperTypeOf(domainElement.eClass())) {
				return BoothEditPart.VISUAL_ID;
			}
			if (CarnivalPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = carnival.diagram.part.CarnivalVisualIDRegistry.getModelID(containerView);
		if (!CarnivalEditPart.MODEL_ID.equals(containerModelID) && !"Carnival".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CarnivalEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = carnival.diagram.part.CarnivalVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CarnivalEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CarnivalEditPart.VISUAL_ID:
			if (VisitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SponsorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CarnivalDayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VisitorEditPart.VISUAL_ID:
			if (VisitorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SponsorEditPart.VISUAL_ID:
			if (SponsorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CarnivalDayEditPart.VISUAL_ID:
			if (CarnivalDayNameNEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BoothEditPart.VISUAL_ID:
			if (BoothNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventNameTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID:
			if (BoothEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VisitorVisitEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SponsorWorkEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Carnival element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CarnivalEditPart.VISUAL_ID:
			return false;
		case VisitorEditPart.VISUAL_ID:
		case SponsorEditPart.VISUAL_ID:
		case BoothEditPart.VISUAL_ID:
		case EventEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return carnival.diagram.part.CarnivalVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
