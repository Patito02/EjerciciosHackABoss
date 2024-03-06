public class Producto {
    private String nombreProducto;
    private double precio;
    private int cantidad;
    private int stock = 10;

    public Producto() {
    }

    public Producto(String nombreProducto, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void agregarProducto() throws ProductoException {
        if( this.nombreProducto.isEmpty()){
            throw new ProductoException("Debe ingresar el nombre del producto.");
        }
        if( this.precio <= 0){
            throw new ProductoException("Debe ingresar un precio valido.");
        }
        if( this.cantidad <= 0){
            throw new ProductoException("Debe ingresar una cantidad valida.");
        }
        setStock(stock+cantidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", stock=" + stock +
                '}';
    }
}
