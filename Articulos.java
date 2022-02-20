import java.util.ArrayList;
class Articulos{
    public String nombre;
    public double price;
}

class Pedido{
    public String nombre; 
    public double total;
    public boolean listo; 
    public ArrayList<Item> items; 

}
/*
    public Articulos(){        
            this.nombre = "N/A";  
            this.price= -1;
    }

    public Articulos(){        
            this.nombre = "N/A";  
            this.price= -1;
    }

    public Pedido( String nombre, double total, boolean listo, ArrayList<Item> items ){
            this.nombre = nombre;  //This es como el self que utilizamos en Python
            this.total = total;
            this.listo = listo;
            this.items = items;  

    }
*/