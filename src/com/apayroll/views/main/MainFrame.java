/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.views.main;

import java.sql.SQLException;

/**
 *
 * @author sly
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws SQLException {
        initComponents();
        // setBackground(new Color(0,0,0,0));
        // sidebar1.initMoving(this);
        jTabbedPane2.setOpaque(false);
        sidebar.initPressed(this);
    }
    
    public static void setTabbedPane(int index){
        jTabbedPane2.setSelectedIndex(index);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        sidebar = new com.apayroll.components.Sidebar();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        dashboardPanel = new javax.swing.JPanel();
        dashBoardPanel1 = new com.apayroll.views.main.DashBoardPanel();
        employeePanel = new javax.swing.JPanel();
        employeePanel1 = new com.apayroll.views.main.EmployeePanel();
        payrollPage = new javax.swing.JPanel();
        payrollPanel1 = new com.apayroll.views.main.PayrollPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tacular");
        setResizable(false);

        jPanel4.setPreferredSize(new java.awt.Dimension(1230, 768));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 770));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1000, 768));

        dashboardPanel.setMinimumSize(new java.awt.Dimension(970, 780));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(970, 780));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        dashboardPanel.add(dashBoardPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        jTabbedPane2.addTab("tab3", dashboardPanel);

        employeePanel.setBackground(new java.awt.Color(248, 249, 250));
        employeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        employeePanel.add(employeePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jTabbedPane2.addTab("tab2", employeePanel);

        payrollPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        payrollPage.add(payrollPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        jTabbedPane2.addTab("tab3", payrollPage);

        jPanel4.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -30, -1, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apayroll.views.main.DashBoardPanel dashBoardPanel1;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel employeePanel;
    private com.apayroll.views.main.EmployeePanel employeePanel1;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel payrollPage;
    private com.apayroll.views.main.PayrollPanel payrollPanel1;
    private com.apayroll.components.Sidebar sidebar;
    // End of variables declaration//GEN-END:variables
}

