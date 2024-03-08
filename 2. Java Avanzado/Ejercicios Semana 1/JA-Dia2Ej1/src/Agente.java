public class Agente extends Thread {

    private int idAgente;
    private Llamada llamada;

    public Agente() {
    }

    public Agente(int idAgente, Llamada llamada) {
        this.idAgente = idAgente;
        this.llamada = llamada;
    }

    @Override
    public void run(){
        int cantLlamadas=2;
        for (int i=0; i<cantLlamadas;i++) {
            System.out.println("Agente " + idAgente + llamada.recibirLlamada()+(i+1));
            System.out.println("Agente " + idAgente+ llamada.consultarLlamada()+(i+1));
            System.out.println("Agente " + idAgente + llamada.registrarLlamada()+(i+1));
        }
    }

}
