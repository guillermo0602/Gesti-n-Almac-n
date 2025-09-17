public class Producto {
    private String Codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;
    private int Stock;

    public Producto(String Codigo, String nombre, double precio, Categoria categoria, int Stock) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.Stock = Stock;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getStock() {
        return Stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public void valorActual(){
        this.precio = this.precio * Stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + Codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", Stock=" + Stock +
                '}';
    }
}
