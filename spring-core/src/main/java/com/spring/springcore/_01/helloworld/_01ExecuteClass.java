package com.spring.springcore._01.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _01ExecuteClass {
	
	public static void main(String[] args) {
		System.out.println("Obje kendimiz üretebiliriz, tüm yönetim bizde.");

		ClassPathXmlApplicationContext xml = new ClassPathXmlApplicationContext("_01.helloworld.xml");
		Message bean1 = (Message) xml.getBean("message1");
		System.out.println(bean1.getMessageText());


		
		Message bean2 = (Message) xml.getBean("message2");
		System.out.println(bean2.getMessageText());
	}

}
