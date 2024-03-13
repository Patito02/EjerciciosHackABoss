public class Main {
    public static void main(String[] args) {
        InventarioAuto<Auto> inventario = new InventarioAuto<>();
        inventario.agregarAuto(new Auto("Audi","audi1",2023,40000));
        inventario.agregarAuto(new Auto("Mercedes","merce1",2022,38000));
        inventario.agregarAuto(new Auto("Toyota","toy1",2020,34000));
        inventario.agregarAuto(new Auto("Toyota","toy2",2018,35000));

        inventario.buscarMarca("Mercedes");
        inventario.buscarAnio(2019);
        inventario.totalInventario();
    }
}