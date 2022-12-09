package com.example.anotationspring;

import org.springframework.stereotype.Component;

@Component
public class Vest implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wear vest");
    }
}
