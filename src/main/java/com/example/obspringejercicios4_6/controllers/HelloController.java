package com.example.obspringejercicios4_6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String Hello(){
        return "Hola, esta es una aplicacion hecha en <b style='color:green;'>Spring!</b>";
    }

}
