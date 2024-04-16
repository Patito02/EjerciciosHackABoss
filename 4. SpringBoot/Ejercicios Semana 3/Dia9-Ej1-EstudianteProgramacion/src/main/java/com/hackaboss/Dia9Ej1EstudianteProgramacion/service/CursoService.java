package com.hackaboss.Dia9Ej1EstudianteProgramacion.service;

import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.dto.CursoTemaDTO;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Curso;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.model.Tema;
import com.hackaboss.Dia9Ej1EstudianteProgramacion.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<CursoDTO> getCursos() {
        List<Curso> listaCursos = cursoRepo.findAll();

        return toListaCursoDTO(listaCursos);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

    @Override
    public void editCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public CursoTemaDTO getTemasCurso(Long idCurso) {
        Curso curso = findCurso(idCurso);

        return toCursoTemaDTO(curso);
    }


    @Override
    public List<CursoDTO> findCursoJava() {
        String java = "Java";

        List<Curso> lista = cursoRepo.findAll();
        List<Curso> buscados = new ArrayList<>();

        //busco los cursos con palabra Java y los agrego a lista de buscados
        for(Curso cur: lista){
            if(cur.getNombre().contains(java)){
                buscados.add(cur);
            }
        }

        return toListaCursoDTO(buscados);
    }

    //aca lo convierto a dto
    private List<CursoDTO> toListaCursoDTO(List<Curso> lista){
        List<CursoDTO> listaDTO= new ArrayList<>();

        for(Curso cur: lista){

            CursoDTO cursoDTO = new CursoDTO();
            cursoDTO.setNombre(cur.getNombre());
            cursoDTO.setTipoCurso(cur.getTipoCurso());
            cursoDTO.setFechaFinalizacion(cur.getFechaFinalizacion());

            listaDTO.add(cursoDTO);
        }
        return listaDTO;
    }

    private CursoTemaDTO toCursoTemaDTO(Curso curso){

        CursoTemaDTO cursoTemaDTO = new CursoTemaDTO();
        List<String> listaTemasDTO= new ArrayList<>();
        List<Tema> listaTemas= curso.getListaTemas();

        cursoTemaDTO.setNombre(curso.getNombre());

        for(Tema tem: listaTemas){
            listaTemasDTO.add(tem.getNombre());
        }
        cursoTemaDTO.setListaTemas(listaTemasDTO);
        return cursoTemaDTO;
    }
}
