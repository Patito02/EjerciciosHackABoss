import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarea proyecto = new Tarea("Proyecto", "Desarrollo de Software");
        List<Tarea> listaSubtareas1 = Arrays.asList(
                new Tarea(" |-- Tarea Principal","Diseño de la Aplicación"),
                new Tarea(" |-- Tarea Principal","Implementación del Código"),
                new Tarea(" |-- Tarea Principal","Pruebas y Depuración"));
        proyecto.setSubtarea(listaSubtareas1);

        List<Tarea> listaSubtareas21 = Arrays.asList(
                new Tarea(" |   |-- Subtarea","Crear Prototipo"),
                new Tarea(" |   |-- Subtarea","Diseñar Interfaz"),
                new Tarea(" |   |-- Subtarea","Documentar Requisitos"));
        proyecto.getSubtarea().get(0).setSubtarea(listaSubtareas21);

        List<Tarea> listaSubtareas31 = Arrays.asList(
                new Tarea(" |   |   |-- Sub-subtarea","Definir Esquema de Colores"),
                new Tarea(" |   |   |-- Sub-subtarea","Diseñar Diseño Responsivo"));
        proyecto.getSubtarea().get(0).getSubtarea().get(1).setSubtarea(listaSubtareas31);

        List<Tarea> listaSubtareas22 = Arrays.asList(
                new Tarea(" |   |-- Subtarea","Desarrollar Backend"),
                new Tarea(" |   |-- Subtarea","Desarrollar Frontend"));
        proyecto.getSubtarea().get(1).setSubtarea(listaSubtareas22);

        List<Tarea> listaSubtareas32 = Arrays.asList(
                new Tarea(" |   |   |-- Sub-subtarea","Configurar Base de Datos"),
                new Tarea(" |   |   |-- Sub-subtarea","Crear Lógica de Negocios"));
        proyecto.getSubtarea().get(1).getSubtarea().get(0).setSubtarea(listaSubtareas32);

        List<Tarea> listaSubtareas33 = Arrays.asList(
                new Tarea(" |   |   |-- Sub-subtarea","Codificar Interfaz de Usuario"),
                new Tarea(" |   |   |-- Sub-subtarea","Integrar con Backend"));
        proyecto.getSubtarea().get(1).getSubtarea().get(1).setSubtarea(listaSubtareas33);

        List<Tarea> listaSubtareas23 = Arrays.asList(
                new Tarea(" |   |-- Subtarea","Ejecutar Pruebas de Integración"),
                new Tarea(" |   |-- Subtarea","Solucionar Errores"));
        proyecto.getSubtarea().get(2).setSubtarea(listaSubtareas23);

        visualizarEstructura(proyecto);
    }

    private static void visualizarEstructura(Tarea tarea) {
        System.out.println(tarea.getNombre()+ ": "+tarea.getDescripcion());
        for(Tarea tare: tarea.getSubtarea()){
            visualizarEstructura(tare);
        }

    }
}