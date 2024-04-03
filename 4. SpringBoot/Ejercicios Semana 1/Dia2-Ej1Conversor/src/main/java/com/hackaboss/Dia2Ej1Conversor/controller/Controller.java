package com.hackaboss.Dia2Ej1Conversor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/convertir/{cm}")
    public String conversorCentimetros(@PathVariable int cm){
        return "El equivalente a "+cm+ " cm es: "+(double)cm/100 +" metros.";
    }
}
