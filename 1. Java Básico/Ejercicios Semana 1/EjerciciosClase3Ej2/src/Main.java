public class Main {
    public static void main(String[] args) {

        //consigna A
        Persona[] personas= new Persona[5];
        personas[0] = new Persona(1,"Lucia",23,"Calle 3","345-6432");
        personas[1] = new Persona(2,"Luis",20,"Calle 11","643-6346");
        personas[2] = new Persona(3,"Juan",47,"Calle 74","235-8733");
        personas[3] = new Persona(4,"Jose",52,"Calle 26","865-8427");
        personas[4] = new Persona(5,"Maria",33,"Calle 85","474-8340");

        //consigna B
        System.out.println("-----------consigna B------------");
        for(int i=0; i< personas.length;i++){
            System.out.println(personas[i].getNombre()+ " " + personas[i].getEdad());
        }

        //consigna C
        System.out.println("-----------consigna C------------");
        System.out.println("Antes:");
        System.out.println("personas[1]: "+personas[1].getNombre());
        System.out.println("personas[2]: "+personas[2].getNombre());
        personas[1].setNombre("Elena");
        personas[2].setNombre("Walter");
        System.out.println("Después:");
        System.out.println("personas[1]: "+personas[1].getNombre());
        System.out.println("personas[2]: "+personas[2].getNombre());

        //consigna D
        System.out.println("-----------consigna D------------");
        for(int i=0; i< personas.length;i++){
            if(personas[i].getEdad() > 30){
                System.out.println(personas[i].getNombre()+ " " + personas[i].getEdad());
            }
        }
    }
}