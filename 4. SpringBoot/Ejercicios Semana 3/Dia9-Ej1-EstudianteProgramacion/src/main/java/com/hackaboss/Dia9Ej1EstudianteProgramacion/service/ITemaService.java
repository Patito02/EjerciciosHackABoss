package com.hackaboss.Dia9Ej1EstudianteProgramacion.service;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Tema;

import java.util.List;

public interface ITemaService {
    public void saveTema(Tema tema);

    public List<Tema> getTemas();

    public void deleteTema(Long id);

    public Tema findTema(Long id);

    public void editTema(Tema tema);
}
