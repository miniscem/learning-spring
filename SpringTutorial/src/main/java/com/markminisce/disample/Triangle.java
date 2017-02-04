package com.markminisce.disample;

public class Triangle {
	private String type; 
	private int height;
	
	public Triangle(){
		this.type = "Obtuse"; 
		this.height = 5; 
	}
	
	public Triangle(String type){
		this.type = type; 
	}
	
	public Triangle(int height){
		this.height = height; 
	}
	
	public Triangle(String type, int height){
		this.type = type; 
		this.height = height; 
	}
	
	public String getType(){
		return type; 
	}
	
	public void setType(String type){
		this.type = type; 
	}
	
	public int getHeight(){
		return height; 
	}
	
	public void draw(){
		System.out.println(getType() + " triangle drawn with height = " + getHeight());
		
	}
}
