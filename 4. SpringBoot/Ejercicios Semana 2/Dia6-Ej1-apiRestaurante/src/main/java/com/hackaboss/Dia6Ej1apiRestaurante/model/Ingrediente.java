package com.hackaboss.Dia6Ej1apiRestaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {
    private Integer id;
    private String name;
    private Double calories;
}
