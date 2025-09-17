import java.util.HashMap;

public class Inventario {
    private HashMap<String,Producto>inventario;

    public Inventario() {
        this.inventario=new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.put(producto.getIdCodigo(),producto);
    }
}
