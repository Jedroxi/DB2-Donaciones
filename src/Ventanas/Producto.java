/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author crixa
 */
public class Producto extends javax.swing.JPanel {

    /**
     * Creates new form Producto
     */
    public Producto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrar1 = new javax.swing.JButton();
        btnRegistrar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(460, 200));
        setMinimumSize(new java.awt.Dimension(460, 200));
        setPreferredSize(new java.awt.Dimension(460, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar1.setBackground(new java.awt.Color(102, 102, 0));
        btnRegistrar1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Donaciones/fondoAñadir.png"))); // NOI18N
        btnRegistrar1.setText("+");
        btnRegistrar1.setBorderPainted(false);
        btnRegistrar1.setContentAreaFilled(false);
        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrar1MouseExited(evt);
            }
        });
        add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        btnRegistrar2.setBackground(new java.awt.Color(102, 102, 0));
        btnRegistrar2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnRegistrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Donaciones/fondoEliminar.png"))); // NOI18N
        btnRegistrar2.setText("x");
        btnRegistrar2.setBorderPainted(false);
        btnRegistrar2.setContentAreaFilled(false);
        btnRegistrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnRegistrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrar2MouseExited(evt);
            }
        });
        add(btnRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 354, 30));

        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Cantidad:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Categoría:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setText("Descripción:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1MouseClicked

    private void btnRegistrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1MouseEntered

    private void btnRegistrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1MouseExited

    private void btnRegistrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2MouseClicked

    private void btnRegistrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2MouseEntered

    private void btnRegistrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}