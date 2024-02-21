/*
* 
*/
package carnival.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import carnival.diagram.edit.commands.BoothCreateCommand;
import carnival.diagram.edit.commands.EventCreateCommand;
import carnival.diagram.providers.CarnivalElementTypes;

/**
 * @generated
 */
public class CarnivalDayCarnivalDayActivitiesCompartmentItemSemanticEditPolicy
		extends CarnivalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CarnivalDayCarnivalDayActivitiesCompartmentItemSemanticEditPolicy() {
		super(CarnivalElementTypes.CarnivalDay_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CarnivalElementTypes.Booth_3001 == req.getElementType()) {
			return getGEFWrapper(new BoothCreateCommand(req));
		}
		if (CarnivalElementTypes.Event_3002 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
