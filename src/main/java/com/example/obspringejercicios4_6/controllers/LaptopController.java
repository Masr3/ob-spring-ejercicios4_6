package com.example.obspringejercicios4_6.controllers;

import com.example.obspringejercicios4_6.entities.Laptop;
import com.example.obspringejercicios4_6.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {


    //inyectamos la dependencia

    private final LaptopRepository respository;

    @Autowired
    public LaptopController(LaptopRepository respository) {
        this.respository = respository;
    }

    //Crear un método que devuelva una lista de objetos Laptop.
    @GetMapping("api/laptops")
    public List<Laptop> findAll(){
        return respository.findAll();
    }

    //Crear un metodo que persista los datos en formato JSON a la base de datos
    @PostMapping("api/laptops")
    public Laptop insert(@RequestBody Laptop laptop){

        return respository.save(laptop);
    }


}
