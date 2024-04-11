package com.hackaboss.Dia6Ej1apiRestaurante.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.Dia6Ej1apiRestaurante.dto.IngredienteDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Ingrediente;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Service
public class IngredienteService implements IIngredienteService{
    private List<Ingrediente> listaIngredientes = loadDataBase();

    private List<Ingrediente> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {};
        List<Ingrediente> listaIngre= null;
        try {
            listaIngre= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaIngre;
    }

    public List<Ingrediente> traerIngredientes(){
        return listaIngredientes;
    }

    @Override
    public IngredienteDTO buscarIngredienteID(Integer id) {
        return listaIngredientes.stream()
                .filter( i -> i.getId().equals(id))
                .findFirst()
                .map(IngredienteService::toIngredienteDTO)
                .orElse(new IngredienteDTO());
    }

    //aca lo convierto a DTO
    private static IngredienteDTO toIngredienteDTO(Ingrediente ingrediente) {
        return new IngredienteDTO(ingrediente.getName(), ingrediente.getCalories());
    }
}
