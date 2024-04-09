package com.hackaboss.Dia5Ej1apiUniversidad.service;

import com.hackaboss.Dia5Ej1apiUniversidad.model.Alumno;
import com.hackaboss.Dia5Ej1apiUniversidad.model.Calificacion;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService implements IAlumnoService{
    List<Alumno> listaAlumnos = Arrays.asList(
            new Alumno(1000,"Jose","Perez", "12/7/2003"),
            new Alumno(1001,"Ana","Lopez", "14/3/1997"),
            new Alumno(1002,"Rachel","Green", "16/10/2000"),
            new Alumno(1003,"Monica","Geller", "30/11/1994")
    );
    List<Calificacion> listaCalificaciones = List.of(
            new Calificacion(1L, 8.0, 8.0, 8.0, 8.0, listaAlumnos.get(0)),
            new Calificacion(2L, 9.0, 9.0, 9.0, 9.0, listaAlumnos.get(1)),
            new Calificacion(3L, 7.0, 8.0, 9.0, 8.0, listaAlumnos.get(2)),
            new Calificacion(4L, 10.0, 10.0, 10.0, 10.0, listaAlumnos.get(3)));
    @Override
    public List<Alumno> obtenerAlumnos() {
        return listaAlumnos;
    }

    @Override
    public String obtenerCalificacionesEstudiante(Integer numMatricula) {
        Calificacion calificaciones = listaCalificaciones.stream()
                .filter(c->c.getUnAlumno().getNumMatricula().equals(numMatricula))
                .findFirst().get();
        return "Las calificaciones para el alumno solicitado son: " +
                "\nCalificacion 1: "+calificaciones.getCalificacion1()+
                "\nCalificacion 2: "+calificaciones.getCalificacion2()+
                "\nCalificacion 3: "+calificaciones.getCalificacion3();
    }

    @Override
    public List<Calificacion> ordenarCalificaciones() {
       List<Calificacion> listaOrdenada = listaCalificaciones.stream()
                .sorted((c1,c2)-> Double.compare(c2.getPromedio(),c1.getPromedio()))
                .collect(Collectors.toList());
        return listaOrdenada;
    }
}
