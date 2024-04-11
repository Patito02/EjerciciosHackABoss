package com.hackaboss.Dia6Ej1apiRestaurante.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.Dia6Ej1apiRestaurante.dto.IngredienteDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.dto.PlatoDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class PlatoService implements IPlatoService{

    @Autowired
    IIngredienteService ingredienteService;

    private List<Plato> listaPlatos = loadDataBase();

    private List<Plato> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Plato>> typeRef = new TypeReference<>() {};
        List<Plato> listaPlat= null;
        try {
            listaPlat= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPlat;
    }

    @Override
    public List<Plato> traerPlatos(){
        return listaPlatos;
    }

    @Override
    public PlatoDTO buscarPlato(String nombrePlato) {
        Plato platoBuscado = listaPlatos.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombrePlato))
                .findFirst()
                .orElse(new Plato());
        return toPlatoDTO(platoBuscado);
    }

    //aca lo convierto a dto
    private PlatoDTO toPlatoDTO(Plato plato) {

        List<IngredienteDTO> ingredientesDTO = plato.getIngredientes().stream()
                .map(ing -> ingredienteService.buscarIngredienteID(ing))
                .toList();

        IngredienteDTO ingredienteMayorCalorias = ingredientesDTO.stream()
                .sorted(Comparator.comparingDouble(IngredienteDTO::getCalories).reversed())
                .findFirst()
                .orElse(new IngredienteDTO());

        return new PlatoDTO(plato.getNombre(), ingredienteMayorCalorias, ingredientesDTO);
    }
}
