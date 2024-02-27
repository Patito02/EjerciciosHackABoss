public class Main {
    public static void main(String[] args) {
        //consigna B
        Vestimenta[] vestimentas = new Vestimenta[9];
        vestimentas[0] = new Zapato(10,"bota",20.5,"Salomon",
                38,"negro","cuero","metal");
        vestimentas[1] = new Zapato(11,"zapatilla",23.5,"Nike",
                39,"negro","cuero","no tiene");
        vestimentas[2] = new Zapato(12,"sueco",25,"Zara",
                36,"negro","cuero","no tiene");
        vestimentas[3] = new Pantalon(20,"jean",25,"Zara",
                38,"azul","slim-fit","tela");
        vestimentas[4] = new Pantalon(21,"jean",30,"Scombro",
                38,"negro","slim","tela");
        vestimentas[5] = new Pantalon(22,"jean",20,"Tommy",
                38,"blanco","regular","tela");
        vestimentas[6] = new Camiseta(30,"camiseta",12,"mango",
                38,"gris","larga","redondo");
        vestimentas[7] = new Camiseta(31,"camiseta",12,"mango",
                38,"gris","corta","redondo");
        vestimentas[8] = new Sombrero(40,"gorra",10.5,"adidas",
                36,"rosa","tela","20cm");

        //consigna D
        // si bien en la consigna B dice crear solo un objeto de cada subclase con parametros,
        // para recorrer el vector se completaron todos los objetos con parámetros para poder
        // mostrar el atributo correspondiente, sino el campo sale por pantalla con un null

        for(int i=0; i< vestimentas.length;i++){
            System.out.println(vestimentas[i].mostrar());
        }
    }
}