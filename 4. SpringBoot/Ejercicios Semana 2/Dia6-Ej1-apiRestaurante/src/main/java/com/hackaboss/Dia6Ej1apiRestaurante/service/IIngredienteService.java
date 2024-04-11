package com.hackaboss.Dia6Ej1apiRestaurante.service;

import com.hackaboss.Dia6Ej1apiRestaurante.dto.IngredienteDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Ingrediente;

import java.util.List;

public interface IIngredienteService {
    List<Ingrediente> traerIngredientes();
    IngredienteDTO buscarIngredienteID(Integer id);
}
