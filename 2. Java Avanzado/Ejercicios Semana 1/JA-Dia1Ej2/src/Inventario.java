import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> listaProductos = new ArrayList<Producto>();

    public Inventario() {
    }

    public Inventario(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
