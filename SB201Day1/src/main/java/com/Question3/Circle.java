package com.Question3;

public class Circle implements Draw {

	
    public void draw() {
		
		System.out.println(" You have drawn Circle .");
	}

	@Override
	public void start() {
		draw();
		
	}

}
