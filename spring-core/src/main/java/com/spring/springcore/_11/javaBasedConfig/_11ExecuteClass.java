package com.spring.springcore._11.javaBasedConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _11ExecuteClass {

	public static void main(String[] args) {

		ApplicationContext conf = new AnnotationConfigApplicationContext(Config.class);

		Car car = conf.getBean(Car.class);
		car.setModel("Audi");
		System.out.println(car.getCarModel());



		Customer customer = conf.getBean(Customer.class);
		System.out.println(customer);
	}

}
