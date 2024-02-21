
/*
 * 
 */
package carnival.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import carnival.diagram.providers.CarnivalElementTypes;

/**
 * @generated
 */
public class CarnivalPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBooth1CreationTool());
		paletteContainer.add(createCarnivalDay2CreationTool());
		paletteContainer.add(createEvent3CreationTool());
		paletteContainer.add(createVisitor4CreationTool());
		paletteContainer.add(createVolunteer5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createVisit1CreationTool());
		paletteContainer.add(createWork2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBooth1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Booth1CreationTool_title,
				Messages.Booth1CreationTool_desc, Collections.singletonList(CarnivalElementTypes.Booth_3001));
		entry.setId("createBooth1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.Booth_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCarnivalDay2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CarnivalDay2CreationTool_title,
				Messages.CarnivalDay2CreationTool_desc,
				Collections.singletonList(CarnivalElementTypes.CarnivalDay_2003));
		entry.setId("createCarnivalDay2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.CarnivalDay_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvent3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event3CreationTool_title,
				Messages.Event3CreationTool_desc, Collections.singletonList(CarnivalElementTypes.Event_3002));
		entry.setId("createEvent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.Event_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisitor4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Visitor4CreationTool_title,
				Messages.Visitor4CreationTool_desc, Collections.singletonList(CarnivalElementTypes.Visitor_2001));
		entry.setId("createVisitor4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.Visitor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVolunteer5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Volunteer5CreationTool_title,
				Messages.Volunteer5CreationTool_desc, Collections.singletonList(CarnivalElementTypes.Volunteer_2002));
		entry.setId("createVolunteer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.Volunteer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisit1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Visit1CreationTool_title,
				Messages.Visit1CreationTool_desc, Collections.singletonList(CarnivalElementTypes.VisitorVisit_4001));
		entry.setId("createVisit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.VisitorVisit_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWork2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Work2CreationTool_title,
				Messages.Work2CreationTool_desc, Collections.singletonList(CarnivalElementTypes.VolunteerWork_4002));
		entry.setId("createWork2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CarnivalElementTypes.getImageDescriptor(CarnivalElementTypes.VolunteerWork_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
