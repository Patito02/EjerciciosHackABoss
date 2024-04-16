package com.hackaboss.Dia9Ej1EstudianteProgramacion.controller;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoTemaDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Curso;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private ICursoService cursoService;

    //crear un nuevo curso
    @PostMapping("/crear")
    public ResponseEntity<String> saveCurso(@RequestBody Curso curso){
        cursoService.saveCurso(curso);
        return new ResponseEntity<>("El curso se agregó correctamente", HttpStatus.OK);
    }

    //Obtener todos los cursos
    @GetMapping("/lista")
    public List<CursoDTO> getCursos(){
        return cursoService.getCursos();
    }

    //Modificar los datos de un curso
    @PutMapping("/editar")
    public String editCurso(@RequestBody Curso curso) {
        cursoService.editCurso(curso);
        return "Curso editado correctamente";
    }

    //obtener los temas de un determinado curso
    @GetMapping("/temas/{idCurso}")
    public ResponseEntity<CursoTemaDTO> getTemasCurso(@PathVariable Long idCurso){
        CursoTemaDTO cursoTema = cursoService.getTemasCurso(idCurso);

        return ResponseEntity.ofNullable(cursoTema);
    }

    //Obtener todos los cursos que contengan como nombre la palabra “Java”
    @GetMapping("/buscar/java")
    public List<CursoDTO> findCursoJava(){
        return cursoService.findCursoJava();
    }
}
