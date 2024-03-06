public class Reserva {
    private int numReserva;
    private String nombreCliente;
    private String destino;
    private String fechaViaje;
    private int numAsientosDeseados;
    private int asientosDisponibles = 10;

    public Reserva() {
    }

    public Reserva(String nombreCliente, String destino, String fechaViaje,
                   int numAsientosDeseados) {
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientosDeseados = numAsientosDeseados;
    }

    public int getNumAsientosDeseados() {
        return numAsientosDeseados;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservar() throws ReservaInvalidaException {
        if( this.nombreCliente.isEmpty()){
            throw new ReservaInvalidaException("Debe ingresar el nombre del cliente.");
        }

        if( this.destino.isEmpty()){
            throw new ReservaInvalidaException("Debe ingresar el destino del viaje.");
        }

        if( this.fechaViaje.isEmpty()){
            throw new ReservaInvalidaException("Debe ingresar la fecha del viaje.");
        }

        if( numAsientosDeseados<=0){
            throw new ReservaInvalidaException("Debe ingresar un numero de asientos válido.");
        }

        if(this.numAsientosDeseados > asientosDisponibles){
            throw new ReservaInvalidaException("Cantidad de asientos no disponible.");
        }
    }

}
