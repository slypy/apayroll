/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.views.main;

import com.apayroll.components.Form;
import com.apayroll.libcore.Database;
import com.apayroll.models.Employee;
import com.apayroll.models.EmployeeRoster;
import com.apayroll.models.components.EmployeeTableModel;
import com.apayroll.swing.ScrollBarCustom;

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
        initTableWithButton();
        scrollTablePane.setVerticalScrollBar(new ScrollBarCustom());
    }
    
    private void initTableWithButton(){
        EmployeeRoster er = new EmployeeRoster();
        er.updateList();
        table.setModel(new EmployeeTableModel(er.getEmployeeList()));
        table.setCellNotEditorColumn("Action");
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
        table = new com.apayroll.swing.TableWithButton();

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
        jLabel2.setText("Employees");
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
        scrollTablePane.setOpaque(false);

        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "RFID No.", "First Name", "Middle Name", "Last Name", "Type", "Action"
            }
        ));
        scrollTablePane.setViewportView(table);

        card5.add(scrollTablePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 880, 600));

        add(card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 960, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        // TODO add your handling code here:
        Form addEmployeeForm = new Form(table);
        addEmployeeForm.show();
    }//GEN-LAST:event_addEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private com.apayroll.components.Card card5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane scrollTablePane;
    private com.apayroll.swing.TableWithButton table;
    // End of variables declaration//GEN-END:variables
}
