package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIinicio extends javax.swing.JFrame {
    
    public UIinicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btngenerarfactura = new javax.swing.JButton();
        btnnuevopedido = new javax.swing.JButton();
        tfnuevocliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 480, 138, 1));

        btngenerarfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_generar_factura_off.png"))); // NOI18N
        btngenerarfactura.setBorder(null);
        btngenerarfactura.setBorderPainted(false);
        btngenerarfactura.setContentAreaFilled(false);
        btngenerarfactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerarfactura.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_generar_factura_on.png"))); // NOI18N
        btngenerarfactura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_generar_factura_on.png"))); // NOI18N
        btngenerarfactura.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_generar_factura_on.png"))); // NOI18N
        btngenerarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btngenerarfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        btnnuevopedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_on.png"))); // NOI18N
        btnnuevopedido.setBorder(null);
        btnnuevopedido.setBorderPainted(false);
        btnnuevopedido.setContentAreaFilled(false);
        btnnuevopedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevopedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevopedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevopedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        tfnuevocliente.setFont(new java.awt.Font("Antonio", 0, 20)); // NOI18N
        tfnuevocliente.setForeground(new java.awt.Color(255, 255, 255));
        tfnuevocliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfnuevocliente.setText("Ingrese nuevo cliente");
        tfnuevocliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tfnuevocliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfnuevocliente.setOpaque(false);
        tfnuevocliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        tfnuevocliente.setSelectionColor(new java.awt.Color(255, 201, 19));
        tfnuevocliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfnuevoclienteMouseClicked(evt);
            }
        });
        getContentPane().add(tfnuevocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 260, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_user_g.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_g.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_off.png"))); // NOI18N
        btncerrar.setToolTipText("");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_on.png"))); // NOI18N
        btncerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_on.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIinicio_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void tfnuevoclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfnuevoclienteMouseClicked
        tfnuevocliente.setText("");
    }//GEN-LAST:event_tfnuevoclienteMouseClicked

    private void btnnuevopedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevopedidoActionPerformed
        if((!tfnuevocliente.getText().equalsIgnoreCase("Ingrese nuevo cliente")) && (!tfnuevocliente.getText().equalsIgnoreCase(""))){
            //CODIGO
            tfnuevocliente.setText("");
        }
        else JOptionPane.showMessageDialog(null, "Ingrese nuevo cliente.", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnnuevopedidoActionPerformed

    private void btngenerarfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarfacturaActionPerformed
        //CODIGO
    }//GEN-LAST:event_btngenerarfacturaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UIinicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btngenerarfactura;
    private javax.swing.JButton btnnuevopedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfnuevocliente;
    // End of variables declaration//GEN-END:variables
}
