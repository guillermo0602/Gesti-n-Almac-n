import java.util.*;

public class Inventario {
    private String nombreEmpresa;
    private HashMap<String, Producto> inventario;

//      constructor con el nuevo atributo y el hashmap
    public Inventario(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.inventario = new HashMap<>();
    }

//      Agregar un producto al inventario.
//      Complejidad: O(1) en promedio (HashMap).
    public void agregarProducto(Producto OBJproducto) {
        if(inventario.containsKey(OBJproducto.getCodigo())) {
         inventario.put(OBJproducto.getCodigo(), OBJproducto);
        }else{
            System.out.println("No existe el producto con el codigo "+OBJproducto.getCodigo());
        }
    }

//      Actualizar o añadir stock a un producto existente.
//      Complejidad: O(1).
    public void actualizarStock(String codigo, int cantidad) {
        Producto p = inventario.get(codigo);
        if (p != null) {
            p.setStock(p.getStock() + cantidad);
            System.out.println("Stock actualizado: " + p);
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }


//      Vender un producto (disminuir stock).
//      Complejidad: O(1).
    public void venderProducto(String codigo, int cantidad) {
        Producto p = inventario.get(codigo);
        if (p != null) {
            if (p.getStock() >= cantidad) {
                p.setStock(p.getStock() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " unidades de " + p.getNombre());
            } else {
                System.out.println("No hay suficiente stock de " + p.getNombre());
            }
        } else {
            System.out.println("Producto con código " + codigo + " no encontrado.");
        }
    }


//      Buscar producto por código.
//      Complejidad: O(1).
    public Producto buscarProducto(Producto OBJproducto) {
        return inventario.get(OBJproducto.getNombre());
    }

//    public List<Producto> ProductosPorCategoria(Categoria categoria) {
//        if(Categoria.valueOf(categoria)){
//            List<Producto> lista = new ArrayList<>();
//            for (Producto p : inventario.values()) {
//                if (p.getCategoria().equals(categoria)) {
//                    lista.add(p);
//                }
//            }
//            return lista;
//        }


//      Retornar lista de productos por categoría.
//      Complejidad: O(n).
    public List<Producto> ProductosPorCategoria(Categoria categoria) {
        List<Producto> lista = new ArrayList<>();
        for (Producto p : inventario.values()) {
            if (p.getCategoria() == categoria) {
                lista.add(p);
            }
        }
        return lista;
    }

//      Retornar el precio de todo el inventario.
//      Complejidad: O(n).
    public double PrecioTotal() {
        double total = 0;
        for (Producto p : inventario.values()) {
            total += p.precioActual();
        }
        return total;
    }

    //Metodo para mostrar los productos del inventario llamando al toString
    public void MostrarInventario() {
        for (Producto p : inventario.values()) {
            System.out.println(p.toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Inventario de la Tienda ===\n");
        for (Producto p : inventario.values()) {
            sb.append(p).append("\n");
        }
        sb.append("Valor total del inventario: ").append(PrecioTotal()).append("\n");
        return sb.toString();
    }
}
