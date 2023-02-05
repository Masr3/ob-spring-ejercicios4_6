package com.example.obspringejercicios4_6;


import com.example.obspringejercicios4_6.entities.Laptop;
import com.example.obspringejercicios4_6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObSpringEjercicios46Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ObSpringEjercicios46Application.class, args);

        LaptopRepository repository = context.getBean(LaptopRepository.class);

        Laptop laptop1 = new Laptop(null,"Zenbook Pro 14","Asus","i9-12900H", "500GB","16GB DRR5","RTX 3050Ti", LocalDate.of(2022,9,6),true);
        Laptop laptop2 = new Laptop(null,"Zenbook Pro 13","Asus","i9-12900H", "1 TB","32GB DRR5","RTX 3090Ti", LocalDate.of(2022,12,6),false);


        //Guardo dos objetos
        repository.save(laptop1);
        repository.save(laptop2);

        


    }

}
