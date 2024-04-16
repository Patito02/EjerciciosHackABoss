package com.hackaboss.Dia9Ej1EstudianteProgramacion.controller;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Tema;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {
    @Autowired
    private ITemaService temaService;

    //crear un nuevo tema
    @PostMapping("/crear")
    public ResponseEntity<String> agregarTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
        return new ResponseEntity<>("Tema agregado correctamente", HttpStatus.OK);
    }

    //obtener todos los cursos
    @GetMapping("/listar")
    public List<Tema> getTemas(){
        return temaService.getTemas();
    }

    //Modificar los datos de un determinado tema
    @PutMapping("/editar")
    public String editTema(@RequestBody Tema tema){
        temaService.editTema(tema);
        return "Tema editado correctamente";
    }


}
