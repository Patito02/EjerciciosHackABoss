package com.hackaboss.Dia6Ej1apiRestaurante.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngredienteDTO {
    private String name;
    private Double calories;
}
