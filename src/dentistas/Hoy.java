package dentistas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Hoy {
    
    
    public void tablaHoy(JTable tablaHoy){
        
        
        Object [][] datostabla = new String[50][3];
            
            for(int i=0;i<datostabla.length;i++){
                for(int j=0;j<datostabla[0].length;j++){
                    if(j==2){
                        if(i<25)
                            datostabla[i][j] = "realizado";
                        else
                            datostabla[i][j] = "pendiente";
                    }else{
                    datostabla[i][j] = "celda "+i+""+j;
                    }
                }
            }
        
            //TableModel para la tabla
            //Hacemos que solo la columna estado sea editable
        DefaultTableModel modeloTablaHoy = new DefaultTableModel(datostabla,new String [] {"Hora", "Paciente", "Estado"}){
            @Override
            public boolean isCellEditable(int row, int column) {
               if(column!=2){
                   return false;
               }else{
                   return true;
               }
            }
        };
            
        tablaHoy.setModel(modeloTablaHoy);
        
        //Establecemos tamaños de tabla
        TableColumn colHora = tablaHoy.getColumnModel().getColumn(0);
        colHora.setMinWidth(100);
        colHora.setMaxWidth(70);
        TableColumn colEstado = tablaHoy.getColumnModel().getColumn(2);
        colEstado.setMinWidth(120);
        colEstado.setMaxWidth(120);
    }
    
}
