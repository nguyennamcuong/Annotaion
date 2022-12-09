package com.example.anotationspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnotationSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AnotationSpringApplication.class);

        Outfit outfit = context.getBean(Outfit.class);

        System.out.println("Instance: " +outfit);
        outfit.wear();

        Man man = context.getBean(Man.class);

        System.out.println("Man Instance: " + man);

        System.out.println("Man Outfit: " + man.outfit);

        man.outfit.wear();

    }

}
