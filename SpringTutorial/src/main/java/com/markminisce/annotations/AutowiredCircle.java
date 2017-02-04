package com.markminisce.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowiredCircle implements Shape{

	private Point center; 
	
	public Point getCenter() {
		return center;
	}

	//qualifier is something in bean definition telling spring that its a AutowiredCircle
	//related bean
	@Autowired
	@Qualifier("autowiredCircleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Point is: (" + center.getX() + ", " + center.getY() + ")");
	}
	
}
