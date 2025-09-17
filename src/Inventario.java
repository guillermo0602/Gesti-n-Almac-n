import java.util.HashMap;

public class Inventario {
    private HashMap<String,Producto>inventario;

    public Inventario(String nombre) {
        this.inventario=new HashMap<>();
    }

    public void agregarProducto(String Codigo,Producto producto) {
        if(!inventario.containsKey(Codigo)) {
            inventario.put(Codigo,producto);
            System.out.println("El producto se ha agregado correctamente");
        }else{
            System.out.println("ERROR");
        }
    }

}
