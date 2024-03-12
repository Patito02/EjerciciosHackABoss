import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = List.of(
                new Empleado("Juan",1500.00,"Desarrollador"),
                new Empleado("Elena",1800.00,"Desarrollador"),
                new Empleado("Ana",2000.00,"Analista"),
                new Empleado("Gerardo",2300.00,"Analista"),
                new Empleado("Maria",3500.00,"Gerente"),
                new Empleado("Jose",3700.00,"Gerente"));


        //salarios mayores a un valor
        double salarioBuscado = 1700.00;
        List<Double> salariosEncontrados = empleados.stream()
                .filter(e -> e.getSalario()>salarioBuscado)
                .map(e-> e.getSalario())
                .collect(Collectors.toList());
        System.out.println("\nLa lista de salarios mayores a: "+salarioBuscado+" es :"+
                salariosEncontrados);

        // obtengo list agrupada por categoria
        Map<String,List<Empleado>> listaEmp = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria));

        //saco el promedio de cada categoria
        double promDesarrollador = listaEmp.get("Desarrollador").stream()
                .mapToDouble(e -> e.getSalario())
                .average().orElse(0.00);
        double promAnalista = listaEmp.get("Analista").stream()
                .mapToDouble(Empleado::getSalario)
                .average().orElse(0.00);
        double promGerente = listaEmp.get("Gerente").stream()
                .mapToDouble(Empleado::getSalario)
                .average().orElse(0.00);
        System.out.println("\nEl salario promedio de Desarrollador es: "+promDesarrollador+
                "\nEl salario promedio de Analista es: "+promAnalista+
                "\nEl salario promedio de Gerente es: "+promGerente);


        // empleado con el salario mas alto
        Optional<Empleado> maxSalario = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));

        maxSalario.ifPresent(e->System.out.println("\nEl empleado con el salario más alto es: "+e));
    }
}