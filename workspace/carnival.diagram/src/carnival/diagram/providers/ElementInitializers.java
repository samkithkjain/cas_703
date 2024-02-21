/*
 * 
 */
package carnival.diagram.providers;

import carnival.diagram.part.CarnivalDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CarnivalDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			CarnivalDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
