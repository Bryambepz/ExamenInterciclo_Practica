/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDocente;
import ec.edu.ups.controlador.ControladorRector;
import static ec.edu.ups.vista.VntPrincipal.ruta;
import static ec.edu.ups.vista.VntPrincipal.ruta2;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class VntIniciarSesion extends javax.swing.JInternalFrame {

    private ControladorRector ctrlRector;
    private ControladorDocente ctrlDocente;
    private VntPrincipal vntMain;

    public static String ruta = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Examen_Interciclo\\registrarRector";
    public static String ruta2 = "C:\\Users\\braya\\OneDrive\\Documentos\\NetBeansProjects\\Examen_Interciclo\\registrarDocente";
    /**
     * Creates new form VntIniciarSesion
     *
     * @param ctrlRector
     * @param ctrlDocente
     * @param vntMain
     */
    public VntIniciarSesion(ControladorRector ctrlRector, ControladorDocente ctrlDocente, VntPrincipal vntMain) {
        initComponents();
        this.ctrlRector = ctrlRector;
        this.ctrlDocente = ctrlDocente;
        this.vntMain = vntMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jtxtPassword = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rbtnRector = new javax.swing.JRadioButton();
        rbtnDocente = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Iniciiar Sesion");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Correo");

        jLabel2.setText("Contraseña");

        btnIniciar.setText("INICIAR SESION");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        rbtnRector.setText("Es Rector");
        rbtnRector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRectorActionPerformed(evt);
            }
        });

        rbtnDocente.setText("Es Docente");
        rbtnDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnRector)
                    .addComponent(rbtnDocente))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnIniciar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCorreo)
                        .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnRector))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnDocente))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnCancelar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        String correo = txtCorreo.getText();
        String contrasenia = jtxtPassword.getText();
//        System.out.println(ctrlRector.inicarSesion(correo, contrasenia, ruta));

        if (rbtnRector.isSelected() || ctrlDocente.findAll().isEmpty()) {
            if (ctrlRector.inicarSesion(correo, contrasenia, ruta)) {
                System.out.println("**************************************\n"
                        + "Sesion Iniciada" + ctrlRector.obtenerSesionInciada());
                JOptionPane.showMessageDialog(this, "Iniciado sesion correctamente");
                vntMain.getGestionarMenu().setVisible(true);
                vntMain.getDocenteMenuItem().setVisible(true);
                limpiar();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
                txtCorreo.setText("");
                jtxtPassword.setText("");
            }
        } else {
            if (ctrlDocente.inicarSesion(correo, contrasenia, ruta2)) {
                System.out.println("**************************************\n"
                        + "Sesion Iniciada" + ctrlDocente.obtenerSesionInciada());
                vntMain.getAlumnosMenuItem().setVisible(true);
                vntMain.getActividadesMenuItem().setVisible(true);
                vntMain.getDocenteMenuItem().setVisible(false);
                JOptionPane.showMessageDialog(this, "Iniciado sesion correctamente");
                vntMain.getGestionarMenu().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
                txtCorreo.setText("");
                jtxtPassword.setText("");
            }
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        if (ctrlDocente.getListaObjetos().isEmpty()) {
            rbtnRector.setVisible(false);
            rbtnDocente.setVisible(false);
        } else {
            rbtnRector.setVisible(true);
            rbtnDocente.setVisible(true);
            rbtnRector.setSelected(true);
            rbtnDocente.setSelected(false);
        }
        limpiar();
    }//GEN-LAST:event_formInternalFrameActivated

    private void rbtnRectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRectorActionPerformed
        // TODO add your handling code here:
        rbtnRector.setSelected(true);
        rbtnDocente.setVisible(false);
        limpiar();
    }//GEN-LAST:event_rbtnRectorActionPerformed

    private void rbtnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDocenteActionPerformed
        // TODO add your handling code here:
        rbtnRector.setSelected(false);
        rbtnDocente.setVisible(true);
        limpiar();
    }//GEN-LAST:event_rbtnDocenteActionPerformed

    public void limpiar() {
        txtCorreo.setText("");
        jtxtPassword.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JRadioButton rbtnDocente;
    private javax.swing.JRadioButton rbtnRector;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
