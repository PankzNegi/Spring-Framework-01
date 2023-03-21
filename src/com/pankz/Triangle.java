package com.pankz;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
		
		
		//System.out.println(getType()+" Triangle drawn of height "+getHeight());
		System.out.println("PointA=("+getPointA().getX() +" ," +getPointA().getY()+")" );
		System.out.println("PointB=("+getPointB().getX() +" ," +getPointB().getY()+")" );
		System.out.println("PointC=("+getPointC().getX() +" ," +getPointC().getY()+")" );
	}

}
