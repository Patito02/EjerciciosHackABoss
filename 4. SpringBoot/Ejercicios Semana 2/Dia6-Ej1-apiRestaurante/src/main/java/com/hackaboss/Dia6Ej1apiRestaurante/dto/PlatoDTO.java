package com.hackaboss.Dia6Ej1apiRestaurante.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PlatoDTO {
    private String nombre;
    private Double cantidadCalorias;
    private IngredienteDTO ingredienteMayorCalorias;
    private List<IngredienteDTO> ingredientes;

    public PlatoDTO(String nombre, IngredienteDTO ingredienteMayorCalorias, List<IngredienteDTO> ingredientes) {
        this.nombre = nombre;
        this.ingredienteMayorCalorias = ingredienteMayorCalorias;
        this.ingredientes = ingredientes;
        cantidadCalorias = ingredientes.stream()
                .mapToDouble(IngredienteDTO::getCalories)
                .sum();
    }
}
