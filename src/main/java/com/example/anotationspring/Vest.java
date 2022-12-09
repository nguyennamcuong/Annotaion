package com.example.anotationspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vest implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wear vest");
    }
}
