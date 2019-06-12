package com.spring.one;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//      
//      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//      obj.getMessage();

	   
//	   when we dont need shutdownhook
//	   ApplicationContext cont = new ClassPathXmlApplicationContext("Beans.xml");
   
	   AbstractApplicationContext cont = new ClassPathXmlApplicationContext("Beans.xml");
	  HelloWorld obj = (HelloWorld)cont.getBean("helloWorld");
	   obj.setMessage("Prag");
	   obj.getMessage();
	   
	   HelloWorld obj1 = (HelloWorld)cont.getBean("helloWorld");
	   obj1.getMessage();
	   cont.registerShutdownHook();
   }
}
