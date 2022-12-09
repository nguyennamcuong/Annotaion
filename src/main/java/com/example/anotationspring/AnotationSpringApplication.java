package com.example.anotationspring;

import com.example.anotationspring.Lession1.Man;
import com.example.anotationspring.Lession1.Outfit;
import com.example.anotationspring.Lession2.AppConfig;
import com.example.anotationspring.Lession2.FirstBean;
import com.example.anotationspring.Lession2.SecondBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//        FirstBean firstBean = context1.getBean(FirstBean.class);

        

    }

}
