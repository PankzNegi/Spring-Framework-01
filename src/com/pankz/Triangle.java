package com.pankz;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware , BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context=null;
	
	
/*	private List<Point> points;
	


	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}*/



	
public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*	private String type;
	private int height;
	
	

	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	

	public Triangle(int height) {
		super();
		this.height = height;
	}



	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
	public void setType(String type) {
		this.type = type;
	}
*/
	public void draw()
	{
		/*for(Point point:points)
		{
			System.out.println("Point =("+point.getX()+","+point.getY()+")");
		
		}*/
		
		
		//System.out.println(getType()+" Triangle drawn of height "+getHeight());
		System.out.println("PointA=("+getPointA().getX() +" ," +getPointA().getY()+")" );
		System.out.println("PointB=("+getPointB().getX() +" ," +getPointB().getY()+")" );
		System.out.println("PointC=("+getPointC().getX() +" ," +getPointC().getY()+")" ); 
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		System.out.println(context);
		
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name as" +beanName);
		
		
	}

}
