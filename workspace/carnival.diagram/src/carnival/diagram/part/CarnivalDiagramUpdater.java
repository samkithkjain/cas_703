/*
* 
*/
package carnival.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import carnival.Activity;
import carnival.Booth;
import carnival.Carnival;
import carnival.CarnivalDay;
import carnival.CarnivalPackage;
import carnival.Event;
import carnival.Participant;
import carnival.Sponsor;
import carnival.Visitor;
import carnival.diagram.edit.parts.BoothEditPart;
import carnival.diagram.edit.parts.CarnivalDayCarnivalDayActivitiesCompartmentEditPart;
import carnival.diagram.edit.parts.CarnivalDayEditPart;
import carnival.diagram.edit.parts.CarnivalEditPart;
import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.edit.parts.SponsorEditPart;
import carnival.diagram.edit.parts.SponsorWorkEditPart;
import carnival.diagram.edit.parts.VisitorEditPart;
import carnival.diagram.edit.parts.VisitorVisitEditPart;
import carnival.diagram.providers.CarnivalElementTypes;

/**
 * @generated
 */
public class CarnivalDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<CarnivalNodeDescriptor> getSemanticChildren(View view) {
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case CarnivalEditPart.VISUAL_ID:
			return getCarnival_1000SemanticChildren(view);
		case CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID:
			return getCarnivalDayCarnivalDayActivitiesCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CarnivalNodeDescriptor> getCarnival_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Carnival modelElement = (Carnival) view.getElement();
		LinkedList<CarnivalNodeDescriptor> result = new LinkedList<CarnivalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttendees().iterator(); it.hasNext();) {
			Participant childElement = (Participant) it.next();
			int visualID = CarnivalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == VisitorEditPart.VISUAL_ID) {
				result.add(new CarnivalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SponsorEditPart.VISUAL_ID) {
				result.add(new CarnivalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCarnivalDays().iterator(); it.hasNext();) {
			CarnivalDay childElement = (CarnivalDay) it.next();
			int visualID = CarnivalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CarnivalDayEditPart.VISUAL_ID) {
				result.add(new CarnivalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CarnivalNodeDescriptor> getCarnivalDayCarnivalDayActivitiesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CarnivalDay modelElement = (CarnivalDay) containerView.getElement();
		LinkedList<CarnivalNodeDescriptor> result = new LinkedList<CarnivalNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivities().iterator(); it.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = CarnivalVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BoothEditPart.VISUAL_ID) {
				result.add(new CarnivalNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new CarnivalNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CarnivalLinkDescriptor> getContainedLinks(View view) {
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case CarnivalEditPart.VISUAL_ID:
			return getCarnival_1000ContainedLinks(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_2001ContainedLinks(view);
		case SponsorEditPart.VISUAL_ID:
			return getSponsor_2002ContainedLinks(view);
		case CarnivalDayEditPart.VISUAL_ID:
			return getCarnivalDay_2003ContainedLinks(view);
		case BoothEditPart.VISUAL_ID:
			return getBooth_3001ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CarnivalLinkDescriptor> getIncomingLinks(View view) {
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_2001IncomingLinks(view);
		case SponsorEditPart.VISUAL_ID:
			return getSponsor_2002IncomingLinks(view);
		case CarnivalDayEditPart.VISUAL_ID:
			return getCarnivalDay_2003IncomingLinks(view);
		case BoothEditPart.VISUAL_ID:
			return getBooth_3001IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CarnivalLinkDescriptor> getOutgoingLinks(View view) {
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_2001OutgoingLinks(view);
		case SponsorEditPart.VISUAL_ID:
			return getSponsor_2002OutgoingLinks(view);
		case CarnivalDayEditPart.VISUAL_ID:
			return getCarnivalDay_2003OutgoingLinks(view);
		case BoothEditPart.VISUAL_ID:
			return getBooth_3001OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getCarnival_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getVisitor_2001ContainedLinks(View view) {
		Visitor modelElement = (Visitor) view.getElement();
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Visitor_Visit_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getSponsor_2002ContainedLinks(View view) {
		Sponsor modelElement = (Sponsor) view.getElement();
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sponsor_Work_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getCarnivalDay_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getBooth_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getEvent_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getVisitor_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getSponsor_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getCarnivalDay_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getBooth_3001IncomingLinks(View view) {
		Booth modelElement = (Booth) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Visitor_Visit_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Sponsor_Work_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getEvent_3002IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Visitor_Visit_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Sponsor_Work_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getVisitor_2001OutgoingLinks(View view) {
		Visitor modelElement = (Visitor) view.getElement();
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Visitor_Visit_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getSponsor_2002OutgoingLinks(View view) {
		Sponsor modelElement = (Sponsor) view.getElement();
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sponsor_Work_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getCarnivalDay_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getBooth_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CarnivalLinkDescriptor> getEvent_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CarnivalLinkDescriptor> getIncomingFeatureModelFacetLinks_Visitor_Visit_4001(
			Activity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CarnivalPackage.eINSTANCE.getVisitor_Visit()) {
				result.add(new CarnivalLinkDescriptor(setting.getEObject(), target,
						CarnivalElementTypes.VisitorVisit_4001, VisitorVisitEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CarnivalLinkDescriptor> getIncomingFeatureModelFacetLinks_Sponsor_Work_4002(
			Activity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CarnivalPackage.eINSTANCE.getSponsor_Work()) {
				result.add(new CarnivalLinkDescriptor(setting.getEObject(), target,
						CarnivalElementTypes.SponsorWork_4002, SponsorWorkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CarnivalLinkDescriptor> getOutgoingFeatureModelFacetLinks_Visitor_Visit_4001(
			Visitor source) {
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		for (Iterator<?> destinations = source.getVisit().iterator(); destinations.hasNext();) {
			Activity destination = (Activity) destinations.next();
			result.add(new CarnivalLinkDescriptor(source, destination, CarnivalElementTypes.VisitorVisit_4001,
					VisitorVisitEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CarnivalLinkDescriptor> getOutgoingFeatureModelFacetLinks_Sponsor_Work_4002(
			Sponsor source) {
		LinkedList<CarnivalLinkDescriptor> result = new LinkedList<CarnivalLinkDescriptor>();
		for (Iterator<?> destinations = source.getWork().iterator(); destinations.hasNext();) {
			Activity destination = (Activity) destinations.next();
			result.add(new CarnivalLinkDescriptor(source, destination, CarnivalElementTypes.SponsorWork_4002,
					SponsorWorkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<CarnivalNodeDescriptor> getSemanticChildren(View view) {
			return CarnivalDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CarnivalLinkDescriptor> getContainedLinks(View view) {
			return CarnivalDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CarnivalLinkDescriptor> getIncomingLinks(View view) {
			return CarnivalDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<CarnivalLinkDescriptor> getOutgoingLinks(View view) {
			return CarnivalDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
