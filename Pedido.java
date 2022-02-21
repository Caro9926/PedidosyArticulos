import java.util.ArrayList;

public class Pedido{
    public String nombre; 
    public double total;
    public boolean listo; 
    public ArrayList<Articulos> items = new ArrayList<Articulos>(); //Aquí le agrego la clase del tipo de artículos
}

