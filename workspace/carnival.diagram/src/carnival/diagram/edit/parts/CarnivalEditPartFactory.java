/*
 * 
 */
package carnival.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import carnival.diagram.part.CarnivalVisualIDRegistry;

/**
 * @generated
 */
public class CarnivalEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CarnivalVisualIDRegistry.getVisualID(view)) {

			case CarnivalEditPart.VISUAL_ID:
				return new CarnivalEditPart(view);

			case VisitorEditPart.VISUAL_ID:
				return new VisitorEditPart(view);

			case VisitorNameEditPart.VISUAL_ID:
				return new VisitorNameEditPart(view);

			case VolunteerEditPart.VISUAL_ID:
				return new VolunteerEditPart(view);

			case VolunteerNameEditPart.VISUAL_ID:
				return new VolunteerNameEditPart(view);

			case CarnivalDayEditPart.VISUAL_ID:
				return new CarnivalDayEditPart(view);

			case CarnivalDayNameNEditPart.VISUAL_ID:
				return new CarnivalDayNameNEditPart(view);

			case BoothEditPart.VISUAL_ID:
				return new BoothEditPart(view);

			case BoothNameEditPart.VISUAL_ID:
				return new BoothNameEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventNameTimeEditPart.VISUAL_ID:
				return new EventNameTimeEditPart(view);

			case CarnivalDayCarnivalDayActivitiesCompartmentEditPart.VISUAL_ID:
				return new CarnivalDayCarnivalDayActivitiesCompartmentEditPart(view);

			case VisitorVisitEditPart.VISUAL_ID:
				return new VisitorVisitEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case VolunteerWorkEditPart.VISUAL_ID:
				return new VolunteerWorkEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
