import java.time.LocalDate;

public class Auto extends Vehiculo implements Electrico{
    private String capacidadBateria;
    private int autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int anio,
                double costo, String capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String cargarEnergia() {
        return "Eléctrica";
    }

    @Override
    public int calcularAntiguedad() {
        return LocalDate.now().getYear() - this.getAnio();
    }
}
