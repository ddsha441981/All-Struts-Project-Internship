package com.org.collectionExample;

import java.util.List;

public class Triangle {
	private List<Point> points;
	
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public List<Point> getPoints() {
		return points;
	}
	
	public void  draw() {
		for (Point point : points) {
			System.out.println("Using Collection values "+point.getX() +"," +point.getY());
		}
		
		
	}

}
