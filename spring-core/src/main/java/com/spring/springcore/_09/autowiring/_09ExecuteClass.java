package com.spring.springcore._09.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _09ExecuteClass {
	
	public static void main(String[] args) {
		//byName ctrl /
//		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("_09.autowiring.xml");
//		Customer customer = (Customer) xml.getBean("customer");
//		String customerProductName = customer.getCustomerProductName();
//		System.out.println(customerProductName);

		//byType
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("_09.autowiring.xml");
		Customer customer = (Customer) xml.getBean("customerByType");
		String customerProductName = customer.getCustomerProductName();
		System.out.println(customerProductName);

		Page page= (Page)xml.getBean("Page");
		System.out.println(page.getSubPageName());
	}

}
