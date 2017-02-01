package com.markminisce.common.objectdi;

public class Triangle {
	private Point a; 
	private Point b; 
	private Point c; 
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public void draw(){
		System.out.println("Point A = " + getA().getX() + ", " + getA().getY());
		System.out.println("Point B = " + getB().getX() + ", " + getB().getY());
		System.out.println("Point C = " + getC().getX() + ", " + getC().getY());
	}
}
