package com.spring.springcore._06.dependencyInjection;


import com.spring.springcore._05.beanLifeCycle.ConnectionDB;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _06ExecuteClass {
	
	public static void main(String[] args) {

		AbstractApplicationContext xml = new ClassPathXmlApplicationContext("_06.dependencyInjection.xml");
		Customer bean = (Customer) xml.getBean("customer");
		bean.setCustomerName("Onur");
		bean.callAllInfo();



	}

}
