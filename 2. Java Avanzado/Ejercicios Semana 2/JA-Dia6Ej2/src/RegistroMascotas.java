import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistroMascotas<T extends Mascota> {
    List<T> listaMascotas;

    public RegistroMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    public void agregarMascotas(T mascota){
        listaMascotas.add(mascota);
        //System.out.println("Se agregó la mascota correctamente");
    }
    public void buscarNombre(String nombre){
        int contador=0;
        System.out.println("\nNombre buscado: "+nombre);
        for(T masco:listaMascotas){
            if(masco.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(masco.toString());
                contador++;
            }
        }
        if(contador==0){
            System.out.println("No hay mascotas con el nombre buscado.");
        }
    }
    public void buscarEspecie(String especie){
        int contador=0;
        System.out.println("\nEspecie buscada: "+especie);
        for(T masco:listaMascotas){
            if(masco.getEspecie().equalsIgnoreCase(especie)){
                System.out.println(masco.toString());
                contador++;
            }
        }
        if(contador==0){
            System.out.println("No hay mascotas de la especie buscada.");
        }
    }
    public void contarMascotas(){
        int total = listaMascotas.size();
        System.out.println("\nEl total de mascotas registradas es: "+total);
    }
    public void datosAleatorios(){
        System.out.println("\nDatos aleatorios de especie, nombre y edad");
        List<String> especies= Arrays.asList("Perro","Gato","Ave","Reptil","Pez");
        int esp = (int)(Math.random()*5);
        System.out.println("Especie: "+especies.get(esp));
        List<String> nombres= Arrays.asList("Cloe","Milo","Rocco","Leo","Danna","Sultan","Cash","Fito","Candela","Rex","Titan","Kayla","Misha","Zoe");
        int nom = (int)(Math.random()*14);
        System.out.println("Nombre: "+nombres.get(nom));
        List<Integer> edades= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        int ed = (int)(Math.random()*20);
        System.out.println("Edad: "+edades.get(ed));
    }
}
