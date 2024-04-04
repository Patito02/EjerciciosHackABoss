package com.hackaboss.Dia3Ej1EventosAcademicos.controller;

import com.hackaboss.Dia3Ej1EventosAcademicos.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {

    List<Evento> listaEventos = new ArrayList<>();
    private Long eventoId = 1L;
    @PostMapping
    public Evento crearEvento(@RequestBody Evento unEvento){
        unEvento.setId(eventoId++);
        listaEventos.add(unEvento);
        return unEvento;
    }

    @GetMapping("/{id}")
    public Evento buscarEvento(@PathVariable Long id){
        Evento evento = listaEventos.stream()
                .filter(e-> e.getId().equals(id))
                .findFirst()
                .orElse(null);
        return evento;
    }
    @GetMapping("/eventos")
    public List<Evento> verEventos(){
        return listaEventos;
    }
}
