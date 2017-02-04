package com.markminisce.beaninterface;

import org.springframework.context.ApplicationContext;

//give information from the container to the bean using the "ContextAware"
//InitializingBean tells spring that Bean needs to know when its initialized - method needs to be called 
//  when the properties are set.
public class Triangle{
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

}

