package com.hackaboss.Dia2Ej2CodigoMorse.controller;

import com.hackaboss.Dia2Ej2CodigoMorse.model.Caracter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    List<Caracter> codigo = List.of(new Caracter(1,"A","·-"),
            new Caracter(2,"B","-···"),
            new Caracter(3,"C","-·-·"),
            new Caracter(4,"D","-··"),
            new Caracter(5,"E","·"),
            new Caracter(6,"F","··-·"),
            new Caracter(7,"G","--·"),
            new Caracter(8,"H","····"),
            new Caracter(9,"I","··"),
            new Caracter(10,"J","·---"),
            new Caracter(11,"K","-·-"),
            new Caracter(12,"L","·-··"),
            new Caracter(13,"M","--"),
            new Caracter(14,"N","-·"),
            new Caracter(15,"O","---"),
            new Caracter(16,"P","·--·"),
            new Caracter(17,"Q","--·-"),
            new Caracter(18,"R","·-·"),
            new Caracter(19,"S","···"),
            new Caracter(20,"T","-"),
            new Caracter(21,"U","··-"),
            new Caracter(22,"V","···-"),
            new Caracter(23,"W","·--"),
            new Caracter(24,"X","-··-"),
            new Caracter(25,"Y","-·--"),
            new Caracter(26,"Z","--··"),
            new Caracter(27,"0","-----"),
            new Caracter(28,"1","·----"),
            new Caracter(29,"2","··---"),
            new Caracter(30,"3","···--"),
            new Caracter(31,"4","····-"),
            new Caracter(32,"5","·····"),
            new Caracter(33,"6","-····"),
            new Caracter(34,"7","--···"),
            new Caracter(35,"8","---··"),
            new Caracter(36,"9","----·"));


    @GetMapping("/{palabra}")
    public String cifrar(@PathVariable String palabra){
        String cifrado ="";

        for(int i=0; i<palabra.length(); i++){
            String caracter = String.valueOf(palabra.charAt(i));
            for(Caracter car: codigo){
                if(car.getDefinicion().equalsIgnoreCase(caracter)){
                    cifrado = cifrado +" "+ car.getCodigo();
                }
            }
        }
        return "El cifrado es: "+cifrado;
    }


}
