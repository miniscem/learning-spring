package com.markminisce.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center; 
	
	public Point getCenter() {
		return center;
	}

	//tells spring that this is a required member variable. 
	//exception will be thrown if no center point is specified. 
	//declare a BeanPostProcessor in the xml configuration - this is doing 
	//the validation on the backend. The error will be thrown before the code execution, 
	//more precisely, when the bean is being initialized.
	//@Required requires the xml config:<property name="center" ref="pointA" /> 
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Point is: (" + center.getX() + ", " + center.getY() + ")");
	}
	
}
