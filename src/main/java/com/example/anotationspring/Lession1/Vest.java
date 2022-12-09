package com.example.anotationspring.Lession1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cuong")
@Scope("prototype")
public class Vest implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wear vest");
    }
}
