package com.markminisce.objectdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
		
		//register AbstractApplicationContext so we can register the shutdown hook for our desktop app
		//when the app ends, spring container shuts down. 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("objectdi.xml");
		context.registerShutdownHook();
		
		Triangle triangle = (Triangle)context.getBean("triangle"); 
		triangle.draw();
		
		System.out.println("--------------------------------------------------");
		Triangle triangleAlias = (Triangle)context.getBean("triangle-alias-1"); 
		triangleAlias.draw();
		
		System.out.println("--------------------------------------------------");
		Triangle triangle_explicit_wiring = (Triangle)context.getBean("triangle_explicit_wiring"); 
		triangle_explicit_wiring.draw();
		
		System.out.println("--------------------------------------------------");
		Triangle triangle_explicit_wiring2 = (Triangle)context.getBean("triangle_explicit_wiring2"); 
		triangle_explicit_wiring2.draw();
	}
}
