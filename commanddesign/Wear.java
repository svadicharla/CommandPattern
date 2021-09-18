package com.lewis.assignments.commanddesign;

public class Wear {
	private boolean on;
	public void dress(){
		on = true;
		System.out.println("Dress");
	}
	public void remove(){
		on = false;
		System.out.println("Undress");
	}
}
