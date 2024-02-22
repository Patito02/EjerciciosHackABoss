public class Main {
    public static void main(String[] args) {

        //consigna A
        Electrodomestico electro1 = new Electrodomestico(1,"Lg","mod45","45w","blanco");
        Electrodomestico electro2 = new Electrodomestico(2,"Samsung","mod70","20w","gris");
        Electrodomestico electro3 = new Electrodomestico(3,"Bosch","mod22","80w","blanco");

        //consigna B
        Electrodomestico electro4 = new Electrodomestico();

        //consigna C
        System.out.println("Info del electro1: "+electro1.getMarca()+" "+ electro1.getModelo()+" "+ electro1.getConsumo());
        System.out.println("Info del electro2: "+electro2.getMarca()+" "+ electro2.getModelo()+" "+ electro2.getConsumo());
        System.out.println("Info del electro3: "+electro3.getMarca()+" "+ electro3.getModelo()+" "+ electro3.getConsumo());

        //consigna D
        System.out.println("Info del electro4: "+electro4.getMarca()+" "+ electro4.getModelo()+" "+ electro4.getConsumo());

        //Se obtiene "null" que es el valor por defecto de un String al que aún no se le ha asignado valor
    }
}