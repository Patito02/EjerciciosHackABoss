public class Llamada {

    private int numLlamada;

    public Llamada() {
    }

    public synchronized String recibirLlamada(){
        return " esta recibiendo la llamada ";
    }
    public synchronized String consultarLlamada(){
        return " esta resolviendo la consulta de la llamada ";
    }
    public synchronized String registrarLlamada(){
        return " está registrando información de la llamada ";
    }


}
