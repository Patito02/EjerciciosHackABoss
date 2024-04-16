package com.hackaboss.Dia9Ej1EstudianteProgramacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CursoTemaDTO {
    private String nombre;
    private List<String> listaTemas;
}
