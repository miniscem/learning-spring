package com.markminisce.objectdi;

import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware; 

//give information from the container to the bean using the "ContextAware"
//InitializingBean tells spring that Bean needs to know when its initialized - method needs to be called 
//  when the properties are set.
public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	private Point pointA;
	private Point pointB; 
	private Point pointC; 
	private ApplicationContext context = null; 
	

	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw(){
		System.out.println("Point A:" + getPointA().getX() + "," + getPointA().getY());
		System.out.println("Point B:" + getPointB().getX() + "," + getPointB().getY());
		System.out.println("Point C:" + getPointC().getX() + "," + getPointC().getY());
	}


	//
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context; 
		
		//allows each point to be a prototype while the parent is a singleton.
		this.setPointA((Point)context.getBean("pointA"));
		this.setPointB((Point)context.getBean("pointB"));
		this.setPointC((Point)context.getBean("pointC"));
		
	}
	
	public void setBeanName(String beanName) {
		
		System.out.println("The bean name is: " + beanName); 
	}


	//method executed after the properties are set
	//this method is implemented from a spring interface and will be called before 
	//any custom init methods. 
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBeans init method called for Triangle.");		
	}
	
	//called just before the bean is destroyed.
	//this method is implemented from a spring interface and will be called before
	//any custom destroy methods.
	public void destroy() throws Exception {
		System.out.println("DisposableBeans method called for Triangle.");		
	}
	
	//separate init and destroy methods not related to spring 
	//(afterPropertiesSet is specific to spring)
	public void myInit(){
		System.out.println("my init method called for Triangle.");
	}
	
	public void myDestroy(){
		System.out.println("my destroy method called for Triangle.");
	}
}
