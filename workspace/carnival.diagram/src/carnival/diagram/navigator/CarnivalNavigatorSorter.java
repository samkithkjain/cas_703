/*
* 
*/
package carnival.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import carnival.diagram.part.CarnivalVisualIDRegistry;

/**
 * @generated
 */
public class CarnivalNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CarnivalNavigatorItem) {
			CarnivalNavigatorItem item = (CarnivalNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CarnivalVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
