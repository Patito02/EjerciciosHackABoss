
package com.hackaboss.votacion.logica;

import com.hackaboss.votacion.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVoto(Voto voto) {
        controlPersis.crearVoto(voto);
        /*
        if("partidoA".equalsIgnoreCase(voto.getVoto())) {
            controlPersis.crearVoto(voto);
        } else if("partidoB".equalsIgnoreCase(voto.getVoto())){
            controlPersis.crearVoto(voto);
        } else if("partidoC".equalsIgnoreCase(voto.getVoto())){
            controlPersis.crearVoto(voto);
        } */
    }

    public List<Voto> traerVotos() {
        return controlPersis.traerVotos();
    }
    
}
