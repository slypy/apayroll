/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.views.main;

import com.apayroll.chart.ModelChart;
import com.apayroll.libcore.Database;
import com.apayroll.models.EmployeeDTR;
import com.apayroll.swing.ScrollBarCustom;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sly
 */
public class DashBoardPanel extends javax.swing.JPanel {
    Database db;
    /**
     * Creates new form DashBoardPanel
     */
    public DashBoardPanel() {
        db = new Database();
        initComponents();
        try {
            startFetchData();
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lineChart.addLegend("Total Net pay per month", Color.decode("#38B6FF"), Color.decode("#38B6FF"));
        lineChart.addLegend("Total Gross pay per month", Color.decode("#004AAD"), Color.decode("#004AAD"));
        lineChart.addData(new ModelChart("Jan", new double[]{5015, 89124}));
        lineChart.addData(new ModelChart("Feb", new double[]{51530, 296}));
        lineChart.addData(new ModelChart("Mar", new double[]{50125, 90893}));
        lineChart.addData(new ModelChart("Apr", new double[]{51250, 26356}));
        lineChart.start();
        
        scrollTablePane.setVerticalScrollBar(new ScrollBarCustom());
    }
    
    public void startFetchData() throws SQLException{
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card2 = new com.apayroll.components.Card();
        jLabel1 = new javax.swing.JLabel();
        scrollTablePane = new javax.swing.JScrollPane();
        table = new com.apayroll.swing.Table();
        card4 = new com.apayroll.components.Card();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        card3 = new com.apayroll.components.Card();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        card1 = new com.apayroll.components.Card();
        lineChart = new com.apayroll.chart.LineChart();

        setBackground(new java.awt.Color(248, 249, 250));
        setPreferredSize(new java.awt.Dimension(970, 770));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card2.setBackground(new java.awt.Color(255, 255, 255));
        card2.setBorderRadius(20);
        card2.setShadowColor(new java.awt.Color(153, 153, 153));
        card2.setShadowOpacity(0.1F);
        card2.setShadowSize(15);
        card2.setShadowType(com.apayroll.components.Card.ShadowType.BOTTOM);
        card2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lato Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Daily Time Record");
        card2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        scrollTablePane.setBackground(new java.awt.Color(255, 255, 255));
        scrollTablePane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollTablePane.setOpaque(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Time In", "Time Out"
            }
        ));
        scrollTablePane.setViewportView(table);

        card2.add(scrollTablePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 890, 360));

        add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 960, 490));

        card4.setBackground(new java.awt.Color(255, 255, 255));
        card4.setBorderRadius(20);
        card4.setShadowColor(new java.awt.Color(153, 153, 153));
        card4.setShadowOpacity(0.1F);
        card4.setShadowSize(15);
        card4.setShadowType(com.apayroll.components.Card.ShadowType.BOTTOM);
        card4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lato Light", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Total Employee");
        card4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apayroll/views/img/employee32x32.png"))); // NOI18N
        card4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 140));

        card3.setBackground(new java.awt.Color(255, 255, 255));
        card3.setBorderRadius(20);
        card3.setShadowColor(new java.awt.Color(153, 153, 153));
        card3.setShadowOpacity(0.1F);
        card3.setShadowSize(15);
        card3.setShadowType(com.apayroll.components.Card.ShadowType.BOTTOM);
        card3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lato Light", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Next payroll release date");
        card3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/apayroll/views/img/calendar32x32.png"))); // NOI18N
        card3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 140));

        card1.setBackground(new java.awt.Color(255, 255, 255));
        card1.setBorderRadius(20);
        card1.setShadowColor(new java.awt.Color(153, 153, 153));
        card1.setShadowOpacity(0.1F);
        card1.setShadowSize(15);
        card1.setShadowType(com.apayroll.components.Card.ShadowType.BOTTOM);
        card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        card1.add(lineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 590, 230));

        add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 640, 270));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.apayroll.components.Card card1;
    private com.apayroll.components.Card card2;
    private com.apayroll.components.Card card3;
    private com.apayroll.components.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.apayroll.chart.LineChart lineChart;
    private javax.swing.JScrollPane scrollTablePane;
    private com.apayroll.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
