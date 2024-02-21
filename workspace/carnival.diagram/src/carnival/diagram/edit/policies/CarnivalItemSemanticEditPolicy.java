/*
* 
*/
package carnival.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import carnival.diagram.edit.commands.CarnivalDayCreateCommand;
import carnival.diagram.edit.commands.VisitorCreateCommand;
import carnival.diagram.edit.commands.VolunteerCreateCommand;
import carnival.diagram.providers.CarnivalElementTypes;

/**
 * @generated
 */
public class CarnivalItemSemanticEditPolicy extends CarnivalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CarnivalItemSemanticEditPolicy() {
		super(CarnivalElementTypes.Carnival_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CarnivalElementTypes.Visitor_2001 == req.getElementType()) {
			return getGEFWrapper(new VisitorCreateCommand(req));
		}
		if (CarnivalElementTypes.Volunteer_2002 == req.getElementType()) {
			return getGEFWrapper(new VolunteerCreateCommand(req));
		}
		if (CarnivalElementTypes.CarnivalDay_2003 == req.getElementType()) {
			return getGEFWrapper(new CarnivalDayCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
