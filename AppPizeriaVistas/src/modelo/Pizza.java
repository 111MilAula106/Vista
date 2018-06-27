package modelo;

public class Pizza {

private String nombre;
private String tipo;
private String variedad;
private String tamanio;
private int precioUnitario;
private int subtotal;
private int cantidad;

    public Pizza(String nombre, String tipo, String variedad, String tamanio, int cantidad, int precioUnitario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.variedad = variedad;
        this.tamanio = tamanio;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return cantidad*precioUnitario;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
