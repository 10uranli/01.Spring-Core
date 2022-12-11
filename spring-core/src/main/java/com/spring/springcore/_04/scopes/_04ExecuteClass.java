package com.spring.springcore._04.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _04ExecuteClass {
	
	public static void main(String[] args) {
		//SINGLETON
		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("_04.scopes.xml");
		Message bean1 = (Message) xml.getBean("message");
		bean1.setMessageText("Message Object 1");
		System.out.println(bean1.getMessageText());
		
		Message bean2 = (Message) xml.getBean("message");
		System.out.println(bean2.getMessageText());
		
	    //PROTOTYPE: 
		Product bean_p_1 = (Product) xml.getBean("product");
		bean_p_1.setProductName("Product Name");
		System.out.println(bean_p_1.getProductName());
		
		Product bean_p_2 = (Product) xml.getBean("product");
		System.out.println(bean_p_2.getProductName());
		
//		Message Object 1
//		Message Object 1
//		Product Name
//		null

	}

}
