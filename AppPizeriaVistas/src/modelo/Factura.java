package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    
    private Date fechaHora;
    private SimpleDateFormat fechaFactura;
    private int numeroFactura;
    private static int numeroFacturaSig=100;
    private boolean estadoFactura;
    private Pedido unPedido;
    
    public Factura(){
        this.numeroFactura = numeroFacturaSig++;
        this.fechaHora=new Date();
    }
    
    public String getFechaFactura() {
        fechaFactura=new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        return fechaFactura.format(fechaHora);
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public boolean isEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public Pedido getUnPedido() {
        return unPedido;
    }

    public void setUnPedido(Pedido unPedido) {
        this.unPedido = unPedido;
    }

    public static int getNumeroFacturaSig() {
        return numeroFacturaSig;
    }
    
    
}
