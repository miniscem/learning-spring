package com.markminisce.disample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args){
		//Triangle triangle = new Triangle();
		
		//using the BeanFactory interface to get the triangle 
		//BeanFactory  factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
		//Triangle triangle = (Triangle)factory.getBean("triangle");
					
		//using ApplicationContext interface (instead of BeanFactory) to read the bean config file.
		ApplicationContext context = new ClassPathXmlApplicationContext("disample.xml");
		
		//instantiating objects using ApplicationContext
		Triangle propertyTriangle = (Triangle)context.getBean("triangle_property_bean"); 
		propertyTriangle.draw(); 
	
		System.out.println("----------------------------------------------");
		
		Triangle indexTriangle = (Triangle)context.getBean("triangle_index_bean");
		indexTriangle.draw();
		
		System.out.println("----------------------------------------------");
		
		Triangle typeTriangle = (Triangle)context.getBean("triangle_type_bean"); 
		typeTriangle.draw();				
	}
}
