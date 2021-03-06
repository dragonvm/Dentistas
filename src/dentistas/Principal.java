/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistas;

import Controlador.BotonNuevaCita;
import Controlador.BotonEditarPaciente;
import Controlador.BotonNuevoPaciente;
import Controlador.Configuracion;
import Controlador.datosCitas;
import Controlador.datosPacientes;
import Controlador.tablaCitas;
import Controlador.tablaHoy;
import Controlador.tablaHoyRenderer;
import Controlador.tablaPacientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    
    /**
     * Creates new form Principal
     */
    
    public static tablaPacientes modeloTablaPacientes = new tablaPacientes();
     public static tablaCitas modeloTablaCitas = new tablaCitas();
     public static tablaHoy modeloTablaHoy = new tablaHoy();
    public static datosPacientes pacientes = new datosPacientes();
    public static datosCitas citas = new datosCitas();
    public static int pacienteSelec=-1;
    public static int citaSelec=-1;
    
    public Principal() {
        super("Programa dentistas por Daniel y Hector");
        initComponents();
        
        //Añado al label la fecha actual
        fecha_actual.setText(Configuracion.fecha_actual());
        
        //PESTAÑA HOY
            tablaHoyRenderer rendererTablaHoy = new tablaHoyRenderer();

            JTableHoy.setModel(modeloTablaHoy);
            JTableHoy.setDefaultRenderer(Object.class, rendererTablaHoy);
        //FIN PESTAÑA HOY
            
        //PESTAÑA PACIENTES
            JTablePacientes.setModel(modeloTablaPacientes);
            JTablePacientes.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = JTablePacientes.rowAtPoint(e.getPoint());
                    int columna = JTablePacientes.columnAtPoint(e.getPoint());
                    //Si se marca fuera de las filas o columnas el valor se pone a -1
                    if ((fila > -1) && (columna > -1)){
                        Principal.pacienteSelec=fila;
                    }
            }
            });
        //FIN PESTAÑA PACIENTES
            
        //PESTAÑA CITAS
            JTableCitas.setModel(modeloTablaCitas);
            JTableCitas.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = JTableCitas.rowAtPoint(e.getPoint());
                    int columna = JTableCitas.columnAtPoint(e.getPoint());
                    //Si se marca fuera de las filas o columnas el valor se pone a -1
                    if ((fila > -1) && (columna > -1)){
                        Principal.pacienteSelec=fila;
                    }
            }
            });
        
        this.nuevacitabtn.addActionListener(new java.awt.event.ActionListener() {            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonNuevaCita view=new BotonNuevaCita();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        
        JTableCitas.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = JTableCitas.rowAtPoint(e.getPoint());
                    int columna = JTableCitas.columnAtPoint(e.getPoint());
                    //Si se marca fuera de las filas o columnas el valor se pone a -1
                    if ((fila > -1) && (columna > -1)){
                        Principal.citaSelec=fila;
                    }
            }
            });
        
        //PESTAÑA CITAS
        
        this.nuevopacientebtn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonNuevoPaciente view=new BotonNuevoPaciente();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        this.editarpacientebtn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
              BotonEditarPaciente view=new BotonEditarPaciente();              
              view.setVisible(true);
              view.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        this.eliminarPacientebtn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            if(Principal.pacienteSelec>-1){
                int dialogoborrar = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas borrar este Paciente?", "Eliminar Paciente",JOptionPane.YES_NO_OPTION);
                
                if(dialogoborrar == JOptionPane.YES_OPTION){
                    pacientes.removePaciente(Principal.pacienteSelec);
                    modeloTablaPacientes.removeRow(Principal.pacienteSelec);
                }
                
            }
            }
        });
        
        this.borrarcitabtn.addActionListener(new java.awt.event.ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            if(Principal.pacienteSelec>-1){
                int dialogoborrar = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas borrar esta Cita?", "Eliminar Cita",JOptionPane.YES_NO_OPTION);
                
                if(dialogoborrar == JOptionPane.YES_OPTION){
                    citas.removeCita(Principal.citaSelec);
                    modeloTablaCitas.removeRow(Principal.citaSelec);
                }
                
            }
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
        JTableCitas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        nuevacitabtn = new javax.swing.JButton();
        borrarcitabtn = new javax.swing.JButton();
        tabPacientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTablePacientes = new javax.swing.JTable();
        nuevopacientebtn = new javax.swing.JButton();
        editarpacientebtn = new javax.swing.JButton();
        eliminarPacientebtn = new javax.swing.JButton();
        tabConfiguracion = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreempresatext = new javax.swing.JTextField();
        domiciliofiscaltext = new javax.swing.JTextField();
        provinciatext = new javax.swing.JTextField();
        poblaciontext = new javax.swing.JTextField();
        cptext = new javax.swing.JTextField();
        ciftext = new javax.swing.JTextField();
        ivatext = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(JTableHoy);

        javax.swing.GroupLayout tabHoyLayout = new javax.swing.GroupLayout(tabHoy);
        tabHoy.setLayout(tabHoyLayout);
        tabHoyLayout.setHorizontalGroup(
            tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHoyLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(tabHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabHoyLayout.createSequentialGroup()
                        .addComponent(fecha_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabHoyLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
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

        JTableCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTableCitas);

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

        nuevacitabtn.setText("Nueva Cita");
        nuevacitabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevacitabtnActionPerformed(evt);
            }
        });

        borrarcitabtn.setText("Borrar Cita");
        borrarcitabtn.setToolTipText("");

        javax.swing.GroupLayout tabAgendaLayout = new javax.swing.GroupLayout(tabAgenda);
        tabAgenda.setLayout(tabAgendaLayout);
        tabAgendaLayout.setHorizontalGroup(
            tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabAgendaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(tabAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevacitabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(borrarcitabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(nuevacitabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrarcitabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Agenda", tabAgenda);

        tabPacientes.setBackground(new java.awt.Color(224, 255, 255));

        jScrollPane3.setMaximumSize(getMaximumSize());
        jScrollPane3.setPreferredSize(new java.awt.Dimension(454, 404));

        JTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTablePacientes);

        nuevopacientebtn.setText("Nuevo Paciente");
        nuevopacientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevopacientebtnActionPerformed(evt);
            }
        });

        editarpacientebtn.setText("Editar Paciente");

        eliminarPacientebtn.setText("Eliminar Paciente");

        javax.swing.GroupLayout tabPacientesLayout = new javax.swing.GroupLayout(tabPacientes);
        tabPacientes.setLayout(tabPacientesLayout);
        tabPacientesLayout.setHorizontalGroup(
            tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPacientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevopacientebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarpacientebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarPacientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabPacientesLayout.setVerticalGroup(
            tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPacientesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(tabPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabPacientesLayout.createSequentialGroup()
                        .addComponent(nuevopacientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarpacientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarPacientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );

        jTabbedPane1.addTab("Pacientes", tabPacientes);

        tabConfiguracion.setBackground(new java.awt.Color(224, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Fiscales"));

        jLabel1.setText("Nombre de la Empresa:");

        jLabel2.setText("Domicilio Fiscal:");

        jLabel3.setText("Provincia:");

        jLabel4.setText("Población:");

        jLabel6.setText("CP:");

        jLabel7.setText("CIF/NIF:");

        jLabel8.setText("%IVA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(poblaciontext, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(provinciatext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(domiciliofiscaltext)
                    .addComponent(nombreempresatext))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ciftext, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(ivatext)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cptext)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(nombreempresatext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(domiciliofiscaltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ivatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(provinciatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(poblaciontext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cptext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabConfiguracionLayout = new javax.swing.GroupLayout(tabConfiguracion);
        tabConfiguracion.setLayout(tabConfiguracionLayout);
        tabConfiguracionLayout.setHorizontalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        tabConfiguracionLayout.setVerticalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConfiguracionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
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

    private void nuevopacientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevopacientebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevopacientebtnActionPerformed

    private void JTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablePacientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTablePacientesMouseClicked

    private void nuevacitabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevacitabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevacitabtnActionPerformed

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
    private javax.swing.JTable JTableCitas;
    private javax.swing.JTable JTableHoy;
    private javax.swing.JTable JTablePacientes;
    private javax.swing.JButton borrarcitabtn;
    private javax.swing.JTextField ciftext;
    private javax.swing.JTextField cptext;
    private javax.swing.JTextField domiciliofiscaltext;
    private javax.swing.JButton editarpacientebtn;
    private javax.swing.JButton eliminarPacientebtn;
    private java.awt.Label fecha_actual;
    private java.awt.Label fecha_label;
    private javax.swing.JTextField ivatext;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombreempresatext;
    private javax.swing.JButton nuevacitabtn;
    private javax.swing.JButton nuevopacientebtn;
    private javax.swing.JTextField poblaciontext;
    private javax.swing.JTextField provinciatext;
    private javax.swing.JPanel tabAgenda;
    private javax.swing.JPanel tabConfiguracion;
    private javax.swing.JPanel tabHoy;
    private javax.swing.JPanel tabPacientes;
    // End of variables declaration//GEN-END:variables

}
