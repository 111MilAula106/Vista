package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date fechaHora;
    private SimpleDateFormat fechaCreacion;
    private SimpleDateFormat fechaEntrega;    
    private String nombreCliente;
    private int numeroPedido;
    private static int numeroPedidoSig;
    private Factura miFactura;
    private boolean estaFacturado = false;
    private List<Pizza> detallePedido;

    public Pedido(String nombreCliente) {
        detallePedido = new ArrayList<>();
        this.fechaHora=new Date();
        this.nombreCliente = nombreCliente;
        this.numeroPedido = numeroPedidoSig++;      
    }
    
    public void addPizza(Pizza unaPizza) {
        detallePedido.add(unaPizza);
    }

    public String getFechaCreacion() {
        fechaCreacion=new SimpleDateFormat("dd/MM/yyyy");
        return fechaCreacion.format(fechaHora);
    }

    public String getFechaEntrega() {
        fechaEntrega=new SimpleDateFormat("HH:mm:ss");
        return fechaEntrega.format(fechaHora);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Factura getMiFactura() {
        return miFactura;
    }

    public void setMiFactura(Factura miFactura) {
        this.miFactura = miFactura;
    }

    public boolean getEstaFacturado() {
        return estaFacturado;
    }

    public void setEstaFacturado(boolean estaFacturado) {
        this.estaFacturado = estaFacturado;
    }

    public List<Pizza> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<Pizza> detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    
}
