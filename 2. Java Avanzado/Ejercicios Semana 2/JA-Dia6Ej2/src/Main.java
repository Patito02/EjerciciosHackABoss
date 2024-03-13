public class Main {
    public static void main(String[] args) {
        RegistroMascotas<Mascota> lista = new RegistroMascotas<>();
        lista.agregarMascotas(new Mascota<>(1,"Uma",3,"gato"));
        lista.agregarMascotas(new Mascota<>(2,"Luna",6,"perro"));
        lista.agregarMascotas(new Mascota<>(3,"Abraham",2,"ave"));
        lista.buscarNombre("Uma");
        lista.buscarEspecie("perro");
        lista.contarMascotas();
        lista.datosAleatorios();
        lista.datosAleatorios();
        lista.datosAleatorios();
        lista.datosAleatorios();
        lista.datosAleatorios();
        lista.datosAleatorios();
    }
}