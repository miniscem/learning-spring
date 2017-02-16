package com.markminisce.annotations;

import org.springframework.context.ApplicationEvent;

//custom events need to extend application event
public class DrawEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public DrawEvent(Object source) {
		super(source);		
	}
	
	public String toString(){
		return "Draw Event Occurred"; 
	}

}
