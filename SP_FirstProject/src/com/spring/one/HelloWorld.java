package com.spring.one;

public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init() {
		   System.out.println("init method called");
	   }
	  public void destroy() {
		System.out.println("destroy");  
	  }
	}