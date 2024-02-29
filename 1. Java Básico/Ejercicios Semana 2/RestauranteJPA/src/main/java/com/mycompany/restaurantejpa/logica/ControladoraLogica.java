package com.mycompany.restaurantejpa.logica;

import com.mycompany.restaurantejpa.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void altaPlatillo(Platillo plato) {
        controlPersis.altaPlatillo(plato);
    }

   
    public void eliminarPlatillo(int id) {
        controlPersis.eliminarPlatillo(id);
    }

    public List<Platillo> traerPlatillos() {
        return controlPersis.traerPlatillos();
    }

    public void editarPlatillo(Platillo plato) {
        controlPersis.editarPlatillo(plato);
    }

    public Platillo traerPlatillo(int id) {
        return controlPersis.traerPlatillo(id);
    }
    
}
