
package com.hackaboss.votacion.persistencia;

import com.hackaboss.votacion.logica.Voto;
import java.util.List;


public class ControladoraPersistencia {
    
    VotoJpaController votoJpa = new VotoJpaController();

    public void crearVoto(Voto voto) {
        votoJpa.create(voto);
    }

    public List<Voto> traerVotos() {
        return votoJpa.findVotoEntities();
    }

    
    
}
