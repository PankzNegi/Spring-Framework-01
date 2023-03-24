package com.pankz;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}
	@SuppressWarnings("deprecation")
 //	This is helpful to make sure that all the required dependencies are met or not(catch all these error during wiring much before code execution)
	//Here BeanPostProcessor checks for annotation @required helping in configuration all these dependency wiring.
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
		System.out.println("Circle's Point is (" +center.getX() +"," +center.getY()+")");
	}

}
