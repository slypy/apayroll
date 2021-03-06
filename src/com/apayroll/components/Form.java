/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apayroll.components;

import com.apayroll.models.EmployeeType;
import com.apayroll.models.HourlyEmployee;
import com.apayroll.models.RegularEmployee;
import com.apayroll.models.components.EmployeeTableModel;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author sly
 */
public class Form extends javax.swing.JFrame {
    JTable employeeTable;
    /** Creates new form Form */
    public Form(JTable employeeTable) {
        initComponents();
        enumEmployee.setModel(new DefaultComboBoxModel(EmployeeType.values()));
        this.employeeTable = employeeTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Form = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFieldFirstName = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtFieldMiddleName = new javax.swing.JTextField();
        txtFieldLastName = new javax.swing.JTextField();
        enumEmployee = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JButton();
        txtFieldRfid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(209, 209, 209)));

        jLabel9.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        jLabel9.setText("Add Employee");

        txtFieldFirstName.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        txtFieldFirstName.setForeground(new java.awt.Color(102, 102, 102));
        txtFieldFirstName.setText("First name");
        txtFieldFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtFieldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldFirstNameFocusLost(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(0, 153, 255));
        submitBtn.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setBorder(null);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        txtFieldMiddleName.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        txtFieldMiddleName.setForeground(new java.awt.Color(102, 102, 102));
        txtFieldMiddleName.setText("Middle name");
        txtFieldMiddleName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtFieldMiddleName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldMiddleNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldMiddleNameFocusLost(evt);
            }
        });

        txtFieldLastName.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        txtFieldLastName.setForeground(new java.awt.Color(102, 102, 102));
        txtFieldLastName.setText("Last name");
        txtFieldLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldLastNameFocusLost(evt);
            }
        });

        enumEmployee.setBackground(new java.awt.Color(255, 255, 255));
        enumEmployee.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        enumEmployee.setForeground(new java.awt.Color(102, 102, 102));
        enumEmployee.setOpaque(false);

        cancelBtn.setBackground(new java.awt.Color(255, 102, 102));
        cancelBtn.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(null);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        txtFieldRfid.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        txtFieldRfid.setForeground(new java.awt.Color(102, 102, 102));
        txtFieldRfid.setText("RFID");
        txtFieldRfid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        txtFieldRfid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldRfidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldRfidFocusLost(evt);
            }
        });

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFieldFirstName)
                            .addComponent(jLabel9)
                            .addComponent(txtFieldMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtFieldLastName)
                            .addComponent(enumEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldRfid))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(txtFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtFieldMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtFieldRfid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(enumEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here
        String rfid = txtFieldRfid.getText();
        String firstName = txtFieldFirstName.getText();
        String middleName = txtFieldMiddleName.getText().equals("Middle name") ? "" : txtFieldMiddleName.getText();
        String lastName = txtFieldLastName.getText();
        String errorMessage;
        if(!firstName.equals("") && !lastName.equals("") && !rfid.equals("")){
            if(enumEmployee.getSelectedItem() == EmployeeType.REGULAR_EMPLOYEE){
                RegularEmployee re = new RegularEmployee();
                re.setRfid(rfid);
                re.setFirstName(firstName);
                re.setMiddleName(middleName);
                re.setLastName(lastName);
                re.setType((EmployeeType) enumEmployee.getSelectedItem());
                if(((EmployeeTableModel) employeeTable.getModel()).addRow(re)){
                    errorMessage = "Employee Added";
                    txtFieldFirstName.setText("First name");
                    txtFieldMiddleName.setText("Middle name");
                    txtFieldLastName.setText("Last name");
                } else {
                    errorMessage = "Employee add unsuccessfull";
                }
            } else {
                HourlyEmployee he = new HourlyEmployee();
                he.setRfid(rfid);
                he.setFirstName(firstName);
                he.setMiddleName(middleName);
                he.setLastName(lastName);
                he.setType((EmployeeType) enumEmployee.getSelectedItem());
                if(((EmployeeTableModel) employeeTable.getModel()).addRow(he)){
                   errorMessage = "Employee Added";
                    txtFieldFirstName.setText("First name");
                    txtFieldMiddleName.setText("Middle name");
                    txtFieldLastName.setText("Last name");
                } else {
                    errorMessage = "Employee add unsuccessfull";
                }
            }
            
        } else {
            errorMessage = "Employee add unsuccessfull";
        }
 
        JOptionPane.showMessageDialog(submitBtn, errorMessage);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void txtFieldFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldFirstNameFocusGained
        // TODO add your handling code here:
        if(txtFieldFirstName.getText().equals("First name")){
            txtFieldFirstName.setText("");
            txtFieldFirstName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldFirstNameFocusGained

    private void txtFieldFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldFirstNameFocusLost
        // TODO add your handling code here:
        if(txtFieldFirstName.getText().equals("")){
            txtFieldFirstName.setText("First name");
            txtFieldFirstName.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtFieldFirstNameFocusLost

    private void txtFieldMiddleNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldMiddleNameFocusGained
        // TODO add your handling code here:
        if(txtFieldMiddleName.getText().equals("Middle name")){
            txtFieldMiddleName.setText("");
            txtFieldMiddleName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldMiddleNameFocusGained

    private void txtFieldMiddleNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldMiddleNameFocusLost
        // TODO add your handling code here:
        if(txtFieldMiddleName.getText().equals("")){
            txtFieldMiddleName.setText("Middle name");
            txtFieldMiddleName.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtFieldMiddleNameFocusLost

    private void txtFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldLastNameFocusGained
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(txtFieldLastName.getText().equals("Last name")){
            txtFieldLastName.setText("");
            txtFieldLastName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldLastNameFocusGained

    private void txtFieldLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldLastNameFocusLost
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(txtFieldLastName.getText().equals("")){
            txtFieldLastName.setText("Last name");
            txtFieldLastName.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtFieldLastNameFocusLost

    private void txtFieldRfidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldRfidFocusGained
        // TODO add your handling code here:
        if(txtFieldRfid.getText().equals("RFID")){
            txtFieldRfid.setText("");
            txtFieldRfid.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtFieldRfidFocusGained

    private void txtFieldRfidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldRfidFocusLost
        // TODO add your handling code here:
        if(txtFieldRfid.getText().equals("")){
            txtFieldRfid.setText("RFID");
            txtFieldRfid.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_txtFieldRfidFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Form;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<EmployeeType> enumEmployee;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtFieldFirstName;
    private javax.swing.JTextField txtFieldLastName;
    private javax.swing.JTextField txtFieldMiddleName;
    private javax.swing.JTextField txtFieldRfid;
    // End of variables declaration//GEN-END:variables

}
