package com.hackaboss.Dia9Ej1EstudianteProgramacion.service;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Tema;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public List<Tema> getTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public void editTema(Tema tema) {
        temaRepo.save(tema);
    }


}
