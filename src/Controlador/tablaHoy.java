/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Campus
 */
public class tablaHoy extends AbstractTableModel {

    ArrayList datos = new ArrayList();
    String [] columnas = {"Hora", "Paciente", "Estado"};
    
    public void addRow(Object [] fila){
        datos.add(fila);
        this.fireTableDataChanged();  
    }
    
    @Override
    public String getColumnName(int index) {
        return columnas[index];
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object [] fila = (Object []) datos.get(rowIndex);
        return fila[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        if(columnIndex!=2){
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    public void setValueAt(Object valor, int row, int col){
        Object [] fila = (Object []) datos.get(row);
        fila[col] = valor;
        fireTableCellUpdated(row, col);
    }
    
}
