package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPizzeria {
    public static GestorPizzeria instanciaActual;
    
    private List<Pedido> misPedidos;
    private List<Factura> misFacturas;

    public GestorPizzeria() {
        misPedidos = new ArrayList<>();
        misFacturas = new ArrayList<>();
        instanciaActual = this;
    }
    
    public void addPedido(Pedido unPedido) {
        misPedidos.add(unPedido);
    }
    
    public List<Pedido> getArrayPedidos(){
        return misPedidos;
    }
}
