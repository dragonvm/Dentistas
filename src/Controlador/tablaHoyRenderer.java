/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Danipro
 */
public class tablaHoyRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        tablaHoy model = (tablaHoy) table.getModel();
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(model.getValueAt(row, 2).equals("Realizada")){
            c.setBackground(Color.green);
        }else if(model.getValueAt(row, 2).equals("Cancelada")){
            c.setBackground(Color.red);
        }else{
            c.setBackground(Color.LIGHT_GRAY);
        }
        return c;
    }
    
}
