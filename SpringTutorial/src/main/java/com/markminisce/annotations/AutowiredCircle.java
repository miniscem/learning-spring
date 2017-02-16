package com.markminisce.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.*;

public class AutowiredCircle implements Shape{

	private Point center; 
	
	public Point getCenter() {
		return center;
	}

	//qualifier is something in bean definition telling spring that its a AutowiredCircle
	//related bean. @Resource allows us to specify a bean by name via JSR-250 standard annotations.
	@Autowired
	@Qualifier("autowiredCircleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Point is: (" + center.getX() + ", " + center.getY() + ")");
	}
	
	@PostConstruct
	public void initCircle(){
		System.out.println("Init circle with PostContruct annotation");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroying circle with PreDestroy annotation");
	}
}
