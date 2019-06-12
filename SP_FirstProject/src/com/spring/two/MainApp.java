package com.spring.two;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
	   
	   HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
//	   obj.getMessage1();
	   obj2.getMessage2();
//	   obj.getMessage3();
	   
	   HelloIndia obj = (HelloIndia) context.getBean("helloIndia");
	   obj.getMessage1();
	   obj.getMessage2();
	   obj.getMessage3();
   }
}
