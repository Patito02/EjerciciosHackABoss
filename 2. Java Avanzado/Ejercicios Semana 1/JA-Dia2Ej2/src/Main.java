public class Main {
    public static void main(String[] args) {
        Trabajador trab1 = new Trabajador(1,new Producto());
        Trabajador trab2 = new Trabajador(2,new Producto());

        trab1.start();
        trab2.start();
    }
}