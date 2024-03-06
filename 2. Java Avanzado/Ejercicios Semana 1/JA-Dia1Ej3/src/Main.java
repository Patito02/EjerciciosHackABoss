import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dato[] listaDatos = new Dato[2];
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        try{
            for (int i = 0; i < listaDatos.length; i++) {
                System.out.println("Ingrese el dni: ");
                int dni1 = entrada1.nextInt();
                System.out.println("Ingrese el nombre: ");
                String nombre1 = entrada2.nextLine();
                System.out.println("Ingrese el apellido: ");
                String apellido1 = entrada2.nextLine();
                listaDatos[i]=new Dato(dni1,nombre1,apellido1);
            }
            System.out.println("A que dato quiere acceder?:");
            int indice = entrada1.nextInt();
            System.out.println(listaDatos[indice-1].toString());
        } catch(IndexOutOfBoundsException e){
            System.out.println("No existe un elemento es esa posicion. Elija un valor entre 1 y "+
                    listaDatos.length);
        } catch(InputMismatchException ex){
            System.out.println("Error en el tipo de dato. Debe ingresar un numero");
        }


    }
}