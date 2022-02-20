import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {

        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
    
        // Elementos del menú
        Articulos articulo1 = new Articulos();
        articulo1.nombre = "moka";
        articulo1.price = 15.1; 

        Articulos articulo2 = new Articulos();
        articulo2.nombre = "latte"; 
        articulo2.price = 10.2;

        Articulos articulo3 = new Articulos();
        articulo3.nombre = "café de goteo"; 
        articulo3.price = 8.3;

        Articulos articulo4 = new Articulos();
        articulo4.nombre = "capucchino"; 
        articulo4.price = 18.4;
         
        //Pedidos 
        Pedido pedido1 = new Pedido();
        pedido1.nombre = "Cindhuri"; 
        pedido1.total = 15.1; 
        pedido1.listo = false; 
        pedido1.items = ("latte"); 

        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy"; 
        pedido2.total = 10.2;
        pedido2.listo = true; 
        pedido2.items = ("latte"); 

        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah"; 
        pedido3.total = 8.3; 
        pedido3.listo = true; 
        pedido3.items = ("café de goteo");

        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam"; 
        pedido4.total = 18.4; 
        pedido4.listo = false; 
        pedido4.items = ("capucchino");  
    
        //Ordenar variables -- orden1, orden2, etc.
    
        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);


        
        System.out.println(saludoGeneral + pedido1.nombre); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        System.out.println("Hola"+ "" + pedido1.nombre + mensajePendiente );  //Cindhuri pide un café

        if(pedido1.listo) {   //Noah pedido de café
            System.out.println(pedido1.nombre + mensajeListo);
            System.out.println(mensajeMostrarTotal + articulo2.price); 
        }
        else {
            System.out.println(pedido1.nombre + mensajePendiente);
        }
        /*
        if(estaListoOrden2) { //Sam pidió dos cafés con leche
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapuchino); 
        }
        else {
            System.out.println(cliente4 + mensajePendiente);
        }

        System.out.println(mensajeMostrarTotal + (precioLeche * 2) );

        System.out.println(mensajeMostrarTotal + (precioCapuchino - precioLeche));
    */
        
    }
}

    