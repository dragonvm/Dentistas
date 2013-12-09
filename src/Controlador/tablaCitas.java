/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Campus
 */
public class tablaCitas extends AbstractTableModel {

    ArrayList Citas = new ArrayList();
    String [] columnas = {"Hora", "Paciente", "Nota"};
    
    public void addRow(Object [] fila){
        Citas.add(fila);
        this.fireTableDataChanged();  
    }
    
    public void updateRow(int i, Object [] fila){
        Citas.remove(i);
        Citas.add(i, fila);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int i){
        Citas.remove(i);
        this.fireTableDataChanged();  
    }
    
    @Override
    public String getColumnName(int index) {
        return columnas[index];
    }
    
    @Override
    public int getRowCount() {
        return Citas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object [] fila = (Object []) Citas.get(rowIndex);
        return fila[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
            return true;
    }
    
    @Override
    public void setValueAt(Object valor, int row, int col){
        Object [] fila = (Object []) Citas.get(row);
        fila[col] = valor;
        fireTableCellUpdated(row, col);
    }    
    
    
}
