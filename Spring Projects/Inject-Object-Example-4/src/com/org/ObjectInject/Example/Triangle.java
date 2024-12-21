package com.org.ObjectInject.Example;

/**
 * @author Deendayal Kumawat
 * 
 */

public class Triangle {

	/**
	 * @param declare objects and 
	 * their references 
	 * class of Point.java 
	 * 
	 */
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	/**
	  * @param pointA the pointA to set
	  */
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	/**
	  * @param pointB the pointB to set
	  */
	
	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	/**
	  * @param pointC the pointC to set
	  */
	
	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	/**
	 *  @param args create 
	 * method draw to display data 
	 */
	public void draw() {
		System.out.println("PointA " + "(" +getPointA().getX() + "," +getPointA().getY() + ") ");
		System.out.println("PointB " + "(" +getPointB().getX() + "," +getPointB().getY() + ") "); 
		System.out.println("PointC " + "(" +getPointC().getX() + "," +getPointC().getY() + ") ");

	}
}
