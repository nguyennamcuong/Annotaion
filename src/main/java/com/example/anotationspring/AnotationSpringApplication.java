package com.example.anotationspring;

import com.example.anotationspring.Lession1.Man;
import com.example.anotationspring.Lession1.Outfit;
import com.example.anotationspring.Lession2.AppConfig;
import com.example.anotationspring.Lession2.FirstBean;
import com.example.anotationspring.Lession2.SecondBean;
import com.example.anotationspring.Lession3.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        System.out.println("-------------------------------------");

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//        FirstBean firstBean = context1.getBean(FirstBean.class);

        System.out.println("-------------------------------------");


        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean.xml");

        // Get the bean student
        Student student = context2.getBean("student", Student.class);

        // Calling the methods
        student.display();
    }
    }

