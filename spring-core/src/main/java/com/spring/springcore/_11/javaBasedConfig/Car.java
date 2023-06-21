package com.spring.springcore._11.javaBasedConfig;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String model;

    public String getCarModel(){
        return "modeli : " + model;
    }
}
