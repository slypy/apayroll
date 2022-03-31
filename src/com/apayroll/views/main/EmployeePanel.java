/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.views.main;

import com.apayroll.components.Form;
import com.apayroll.libcore.Database;
import com.apayroll.swing.renderers.ButtonEditor;
import com.apayroll.swing.renderers.ButtonRenderer;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author sly
 */
public class EmployeePanel extends javax.swing.JPanel {
    Database db;
    /**
     * Creates new form EmployeePanel
     */
    public EmployeePanel() {
        db = new Database();
        initComponents();
        try {
            startFetchData();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void startFetchData() throws SQLException{
//        db.query("SELECT r.user_rfid_number, e.firstName, e.middleName, e.lastName, e.employeeType "
//                + "FROM dbb_employee e "
//                + "LEFT JOIN dbb_rfid r ON r.user_id = e.id");
//        db.execute();
//       
//        for (Iterator<Object> it = db.fetchDataObjects().iterator(); it.hasNext();) {
//            Vector<Object> o = (Vector<Object>) it.next();
//
//            table.addRow(new Object[] {o.get(0), o.get(1), o.get(2), o.get(3), o.get(4), "DELETE"});
//            table.getColumn("Action").setCellRenderer(new ButtonRenderer());
//            table.getColumn("Action").setCellEditor(new ButtonEditor(new JTextField()));
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card5 = new com.apayroll.components.Card();
        jLabel2 = new javax.swing.JLabel();
        addEmployeeBtn = new javax.swing.JButton();
        scrollTablePane = new javax.swing.JScrollPane();
        table = new com.apayroll.swing.Table();

        setBackground(new java.awt.Color(248, 249, 250));
        setPreferredSize(new java.awt.Dimension(970, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card5.setBackground(new java.awt.Color(255, 255, 255));
        card5.setShadowColor(new java.awt.Color(153, 153, 153));
        card5.setShadowOpacity(0.1F);
        card5.setShadowSize(15);
        card5.setShadowType(com.apayroll.components.Card.ShadowType.BOTTOM);
        card5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Daily Time Record");
        card5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        addEmployeeBtn.setBackground(new java.awt.Color(0, 153, 255));
        addEmployeeBtn.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        addEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addEmployeeBtn.setText("Add Employee");
        addEmployeeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addEmployeeBtn.setFocusPainted(false);
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });
        card5.add(addEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 130, 40));

        scrollTablePane.setBackground(new java.awt.Color(255, 255, 255));
        scrollTablePane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First name", "Middle name", "Last name", "Type", "Action"
            }
        ));
        scrollTablePane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        card5.add(scrollTablePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 880, 610));

        add(card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 960, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        // TODO add your handling code here:
        Form addEmployeeForm = new Form();
        addEmployeeForm.show();
    }//GEN-LAST:event_addEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private com.apayroll.components.Card card5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane scrollTablePane;
    private com.apayroll.swing.Table table;
    // End of variables declaration//GEN-END:variables
}