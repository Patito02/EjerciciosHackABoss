import java.util.ArrayList;
import java.util.List;

public class InventarioAuto<T extends Auto> {
    private List<T> autos;

    public InventarioAuto() {
        this.autos = new ArrayList<>();;
    }

    public void agregarAuto(T auto){
        autos.add(auto);
        //System.out.println("Auto agregado correctamente " + auto.getModelo());
    }
    public void buscarMarca(String marca) {
        int contador=0;
        System.out.println("\nMarca buscada:" + marca);
        for (T auto : autos) {
            if(auto.getMarca().equalsIgnoreCase(marca)){
                System.out.println(auto.toString());
                contador++;
            }
        }
        if(contador ==0) {
            System.out.println("No hay autos de esa marca en el listado.");
        }
    }
    public void buscarAnio(int anio){
        System.out.println("\nAño buscado:" + anio);
        int contador=0;
        for(T auto : autos){
            if(auto.getAnio()==anio){
                System.out.println(auto.toString());
                contador++;
            }
        }
        if(contador==0) {
            System.out.println("No hay autos de ese año en el listado.");
        }
    }

    public void totalInventario(){
        double suma =0;
        for(T auto: autos){
            suma = suma + auto.getPrecio();
        }
        System.out.println("\nEl valor total del inventario es: "+ suma);
    }
}
