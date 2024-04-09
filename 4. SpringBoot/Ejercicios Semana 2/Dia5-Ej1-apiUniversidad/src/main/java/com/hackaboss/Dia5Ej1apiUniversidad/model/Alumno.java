package com.hackaboss.Dia5Ej1apiUniversidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private Integer numMatricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
}
