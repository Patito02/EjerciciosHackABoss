public class Main {
    public static void main(String[] args) {

        //consigna C
        Mamifero mamifero1 = new Mamifero(1,"elefante",2,"piel","herbivoro",4,"vivipara","gris","pastizales");
        Ave ave1 = new Ave(1,"avestruz",1,"plumas","herbivoro","2 metros","no vuela","negro","plano");
        Reptil reptil1 = new Reptil(1,"cocodrilo",2,"escamas","carnivoro","4 metros","gruesas e impermeables","sin veneno","pantanos");


        System.out.println(mamifero1.saludar());
        System.out.println(ave1.saludar());
        System.out.println(reptil1.saludar());

        //consigna D
        // se puede asignar a un objeto Animal un mamifero, pero solo va a poder acceder mediante la
        // propiedad de encapsulamiento a los atributos de la clase Animal, no a los atributos de la
        // subclase Mamifero
        Animal animal1 = mamifero1;

        System.out.println(animal1.getNombre());
        System.out.println(animal1.getId());
        System.out.println(animal1.getEdad());
        System.out.println(animal1.getTipoPiel());
        System.out.println(animal1.getTipoAlimentacion());

        //consigna D
        // si cambio los metodos de la clase madre o de la subclase a private, no puedo acceder a ellos
        // desde el main.
    }
}