import java.util.Arrays;
import java.util.List;

public class ExploradorDirectorios {
    public static void main(String[] args) {
        List<String> listaArchivos = Arrays.asList("Archivo1","Archivo2","Archivo3");
        Directorio directorioPrincipal = new Directorio("Directorio Principal",listaArchivos);
        List<Directorio> listaDirectorio1 = Arrays.asList(
                new Directorio("Directorio1",listaArchivos),
                new Directorio("Directorio2",listaArchivos),
                new Directorio("Directorio3",listaArchivos));
        directorioPrincipal.setSubdirectorios(listaDirectorio1);

        List<Directorio> listaDirectorio2 = Arrays.asList(
                new Directorio("Directorio21",listaArchivos),
                new Directorio("Directorio22",listaArchivos),
                new Directorio("Directorio23",listaArchivos));
        directorioPrincipal.getSubdirectorios().get(1).setSubdirectorios(listaDirectorio2);

        List<Directorio> listaDirectorio3 = Arrays.asList(
                new Directorio("Directorio231",listaArchivos),
                new Directorio("Directorio232",listaArchivos),
                new Directorio("Directorio233",listaArchivos));
        directorioPrincipal.getSubdirectorios().get(1).getSubdirectorios().get(2).setSubdirectorios(listaDirectorio3);

        System.out.println(directorioPrincipal.toString());
        explorarDirectorios(directorioPrincipal);
    }
    private static void explorarDirectorios(Directorio directorio){
        System.out.println(directorio.getNombre());
        /*
        for(int i=0; i< directorio.getSubdirectorios().size();i++){
            //System.out.println(directorio.getSubdirectorios().get(i).getNombre());
            explorarDirectorios(directorio.getSubdirectorios().get(i));
        }*/

        for(Directorio direct : directorio.subdirectorios){
            direct.getNombre();
            explorarDirectorios(direct);
        }
    }

}
