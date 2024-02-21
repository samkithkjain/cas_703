/*
* 
*/
package carnival.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import carnival.Carnival;
import carnival.diagram.edit.parts.BoothEditPart;
import carnival.diagram.edit.parts.BoothNameEditPart;
import carnival.diagram.edit.parts.CarnivalDayEditPart;
import carnival.diagram.edit.parts.CarnivalDayNameEditPart;
import carnival.diagram.edit.parts.CarnivalDayNameNEditPart;
import carnival.diagram.edit.parts.CarnivalEditPart;
import carnival.diagram.edit.parts.EventEditPart;
import carnival.diagram.edit.parts.EventNameTimeEditPart;
import carnival.diagram.edit.parts.VisitorEditPart;
import carnival.diagram.edit.parts.VisitorNameEditPart;
import carnival.diagram.edit.parts.VisitorVisitEditPart;
import carnival.diagram.edit.parts.VolunteerEditPart;
import carnival.diagram.edit.parts.VolunteerNameEditPart;
import carnival.diagram.edit.parts.VolunteerWorkEditPart;
import carnival.diagram.part.CarnivalDiagramEditorPlugin;
import carnival.diagram.part.CarnivalVisualIDRegistry;
import carnival.diagram.providers.CarnivalElementTypes;
import carnival.diagram.providers.CarnivalParserProvider;

/**
 * @generated
 */
public class CarnivalNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CarnivalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CarnivalDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CarnivalNavigatorItem && !isOwnView(((CarnivalNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CarnivalNavigatorGroup) {
			CarnivalNavigatorGroup group = (CarnivalNavigatorGroup) element;
			return CarnivalDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CarnivalNavigatorItem) {
			CarnivalNavigatorItem navigatorItem = (CarnivalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case CarnivalEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?vr/carnival?Carnival", CarnivalElementTypes.Carnival_1000); //$NON-NLS-1$
		case VisitorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/carnival?Visitor", CarnivalElementTypes.Visitor_2001); //$NON-NLS-1$
		case VolunteerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/carnival?Volunteer", CarnivalElementTypes.Volunteer_2002); //$NON-NLS-1$
		case CarnivalDayEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?vr/carnival?CarnivalDay", CarnivalElementTypes.CarnivalDay_2003); //$NON-NLS-1$
		case BoothEditPart.VISUAL_ID:
			return getImage("Navigator?Node?vr/carnival?Booth", CarnivalElementTypes.Booth_3001); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?vr/carnival?Event", CarnivalElementTypes.Event_3002); //$NON-NLS-1$
		case VisitorVisitEditPart.VISUAL_ID:
			return getImage("Navigator?Link?vr/carnival?Visitor?visit", CarnivalElementTypes.VisitorVisit_4001); //$NON-NLS-1$
		case VolunteerWorkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?vr/carnival?Volunteer?work", CarnivalElementTypes.VolunteerWork_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CarnivalDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CarnivalElementTypes.isKnownElementType(elementType)) {
			image = CarnivalElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof CarnivalNavigatorGroup) {
			CarnivalNavigatorGroup group = (CarnivalNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CarnivalNavigatorItem) {
			CarnivalNavigatorItem navigatorItem = (CarnivalNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (CarnivalVisualIDRegistry.getVisualID(view)) {
		case CarnivalEditPart.VISUAL_ID:
			return getCarnival_1000Text(view);
		case VisitorEditPart.VISUAL_ID:
			return getVisitor_2001Text(view);
		case VolunteerEditPart.VISUAL_ID:
			return getVolunteer_2002Text(view);
		case CarnivalDayEditPart.VISUAL_ID:
			return getCarnivalDay_2003Text(view);
		case BoothEditPart.VISUAL_ID:
			return getBooth_3001Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3002Text(view);
		case VisitorVisitEditPart.VISUAL_ID:
			return getVisitorVisit_4001Text(view);
		case VolunteerWorkEditPart.VISUAL_ID:
			return getVolunteerWork_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCarnival_1000Text(View view) {
		Carnival domainModelElement = (Carnival) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisitor_2001Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.Visitor_2001,
				view.getElement() != null ? view.getElement() : view,
				CarnivalVisualIDRegistry.getType(VisitorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVolunteer_2002Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.Volunteer_2002,
				view.getElement() != null ? view.getElement() : view,
				CarnivalVisualIDRegistry.getType(VolunteerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCarnivalDay_2003Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.CarnivalDay_2003,
				view.getElement() != null ? view.getElement() : view,
				CarnivalVisualIDRegistry.getType(CarnivalDayNameNEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBooth_3001Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.Booth_3001,
				view.getElement() != null ? view.getElement() : view,
				CarnivalVisualIDRegistry.getType(BoothNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvent_3002Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.Event_3002,
				view.getElement() != null ? view.getElement() : view,
				CarnivalVisualIDRegistry.getType(EventNameTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisitorVisit_4001Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.VisitorVisit_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVolunteerWork_4002Text(View view) {
		IParser parser = CarnivalParserProvider.getParser(CarnivalElementTypes.VolunteerWork_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CarnivalDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return CarnivalEditPart.MODEL_ID.equals(CarnivalVisualIDRegistry.getModelID(view));
	}

}
