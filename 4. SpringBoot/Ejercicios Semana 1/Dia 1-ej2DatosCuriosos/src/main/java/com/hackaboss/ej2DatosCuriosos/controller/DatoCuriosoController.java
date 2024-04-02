package com.hackaboss.ej2DatosCuriosos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DatoCuriosoController {
    @GetMapping
    public String generarDatoCurioso(){
        String[] frases = {"Los gatos hacen unos 100 sonidos y los perros solamente 10.",
                "En el Antiguo Egipto cuando un gato doméstico fallecía todos los miembros de la casa se depilaban las cejas y lamentaban su pérdida.",
                "Los perros también tienen una huella única, se encuentra en su hocico.",
                "Los perros tienen el record del mundo de mayor número de razas registradas.",
                "Antes, las pelotas de tenis no eran amarillas, el tenis se jugaba con pelotas blancas hasta que gracias a un estudio se dieron cuenta de que las pelotas amarillas eran más fáciles de ver para quienes veían los partidos a través de la televisión.",
                "El baloncesto se jugaba originalmente con una pelota de fútbol y canastas de durazno.",
                "Las hormigas no duermen.",
                "El lagarto escamoso o cornudo puede disparar sangre con sus ojos"};
        int dato = new Random().nextInt(frases.length);
        return "El dato curioso es: "+ frases[dato];
    }
}
