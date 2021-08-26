/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.SQLClass;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author crixa
 */
public class RegistroDonante extends javax.swing.JPanel {

    /**
     * Creates new form RegistroDonante
     */
    public RegistroDonante(javax.swing.JPanel miRef) {
        this.refHome = miRef;
        initComponents();
        jLabel10.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        campoDNI = new javax.swing.JTextField();
        campoFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1020, 510));
        setPreferredSize(new java.awt.Dimension(1020, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 49)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Donante");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 25, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 0));
        btnRegistrar.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Generales/fondoBoton.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 140, 40));

        btnHome.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Generales/home.png"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        campoNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoNombre.setToolTipText("");
        campoNombre.setMinimumSize(new java.awt.Dimension(300, 30));
        campoNombre.setPreferredSize(new java.awt.Dimension(300, 30));
        add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));
        campoNombre.getAccessibleContext().setAccessibleName("");

        campoApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoApellido.setToolTipText("");
        campoApellido.setMinimumSize(new java.awt.Dimension(300, 30));
        campoApellido.setPreferredSize(new java.awt.Dimension(300, 30));
        add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        campoCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoCorreo.setToolTipText("");
        campoCorreo.setMinimumSize(new java.awt.Dimension(300, 30));
        campoCorreo.setPreferredSize(new java.awt.Dimension(300, 30));
        add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        campoDNI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoDNI.setToolTipText("");
        campoDNI.setMinimumSize(new java.awt.Dimension(300, 30));
        campoDNI.setPreferredSize(new java.awt.Dimension(300, 30));
        add(campoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        campoFecha.setDateFormatString("DD Month YYYY");
        campoFecha.setMaximumSize(new java.awt.Dimension(200, 30));
        campoFecha.setMinSelectableDate(new java.util.Date(-2208966592000L));
        campoFecha.setMinimumSize(new java.awt.Dimension(200, 30));
        campoFecha.setOpaque(false);
        campoFecha.setPreferredSize(new java.awt.Dimension(200, 30));
        add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Generales/barraNavRegistros.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Agregue los datos del nuevo donante");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        jLabel3.setText("Nombre:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        jLabel4.setText("Apellido:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        jLabel5.setText("Correo:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        jLabel7.setText("<html>Fecha de<br>Nacimiento:</html>");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarUsuario/fotoUsuario.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        jLabel9.setText("DNI:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Registro Exitoso");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        refHome.setVisible(true);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        // TODO add your handling code here:
        btnRegistrar.setFont(new java.awt.Font("Bahnschrift", 0, 19));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        // TODO add your handling code here:
        btnRegistrar.setFont(new java.awt.Font("Bahnschrift", 1, 21));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String correo = campoCorreo.getText();
        int dni = -1;
        if (!campoDNI.getText().equals("")) {
            dni = Integer.parseInt(campoDNI.getText());
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = dateFormat.format(campoFecha.getDate());
        if (!nombre.equals("") && !apellido.equals("") && !correo.equals("") && dni > 0 && !fecha.equals("")) {
            String msj = SQLClass.agregarDonante(nombre, apellido, correo, fecha, dni);
            if (!msj.equals("")) {
                JOptionPane.showMessageDialog(this, msj, "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                jLabel10.setVisible(true);
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    public void run() {
                        jLabel10.setVisible(false);
                        timer.cancel();
                    }
                };
                timer.scheduleAtFixedRate(task, 2000, 1000);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Algún campo es incorrecto", "Error", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDNI;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel refHome;
}
