package com.Question3;

public class Triangle implements Draw {
	
	
	public void draw() {
		
		System.out.println(" You have drawn Triangle .");
	}

	@Override
	public void start() {
		draw();
		
	}

}
