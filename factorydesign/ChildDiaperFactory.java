package com.lewis.assignments.factorydesign;

public class ChildDiaperFactory implements DiaperFactory {
	Diaper diaper;

	@Override
	public Diaper getDiaper() {
		diaper = new ChildDiaper();
		return diaper;
	}
	 

}
