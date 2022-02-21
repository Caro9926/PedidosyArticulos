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
         

        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy"; 
        

        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah"; 
        

        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam"; 

        // Agrega a la lista del pedido 2 el artículo 1 y que aumente el total.
        pedido2.items.add(articulo1);
        pedido2.total += articulo1.price;

        // Pedido3 pidió un capuchino. Agrega el capuchino a su lista de pedido y a su cuenta.
        pedido3.items.add(articulo4);
        pedido3.total += articulo4.price;

        //Pedido4 agregó un latte. Actualiza en consecuencia.
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price;

        // El pedido de Cindhuri ya está listo. Actualiza su estado.
        pedido1.listo = true;

        // Sam pidió más bebidas: 2 latte. Actualiza su pedido también.
        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.price * 2;

        //El pedido de Jimmy ya está listo. Actualiza su estado.
        pedido2.listo = true;
    
        
    
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
   

       

    }
}

    