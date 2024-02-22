/*
 * 
 */
package carnival.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import carnival.diagram.providers.CarnivalElementTypes;
import carnival.diagram.providers.CarnivalModelingAssistantProvider;

/**
 * @generated
 */
public class CarnivalModelingAssistantProviderOfCarnivalEditPart extends CarnivalModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CarnivalElementTypes.Visitor_2001);
		types.add(CarnivalElementTypes.Sponsor_2002);
		types.add(CarnivalElementTypes.CarnivalDay_2003);
		return types;
	}

}
