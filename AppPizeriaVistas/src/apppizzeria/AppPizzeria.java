package apppizzeria;

import modelo.GestorPizzeria;
import modelo.Pedido;
import modelo.Pizza;
import vista.UIgenerarFactura;



public class AppPizzeria {

    public static void main(String[] args) {
        GestorPizzeria gestorPizzeria = new GestorPizzeria();
        
        Pizza unaPizza = new Pizza("Fugazetta", "Molde", "Fugazetta", "8 porciones");
        Pedido pedido1 = new Pedido("Alan");
        pedido1.addPizza(unaPizza);
        gestorPizzeria.addPedido(pedido1); 
        
        Pedido pedido2 = new Pedido("Maxi");
        pedido2.addPizza(new Pizza("Especial rica","A la parrilla","Especial","12 porciones"));
        gestorPizzeria.addPedido(pedido2);
        
        Pedido pedido3 = new Pedido("Majo");
        pedido3.addPizza(new Pizza("Extra muzza","Molde","Mozzarella","12 porciones"));
        pedido3.addPizza(unaPizza);
        gestorPizzeria.addPedido(pedido3);
        
        UIgenerarFactura inicio = new UIgenerarFactura();
        inicio.setVisible(true);
    }
    
}
