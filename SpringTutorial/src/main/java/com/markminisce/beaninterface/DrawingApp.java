package com.markminisce.beaninterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
		//use self-contained xml config file
		ApplicationContext context = new ClassPathXmlApplicationContext("interfacedi.xml"); 
		Shape triangle = (Triangle)context.getBean("triangle"); 
		triangle.draw();
		
		Shape circle = (Circle)context.getBean("circle"); 
		circle.draw(); 
		
	}
}
