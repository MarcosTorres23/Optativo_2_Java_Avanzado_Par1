/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentaciones.contactos;

import Infraestructura.Modelos.Persona_modelo;
import Servicios.Personas_servicios;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */

 public class Personas extends javax.swing.JFrame {
     

    private Personas_servicios personaService;
    /**
     * Creates new form Personas
     */
    
     private Persona_modelo personas;
    public Personas() {
        initComponents();
        this.setLocationRelativeTo(null);
        personaService = new Personas_servicios("postgres", "0000", "localhost", "5432", "BaseDatos_Examen_OptativoII");
    }

    private void ConsultarPersona(String filtrarPor, String filtro) {
        switch (filtrarPor) {
            case "id":
                cargarDatos(personaService.consultarPersonaPorId(Integer.parseInt(filtro)));
                break;
            case "documento":
                cargarDatos(personaService.consultarPersonaPorDocumento(Integer.parseInt(filtro)));
            default:
                throw new AssertionError();
        }
        
    }
    private void eliminarPersona(String filtrarPor, String filtro){
         switch (filtrarPor) {
            case "id":
        personaService.eliminarpersonaporId(Integer.parseInt(filtro));
        default:
                throw new AssertionError();
        }
        
    }
    
    private void cargarDatos(Persona_modelo model){
        txtIdPersona.setText(model.getIdPersona());
        txtNombre.setText(model.getNombre());
        txtApellido.setText(model.getApellido());
        cbTipoDocumento.setSelectedItem(model.getTipoDocumento());
        txtNroDocumento.setText(model.getNroDocumento());
        txtDireccion.setText(model.getDireccion());
        txtEmail.setText(model.getEmail());
        txtCelular.setText(model.getCelular());
        dateFechaNacimiento.setDate(model.getFecha());
        txtidciudad.setText(model.getIdCiudad());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdPersona = new javax.swing.JTextField();
        txtNroDocumento = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        tituloPrincipal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        Insertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnModelBuscarPersonas = new javax.swing.JButton();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        etiquetaPersona = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtidciudad = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPersonaActionPerformed(evt);
            }
        });
        txtIdPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPersonaKeyPressed(evt);
            }
        });

        txtNroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDocumentoActionPerformed(evt);
            }
        });
        txtNroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDocumentoKeyPressed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(0, 204, 204));
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        tituloPrincipal.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(0, 51, 102));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("Personas");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setText("Direccion");

        Salir.setBackground(new java.awt.Color(0, 102, 102));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        Insertar.setBackground(new java.awt.Color(0, 144, 197));
        Insertar.setForeground(new java.awt.Color(255, 255, 255));
        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel6.setText("Celular");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setText("Tipo Documento");

        btnModelBuscarPersonas.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\lupa2.jpg")); // NOI18N
        btnModelBuscarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelBuscarPersonasActionPerformed(evt);
            }
        });

        cbTipoDocumento.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar el tipo de documento", "C.I.", "Pasaporte", "Licencia" }));
        cbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel8.setText("Fecha de Nac.");

        etiquetaPersona.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        etiquetaPersona.setText("Id Persona");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel4.setText("Numero Documento");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("ID Ciudad");

        Actualizar.setBackground(new java.awt.Color(0, 102, 204));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipoDocumento, 0, 546, Short.MAX_VALUE)
                            .addComponent(txtNroDocumento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(etiquetaPersona))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdPersona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModelBuscarPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Eliminar)
                        .addGap(29, 29, 29)
                        .addComponent(Actualizar)
                        .addGap(27, 27, 27)
                        .addComponent(Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(txtEmail)
                            .addComponent(txtCelular)
                            .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPersona)
                    .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelBuscarPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6))
                    .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtidciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insertar)
                    .addComponent(Cancelar)
                    .addComponent(Salir)
                    .addComponent(Actualizar)
                    .addComponent(Eliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPersonaKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            if(txtIdPersona.getText().trim().length() > 0 ){
            
            ConsultarPersona("id", txtIdPersona.getText().trim());
            }
        else{
            JOptionPane.showConfirmDialog(null,"se necesita un valor ID para buscar coincidencias...", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_txtIdPersonaKeyPressed

    private void Setear(){
        txtIdPersona.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        cbTipoDocumento.setSelectedIndex(0);
        txtDireccion.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        txtNroDocumento.setText("");
        dateFechaNacimiento.setDate(null);
        txtidciudad.setText(" ");

        
    }
    private void txtNroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDocumentoActionPerformed

    private void txtNroDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocumentoKeyPressed
      
        
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            if(txtNroDocumento.getText().trim().length() > 0 ){
            ConsultarPersona("documento", txtNroDocumento.getText().trim());
        }else{
            JOptionPane.showConfirmDialog(null,"se necesita un valor Numero Documento para buscar coincidencias...", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_txtNroDocumentoKeyPressed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
       Setear(); 
    }//GEN-LAST:event_CancelarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

   this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        
         int confirmar = JOptionPane.showConfirmDialog(null, "Deseas Aggregar a " +txtNombre.getText());
        if(confirmar==JOptionPane.YES_OPTION){
            Persona_modelo personas=new Persona_modelo();
           
            personas.setNombre(txtNombre.getText());
            personas.setApellido(txtApellido.getText());
            personas.setCelular(txtCelular.getText());
            personas.setDireccion(txtDireccion.getText());
            personas.setEmail(txtEmail.getText());
            personas.setNroDocumento(txtNroDocumento.getText());
            personas.setTipoDocumento (cbTipoDocumento.getSelectedItem().toString());
            personas.setFecha(dateFechaNacimiento.getDate());
            personas.setIdCiudad(txtidciudad.getText());
            personas.setIdPersona(txtIdPersona.getText());
            
     
           
            personaService.registrarPersona(personas);
        }
    }//GEN-LAST:event_InsertarActionPerformed

    private void btnModelBuscarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelBuscarPersonasActionPerformed
        new BusquedaPersona(null, true).setVisible(true);
    }//GEN-LAST:event_btnModelBuscarPersonasActionPerformed

    private void cbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoDocumentoActionPerformed

    private void txtIdPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPersonaActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseas Actualizar los datos de " +txtNombre.getText());
        if(confirmar==JOptionPane.YES_OPTION){
            Persona_modelo personas=new Persona_modelo();
           
            personas.setNombre(txtNombre.getText());
            personas.setApellido(txtApellido.getText());
            personas.setCelular(txtCelular.getText());
            personas.setDireccion(txtDireccion.getText());
            personas.setEmail(txtEmail.getText());
            personas.setNroDocumento(txtNroDocumento.getText());
            personas.setTipoDocumento (cbTipoDocumento.getSelectedItem().toString());
            personas.setFecha(dateFechaNacimiento.getDate());
            personas.setIdCiudad(txtidciudad.getText());
            personas.setIdPersona(txtIdPersona.getText());
     
           
            personaService.modificarPersona(personas);
        }
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseas Eliminar los datos de " +txtNombre.getText());
        if(confirmar==JOptionPane.YES_OPTION){
        int s=Integer.parseInt(txtIdPersona.getText().trim());
        personaService.eliminarpersonaporId(s); 
        JOptionPane.showConfirmDialog(null,"se elimino correctamente");
        
        }
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnModelBuscarPersonas;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private com.toedter.calendar.JDateChooser dateFechaNacimiento;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tituloPrincipal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtidciudad;
    // End of variables declaration//GEN-END:variables
}
