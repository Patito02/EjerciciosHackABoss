package com.hackaboss.Dia6Ej1apiRestaurante.service;

import com.hackaboss.Dia6Ej1apiRestaurante.dto.PlatoDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Plato;

import java.util.List;

public interface IPlatoService {

    List<Plato> traerPlatos();
    PlatoDTO buscarPlato(String nombrePlato);
}
