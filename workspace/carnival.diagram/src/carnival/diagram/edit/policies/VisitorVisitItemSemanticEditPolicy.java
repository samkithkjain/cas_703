/*
* 
*/
package carnival.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import carnival.diagram.providers.CarnivalElementTypes;

/**
 * @generated
 */
public class VisitorVisitItemSemanticEditPolicy extends CarnivalBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VisitorVisitItemSemanticEditPolicy() {
		super(CarnivalElementTypes.VisitorVisit_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
