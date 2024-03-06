import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nombre para la reserva: " );
        String nombre = teclado.nextLine();
        System.out.println("Ingrese un destino para la reserva: " );
        String destino = teclado.nextLine();
        System.out.println("Ingrese una fecha para la reserva: " );
        String fecha = teclado.nextLine();
        System.out.println("Ingrese la cantidad de asientos deseados: " );
        int asientos = teclado.nextInt();

        Reserva reserva1 = new Reserva(nombre,destino,fecha,asientos);

        try {
            System.out.println(reserva1.getAsientosDisponibles()+" asientos disponibles");
            reserva1.reservar();
            System.out.println("Se han reservado "+reserva1.getNumAsientosDeseados());
            reserva1.setAsientosDisponibles(reserva1.getAsientosDisponibles()-reserva1.getNumAsientosDeseados());

        } catch (ReservaInvalidaException e) {
            System.out.println("Error. "+e.getMessage());
        }
    }
}