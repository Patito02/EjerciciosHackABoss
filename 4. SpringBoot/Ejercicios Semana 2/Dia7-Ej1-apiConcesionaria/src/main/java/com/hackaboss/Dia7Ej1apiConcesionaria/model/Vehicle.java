package com.hackaboss.Dia7Ej1apiConcesionaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private Integer id;
    private String brand;
    private String model;
    private Integer kilometers;
    private Integer doors;
    private Integer price;
}
