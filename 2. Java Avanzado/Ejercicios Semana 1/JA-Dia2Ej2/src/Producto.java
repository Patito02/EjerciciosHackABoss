public class Producto {
    private int id;

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public synchronized String ensamblarProductos(){
        return " está ensamblando el producto ";
    }
    public synchronized String controleCalidad(){
        return " está controlando la calidad del producto ";
    }
    public synchronized String embalarProductos(){
        return " está embalando el producto ";
    }
}
