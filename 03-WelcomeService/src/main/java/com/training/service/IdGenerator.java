package com.training.service;

public class IdGenerator {
	
	int number=1010;
	static IdGenerator generator=null;
	
	public int next() {
		return this.number++;
	}
	
	private IdGenerator() {
		
	}
	
	public static IdGenerator getInstance() {
		if(generator==null)
			generator=new IdGenerator();
		
		return generator;
	}

}
