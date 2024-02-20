public class Main {

    public static void main(String[] args) {

        //consigna a
        int num = 4;
        double decimal = 2.5;
        boolean bandera = false;
        String cadena = "texto";

        System.out.println("La variable int es: " + num);
        System.out.println("La variable double es: " + decimal);
        System.out.println("La variable boolean es: " + bandera);
        System.out.println("La variable String es: " + cadena);

        //consigna b
        int num2 = 2.5;
        double decimal2 = "texto";
        boolean bandera2 =  4;
        String cadena2 = false;
        // el programa marca error con el subrayado rojo
        // el programa no se ejecuta correctamente
        // si se intenta ejecutar se produce un error de incopatibilidad en tipos de datos
        // el caso que no produce error es en el double al asignarle un numero entero
    }
}
