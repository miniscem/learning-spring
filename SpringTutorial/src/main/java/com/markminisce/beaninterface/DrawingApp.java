package com.markminisce.beaninterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("objectdi.xml"); 
		
	}
}
