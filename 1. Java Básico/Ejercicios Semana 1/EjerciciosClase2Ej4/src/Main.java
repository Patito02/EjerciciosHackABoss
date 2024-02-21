import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fila, asiento;
        boolean bandera = false;
        String respuesta="";
        String mapa[][] = new String[5][5];
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        for(int i=0; i< mapa.length;i++){
            for(int j=0; j<mapa[i].length;j++){
                mapa[i][j] = "O";
            }
        }
        System.out.println("----- Bienvenid@ al sistema de reservas del teatro -----");
        while (!bandera){
            System.out.println("Por favor elija una fila del 1 al 5:");
            fila = scanner.nextInt();
            System.out.println("Por favor elija un asiento del 1 al 5:");
            asiento = scanner.nextInt();

            if(fila <= 0){
                System.out.println("Error en el número de fila. Elija un fila del 1 al 5.");
            } else if(asiento <=0){
                System.out.println("Error en el número de asiento. Elija un asiento del 1 al 5");
            } else if(fila <= mapa.length && asiento <= mapa.length){
                if(mapa[fila-1][asiento-1].equals("O")){
                    System.out.println("Asiento reservado correctamente.");
                    mapa[fila-1][asiento-1] = "X";

                    for(int i=0; i< mapa.length;i++){
                        for(int j=0; j<mapa[i].length;j++){
                            System.out.print(" " +mapa[i][j] + " ");
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("Lo lamento, el asiento ya está ocupado.");
                }
            } else if (fila > mapa.length){
                System.out.println("Error en el número de fila. Elija un fila del 1 al 5.");
            } else {
                System.out.println("Error en el número de asiento. Elija un asiento del 1 al 5");
            }

            System.out.println("Desea reservar otro asiento? Elija SI/NO");
            respuesta = scanner2.nextLine();
            if(respuesta.equalsIgnoreCase("NO")){
                bandera = true;
            }
        }
    }
}