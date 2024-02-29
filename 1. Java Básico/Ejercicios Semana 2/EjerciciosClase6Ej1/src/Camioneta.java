import java.time.LocalDate;

public class Camioneta extends Vehiculo implements Combustion{
    private int capacidadTanque;
    private int consumoCombustible;

    public Camioneta() {
    }
    public Camioneta(int id, String placa, String marca, String modelo, int anio,
                     double costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String recargarCombustible() {
        return "Combustible";
    }

    @Override
    public int calcularAntiguedad() {
        return LocalDate.now().getYear() - this.getAnio();
    }
}
