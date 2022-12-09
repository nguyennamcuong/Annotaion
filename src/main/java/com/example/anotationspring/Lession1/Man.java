package com.example.anotationspring.Lession1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Man {

    @Autowired
    @Qualifier("cuong")
    public
    Outfit outfit;

    public Man(Outfit outfit) {
        this.outfit = outfit;
    }

}
