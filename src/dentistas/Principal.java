/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistas;

import Controlador.tablaHoy;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableColumn;

public class Principal extends javax.swing.JFrame {

    //Inicializo objetos, en estas clases se encuentran los metodos de cada pestaña
    Configuracion config = new Configuracion(); //Creo objetos de configuracion
    Hoy_viejo cHoy = new Hoy_viejo(); //Creo objetos de tab Hoy
    
    
    // COMENTARIO UNO
    
    // COMENTARIO DOS
    
    //COMENTARIO TRES
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        super("Programa dentistas por Daniel y Hector");
        initComponents();
        
        //Añado al label la fecha actual
        fecha_actual.setText(config.fecha_actual());
        this.jButton1.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonNuevaCita view=new BotonNuevaCita();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        this.jButton3.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonNuevoPaciente view=new BotonNuevoPaciente();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        this.jButton4.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonEditarPaciente view=new BotonEditarPaciente();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        this.jButton5.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
             JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas borrar este Paciente?", "Eliminar Paciente",JOptionPane.YES_NO_OPTION);
            // this.JOptionPane.showConfirmDialog(this,"¿Le esta gustando el curso de Swing?","Curso BBDD y Java",JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabHoy = new javax.swing.JPanel();
        fecha_label = new java.awt.Label();
        fecha_actual = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableHoy = new javax.swing.JTable();
        tabAgenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tabPacientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tabFacturas = new javax.swing.JPanel();
        tabConfiguracion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 244, 255));
        setMinimumSize(new java.awt.Dimension(800, 700));

        jTabbedPane1.setBackground(new java.awt.Color(224, 255, 255));

        tabHoy.setBackground(new java.awt.Color(224, 255, 255));
        tabHoy.setPreferredSize(new java.awt.Dimension(800, 700));

        fecha_label.setText("Fecha de hoy: ");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 102, 255), 2));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 560));
        jScrollPane1.setName(""); // NOI18N

        tablaHoy modeloTablaHoy = new tablaHoy();
        Object [] nuevocliente = {"22/10/2013", "Juan Feliu", "Pendiente"};
        modeloTablaHoy.addRow(nuevocliente);
        JTableHoy.setModel(modeloTablaHoy);
        jScrollPane1.setViewportView(JTableHoy);

        javax.swing.GroupLayout tabHoyLayout = new javax.swing.GroupLayout(tabHoy);
        tabHoy.setLayout(tabHoyLayout);
        tabHoyLayout.setHorizontalGroup(
            tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHoyLayout.createSequentialGroup()
                .addGroup(tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabHoyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(fecha_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabHoyLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabHoyLayout.setVerticalGroup(
            tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHoyLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fecha_label.getAccessibleContext().setAccessibleName("fecha_label");
        fecha_actual.getAccessibleContext().setAccessibleName("fecha_hoy");
        fecha_actual.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Hoy", tabHoy);

        tabAgenda.setBackground(new java.awt.Color(224, 255, 255));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "Realizado"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Calendario"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton1.setText("Nueva Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar Cita");

        javax.swing.GroupLayout tabAgendaLayout = new javax.swing.GroupLayout(tabAgenda);
        tabAgenda.setLayout(tabAgendaLayout);
        tabAgendaLayout.setHorizontalGroup(
            tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAgendaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabAgendaLayout.setVerticalGroup(
            tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAgendaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabAgendaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agenda", tabAgenda);

        tabPacientes.setBackground(new java.awt.Color(224, 255, 255));

        jScrollPane3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(454, 404));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hora", "Paciente", "Realizado"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jButton3.setText("Nuevo Paciente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar Paciente");

        jButton5.setText("Eliminar Paciente");

        javax.swing.GroupLayout tabPacientesLayout = new javax.swing.GroupLayout(tabPacientes);
        tabPacientes.setLayout(tabPacientesLayout);
        tabPacientesLayout.setHorizontalGroup(
            tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPacientesLayout.createSequentialGroup()
                .addGroup(tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPacientesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPacientesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabPacientesLayout.setVerticalGroup(
            tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPacientesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPacientesLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pacientes", tabPacientes);

        tabFacturas.setBackground(new java.awt.Color(224, 255, 255));

        javax.swing.GroupLayout tabFacturasLayout = new javax.swing.GroupLayout(tabFacturas);
        tabFacturas.setLayout(tabFacturasLayout);
        tabFacturasLayout.setHorizontalGroup(
            tabFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        tabFacturasLayout.setVerticalGroup(
            tabFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Facturas", tabFacturas);

        tabConfiguracion.setBackground(new java.awt.Color(224, 255, 255));

        javax.swing.GroupLayout tabConfiguracionLayout = new javax.swing.GroupLayout(tabConfiguracion);
        tabConfiguracion.setLayout(tabConfiguracionLayout);
        tabConfiguracionLayout.setHorizontalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        tabConfiguracionLayout.setVerticalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuración", null, tabConfiguracion, "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Guardo el Jframe en un objeto
                Principal Jframe = new Principal();
                //PrincipalHoy es el Jframe, indico que al iniciarse se maximice la ventana
                Jframe.setExtendedState(MAXIMIZED_BOTH);
                Jframe.setVisible(true);
            }
        });
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableHoy;
    private java.awt.Label fecha_actual;
    private java.awt.Label fecha_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel tabAgenda;
    private javax.swing.JPanel tabConfiguracion;
    private javax.swing.JPanel tabFacturas;
    private javax.swing.JPanel tabHoy;
    private javax.swing.JPanel tabPacientes;
    // End of variables declaration//GEN-END:variables

}
