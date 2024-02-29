import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Auto(1,"3521 GDD","VW","ID3",2020,15000,"500 mAh",500));
        listaVehiculos.add(new Auto(2,"6733 DNG","Toyota","Yaris",2022,25000,"480 mAh",780));
        listaVehiculos.add(new Camioneta(3,"6536 KFJ","Toyota","CHR",2024,35000,150,5));
        listaVehiculos.add(new Camioneta(4,"9536 JSN","Nissan","Frontier",2021,30000,250,8));
        listaVehiculos.add(new Moto(5,"7230 AHE","SUZUKI","V-Strom",2018,18000,250,"monocilindrico"));
        listaVehiculos.add(new Moto(6,"8462 LAD","YAMAHA","XMAX",2019,19000,250,"monocilindrico"));

        for(Vehiculo vehi : listaVehiculos){
            System.out.println("-------Vehículo-------");
            System.out.println("Id: "+ vehi.getId() + ", Placa: " + vehi.getPlaca()+", Marca: " +
                    vehi.getMarca() + ", Modelo: " + vehi.getModelo() + ", Año: " + vehi.getAnio() +
                    ", Costo: €" + vehi.getCosto() + ", Antiguedad: " + vehi.calcularAntiguedad() + " años");
            if(vehi instanceof Auto){
                System.out.println("Capacidad Batería: " + ((Auto) vehi).getCapacidadBateria() +
                        ", Autonomía: " + ((Auto) vehi).getAutonomia()+" hs, Recarga: " +((Auto) vehi).cargarEnergia());
            } else if (vehi instanceof Camioneta){
                System.out.println("Capacidad Tanque: " + ((Camioneta) vehi).getCapacidadTanque() +
                        " litros, Consumo combustible: " + ((Camioneta) vehi).getConsumoCombustible() +
                        " litros/hora, Recarga: " + ((Camioneta) vehi).recargarCombustible());
            } else if (vehi instanceof Moto){
                System.out.println("Cilindrada: " + ((Moto) vehi).getCilindrada() + "cc, Tipo Motor: " +
                        ((Moto) vehi).getTipoMotor() + ", Recarga: " + ((Moto) vehi).recargarCombustible());
            }
        }
    }
}