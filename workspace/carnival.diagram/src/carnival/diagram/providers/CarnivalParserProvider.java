/*
 * 
 */
package carnival.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import carnival.CarnivalPackage;
import carnival.diagram.edit.parts.BoothNameEditPart;
import carnival.diagram.edit.parts.CarnivalDayNameNEditPart;
import carnival.diagram.edit.parts.EventNameTimeEditPart;
import carnival.diagram.edit.parts.SponsorNameEditPart;
import carnival.diagram.edit.parts.VisitorNameEditPart;
import carnival.diagram.parsers.MessageFormatParser;
import carnival.diagram.part.CarnivalVisualIDRegistry;

/**
 * @generated
 */
public class CarnivalParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser visitorName_5001Parser;

	/**
	* @generated
	*/
	private IParser getVisitorName_5001Parser() {
		if (visitorName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CarnivalPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Visitor {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Visitor {0}"); //$NON-NLS-1$
			parser.setEditPattern("Visitor {0}"); //$NON-NLS-1$
			visitorName_5001Parser = parser;
		}
		return visitorName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser sponsorName_5002Parser;

	/**
	* @generated
	*/
	private IParser getSponsorName_5002Parser() {
		if (sponsorName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CarnivalPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sponsor {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Sponsor {0}"); //$NON-NLS-1$
			parser.setEditPattern("Sponsor {0}"); //$NON-NLS-1$
			sponsorName_5002Parser = parser;
		}
		return sponsorName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser carnivalDayNameN_5005Parser;

	/**
	* @generated
	*/
	private IParser getCarnivalDayNameN_5005Parser() {
		if (carnivalDayNameN_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { CarnivalPackage.eINSTANCE.getNamedElement_Name(),
					CarnivalPackage.eINSTANCE.getCarnivalDay_N() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Day {1}:{0}"); //$NON-NLS-1$
			parser.setEditorPattern("Day {1}:{0}"); //$NON-NLS-1$
			parser.setEditPattern("Day {1}:{0}"); //$NON-NLS-1$
			carnivalDayNameN_5005Parser = parser;
		}
		return carnivalDayNameN_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser boothName_5003Parser;

	/**
	* @generated
	*/
	private IParser getBoothName_5003Parser() {
		if (boothName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CarnivalPackage.eINSTANCE.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			boothName_5003Parser = parser;
		}
		return boothName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser eventNameTime_5004Parser;

	/**
	* @generated
	*/
	private IParser getEventNameTime_5004Parser() {
		if (eventNameTime_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CarnivalPackage.eINSTANCE.getNamedElement_Name(),
					CarnivalPackage.eINSTANCE.getEvent_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			eventNameTime_5004Parser = parser;
		}
		return eventNameTime_5004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case VisitorNameEditPart.VISUAL_ID:
			return getVisitorName_5001Parser();
		case SponsorNameEditPart.VISUAL_ID:
			return getSponsorName_5002Parser();
		case CarnivalDayNameNEditPart.VISUAL_ID:
			return getCarnivalDayNameN_5005Parser();
		case BoothNameEditPart.VISUAL_ID:
			return getBoothName_5003Parser();
		case EventNameTimeEditPart.VISUAL_ID:
			return getEventNameTime_5004Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CarnivalVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CarnivalVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CarnivalElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
