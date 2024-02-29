import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //consigna A y B
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto(1,"telefono","Samsung","smartphone",330.0,660.0,100));
        listaProductos.add(new Producto(2,"laptop","Samsung","smartphone",400.0,800.0,120));
        listaProductos.add(new Producto(3,"auriculares","Samsung","smartphone",130.0,260.0,103));
        listaProductos.add(new Producto(4,"cargador","Samsung","smartphone",30.0,60.0,94));
        listaProductos.add(new Producto(5,"tablet","Samsung","smartphone",100.0,1200.0,570));
        listaProductos.add(new Producto(6,"usb","Samsung","smartphone",15.0,30.0,53));
        listaProductos.add(new Producto(7,"mouse","Samsung","smartphone",8.0,16.0,235));
        listaProductos.add(new Producto(8,"teclado","Samsung","smartphone",22.0,44.0,84));
        listaProductos.add(new Producto(9,"monitor","Samsung","smartphone",250.0,500.0,112));
        listaProductos.add(new Producto(10,"parlante","Samsung","smartphone",35.0,70.0,64));

        System.out.println("Productos creados y guardados en el ArrayList.");

        //consigna C
        double precioAnt=0.0;
        String nombreProd="";

        for(Producto produ: listaProductos){
            if(produ.getPrecioVenta() > precioAnt){
                nombreProd = produ.getNombre();
                precioAnt = produ.getPrecioVenta();
            }
        }
        System.out.println("El producto de mayor precio de venta es: "+ nombreProd);

        //consigna D
        for(Producto produ: listaProductos){
            if(produ.getPrecioCosto() < precioAnt){
                nombreProd = produ.getNombre();
                precioAnt = produ.getPrecioVenta();
            }
        }
        System.out.println("El producto de menor precio de costo es: "+ nombreProd);

        //consigna E
        String nombreEliminado = listaProductos.get(5).getNombre();
        listaProductos.remove(5);
        System.out.println("Se ha eliminado el producto: " + nombreEliminado);

        //consigna F
        int cantStock=0,cantStockAnt=0;
        int indice=0;

        for (int i=0; i< listaProductos.size();i++){
            cantStock = ((Producto)listaProductos.get(i)).getCantidadStock();
            if(cantStock > cantStockAnt){
                nombreProd = ((Producto) listaProductos.get(i)).getNombre();
                indice = i;
                cantStockAnt = cantStock;
            }
        }
        ((Producto)listaProductos.get(indice)).setCantidadStock(cantStockAnt-3);
        System.out.println("El producto con mayor stock es: "+ nombreProd);
        System.out.println("El stock actualizado del " + ((Producto)listaProductos.get(indice)).getNombre()+ " es "+
                ((Producto)listaProductos.get(indice)).getCantidadStock());

    }
}