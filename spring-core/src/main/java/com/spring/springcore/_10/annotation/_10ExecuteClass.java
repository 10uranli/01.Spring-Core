package com.spring.springcore._10.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _10ExecuteClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("_10.annotation.xml");

		Car car = (Car) xml.getBean("car");
		car.setModel("Audi");

		Car car2 = (Car) xml.getBean("car2");
		car2.setModel("Bmw");

		Insurance insurance = (Insurance) xml.getBean("insurance");
		System.out.println(insurance.getCar().getModel());
		System.out.println(insurance.getCar().desc());

		/*
		 * Bmw Car model class
		 */
	}

}
