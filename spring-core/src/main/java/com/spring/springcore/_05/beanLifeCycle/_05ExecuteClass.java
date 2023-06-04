package com.spring.springcore._05.beanLifeCycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _05ExecuteClass {
	
	public static void main(String[] args) {

		AbstractApplicationContext xml = new ClassPathXmlApplicationContext("_05.beanLifeCycle.xml");
		ConnectionDB bean = (ConnectionDB) xml.getBean("ConnectionDB");
		bean.setURL("bank:1212");
		bean.setUserName("bank");

		System.out.println(bean.toString());


		//builder
		ConnectionDB aa = ConnectionDB.builder().URL("").userName("aa").build();
		System.out.println(aa);


	}

}
