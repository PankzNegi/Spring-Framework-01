package com.pankz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;




public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}
	
/*	@Autowired
	@Qualifier("circleRelated")*/
	
	@Resource(name="point1")

	public void setCenter( Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
		System.out.println("Circle's Point is (" +center.getX() +"," +center.getY()+")");
	}
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	}


}
