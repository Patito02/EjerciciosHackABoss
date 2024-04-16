package com.hackaboss.Dia9Ej1EstudianteProgramacion.repository;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
