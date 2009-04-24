/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VehicleEditor.java
 *
 * Created on 26-Mar-2009, 15:02:43
 */

package vehicles.gui;

import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import vehicles.processing.Embedded;
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
import processing.core.*;

/**
 *
 * @author Niall O'Hara
 */
public class VehicleEditor extends javax.swing.JFrame {

    /** Creates new form VehicleEditor */
    public VehicleEditor(java.awt.Frame parent) {

        embed = new Embedded();
        initComponents();
        // important to call this whenever embedding a PApplet.
        // It ensures that the animation thread is started and
        // that other internal variables are properly set.
        embed.init();
    }

    @Action public void cancel() {
        dispose();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabContainer = new JTabbedPane();
        tab_Properties = new JPanel();
        panel_VehicleName = new JPanel();
        vehicleName_jTextField = new JTextField();
        panel_SelectedVehicle = new JPanel();
        selectedVehicle_jComboBox = new JComboBox();
        panel_VehicleDescription = new JPanel();
        jScrollPane6 = new JScrollPane();
        vehicleDescription_jTextArea = new JTextArea();
        panel_Author = new JPanel();
        author_jTextField = new JTextField();
        panel_Preview = new JPanel();
        panel_Processing = new JPanel();
        tab_Design = new JPanel();
        jPanel5 = new JPanel();
        jPanel1 = new JPanel();
        jSlider1 = new JSlider();
        jPanel2 = new JPanel();
        jSlider2 = new JSlider();
        jPanel3 = new JPanel();
        jSlider3 = new JSlider();
        jPanel4 = new JPanel();
        jSlider4 = new JSlider();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jSlider5 = new JSlider();
        jPanel8 = new JPanel();
        jSlider6 = new JSlider();
        jPanel9 = new JPanel();
        jSlider7 = new JSlider();
        jPanel10 = new JPanel();
        jSlider8 = new JSlider();
        jPanel11 = new JPanel();
        jSlider9 = new JSlider();
        button_Save = new JButton();
        button_SaveAs = new JButton();
        button_Cancel = new JButton();

        ResourceMap resourceMap = Application.getInstance(VehiclesApp.class).getContext().getResourceMap(VehicleEditor.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        tabContainer.setName("tabContainer"); // NOI18N

        tab_Properties.setName("tab_Properties"); // NOI18N

        panel_VehicleName.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_VehicleName.border.title"))); // NOI18N
        panel_VehicleName.setName("panel_VehicleName"); // NOI18N

        vehicleName_jTextField.setName("vehicleName_jTextField"); // NOI18N

        GroupLayout panel_VehicleNameLayout = new GroupLayout(panel_VehicleName);
        panel_VehicleName.setLayout(panel_VehicleNameLayout);
        panel_VehicleNameLayout.setHorizontalGroup(
            panel_VehicleNameLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(vehicleName_jTextField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        panel_VehicleNameLayout.setVerticalGroup(
            panel_VehicleNameLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(vehicleName_jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        panel_SelectedVehicle.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_SelectedVehicle.border.title"))); // NOI18N
        panel_SelectedVehicle.setName("panel_SelectedVehicle"); // NOI18N

        selectedVehicle_jComboBox.setModel(new DefaultComboBoxModel(new String[] { "<new>", "Vehicle 1", "Vehicle 2", "Vehicle 3", "Vehicle 4", "Vehicle 5" }));
        selectedVehicle_jComboBox.setName("selectedVehicle_jComboBox"); // NOI18N

        GroupLayout panel_SelectedVehicleLayout = new GroupLayout(panel_SelectedVehicle);
        panel_SelectedVehicle.setLayout(panel_SelectedVehicleLayout);
        panel_SelectedVehicleLayout.setHorizontalGroup(
            panel_SelectedVehicleLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(selectedVehicle_jComboBox, 0, 452, Short.MAX_VALUE)
        );
        panel_SelectedVehicleLayout.setVerticalGroup(
            panel_SelectedVehicleLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(selectedVehicle_jComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        panel_VehicleDescription.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_VehicleDescription.border.title"))); // NOI18N
        panel_VehicleDescription.setName("panel_VehicleDescription"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        vehicleDescription_jTextArea.setColumns(20);
        vehicleDescription_jTextArea.setRows(5);
        vehicleDescription_jTextArea.setName("vehicleDescription_jTextArea"); // NOI18N
        jScrollPane6.setViewportView(vehicleDescription_jTextArea);

        GroupLayout panel_VehicleDescriptionLayout = new GroupLayout(panel_VehicleDescription);
        panel_VehicleDescription.setLayout(panel_VehicleDescriptionLayout);
        panel_VehicleDescriptionLayout.setHorizontalGroup(
            panel_VehicleDescriptionLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        panel_VehicleDescriptionLayout.setVerticalGroup(
            panel_VehicleDescriptionLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        panel_Author.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_Author.border.title"))); // NOI18N
        panel_Author.setName("panel_Author"); // NOI18N

        author_jTextField.setName("author_jTextField"); // NOI18N

        GroupLayout panel_AuthorLayout = new GroupLayout(panel_Author);
        panel_Author.setLayout(panel_AuthorLayout);
        panel_AuthorLayout.setHorizontalGroup(
            panel_AuthorLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(author_jTextField, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        panel_AuthorLayout.setVerticalGroup(
            panel_AuthorLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(author_jTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        panel_Preview.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("panel_Preview.border.title"))); // NOI18N
        panel_Preview.setName("panel_Preview"); // NOI18N

        panel_Processing.setName("panel_Processing"); // NOI18N
        panel_Processing.setLayout(new BorderLayout());

        GroupLayout panel_PreviewLayout = new GroupLayout(panel_Preview);
        panel_Preview.setLayout(panel_PreviewLayout);
        panel_PreviewLayout.setHorizontalGroup(
            panel_PreviewLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(panel_Processing, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        panel_PreviewLayout.setVerticalGroup(
            panel_PreviewLayout.createParallelGroup(Alignment.LEADING)
            .addComponent(panel_Processing, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        panel_Processing.add(embed, BorderLayout.CENTER);

        GroupLayout tab_PropertiesLayout = new GroupLayout(tab_Properties);
        tab_Properties.setLayout(tab_PropertiesLayout);
        tab_PropertiesLayout.setHorizontalGroup(
            tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(tab_PropertiesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel_SelectedVehicle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(tab_PropertiesLayout.createSequentialGroup()
                .addGroup(tab_PropertiesLayout.createParallelGroup(Alignment.TRAILING)
                    .addGroup(tab_PropertiesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_VehicleName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Alignment.LEADING, tab_PropertiesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panel_VehicleDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(tab_PropertiesLayout.createParallelGroup(Alignment.TRAILING)
                    .addGroup(tab_PropertiesLayout.createSequentialGroup()
                        .addComponent(panel_Preview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(tab_PropertiesLayout.createSequentialGroup()
                        .addComponent(panel_Author, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        tab_PropertiesLayout.setVerticalGroup(
            tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(tab_PropertiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_SelectedVehicle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(panel_VehicleName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Author, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(tab_PropertiesLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(panel_VehicleDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Preview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabContainer.addTab("Properties", tab_Properties);

        tab_Design.setName("tab_Design"); // NOI18N

        jPanel5.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel5.border.title"))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N

        jPanel1.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jSlider1.setFont(resourceMap.getFont("jSlider1.font")); // NOI18N
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMaximum(50);
        jSlider1.setMinimum(-50);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setOrientation(JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(0);
        jSlider1.setName("jSlider1"); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSlider1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel2.border.title"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMaximum(50);
        jSlider2.setMinimum(-50);
        jSlider2.setMinorTickSpacing(2);
        jSlider2.setOrientation(JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(0);
        jSlider2.setName("jSlider2"); // NOI18N

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider2, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSlider2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel3.border.title"))); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        jSlider3.setMajorTickSpacing(10);
        jSlider3.setMaximum(50);
        jSlider3.setMinimum(-50);
        jSlider3.setMinorTickSpacing(2);
        jSlider3.setOrientation(JSlider.VERTICAL);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setName("jSlider3"); // NOI18N

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider3, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSlider3, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel4.border.title"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        jSlider4.setMajorTickSpacing(10);
        jSlider4.setMaximum(50);
        jSlider4.setMinimum(-50);
        jSlider4.setMinorTickSpacing(2);
        jSlider4.setOrientation(JSlider.VERTICAL);
        jSlider4.setPaintLabels(true);
        jSlider4.setPaintTicks(true);
        jSlider4.setSnapToTicks(true);
        jSlider4.setValue(0);
        jSlider4.setName("jSlider4"); // NOI18N

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider4, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSlider4, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel6.border.title"))); // NOI18N
        jPanel6.setName("jPanel6"); // NOI18N

        jPanel7.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel7.border.title"))); // NOI18N
        jPanel7.setName("jPanel7"); // NOI18N

        jSlider5.setMajorTickSpacing(10);
        jSlider5.setMaximum(50);
        jSlider5.setMinimum(-50);
        jSlider5.setMinorTickSpacing(2);
        jSlider5.setOrientation(JSlider.VERTICAL);
        jSlider5.setPaintLabels(true);
        jSlider5.setPaintTicks(true);
        jSlider5.setSnapToTicks(true);
        jSlider5.setValue(0);
        jSlider5.setName("jSlider5"); // NOI18N

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider5, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jSlider5, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel8.border.title"))); // NOI18N
        jPanel8.setName("jPanel8"); // NOI18N

        jSlider6.setMajorTickSpacing(10);
        jSlider6.setMaximum(50);
        jSlider6.setMinimum(-50);
        jSlider6.setMinorTickSpacing(2);
        jSlider6.setOrientation(JSlider.VERTICAL);
        jSlider6.setPaintLabels(true);
        jSlider6.setPaintTicks(true);
        jSlider6.setSnapToTicks(true);
        jSlider6.setValue(0);
        jSlider6.setName("jSlider6"); // NOI18N

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider6, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jSlider6, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel9.border.title"))); // NOI18N
        jPanel9.setName("jPanel9"); // NOI18N

        jSlider7.setMajorTickSpacing(10);
        jSlider7.setMaximum(50);
        jSlider7.setMinimum(-50);
        jSlider7.setMinorTickSpacing(2);
        jSlider7.setOrientation(JSlider.VERTICAL);
        jSlider7.setPaintLabels(true);
        jSlider7.setPaintTicks(true);
        jSlider7.setSnapToTicks(true);
        jSlider7.setValue(0);
        jSlider7.setName("jSlider7"); // NOI18N

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider7, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSlider7, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBorder(BorderFactory.createTitledBorder(resourceMap.getString("jPanel10.border.title"))); // NOI18N
        jPanel10.setName("jPanel10"); // NOI18N

        jSlider8.setMajorTickSpacing(10);
        jSlider8.setMaximum(50);
        jSlider8.setMinimum(-50);
        jSlider8.setMinorTickSpacing(2);
        jSlider8.setOrientation(JSlider.VERTICAL);
        jSlider8.setPaintLabels(true);
        jSlider8.setPaintTicks(true);
        jSlider8.setSnapToTicks(true);
        jSlider8.setValue(0);
        jSlider8.setName("jSlider8"); // NOI18N

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider8, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jSlider8, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.setBorder(BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel11.border.title"), TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION)); // NOI18N
        jPanel11.setName("jPanel11"); // NOI18N

        jSlider9.setMajorTickSpacing(10);
        jSlider9.setMaximum(200);
        jSlider9.setOrientation(JSlider.VERTICAL);
        jSlider9.setPaintLabels(true);
        jSlider9.setPaintTicks(true);
        jSlider9.setSnapToTicks(true);
        jSlider9.setName("jSlider9"); // NOI18N

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider9, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jSlider9, GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout tab_DesignLayout = new GroupLayout(tab_Design);
        tab_Design.setLayout(tab_DesignLayout);
        tab_DesignLayout.setHorizontalGroup(
            tab_DesignLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(tab_DesignLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_DesignLayout.createParallelGroup(Alignment.LEADING)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab_DesignLayout.setVerticalGroup(
            tab_DesignLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, tab_DesignLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_DesignLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jPanel11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab_DesignLayout.createSequentialGroup()
                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel6.getAccessibleContext().setAccessibleName(resourceMap.getString("jPanel6.AccessibleContext.accessibleName")); // NOI18N

        tabContainer.addTab(resourceMap.getString("tab_Design.TabConstraints.tabTitle"), tab_Design); // NOI18N

        button_Save.setText(resourceMap.getString("button_Save.text")); // NOI18N
        button_Save.setName("button_Save"); // NOI18N

        button_SaveAs.setText(resourceMap.getString("button_SaveAs.text")); // NOI18N
        button_SaveAs.setName("button_SaveAs"); // NOI18N

        ActionMap actionMap = Application.getInstance(VehiclesApp.class).getContext().getActionMap(VehicleEditor.class, this);
        button_Cancel.setAction(actionMap.get("cancel")); // NOI18N
        button_Cancel.setText(resourceMap.getString("button_Cancel.text")); // NOI18N
        button_Cancel.setName("button_Cancel"); // NOI18N

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(287, Short.MAX_VALUE)
                        .addComponent(button_Save)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(button_SaveAs)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(button_Cancel))
                    .addComponent(tabContainer, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabContainer, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(button_Cancel)
                    .addComponent(button_SaveAs)
                    .addComponent(button_Save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VehicleEditor().setVisible(true);
//            }
//        });
//    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField author_jTextField;
    private JButton button_Cancel;
    private JButton button_Save;
    private JButton button_SaveAs;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JScrollPane jScrollPane6;
    private JSlider jSlider1;
    private JSlider jSlider2;
    private JSlider jSlider3;
    private JSlider jSlider4;
    private JSlider jSlider5;
    private JSlider jSlider6;
    private JSlider jSlider7;
    private JSlider jSlider8;
    private JSlider jSlider9;
    private JPanel panel_Author;
    private JPanel panel_Preview;
    private JPanel panel_Processing;
    private JPanel panel_SelectedVehicle;
    private JPanel panel_VehicleDescription;
    private JPanel panel_VehicleName;
    private JComboBox selectedVehicle_jComboBox;
    private JTabbedPane tabContainer;
    private JPanel tab_Design;
    private JPanel tab_Properties;
    private JTextArea vehicleDescription_jTextArea;
    private JTextField vehicleName_jTextField;
    // End of variables declaration//GEN-END:variables
    private PApplet embed;
}
