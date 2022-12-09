package com.example.anotationspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Man {

    @Autowired
    Outfit outfit;

    public Man(Outfit outfit) {
        this.outfit = outfit;
    }

}
