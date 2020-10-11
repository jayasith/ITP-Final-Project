/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.Border.changeFunction;
import SQL.DBHelper;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

/**
 *
 * @author Nirmith Akash
 */
public class VehicleInforPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleInforPanel
     */
    public VehicleInforPanel() {
        initComponents();
        
        //Filling Tables
        fillMenuItemtable();
        
        //Keep IDs for deleting
        Hidden_ID.setVisible(false);
        Hidden_ID.setEditable(false);
    }
    
    public void fillMenuItemtable(){
        DBHelper dbhelper = new DBHelper();
        ResultSet rs = dbhelper.SelectVehicle();
        vechicleinfo.setModel(DbUtils.resultSetToTableModel(rs));
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Side_panel = new javax.swing.JPanel();
        Home_Button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        VID = new javax.swing.JScrollPane();
        vechicleinfo = new javax.swing.JTable();
        vechicleinfoSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        deletebtn2 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Hidden_ID = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1360, 590));
        setMinimumSize(new java.awt.Dimension(1360, 590));
        setPreferredSize(new java.awt.Dimension(1360, 590));

        Side_panel.setBackground(new java.awt.Color(51, 51, 51));

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BlackHome.png"))); // NOI18N
        buttonGroup1.add(Home_Button);
        Home_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_ButtonMouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Back_normal.png"))); // NOI18N
        buttonGroup1.add(jButton2);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Back_Selected.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Back_Selected.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Back_Selected.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/add_vehicle_normal.png"))); // NOI18N
        buttonGroup1.add(jButton3);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/add_vehicle_selected.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/add_vehicle_selected.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/add_vehicle_selected.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Side_panelLayout = new javax.swing.GroupLayout(Side_panel);
        Side_panel.setLayout(Side_panelLayout);
        Side_panelLayout.setHorizontalGroup(
            Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Side_panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Side_panelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        Side_panelLayout.setVerticalGroup(
            Side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Side_panelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Vehicle Information");

        vechicleinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "VID", "Vehicle Name", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vechicleinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vechicleinfoMouseClicked(evt);
            }
        });
        VID.setViewportView(vechicleinfo);

        vechicleinfoSearch.setText("Search");
        vechicleinfoSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vechicleinfoSearchKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Maintenance_Normal.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Maintenance_Selected.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Maintenance_Selected.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Maintenance_Selected.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_normal.png"))); // NOI18N
        update2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        deletebtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/DELETE_NORMAL.png"))); // NOI18N
        deletebtn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/DELETE_SELECTED.png"))); // NOI18N
        deletebtn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/DELETE_SELECTED.png"))); // NOI18N
        deletebtn2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/DELETE_SELECTED.png"))); // NOI18N
        deletebtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtn2MouseClicked(evt);
            }
        });

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/DELETE_NORMAL.png"))); // NOI18N
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_normal.png"))); // NOI18N
        update.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Edit_Selected.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KitchenButtons/Internal_UI/Maintenance_Normal.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(vechicleinfoSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(608, 608, 608))
                            .addComponent(VID))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vechicleinfoSearch)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(deletebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VID, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Hidden_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hidden_IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hidden_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Side_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Hidden_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vechicleinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vechicleinfoMouseClicked
        //Navigate to Update page with data.

        DefaultTableModel table = (DefaultTableModel)vechicleinfo.getModel();
        String id = table.getValueAt(vechicleinfo.getSelectedRow(), 0).toString();
        Hidden_ID.setText(id);

    }//GEN-LAST:event_vechicleinfoMouseClicked

    private void vechicleinfoSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vechicleinfoSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)vechicleinfo.getModel();
        String search = vechicleinfoSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        vechicleinfo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_vechicleinfoSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update2ActionPerformed

    private void deletebtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtn2MouseClicked
        // TODO add your handling code here:
        //Validation
        if(Hidden_ID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Deleting Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //Get the value
            //Conver or pass it to int Integer.parseInt(String variable)
            //CAll the method

            int id = Integer.parseInt(Hidden_ID.getText());
            boolean statu = false;
            DBHelper obj = new DBHelper();

            statu = obj.DeleteV(id);

            if(statu == true){
                JOptionPane.showMessageDialog(this, "Vehicle deleted Successfully", "Messege", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Vehicle Deleting Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            }

            fillMenuItemtable();

        }

    }//GEN-LAST:event_deletebtn2MouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        //Validation
        if(Hidden_ID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Deleting Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //Get the value
            //Conver or pass it to int Integer.parseInt(String variable)
            //CAll the method

            int id = Integer.parseInt(Hidden_ID.getText());
            boolean statu = false;
            DBHelper obj = new DBHelper();

            statu = obj.DeleteV(id);

            if(statu == true){
                JOptionPane.showMessageDialog(this, "Vehicle deleted Successfully", "Messege", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Vehicle Deleting Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            }

            fillMenuItemtable();

        }

        //Refresh the table again
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Hidden_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hidden_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hidden_IDActionPerformed

    private void Home_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_ButtonMouseClicked
        changeFunction("Home");
    }//GEN-LAST:event_Home_ButtonMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        changeFunction("AddVehicle");
    }//GEN-LAST:event_jButton3MouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField Hidden_ID;
    private javax.swing.JButton Home_Button;
    private javax.swing.JPanel Side_panel;
    private javax.swing.JScrollPane VID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletebtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton update;
    private javax.swing.JButton update2;
    private javax.swing.JTable vechicleinfo;
    private javax.swing.JTextField vechicleinfoSearch;
    // End of variables declaration//GEN-END:variables
}
