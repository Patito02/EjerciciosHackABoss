package com.hackaboss.ej1Refranes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RefranesController {
    @GetMapping
    public String generarRefran(){
        String[] refranes = {"No hay mal que por bien no venga","Al que madruga Dios lo ayuda",
                "El que se fue a Sevilla, perdió su silla","A las palabras se las lleva el viento",
                "Cuando el gato no está, los ratones bailan", "Donde hubo fuego, cenizas quedan",
                "A caballo regalado, no se le miran los dientes"};
        int refran = new Random().nextInt(refranes.length);
        return "El refrán es: "+ refranes[refran];
    }
}
