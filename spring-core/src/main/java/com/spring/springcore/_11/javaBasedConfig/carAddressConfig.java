package com.spring.springcore._11.javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class carAddressConfig {
    @Bean
    public Address address(){
        return new Address("Kars");
    }

    @Bean
    public Customer customer(){
        return new Customer("Onur", address());
    }

}
