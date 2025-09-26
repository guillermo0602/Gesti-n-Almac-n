public class Producto {
    private String Codigo;
    private String Nombre;
    private double Precio;
    private Categoria categoria;
    private int Stock;

    //Constructor

    public Producto(String codigo, String nombre, double precio, Categoria categoria, int stock) {
        Codigo = codigo;
        Nombre = nombre;
        Precio = precio;
        this.categoria = categoria;
        Stock = stock;
    }



    //Getters
    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return Stock;
    }

    //Setters
    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    //Metodo para actualizar el Stock
    public double precioActual() {
        return Precio * Stock;
    }

    //Metodo para parsear el objeto String 0(1)

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo='" + Codigo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                ", categoria=" + categoria +
                ", Stock=" + Stock +
                '}';
    }
}
