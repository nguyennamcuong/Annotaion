package com.example.anotationspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tie implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wear tie");
    }
}
