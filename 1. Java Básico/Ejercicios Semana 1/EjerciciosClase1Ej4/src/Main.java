import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, suma, resta, multiplicacion;
        double division;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero (no puede ser 0): ");
        num2 = scanner.nextInt();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.printf("La división es: %.2f", division);

        //EXTRA: si el 2do numero es 0, la division da como resultado infinito
        //se podria aclarar con un mensaje que el 2do numero no puede ser 0
        //o podria poner una condicion para que el 2do numero ingresado no pueda ser 0
    }
}