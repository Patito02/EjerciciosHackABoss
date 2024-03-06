import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Inventario inventario = new Inventario();
        boolean ok = false;
        int cantiProd=0,precio=0,cantidad=0;

        try {
            System.out.println("Cuantos productos diferentes quiere ingresar?");
            cantiProd = numero.nextInt();
            for(int i=0; i<cantiProd;i++){
                System.out.println("Ingrese el nombre del producto: " );
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el precio del producto: " );
                precio = numero.nextInt();
                System.out.println("Ingrese la cantidad del producto: " );
                cantidad = numero.nextInt();
                Producto producto1 = new Producto(nombre,precio,cantidad);
                try {
                    System.out.println("Stock anterior: "+producto1.getStock());
                    producto1.agregarProducto();
                    System.out.println("Stock actualizado: "+producto1.getStock());
                    ok = true;
                } catch (ProductoException e) {
                    System.out.println("Error. " +e.getMessage());
                }
                if(ok){
                    inventario.listaProductos.add(producto1);
                }
            }
            System.out.println(inventario.getListaProductos());

        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar un numero válido");
        }

    }
}