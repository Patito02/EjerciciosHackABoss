public class Main {
    public static void main(String[] args) {

        //consigna A
        Verdura[] vectorVerduras = new Verdura[5];

        vectorVerduras[0] = new Verdura(1,"tomate","rojo",55,false);
        vectorVerduras[1] = new Verdura(2,"lechuga","verde",10,false);
        vectorVerduras[2] = new Verdura(3,"zanahoria","naranja",30,false);
        vectorVerduras[3] = new Verdura(4,"berenjena","violeta",25,true);
        vectorVerduras[4] = new Verdura(5,"espinaca","verde",25,true);

        //consigna B
        for(int i=0; i< vectorVerduras.length; i++){
            System.out.println(vectorVerduras[i].getNombre() + " posee " + vectorVerduras[i].getCalorias()+" calorías");
        }

        //consigna C
        Verdura verdu1 = vectorVerduras[1];
        Verdura verdu2 = vectorVerduras[3];
        System.out.println("\n--------Antes----------");
        System.out.println("id: " +verdu1.getId()+", nombre: "+ verdu1.getNombre() +
                ", color: "+ verdu1.getColor() + ", calorías: " + verdu1.getCalorias()+
                ", debe cocinarse?: "+verdu1.isDebeCocinarse());
        System.out.println("id: " +verdu2.getId()+", nombre: "+ verdu2.getNombre() +
                ", color: "+ verdu2.getColor() + ", calorías: " + verdu2.getCalorias()+
                ", debe cocinarse?: "+verdu2.isDebeCocinarse());

        verdu1.setId(6);
        verdu1.setNombre("puerro");
        verdu1.setColor("verde");
        verdu1.setCalorias(40);
        verdu1.setDebeCocinarse(true);
        verdu2.setId(7);
        verdu2.setNombre("calabaza");
        verdu2.setColor("naranja");
        verdu2.setCalorias(45);
        verdu2.setDebeCocinarse(true);

        System.out.println("--------Después----------");
        System.out.println("id: " +verdu1.getId()+", nombre: "+ verdu1.getNombre() +
                ", color: "+ verdu1.getColor() + ", calorías: " + verdu1.getCalorias()+
                ", debe cocinarse?: "+verdu1.isDebeCocinarse());
        System.out.println("id: " +verdu2.getId()+", nombre: "+ verdu2.getNombre() +
                ", color: "+ verdu2.getColor() + ", calorías: " + verdu2.getCalorias()+
                ", debe cocinarse?: "+verdu2.isDebeCocinarse());

        //consigna D
        int cantidad = 0;
        String color = "verde";
        System.out.println("\nLas verduras de color "+color+" son: ");
        for(int i=0; i< vectorVerduras.length; i++){
            Verdura verdu = vectorVerduras[i];
            if(verdu.getColor().equalsIgnoreCase(color)){
                cantidad++;

                System.out.println("id: " +verdu.getId()+", nombre: "+ verdu.getNombre() +
                        ", color: "+ verdu.getColor() + ", calorías: " + verdu.getCalorias()+
                        ", debe cocinarse?: "+verdu.isDebeCocinarse());
            }
        }
        if(cantidad == 0){
            System.out.println("\nNo hay verduras de color "+ color +" en este listado.");
        }
    }
}