package com.mycompany.restaurantejpa;

import com.mycompany.restaurantejpa.logica.ControladoraLogica;
import com.mycompany.restaurantejpa.logica.Platillo;
import java.util.List;

public class RestauranteJPA {

    public static void main(String[] args) {
        ControladoraLogica control = new ControladoraLogica();
        
        Platillo plato = new Platillo(1,"Plato1","Receta 1", 40.50);
        control.altaPlatillo(plato);
        
        Platillo plato1 = new Platillo(2,"Plato2","Receta 2", 35.50);
        Platillo plato2= new Platillo(3,"Plato3","Receta 3", 40.50);
        control.altaPlatillo(plato1);
        control.altaPlatillo(plato2);
        
        control.eliminarPlatillo(plato1.getId());
        
        Platillo platillo = control.traerPlatillo(3);
        platillo.setPrecio(86.0);
        control.editarPlatillo(platillo);
        
        List<Platillo> listaPlatillos = control.traerPlatillos();
        
        for(Platillo plat: listaPlatillos){
            System.out.println(plat.toString());
        }
    }

    
}
