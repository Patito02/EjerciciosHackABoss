package com.hackaboss.integrador.logica;

import com.hackaboss.integrador.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }

    public void crearPartido(Partido partido, Long idEquipo1, Long idEquipo2) {
        Equipo equipo1 = controlPersis.obtenerEquipo(idEquipo1);
        Equipo equipo2 = controlPersis.obtenerEquipo(idEquipo2);
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        controlPersis.crearPartido(partido);
    }

    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }

    
    
}
