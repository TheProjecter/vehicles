package vehicles.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import vehicles.*;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.jdesktop.application.Action;
import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;
import vehicles.environment.*;
import vehicles.processing.*;

/*
 * EnvironmentEditor.java
 *
 * Created on 26-Mar-2009, 15:05:05
 * @author Niall O'Hara
 */
public class EnvironmentEditor extends javax.swing.JFrame {

	/** Creates new form EnvironmentEditor */
	public EnvironmentEditor(java.awt.Frame parent, Simulator p_appRoot) {

		appRoot = p_appRoot;
		environmentArray = appRoot.getEnvironmentArray();
		environmentDropDown = new DefaultComboBoxModel(environmentArray);

		gridArray = new Grid[]{new Grid(640, 480), new Grid(800, 600), new Grid(1024, 768)};
		gridDropDown = new DefaultComboBoxModel(gridArray);

		elementArray = new EnvironmentElement[]{new EnvironmentElement(1),
				new EnvironmentElement(2),
				new EnvironmentElement(3),
				new EnvironmentElement(4)};
		elementDropDown = new DefaultComboBoxModel(elementArray);

		proLayout = new EnvironmentLayout(environmentArray[0]);

		// important to call this whenever embedding a PApplet.
		// It ensures that the animation thread is started and
		// that other internal variables are properly set.
		preBrush = new ElementBrushPreview();
		preBrush.setPev(elementArray[0]);



		proLayout.setEb(preBrush);
		preBrush.init();
		proLayout.init();




		initComponents();

		populateFields(environmentArray[0]);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		panel_SelectedEnvironment = new JPanel();
		dropdown_SelectedEnvironment = new JComboBox();
		tabContainer = new JTabbedPane();
		tab_Properties = new JPanel();
		panel_Name = new JPanel();
		text_Name = new JTextField();
		panel_Author = new JPanel();
		text_Author = new JTextField();
		panel_Description = new JPanel();
		scrollpanel_Description = new JScrollPane();
		text_Description = new JTextArea();
		panel_LastModified = new JPanel();
		text_LastModified = new JTextField();
		tab_Design = new JPanel();
		panel_Layout = new JPanel();
		processing_Layout = new JPanel();
		button_ResetEnvironment = new JButton();
		panel_Tools = new JPanel();
		panel_GridSize = new JPanel();
		dropdown_GridSize = new JComboBox();
		panel_Brush = new JPanel();
		toggle_SelectionMode = new JToggleButton();
		dropdown_Brush = new JComboBox();
		processing_Brush = new JPanel();
		panel_Radius = new JPanel();
		slider_Radius = new JSlider();
		text_Radius = new JTextField();
		panel_Intensity = new JPanel();
		slider_Intensity = new JSlider();
		text_Intensity = new JTextField();
		text_Status = new JTextField();
		button_Save = new JButton();
		button_SaveAs = new JButton();
		button_Cancel = new JButton();

		ResourceMap resourceMap = Application.getInstance(VehiclesApp.class).getContext().getResourceMap(EnvironmentEditor.class);
		setTitle(resourceMap.getString("Form.title")); // NOI18N
		setMinimumSize(new Dimension(620, 560));
		setName("Form"); // NOI18N
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent evt) {
				formWindowGainedFocus(evt);
			}
			public void windowLostFocus(WindowEvent evt) {
			}
		});

		panel_SelectedEnvironment.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_SelectedEnvironment.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_SelectedEnvironment.border.titleFont"))); // NOI18N
		panel_SelectedEnvironment.setName("panel_SelectedEnvironment"); // NOI18N

		dropdown_SelectedEnvironment.setMaximumRowCount(4);
		dropdown_SelectedEnvironment.setModel(environmentDropDown);
		dropdown_SelectedEnvironment.setName("dropdown_SelectedEnvironment"); // NOI18N
		dropdown_SelectedEnvironment.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				dropdown_SelectedEnvironmentItemStateChanged(evt);
			}
		});

		GroupLayout panel_SelectedEnvironmentLayout = new GroupLayout(panel_SelectedEnvironment);
		panel_SelectedEnvironment.setLayout(panel_SelectedEnvironmentLayout);
		panel_SelectedEnvironmentLayout.setHorizontalGroup(
				panel_SelectedEnvironmentLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(dropdown_SelectedEnvironment, 0, 588, Short.MAX_VALUE)
		);
		panel_SelectedEnvironmentLayout.setVerticalGroup(
				panel_SelectedEnvironmentLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(dropdown_SelectedEnvironment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		tabContainer.setName("tabContainer"); // NOI18N

		tab_Properties.setName("tab_Properties"); // NOI18N

		panel_Name.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Name.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Name.border.titleFont"))); // NOI18N
		panel_Name.setName("panel_Name"); // NOI18N
		panel_Name.setPreferredSize(new Dimension(224, 46));

		text_Name.setName("text_Name"); // NOI18N

		GroupLayout panel_NameLayout = new GroupLayout(panel_Name);
		panel_Name.setLayout(panel_NameLayout);
		panel_NameLayout.setHorizontalGroup(
				panel_NameLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Name, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
		);
		panel_NameLayout.setVerticalGroup(
				panel_NameLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		panel_Author.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Author.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Author.border.titleFont"))); // NOI18N
		panel_Author.setName("panel_Author"); // NOI18N

		text_Author.setName("text_Author"); // NOI18N

		GroupLayout panel_AuthorLayout = new GroupLayout(panel_Author);
		panel_Author.setLayout(panel_AuthorLayout);
		panel_AuthorLayout.setHorizontalGroup(
				panel_AuthorLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Author, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
		);
		panel_AuthorLayout.setVerticalGroup(
				panel_AuthorLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Author, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		panel_Description.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Description.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Description.border.titleFont"))); // NOI18N
		panel_Description.setName("panel_Description"); // NOI18N
		panel_Description.setPreferredSize(new Dimension(220, 311));

		scrollpanel_Description.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpanel_Description.setAutoscrolls(true);
		scrollpanel_Description.setName("scrollpanel_Description"); // NOI18N

		text_Description.setColumns(20);
		text_Description.setFont(resourceMap.getFont("text_Description.font")); // NOI18N
		text_Description.setLineWrap(true);
		text_Description.setRows(5);
		text_Description.setWrapStyleWord(true);
		text_Description.setName("text_Description"); // NOI18N
		scrollpanel_Description.setViewportView(text_Description);

		GroupLayout panel_DescriptionLayout = new GroupLayout(panel_Description);
		panel_Description.setLayout(panel_DescriptionLayout);
		panel_DescriptionLayout.setHorizontalGroup(
				panel_DescriptionLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollpanel_Description, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
		);
		panel_DescriptionLayout.setVerticalGroup(
				panel_DescriptionLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollpanel_Description, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
		);

		panel_LastModified.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_LastModified.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_LastModified.border.titleFont"))); // NOI18N
		panel_LastModified.setName("panel_LastModified"); // NOI18N

		text_LastModified.setEditable(false);
		text_LastModified.setBorder(BorderFactory.createEmptyBorder(1, 4, 1, 1));
		text_LastModified.setName("text_LastModified"); // NOI18N

		GroupLayout panel_LastModifiedLayout = new GroupLayout(panel_LastModified);
		panel_LastModified.setLayout(panel_LastModifiedLayout);
		panel_LastModifiedLayout.setHorizontalGroup(
				panel_LastModifiedLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_LastModified, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
		);
		panel_LastModifiedLayout.setVerticalGroup(
				panel_LastModifiedLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_LastModified, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		GroupLayout tab_PropertiesLayout = new GroupLayout(tab_Properties);
		tab_Properties.setLayout(tab_PropertiesLayout);
		tab_PropertiesLayout.setHorizontalGroup(
				tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, tab_PropertiesLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(tab_PropertiesLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_LastModified, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_Description, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
								.addComponent(panel_Author, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_Name, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
								.addContainerGap())
		);
		tab_PropertiesLayout.setVerticalGroup(
				tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, tab_PropertiesLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_Name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_Author, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_Description, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_LastModified, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
		);

		tabContainer.addTab(resourceMap.getString("tab_Properties.TabConstraints.tabTitle"), tab_Properties); // NOI18N

		tab_Design.setName("tab_Design"); // NOI18N

		panel_Layout.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Layout.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Layout.border.titleFont"))); // NOI18N
		panel_Layout.setName("panel_Layout"); // NOI18N

		processing_Layout.setBackground(resourceMap.getColor("processing_Layout.background")); // NOI18N
		processing_Layout.setName("processing_Layout"); // NOI18N
		processing_Layout.setPreferredSize(new Dimension(320, 240));
		processing_Layout.setLayout(new BorderLayout());

		ActionMap actionMap = Application.getInstance(VehiclesApp.class).getContext().getActionMap(EnvironmentEditor.class, this);
		button_ResetEnvironment.setAction(actionMap.get("removeAllElements")); // NOI18N
		button_ResetEnvironment.setText(resourceMap.getString("button_ResetEnvironment.text")); // NOI18N
		button_ResetEnvironment.setName("button_ResetEnvironment"); // NOI18N

		GroupLayout panel_LayoutLayout = new GroupLayout(panel_Layout);
		panel_Layout.setLayout(panel_LayoutLayout);
		panel_LayoutLayout.setHorizontalGroup(
				panel_LayoutLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(button_ResetEnvironment, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
				.addComponent(processing_Layout, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
		);
		panel_LayoutLayout.setVerticalGroup(
				panel_LayoutLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, panel_LayoutLayout.createSequentialGroup()
						.addComponent(processing_Layout, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(button_ResetEnvironment))
		);

		processing_Layout.add(proLayout, BorderLayout.CENTER);

		panel_Tools.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Tools.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Tools.border.titleFont"))); // NOI18N
		panel_Tools.setName("panel_Tools"); // NOI18N

		panel_GridSize.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_GridSize.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_GridSize.border.titleFont"))); // NOI18N
		panel_GridSize.setName("panel_GridSize"); // NOI18N

		dropdown_GridSize.setModel(gridDropDown);
		dropdown_GridSize.setName("dropdown_GridSize"); // NOI18N
		dropdown_GridSize.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				dropdown_GridSizeItemStateChanged(evt);
			}
		});

		GroupLayout panel_GridSizeLayout = new GroupLayout(panel_GridSize);
		panel_GridSize.setLayout(panel_GridSizeLayout);
		panel_GridSizeLayout.setHorizontalGroup(
				panel_GridSizeLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(dropdown_GridSize, 0, 186, Short.MAX_VALUE)
		);
		panel_GridSizeLayout.setVerticalGroup(
				panel_GridSizeLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(dropdown_GridSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		panel_Brush.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("panel_Brush.border.title"), TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, resourceMap.getFont("panel_Brush.border.titleFont"))); // NOI18N
		panel_Brush.setName("panel_Brush"); // NOI18N

		toggle_SelectionMode.setAction(actionMap.get("toggleBrush")); // NOI18N
		toggle_SelectionMode.setText(resourceMap.getString("toggle_SelectionMode.text")); // NOI18N
		toggle_SelectionMode.setName("toggle_SelectionMode"); // NOI18N

		dropdown_Brush.setModel(elementDropDown);
		dropdown_Brush.setName("dropdown_Brush"); // NOI18N
		dropdown_Brush.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				dropdown_BrushItemStateChanged(evt);
			}
		});

		processing_Brush.setBackground(resourceMap.getColor("processing_Brush.background")); // NOI18N
		processing_Brush.setName("processing_Brush"); // NOI18N
		processing_Brush.setLayout(new BorderLayout());

		panel_Radius.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_Radius.border.title"))); // NOI18N
		panel_Radius.setName("panel_Radius"); // NOI18N

		slider_Radius.setMaximum(50);
		slider_Radius.setValue(10);
		slider_Radius.setName("slider_Radius"); // NOI18N
		slider_Radius.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent evt) {
				slider_Radius_StateChanged(evt);
			}
		});

		text_Radius.setEditable(false);
		text_Radius.setFont(resourceMap.getFont("text_Radius.font")); // NOI18N
		text_Radius.setText(resourceMap.getString("text_Radius.text")); // NOI18N
		text_Radius.setName("text_Radius"); // NOI18N

		GroupLayout panel_RadiusLayout = new GroupLayout(panel_Radius);
		panel_Radius.setLayout(panel_RadiusLayout);
		panel_RadiusLayout.setHorizontalGroup(
				panel_RadiusLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, panel_RadiusLayout.createSequentialGroup()
						.addComponent(slider_Radius, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(text_Radius, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		panel_RadiusLayout.setVerticalGroup(
				panel_RadiusLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Radius, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addComponent(slider_Radius, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		panel_Intensity.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_Intensity.border.title"))); // NOI18N
		panel_Intensity.setName("panel_Intensity"); // NOI18N

		slider_Intensity.setName("slider_Intensity"); // NOI18N
		slider_Intensity.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent evt) {
				slider_Intensity_StateChanged(evt);
			}
		});

		text_Intensity.setEditable(false);
		text_Intensity.setFont(resourceMap.getFont("text_Intensity.font")); // NOI18N
		text_Intensity.setText(resourceMap.getString("text_Intensity.text")); // NOI18N
		text_Intensity.setName("text_Intensity"); // NOI18N

		GroupLayout panel_IntensityLayout = new GroupLayout(panel_Intensity);
		panel_Intensity.setLayout(panel_IntensityLayout);
		panel_IntensityLayout.setHorizontalGroup(
				panel_IntensityLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, panel_IntensityLayout.createSequentialGroup()
						.addComponent(slider_Intensity, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(text_Intensity, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		panel_IntensityLayout.setVerticalGroup(
				panel_IntensityLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(text_Intensity, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
				.addComponent(slider_Intensity, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);

		GroupLayout panel_BrushLayout = new GroupLayout(panel_Brush);
		panel_Brush.setLayout(panel_BrushLayout);
		panel_BrushLayout.setHorizontalGroup(
				panel_BrushLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panel_BrushLayout.createSequentialGroup()
						.addComponent(toggle_SelectionMode, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(dropdown_Brush, 0, 75, Short.MAX_VALUE))
						.addComponent(processing_Brush, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
						.addComponent(panel_Radius, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_Intensity, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		panel_BrushLayout.setVerticalGroup(
				panel_BrushLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panel_BrushLayout.createSequentialGroup()
						.addGroup(panel_BrushLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(toggle_SelectionMode)
								.addComponent(dropdown_Brush, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(processing_Brush, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_Radius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(1, 1, 1)
								.addComponent(panel_Intensity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);

		processing_Brush.add(preBrush, BorderLayout.CENTER);

		GroupLayout panel_ToolsLayout = new GroupLayout(panel_Tools);
		panel_Tools.setLayout(panel_ToolsLayout);
		panel_ToolsLayout.setHorizontalGroup(
				panel_ToolsLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_GridSize, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_Brush, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		panel_ToolsLayout.setVerticalGroup(
				panel_ToolsLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panel_ToolsLayout.createSequentialGroup()
						.addComponent(panel_GridSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_Brush, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		GroupLayout tab_DesignLayout = new GroupLayout(tab_Design);
		tab_Design.setLayout(tab_DesignLayout);
		tab_DesignLayout.setHorizontalGroup(
				tab_DesignLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, tab_DesignLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_Layout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_Tools, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
		);
		tab_DesignLayout.setVerticalGroup(
				tab_DesignLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, tab_DesignLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(tab_DesignLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_Layout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_Tools, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
		);

		tabContainer.addTab(resourceMap.getString("tab_Design.TabConstraints.tabTitle"), tab_Design); // NOI18N

		text_Status.setEditable(false);
		text_Status.setText(resourceMap.getString("text_Status.text")); // NOI18N
		text_Status.setName("text_Status"); // NOI18N

		button_Save.setAction(actionMap.get("saveEnvironment")); // NOI18N
		button_Save.setText(resourceMap.getString("button_Save.text")); // NOI18N
		button_Save.setName("button_Save"); // NOI18N

		button_SaveAs.setAction(actionMap.get("saveEnvironmentAs")); // NOI18N
		button_SaveAs.setText(resourceMap.getString("button_SaveAs.text")); // NOI18N
		button_SaveAs.setName("button_SaveAs"); // NOI18N

		button_Cancel.setAction(actionMap.get("cancel")); // NOI18N
		button_Cancel.setText(resourceMap.getString("button_Cancel.text")); // NOI18N
		button_Cancel.setName("button_Cancel"); // NOI18N

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
										.addComponent(text_Status, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_Save)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_SaveAs)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_Cancel))
										.addComponent(tabContainer, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
										.addComponent(panel_SelectedEnvironment, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addContainerGap())
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel_SelectedEnvironment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tabContainer, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_Cancel)
								.addComponent(button_SaveAs)
								.addComponent(button_Save)
								.addComponent(text_Status, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addContainerGap())
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void dropdown_SelectedEnvironmentItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_dropdown_SelectedEnvironmentItemStateChanged
		JComboBox tempComboBox = (JComboBox) evt.getSource();
		Environment selected = (Environment) tempComboBox.getSelectedItem();
		populateFields(selected);
	}//GEN-LAST:event_dropdown_SelectedEnvironmentItemStateChanged

	private void formWindowGainedFocus(WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
		dropdown_SelectedEnvironment.requestFocus();
	}//GEN-LAST:event_formWindowGainedFocus

	private void slider_Radius_StateChanged(ChangeEvent evt) {//GEN-FIRST:event_slider_Radius_StateChanged
		JSlider tempSlider = (JSlider) evt.getSource();
		int value = tempSlider.getValue();
		text_Radius.setText(Integer.toString(value));
		EnvironmentElement selected = (EnvironmentElement) dropdown_Brush.getSelectedItem();
		selected.setRadius(value);
		preBrush.setPev(selected);
		proLayout.setEb(preBrush);
	}//GEN-LAST:event_slider_Radius_StateChanged

	private void slider_Intensity_StateChanged(ChangeEvent evt) {//GEN-FIRST:event_slider_Intensity_StateChanged
		JSlider tempSlider = (JSlider) evt.getSource();
		int value = tempSlider.getValue();
		text_Intensity.setText(Integer.toString(value));
		EnvironmentElement selected = (EnvironmentElement) dropdown_Brush.getSelectedItem();
		selected.setStrength(value);
		preBrush.setPev(selected);
		proLayout.setEb(preBrush);
	}//GEN-LAST:event_slider_Intensity_StateChanged

	private void dropdown_GridSizeItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_dropdown_GridSizeItemStateChanged
		JComboBox tempComboBox = (JComboBox) evt.getSource();
		Grid selected = (Grid) tempComboBox.getSelectedItem();
		proLayout.setWidth_and_Height(selected.getWidth(), selected.getHeight());
	}//GEN-LAST:event_dropdown_GridSizeItemStateChanged

	private void dropdown_BrushItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_dropdown_BrushItemStateChanged
		JComboBox tempComboBox = (JComboBox) evt.getSource();
		EnvironmentElement selected = (EnvironmentElement) tempComboBox.getSelectedItem();
		populateBrushSliders(selected);
		preBrush.setPev(selected);
		proLayout.setEb(preBrush);
	}//GEN-LAST:event_dropdown_BrushItemStateChanged

	private void populateBrushSliders(EnvironmentElement p_element) {
		EnvironmentElement tempElement = p_element;
		slider_Radius.setValue(tempElement.getRadius());
		slider_Intensity.setValue(tempElement.getStrength());
	}

	private void populateFields(Environment p_environment) {
		Environment tempEnvironment = p_environment;
		text_Author.setText(tempEnvironment.getAuthor());
		text_Description.setText(tempEnvironment.getDescription());
		text_Name.setText(tempEnvironment.getName());
		text_LastModified.setText(tempEnvironment.getLastModified());
		proLayout.destroy();
		proLayout = new EnvironmentLayout(tempEnvironment);
		proLayout.init();
	}

	@Action
	public void cancel() {
		dispose();
	}

	@Action
	public void toggleBrush() {
	}

	@Action
	public void saveEnvironment() {
	}

	@Action
	public void saveEnvironmentAs() {
	}

	@Action
	public void removeAllElements() {
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton button_Cancel;
	private JButton button_ResetEnvironment;
	private JButton button_Save;
	private JButton button_SaveAs;
	private JComboBox dropdown_Brush;
	private JComboBox dropdown_GridSize;
	private JComboBox dropdown_SelectedEnvironment;
	private JPanel panel_Author;
	private JPanel panel_Brush;
	private JPanel panel_Description;
	private JPanel panel_GridSize;
	private JPanel panel_Intensity;
	private JPanel panel_LastModified;
	private JPanel panel_Layout;
	private JPanel panel_Name;
	private JPanel panel_Radius;
	private JPanel panel_SelectedEnvironment;
	private JPanel panel_Tools;
	private JPanel processing_Brush;
	private JPanel processing_Layout;
	private JScrollPane scrollpanel_Description;
	private JSlider slider_Intensity;
	private JSlider slider_Radius;
	private JTabbedPane tabContainer;
	private JPanel tab_Design;
	private JPanel tab_Properties;
	private JTextField text_Author;
	private JTextArea text_Description;
	private JTextField text_Intensity;
	private JTextField text_LastModified;
	private JTextField text_Name;
	private JTextField text_Radius;
	private JTextField text_Status;
	private JToggleButton toggle_SelectionMode;
	// End of variables declaration//GEN-END:variables
	private EnvironmentLayout proLayout;
	private ElementBrush proBrush;
	private ElementBrushPreview preBrush;

	private Environment[] environmentArray;
	private Grid[] gridArray;
	private EnvironmentElement[] elementArray;
	private DefaultComboBoxModel environmentDropDown;
	private DefaultComboBoxModel gridDropDown;
	private DefaultComboBoxModel elementDropDown;
	private Simulator appRoot;
}
