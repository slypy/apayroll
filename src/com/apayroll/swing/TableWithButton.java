/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apayroll.swing;
import com.apayroll.models.components.ButtonType;
import com.apayroll.models.components.EmployeeTableModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sly
 */
public class TableWithButton extends JTable{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public TableWithButton() {
        setShowHorizontalLines(true);
        setShowVerticalLines(false);
        setGridColor(new Color(230, 230, 230));
        setOpaque(false);
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int index, int index1){
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int row, int col){
                if(!getColumnName(col).equals("Action")){
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, row, col);
                    com.setBackground(Color.WHITE);
                    setHorizontalAlignment(SwingConstants.LEFT);
                    setBorder(noFocusBorder);
                    if(selected){
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                } else {
                    ButtonType type;
                    if(o instanceof String){
                        type = (ButtonType) ButtonType.DELETE;
                    } else {
                        type = (ButtonType) o;
                    }
                    CellButton cell = new CellButton(type);
                    return cell;
                }
            }
        });
    }
    
    public void setCellNotEditorColumn(String columnName){
        getColumn(columnName).setCellEditor(new DefaultCellEditor(new JTextField()) {
            protected TableButton btn = new TableButton();
            private Boolean clicked;
            private Long selectedId;
            private int selectedRow;
            
            {
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicked = true;
                        selectedId = (Long) getCellEditorValue();
                        stopCellEditing();
                        ((EmployeeTableModel) getModel()).removeRow(selectedId, selectedRow);
                    }
                });
            }
            
            @Override
            public Component getTableCellEditorComponent(JTable table, Object obj, boolean selected, int row, int col) {
                selectedId = (Long) table.getValueAt(row, 0);
                selectedRow = row;
                btn.setButtonType(ButtonType.DELETE);
                clicked = true;
                return btn;
            }
            
            @Override
            public Object getCellEditorValue() {
                if(clicked) {
                    JOptionPane.showMessageDialog(btn, "Deleted Employee "+ selectedId);
                }
                clicked = false;
                return selectedId;
            }
    
            @Override
            public boolean stopCellEditing() {
                //SET CLICKED TO FALSE FIRST
                clicked = false;
                return super.stopCellEditing();
            }

            @Override
            protected void fireEditingStopped() {
                // TODO Auto-generated method stub
                super.fireEditingStopped();
            }
        });
    }
    
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}