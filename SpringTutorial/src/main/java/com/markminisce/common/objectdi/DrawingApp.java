package com.markminisce.common.objectdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("objectdi.xml");
		Triangle triangle = (Triangle)context.getBean("triangle"); 
		triangle.draw();
		
		System.out.println("--------------------------------------------------");
		Triangle triangleAlias = (Triangle)context.getBean("triangle-alias-1"); 
		triangleAlias.draw();
	}
}
