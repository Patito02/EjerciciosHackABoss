import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistroMascotas{
    List<Mascota<?>> listaMascotas;

    public RegistroMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    public void agregarMascotas(Mascota<?> mascota){
        listaMascotas.add(mascota);
        //System.out.println("Se agregó la mascota correctamente");
    }
    public <T> List<Mascota<?>> buscarNombre(String nombre){
        List<Mascota<?>> listadoNombres = new ArrayList<>();
        for(Mascota<?> masco:listaMascotas){
            if(masco.getNombre().equalsIgnoreCase(nombre)){
                listadoNombres.add(masco);
            }
        }
        System.out.println("\nListado de nombres: \n"+listadoNombres);
        return listadoNombres;
    }
    public <T> List<Mascota<?>> buscarEspecie(T especie){
        List<Mascota<?>> listadoEspecies = new ArrayList<>();
        for(Mascota<?> masco:listaMascotas){
            if(masco.getEspecie()==especie){
                listadoEspecies.add(masco);
            }
        }
        System.out.println("\nListado de especies: \n"+listadoEspecies);
        return listadoEspecies;
    }
    public int contarMascotas(){
        int total = listaMascotas.size();
        System.out.println("\nEl total de mascotas registradas es: "+total);
        return total;
    }
    public Mascota<?> datosAleatorios(){
        System.out.println("\nDatos aleatorios de especie, nombre y edad");

        List<String> especies= Arrays.asList("Perro","Gato","Ave","Reptil","Pez");
        int esp = (int)(Math.random()* especies.size());

        List<String> nombres= Arrays.asList("Cloe","Milo","Rocco","Leo","Danna","Sultan","Cash","Fito","Candela","Rex","Titan","Kayla","Misha","Zoe");
        int nom = (int)(Math.random()* nombres.size());

        List<Integer> edades= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        int ed = (int)(Math.random()*edades.size());

        System.out.println(new Mascota<>(listaMascotas.size()+1, nombres.get(nom), ed, especies.get(esp)));

        return new Mascota<>(listaMascotas.size()+1, nombres.get(nom), ed, especies.get(esp));

    }
}
