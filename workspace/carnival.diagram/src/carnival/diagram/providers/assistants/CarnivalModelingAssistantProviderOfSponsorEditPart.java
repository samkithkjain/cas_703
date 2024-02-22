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
import carnival.diagram.edit.parts.SponsorEditPart;
import carnival.diagram.providers.CarnivalElementTypes;
import carnival.diagram.providers.CarnivalModelingAssistantProvider;

/**
 * @generated
 */
public class CarnivalModelingAssistantProviderOfSponsorEditPart extends CarnivalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SponsorEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(SponsorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CarnivalElementTypes.SponsorWork_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((SponsorEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(SponsorEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BoothEditPart) {
			types.add(CarnivalElementTypes.SponsorWork_4002);
		}
		if (targetEditPart instanceof EventEditPart) {
			types.add(CarnivalElementTypes.SponsorWork_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((SponsorEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(SponsorEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CarnivalElementTypes.SponsorWork_4002) {
			types.add(CarnivalElementTypes.Booth_3001);
			types.add(CarnivalElementTypes.Event_3002);
		}
		return types;
	}

}
