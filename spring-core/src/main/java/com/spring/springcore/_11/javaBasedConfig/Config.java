package com.spring.springcore._11.javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(carAddressConfig.class)
public class Config {
    @Bean()
    public Car car(){
        return new Car();
    }
}
