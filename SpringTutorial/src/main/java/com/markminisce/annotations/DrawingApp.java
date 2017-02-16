package com.markminisce.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
		//use self-contained xml config file
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotationdi.xml");
		context.registerShutdownHook();
		
		Shape triangle = (Triangle)context.getBean("triangle"); 
		triangle.draw();
		
		Shape circle = (Circle)context.getBean("circle"); 
		circle.draw();
		
		//using @Component annotation in Rectangle
		Shape rectangle = (Rectangle)context.getBean("rectangle"); 
		rectangle.draw(); 
		
		System.out.println(context.getMessage("greeting", null, "Default greeting", null));
		System.out.println(context.getMessage("greeting_warm", null, "Default warm greeting", null));
	}
}
