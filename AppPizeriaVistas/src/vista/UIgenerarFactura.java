package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import modelo.GestorPizzeria;
import modelo.Pedido;

public class UIgenerarFactura extends javax.swing.JFrame {
    private GestorPizzeria current;
    private Pedido unPedido;
    private boolean puedoCancelar = false;
    private String numero;
    private boolean puedoConfirmar=false;    
    
    
    public UIgenerarFactura() {
        initComponents();
        
        current = GestorPizzeria.instanciaActual;
        this.unPedido=unPedido; 
        
        //DISEÑO TABLAS
        JTableHeader encabezado = tabla_clientes.getTableHeader();
        encabezado.setForeground(new Color(193,39,45));
        encabezado.setBackground(Color.white);
        encabezado.setFont(new Font("Antonio", Font.BOLD, 15));        
        JTableHeader encabezado2 = tablaDetalle.getTableHeader();
        encabezado2.setForeground(new Color(193,39,45));
        encabezado2.setBackground(Color.white);
        encabezado2.setFont(new Font("Antonio", Font.BOLD, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevopedido = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btncancelar = new javax.swing.JButton();
        btnconfirmar = new javax.swing.JButton();
        tfmontototal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevopedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_on.png"))); // NOI18N
        btnnuevopedido.setBorder(null);
        btnnuevopedido.setBorderPainted(false);
        btnnuevopedido.setContentAreaFilled(false);
        btnnuevopedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnuevopedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        btnnuevopedido.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_nuevo_pedido_off.png"))); // NOI18N
        getContentPane().add(btnnuevopedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 598, 685, 1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancelar_off.png"))); // NOI18N
        btncancelar.setBorder(null);
        btncancelar.setBorderPainted(false);
        btncancelar.setContentAreaFilled(false);
        btncancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancelar_on.png"))); // NOI18N
        btncancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_cancelar_on.png"))); // NOI18N
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        btnconfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_confirmar_off.png"))); // NOI18N
        btnconfirmar.setBorder(null);
        btnconfirmar.setBorderPainted(false);
        btnconfirmar.setContentAreaFilled(false);
        btnconfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirmar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_confirmar_on.png"))); // NOI18N
        btnconfirmar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_confirmar_on.png"))); // NOI18N
        btnconfirmar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_confirmar_on.png"))); // NOI18N
        btnconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        tfmontototal.setFont(new java.awt.Font("ChunkFive Roman", 0, 26)); // NOI18N
        tfmontototal.setForeground(new java.awt.Color(255, 210, 19));
        tfmontototal.setBorder(null);
        tfmontototal.setOpaque(false);
        getContentPane().add(tfmontototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 472, 90, -1));

        jLabel6.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 210, 19));
        jLabel6.setText("MONTO TOTAL:");
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        tablaDetalle.setFont(new java.awt.Font("Antonio", 0, 13)); // NOI18N
        tablaDetalle.setForeground(new java.awt.Color(102, 102, 102));
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "VARIEDAD", "TIPO", "TAMAÑO", "CANTIDAD", "PRECIO", "SUBTOTAL"
            }
        ));
        tablaDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaDetalle.setGridColor(new java.awt.Color(102, 102, 102));
        tablaDetalle.setRowHeight(20);
        tablaDetalle.setSelectionBackground(new java.awt.Color(255, 201, 19));
        tablaDetalle.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tablaDetalle);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 345, 690, 110));

        jLabel5.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 210, 19));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_detalle_pedido.png"))); // NOI18N
        jLabel5.setText("DETALLE DEL PEDIDO:");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 310, -1, -1));

        tabla_clientes.setFont(new java.awt.Font("Antonio", 0, 13)); // NOI18N
        tabla_clientes.setForeground(new java.awt.Color(102, 102, 102));
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NÚMERO", "HORA", "FECHA", "CLIENTE"
            }
        ));
        tabla_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_clientes.setGridColor(new java.awt.Color(102, 102, 102));
        tabla_clientes.setRowHeight(20);
        tabla_clientes.setSelectionBackground(new java.awt.Color(255, 201, 19));
        tabla_clientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        tabla_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_clientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 180, 380, 110));

        jLabel4.setFont(new java.awt.Font("ChunkFive Roman", 0, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 210, 19));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_user_amarillo.png"))); // NOI18N
        jLabel4.setText("SELECCIONE UN PEDIDO:");
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Antonio", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_generar_factura.png"))); // NOI18N
        jLabel2.setText("GENERAR FACTURA ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 97, 344, 1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_m.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

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
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UIgenerarFactura_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //CERRAR
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncerrarActionPerformed
    //EVENTO: CLICK SOBRE TABLA CLIENTES
    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked
        navegacionTabla();
    }//GEN-LAST:event_tabla_clientesMouseClicked
    //CANCELAR
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        puedoCancelar=((!(current.getArrayPedidos()).isEmpty()) && (tabla_clientes.getSelectedRow()!=-1));
        int opc = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
        if (puedoCancelar){
            if(JOptionPane.OK_OPTION==opc){
                for (int i=0; i<(current.getArrayPedidos()).size(); i++){            
                    if(numero.equalsIgnoreCase(tabla_clientes.getValueAt(i, 0).toString())){
                        (current.getArrayPedidos()).remove(i);
                        break;
                    }
                }
                mostrarTablaClientes();
            }              
        }
        else JOptionPane.showMessageDialog(null, "No puede eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);        
    }//GEN-LAST:event_btncancelarActionPerformed
    //CONFIRMAR
    private void btnconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarActionPerformed
        puedoConfirmar=((!(current.getArrayPedidos()).isEmpty()) && (tabla_clientes.getSelectedRow()!=-1));
        if(puedoConfirmar){
            UIfacturaGenerada frameFacturaGenerada = new UIfacturaGenerada(current, unPedido);
            frameFacturaGenerada.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null, "No hay pedidos registrados o no ha seleccionado uno.", "ERROR", JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_btnconfirmarActionPerformed
    //FOCUS EN FRAME GENERAR FACTURA
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        mostrarTablaClientes();
    }//GEN-LAST:event_formWindowGainedFocus
    //NAVEGACION TABLA POR TECLADO
    private void tabla_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_clientesKeyReleased
        if((evt.getKeyCode()==KeyEvent.VK_DOWN) || (evt.getKeyCode()==KeyEvent.VK_UP)){
            navegacionTabla();
        }
    }//GEN-LAST:event_tabla_clientesKeyReleased

    public void mostrarTablaClientes() {
        String unaMatriz[][] = new String[current.getArrayPedidos().size()][4];        
        for (int i = 0; i < current.getArrayPedidos().size(); i++) {
                unaMatriz[i][0] = String.valueOf(current.getArrayPedidos().get(i).getNumeroPedido());
                unaMatriz[i][1] = current.getArrayPedidos().get(i).getFechaEntrega();
                unaMatriz[i][2] = current.getArrayPedidos().get(i).getFechaCreacion();
                unaMatriz[i][3] = current.getArrayPedidos().get(i).getNombreCliente();
        }
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            unaMatriz,            
            new String [] {
                "NÚMERO", "HORA", "FECHA", "CLIENTE"
            }                
        ));
    }
    
    public void mostrarTablaDetalles(Pedido unPedido) { 
        int montoTotal=0;
        String unaMatriz[][] = new String[unPedido.getDetallePedido().size()][6];
        for (int i = 0; i < unPedido.getDetallePedido().size(); i++) {
            unaMatriz[i][0] = unPedido.getDetallePedido().get(i).getVariedad();
            unaMatriz[i][1] = unPedido.getDetallePedido().get(i).getTipo();
            unaMatriz[i][2] = unPedido.getDetallePedido().get(i).getTamanio();
            unaMatriz[i][3] = unPedido.getDetallePedido().get(i).getCantidad()+" CAJAS";
            unaMatriz[i][4] = "$"+unPedido.getDetallePedido().get(i).getPrecioUnitario();
            unaMatriz[i][5] = "$"+unPedido.getDetallePedido().get(i).getSubtotal();
            montoTotal += unPedido.getDetallePedido().get(i).getSubtotal(); 
        }
        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            unaMatriz,            
            new String [] {
                "VARIEDAD", "TIPO", "TAMAÑO", "CANTIDAD", "PRECIO", "SUBTOTAL"
            }                
        ));
        this.tfmontototal.setText("$"+String.valueOf(montoTotal));        
    }  
    
    public void navegacionTabla(){
        puedoCancelar=((!(current.getArrayPedidos()).isEmpty()) && (tabla_clientes.getSelectedRow()!=-1));
            if(puedoCancelar){
                int a = tabla_clientes.getSelectedRow();
                numero=tabla_clientes.getValueAt(a, 0).toString();
                unPedido=current.getArrayPedidos().get(a);
                mostrarTablaDetalles(unPedido); 
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnconfirmar;
    private javax.swing.JButton btnnuevopedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField tfmontototal;
    // End of variables declaration//GEN-END:variables
}
