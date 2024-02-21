/*
 * 
 */
package carnival.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import carnival.diagram.edit.parts.CarnivalEditPart;
import carnival.diagram.edit.parts.CarnivalEditPartFactory;
import carnival.diagram.part.CarnivalVisualIDRegistry;

/**
 * @generated
 */
public class CarnivalEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public CarnivalEditPartProvider() {
		super(new CarnivalEditPartFactory(), CarnivalVisualIDRegistry.TYPED_INSTANCE, CarnivalEditPart.MODEL_ID);
	}

}
