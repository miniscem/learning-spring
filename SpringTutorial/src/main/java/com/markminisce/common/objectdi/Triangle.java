package com.markminisce.common.objectdi;

import java.util.*; 

public class Triangle {
	private List<Point> points;
		
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		for(Point p: this.points){
			System.out.println(p.getX() + "," + p.getY());
		}
	}
}
