import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edad;
        System.out.println("Bienvenid@! Ingrese su edad: ");
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad. Puedes ingresar al evento.");
        } else {
            System.out.println("Eres menor de edad. NO puedes ingresar al evento.");
        }
    }
}