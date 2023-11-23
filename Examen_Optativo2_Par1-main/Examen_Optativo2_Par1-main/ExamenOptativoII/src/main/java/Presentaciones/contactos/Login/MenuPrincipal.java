/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentaciones.contactos.Login;

import Presentaciones.contactos.Ciudad;
import Presentaciones.contactos.Clientes;
import Presentaciones.contactos.Cuentas;
import Presentaciones.contactos.Movimientos;
import Presentaciones.contactos.Personas;
import Servicios.auth.RegistroUsuario;

/**
 *
 * @author User
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        personamenu = new javax.swing.JMenuItem();
        ciudadmenu = new javax.swing.JMenuItem();
        movimientomenu = new javax.swing.JMenuItem();
        clientemenu = new javax.swing.JMenuItem();
        cuentasmenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(0, 102, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 102, 153));

        jToggleButton1.setBackground(new java.awt.Color(255, 153, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Salir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 255), new java.awt.Color(0, 204, 204)));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\formupng.png")); // NOI18N
        jMenu1.setText("Formularios");

        personamenu.setText("Personas");
        personamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personamenuActionPerformed(evt);
            }
        });
        jMenu1.add(personamenu);

        ciudadmenu.setText("Ciudad");
        ciudadmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadmenuActionPerformed(evt);
            }
        });
        jMenu1.add(ciudadmenu);

        movimientomenu.setText("Movimientos");
        movimientomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimientomenuActionPerformed(evt);
            }
        });
        jMenu1.add(movimientomenu);

        clientemenu.setText("Clientes");
        clientemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientemenuActionPerformed(evt);
            }
        });
        jMenu1.add(clientemenu);

        cuentasmenu.setText("Cuentas");
        cuentasmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentasmenuActionPerformed(evt);
            }
        });
        jMenu1.add(cuentasmenu);

        jMenuItem1.setText("Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personamenuActionPerformed
        // TODO add your handling code here:
        new Personas().setVisible(true);
        
      
    }//GEN-LAST:event_personamenuActionPerformed

    private void ciudadmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadmenuActionPerformed
        // TODO add your handling code here:
        new Ciudad().setVisible(true);
    }//GEN-LAST:event_ciudadmenuActionPerformed

    private void clientemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientemenuActionPerformed
        // TODO add your handling code here:
        new Clientes().setVisible(true);
    }//GEN-LAST:event_clientemenuActionPerformed

    private void cuentasmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentasmenuActionPerformed
        // TODO add your handling code here:
        new Cuentas().setVisible(true);
    }//GEN-LAST:event_cuentasmenuActionPerformed

    private void movimientomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimientomenuActionPerformed
        // TODO add your handling code here:
        new Movimientos().setVisible(true);
    }//GEN-LAST:event_movimientomenuActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ciudadmenu;
    private javax.swing.JMenuItem clientemenu;
    private javax.swing.JMenuItem cuentasmenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem movimientomenu;
    private javax.swing.JMenuItem personamenu;
    // End of variables declaration//GEN-END:variables
}
