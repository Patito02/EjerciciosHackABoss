package com.hackaboss.Dia6Ej1apiRestaurante.controller;

import com.hackaboss.Dia6Ej1apiRestaurante.dto.PlatoDTO;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Ingrediente;
import com.hackaboss.Dia6Ej1apiRestaurante.model.Plato;
import com.hackaboss.Dia6Ej1apiRestaurante.service.IIngredienteService;
import com.hackaboss.Dia6Ej1apiRestaurante.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestauranteController {
    @Autowired
    IPlatoService platoService;
    @Autowired
    IIngredienteService ingredienteService;

    @GetMapping("/ingredientes")
    public List<Ingrediente> traerIngredientes() {
        return ingredienteService.traerIngredientes();
    }

    @GetMapping("/platos")
    public List<Plato> traerPlatos() {
        return platoService.traerPlatos();
    }

    @GetMapping("/verPlato/{nombrePlato}")
    public PlatoDTO verPlato(@PathVariable String nombrePlato) {
        return platoService.buscarPlato(nombrePlato);
    }

}
