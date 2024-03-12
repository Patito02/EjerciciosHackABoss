import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = List.of(
                new Evento("Cumpleaños",LocalDate.of(2024,4,12),"Reunión"),
                new Evento("Xunta",LocalDate.of(2024,4,12),"Conferencia"),
                new Evento("Arte",LocalDate.of(2024,4,12),"Taller"),
                new Evento("Lego",LocalDate.of(2024,5,26),"Taller"),
                new Evento("Despedida",LocalDate.of(2024,6,13),"Reunión"),
                new Evento("Deporte",LocalDate.of(2024,4,22),"Conferencia"),
                new Evento("Exposición",LocalDate.of(2024,3,18),"Taller"));

        //filtrar fecha especifica
        LocalDate fechaBuscada = LocalDate.of(2024,4,12);

        List<Evento> lista = eventos.stream()
                .filter(e -> e.getFecha().equals(fechaBuscada))
                .toList();
        System.out.println("\nLa lista filtrada por fecha: "+fechaBuscada+" es: \n"+lista);


        //agrupo por categoria y cuento
        Map<String,Long> listaCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        System.out.println("\nCantidad de eventos por categoría:");
        listaCategoria.forEach((categoria, cantidad) -> System.out.println(categoria + ": " + cantidad));


        //evento mas proximo
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min(Comparator.comparing(evento->Math.abs(evento.getFecha().toEpochDay()-LocalDate.now().toEpochDay())));

        eventoMasProximo.ifPresent(evento -> System.out.println("\nEvento más próximo es: " +evento));
    }
}