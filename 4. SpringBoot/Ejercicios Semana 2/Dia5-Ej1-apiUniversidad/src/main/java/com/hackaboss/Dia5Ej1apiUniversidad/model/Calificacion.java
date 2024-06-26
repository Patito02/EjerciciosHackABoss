package com.hackaboss.Dia5Ej1apiUniversidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calificacion {
    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private Alumno unAlumno;
}
