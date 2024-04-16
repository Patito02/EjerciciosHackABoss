package com.hackaboss.Dia9Ej1EstudianteProgramacion.service;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoTemaDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Curso;

import java.util.List;

public interface ICursoService {
    public void saveCurso(Curso curso);

    List<CursoDTO> getCursos();

    public void deleteCurso(Long id);

    public Curso findCurso(Long id);

    public void editCurso(Curso curso);

    public CursoTemaDTO getTemasCurso(Long idCurso);

    List<CursoDTO> findCursoJava();
}
