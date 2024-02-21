/*
 * 
 */
package carnival.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.providers.CarnivalElementTypes;
import carnival.diagram.providers.CarnivalModelingAssistantProvider;

/**
 * @generated
 */
public class CarnivalModelingAssistantProviderOfEventEditPart extends CarnivalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EventEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EventEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CarnivalElementTypes.VisitorVisit_4001);
		types.add(CarnivalElementTypes.VolunteerWork_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EventEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EventEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CarnivalElementTypes.VisitorVisit_4001) {
			types.add(CarnivalElementTypes.Visitor_2001);
		} else if (relationshipType == CarnivalElementTypes.VolunteerWork_4002) {
			types.add(CarnivalElementTypes.Volunteer_2002);
		}
		return types;
	}

}
