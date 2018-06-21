package modelo;

public class Factura {
    
    private String fechaFactura;
    private int numeroFactura;
    private boolean estadoFactura;

    public Factura(String fechaFactura, int numeroFactura, boolean estadoFactura) {
        this.fechaFactura = fechaFactura;
        this.numeroFactura = numeroFactura;
        this.estadoFactura = estadoFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
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
}
