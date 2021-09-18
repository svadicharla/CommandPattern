package com.lewis.assignments.factorydesign;

public class AdultDiaperFactory implements DiaperFactory {

	Diaper diaper;

	@Override
	public Diaper getDiaper() {
		diaper = new AdultDiaper();
		return diaper;
	}

}
