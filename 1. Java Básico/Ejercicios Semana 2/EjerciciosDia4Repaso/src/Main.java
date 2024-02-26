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
            System.out.println(vectorVerduras[i].getNombre() + " posee " + vectorVerduras[i].getCalorias()+" calorias");
        }

    }
}