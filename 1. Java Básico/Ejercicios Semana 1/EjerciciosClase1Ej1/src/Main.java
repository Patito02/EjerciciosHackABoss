import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // consigna a
        System.out.println("Hola, bienvenid@ al sistema");

        // consigna b
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + ", bienvenid@ al sistema");
    }
}
