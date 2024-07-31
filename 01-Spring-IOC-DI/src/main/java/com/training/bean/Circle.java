package com.training.bean;

public class Circle implements Shape{
	
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return 3.14*this.radius*this.radius;
	}

	@Override
	public void setSize(int size) {
		setRadius(size);
		
	}
}
