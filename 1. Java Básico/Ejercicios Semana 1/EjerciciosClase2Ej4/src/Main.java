import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fila, asiento;
        boolean bandera = false;
        String respuesta="";
        String mapa[][] = new String[5][5];
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        // agrego las variables "filas" y "columnas" para poder trabajar con distintos
        // tamaños de matriz
        int filas = mapa.length;
        int columnas=0;
        for(int i=0; i< mapa.length;i++){
            for(int j=0; j<mapa[i].length;j++){
                mapa[i][j] = "O";
                if(i==0){
                    columnas++;
                }
            }
        }
        System.out.println("----- Bienvenid@ al sistema de reservas del teatro -----");
        while (!bandera){
            System.out.println("Por favor elija una fila del 1 al "+filas+":");
            fila = scanner.nextInt();
            System.out.println("Por favor elija un asiento del 1 al "+columnas+":");
            asiento = scanner.nextInt();

            if(fila <= 0){
                System.out.println("Error en el número de fila. Elija un fila del 1 al "+filas);
            } else if(asiento <=0){
                System.out.println("Error en el número de asiento. Elija un asiento del 1 al "+columnas);
            } else if(fila <= filas && asiento <= columnas){
                if(mapa[fila-1][asiento-1].equals("O")){
                    System.out.println("Asiento reservado correctamente.");
                    mapa[fila-1][asiento-1] = "X";

                    for(int i=0; i<filas;i++){
                        for(int j=0; j<columnas;j++){
                            System.out.print(" " +mapa[i][j] + " ");
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("Lo lamento, el asiento ya está ocupado.");
                }
            } else if (fila > filas){
                System.out.println("Error en el número de fila. Elija un fila del 1 al "+filas);
            } else {
                System.out.println("Error en el número de asiento. Elija un asiento del 1 al "+columnas);
            }

            System.out.println("Desea reservar otro asiento? Elija SI/NO");
            respuesta = scanner2.nextLine();
            if(respuesta.equalsIgnoreCase("NO")){
                bandera = true;
            }
        }
    }
}