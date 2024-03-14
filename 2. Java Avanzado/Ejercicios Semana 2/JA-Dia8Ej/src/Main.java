import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = Arrays.asList(
                new Vehiculo("Ford","Fiesta",1000.0),
                new Vehiculo("Ford","Focus",1200.0),
                new Vehiculo("Ford","Explorer",2500.0),
                new Vehiculo("Fiat","Uno",500.0),
                new Vehiculo("Fiat","Cronos",1000.0),
                new Vehiculo("Fiat","Torino",1250.0),
                new Vehiculo("Chevrolet","Aveo",1250.0),
                new Vehiculo("Chevrolet","Spin",2500.0),
                new Vehiculo("Toyota","Corolla",1200.0),
                new Vehiculo("Toyota","Fortuner",3000.0),
                new Vehiculo("Renault","Logan",950.0));

        //lista ordenada por precio de menor a mayor
        System.out.println("\nLista ordena por precio:");
        listaVehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .forEach(System.out::println);

        //lista ordenada por marca y precio de menor a mayor
        System.out.println("\nLista ordena por marca y precio:");
        listaVehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getCosto))
                .sorted(Comparator.comparing(Vehiculo::getMarca))
                .forEach(System.out::println);

        //lista de precios no mayor a 1000
        System.out.println("\nLista de precios no mayor a 1000:");
        listaVehiculos.stream()
                .filter(v->v.getCosto()<1000)
                .forEach(System.out::println);

        //lista de precios mayor o igual a 1000
        System.out.println("\nLista de precios mayor o igual a 1000:");
        listaVehiculos.stream()
                .filter(v->v.getCosto()>=1000)
                .forEach(System.out::println);

        //promedio de precios
        double promedio = listaVehiculos.stream()
                .mapToDouble(v-> v.getCosto())
                .average()
                .orElse(0.00);
        System.out.printf("\nEl promedio de precios es: %.2f",promedio);
    }
}