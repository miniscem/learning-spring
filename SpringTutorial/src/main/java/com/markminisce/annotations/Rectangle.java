package com.markminisce.annotations;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape, MessageSource, ApplicationEventPublisherAware{
	
	@Autowired
	private Point pointA;
	private Point pointB; 
	private Point pointC; 
	private Point pointD;
	
	//MessageSource is an interface, ApplicationContext is just one implementation
	@Autowired
	private MessageSource messageSource; 
	
	//spring's provided event publisher.
	private ApplicationEventPublisher publisher; 
	
	public void draw() {
		
		System.out.println(this.messageSource.getMessage("drawing.rectangle", 
				null, "Default message: Trying to draw a circle", null));
		
		//passing Object array to substitute into message
		System.out.println(this.messageSource.getMessage("drawing.point", 
				new Object[]{pointA.getX(), pointA.getY()}, "Default message: Trying to draw a circle", null));
				
		System.out.println(this.messageSource.getMessage("greeting_warm", 
				null, "Default message from Rectangle", null));
		
		DrawEvent drawEvent = new DrawEvent(this); 		
		publisher.publishEvent(drawEvent);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public String getMessage(MessageSourceResolvable arg0, Locale arg1) throws NoSuchMessageException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage(String arg0, Object[] arg1, Locale arg2) throws NoSuchMessageException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage(String arg0, Object[] arg1, String arg2, Locale arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	//spring uses this method to give us the event publisher
	//method required by ApplicationEventPublisherAware interface
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher; 		
	} 
	
	
}
