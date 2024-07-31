package com.training.bean;

public class Square implements Shape{
	int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public double computeArea(){
		return this.length*this.length;
	}

	@Override
	public void setSize(int size) {
		setLength(size);
		
	}

	@Override
	public double getArea() {
		
		return computeArea();
	}
}
