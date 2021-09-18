package com.lewis.assignments.commanddesign;

public class Main {
	public static void main(String[] args) {
		DiaperUsage usage = new DiaperUsage();
		
		Wear wear = new Wear();
		Usage dress = new WearOn(wear);
		Usage remove = new WearOff(wear);
		
		usage.setUsage(dress);
		usage.use();
		
		usage.setUsage(remove);
		usage.use();
		
	}
}
