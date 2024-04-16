package com.hackaboss.Dia9Ej1EstudianteProgramacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private String nombre;
    private String tipoCurso;
    private String fechaFinalizacion;
}
