/*
 * 
 */
package carnival.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import carnival.diagram.edit.parts.BoothEditPart;
import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.edit.parts.VisitorEditPart;
import carnival.diagram.providers.CarnivalElementTypes;
import carnival.diagram.providers.CarnivalModelingAssistantProvider;

/**
 * @generated
 */
public class CarnivalModelingAssistantProviderOfVisitorEditPart extends CarnivalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((VisitorEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(VisitorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CarnivalElementTypes.VisitorVisit_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((VisitorEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(VisitorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BoothEditPart) {
			types.add(CarnivalElementTypes.VisitorVisit_4001);
		}
		if (targetEditPart instanceof EventEditPart) {
			types.add(CarnivalElementTypes.VisitorVisit_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((VisitorEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(VisitorEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CarnivalElementTypes.VisitorVisit_4001) {
			types.add(CarnivalElementTypes.Booth_3001);
			types.add(CarnivalElementTypes.Event_3002);
		}
		return types;
	}

}
