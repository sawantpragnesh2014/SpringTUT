package com.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext cont = new ClassPathXmlApplicationContext("DIXml.xml");
	Employee emp = (Employee) cont.getBean("e");
	emp.show();

		
	}

}
