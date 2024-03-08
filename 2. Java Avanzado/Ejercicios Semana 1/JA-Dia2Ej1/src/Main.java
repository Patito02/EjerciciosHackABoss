
public class Main {
    public static void main(String[] args) {

        Agente agente1 = new Agente(1,new Llamada());
        Agente agente2 = new Agente(2,new Llamada());

        agente1.start();
        agente2.start();
    }

}