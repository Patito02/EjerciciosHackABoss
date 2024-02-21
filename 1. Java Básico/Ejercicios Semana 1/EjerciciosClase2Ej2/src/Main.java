import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio, suma=0;
        int cantidad=1;
        Scanner scanner = new Scanner(System.in);

        while(cantidad>0){
            System.out.println("Ingrese el precio del producto: (ingrese 0 para terminar)");
            precio = scanner.nextDouble();
            if (precio > 0){
                suma += precio;
            }else if(precio < 0){
                System.out.println("El precio ingresado es incorrecto.");
            }
            else {
                cantidad = 0;
            }
        }
        System.out.println("El total a abonar es: " + suma);
    }
}