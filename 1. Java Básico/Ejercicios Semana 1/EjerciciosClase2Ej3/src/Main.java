import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tempMax, suma=0, maxProm;
        double[] vector = new double [7];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<vector.length;i++){
            System.out.println("Ingrese una temperatura máxima para el dia " + (i+1));
            tempMax = scanner.nextDouble();
            vector[i] = tempMax;
            suma += tempMax;
        }
        maxProm= suma/ vector.length;

        System.out.printf("La temperatura maxima promedio es: %.2f", maxProm);
    }
}