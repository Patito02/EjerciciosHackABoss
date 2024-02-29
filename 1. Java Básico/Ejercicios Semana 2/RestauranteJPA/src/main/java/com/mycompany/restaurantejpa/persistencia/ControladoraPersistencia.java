package com.mycompany.restaurantejpa.persistencia;

import com.mycompany.restaurantejpa.logica.Platillo;
import com.mycompany.restaurantejpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    public void altaPlatillo(Platillo plato) {
        platilloJpa.create(plato);
    }

    public void eliminarPlatillo(int id) {
        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> traerPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }

    public void editarPlatillo(Platillo plato) {
        try {
            platilloJpa.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platillo traerPlatillo(int id) {
        return platilloJpa.findPlatillo(id);
    }
    
    
}
