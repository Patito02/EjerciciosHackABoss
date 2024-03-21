package com.hackaboss.integrador.persistencia;

import com.hackaboss.integrador.logica.Equipo;
import com.hackaboss.integrador.logica.Partido;
import java.util.List;


public class ControladoraPersistencia {

    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();
    
    public void crearEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }

    public List<Equipo> traerEquipos() {
        return equipoJpa.findEquipoEntities();
    }

    public Equipo obtenerEquipo(Long id) {
        return equipoJpa.findEquipo(id);
    }

    public void crearPartido(Partido partido) {
        partidoJpa.create(partido);
    }

    public List<Partido> traerPartidos() {
        return partidoJpa.findPartidoEntities();
    }
    
}
