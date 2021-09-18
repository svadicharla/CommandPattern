package com.lewis.assignments.commanddesign;

public class WearOff implements Usage {

	Wear wear;
	
	public WearOff(Wear wear) {
		this.wear = wear; 
	}
	
	@Override
	public void wear() {
		wear.remove();
	}

}
