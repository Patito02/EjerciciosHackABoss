import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private String descripcion;
    private List<Tarea> subtarea;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.subtarea = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getSubtarea() {
        return subtarea;
    }

    public void setSubtarea(List<Tarea> subtarea) {
        this.subtarea = subtarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
