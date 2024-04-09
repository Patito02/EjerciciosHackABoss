package com.hackaboss.Dia5Ej1apiUniversidad.controller;

import com.hackaboss.Dia5Ej1apiUniversidad.model.Alumno;
import com.hackaboss.Dia5Ej1apiUniversidad.model.Calificacion;
import com.hackaboss.Dia5Ej1apiUniversidad.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UniversidadController {

    private AlumnoService alumnoService;

    public UniversidadController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }
    @GetMapping("/estudiantes")
    public List<Alumno> obtenerAlumnos(){
        return alumnoService.obtenerAlumnos();
    }

    @GetMapping("/calificaciones/{numMatricula}")
    public String obtenerCalificacionesEstudiante(@PathVariable Integer numMatricula){
        return alumnoService.obtenerCalificacionesEstudiante(numMatricula);
    }

    @GetMapping("/calificaciones/ordenDesc")
    public List<Calificacion> ordenarCalificaciones(){

        return alumnoService.ordenarCalificaciones();
    }
}
