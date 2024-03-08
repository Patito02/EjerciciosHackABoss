public class Trabajador extends Thread{
    private int id;
    private Producto producto;

    public Trabajador(int id,Producto producto) {
        this.id = id;
        this.producto=producto;
    }


    @Override
    public void run() {
        int cantProductos = 3;
        for(int i=0; i<cantProductos;i++){
            producto.setId(i+1);
            System.out.println("El trabajador "+this.id + producto.ensamblarProductos()+producto.getId());
            System.out.println("El trabajador "+this.id + producto.controleCalidad()+producto.getId());
            System.out.println("El trabajador "+this.id + producto.embalarProductos()+producto.getId());
        }

    }
}
