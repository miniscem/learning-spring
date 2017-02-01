package com.markminisce.common.objectdi;

import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware; 

//give information from the container to the bean using the "ContextAware"
public class Triangle implements ApplicationContextAware{
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
}
