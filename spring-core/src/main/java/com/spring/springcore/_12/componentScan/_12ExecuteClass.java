package com.spring.springcore._12.componentScan;


import com.spring.springcore._11.javaBasedConfig.Car;
import com.spring.springcore._11.javaBasedConfig.Config;
import com.spring.springcore._11.javaBasedConfig.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class _12ExecuteClass {



	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("_12.componentScan.xml");

		Insurance insurance = ctx.getBean(Insurance.class);
		insurance.setType("Dask");

		System.out.println(insurance);

		//autowired : otomatik inject icin.
	}

}
