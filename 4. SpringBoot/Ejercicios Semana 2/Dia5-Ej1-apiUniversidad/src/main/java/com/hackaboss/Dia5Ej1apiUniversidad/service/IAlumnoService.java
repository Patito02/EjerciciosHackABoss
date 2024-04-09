package com.hackaboss.Dia5Ej1apiUniversidad.service;

import com.hackaboss.Dia5Ej1apiUniversidad.model.Alumno;
import com.hackaboss.Dia5Ej1apiUniversidad.model.Calificacion;

import java.util.List;

public interface IAlumnoService {

    List<Alumno> obtenerAlumnos();
    public String obtenerCalificacionesEstudiante(Integer numMatricula);
    public List<Calificacion> ordenarCalificaciones();
}
