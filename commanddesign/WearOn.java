package com.lewis.assignments.commanddesign;

public class WearOn implements Usage {

	Wear wear;
	
	public WearOn(Wear wear) {
		this.wear = wear; 
	}
	
	@Override
	public void wear() {
		wear.dress();
	}

}
