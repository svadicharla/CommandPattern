package com.lewis.assignments.factorydesign;

public class Main {

	public static void main(String[] args) {
		DiaperFactory childDiaperFactory = new ChildDiaperFactory();
		
		Diaper childDiaper1 = childDiaperFactory.getDiaper();
		Diaper childDiaper2 = childDiaperFactory.getDiaper();
		
		childDiaper1.setSize(35);
		childDiaper1.setDesign("Cartoon");
		childDiaper1.setPurpose("night wear");

		childDiaper2.setSize(40);
		childDiaper2.setDesign("checks");
		childDiaper2.setPurpose("playing");
		
		System.out.println("Child1 diaper Size		: "+childDiaper1.getSize());
		System.out.println("Child1 Design			: "+childDiaper1.getDesign());
		System.out.println("Child1 purpose			: "+childDiaper1.getPurpose());
		System.out.println("============================================");
		System.out.println("Child2 diaper Size		: "+childDiaper2.getSize());
		System.out.println("Child2 Design			: "+childDiaper2.getDesign());
		System.out.println("Child2 purpose 			: "+childDiaper2.getPurpose());
		System.out.println("============================================");
		DiaperFactory adultDiaperFactory = new AdultDiaperFactory();
		
		Diaper adultDiaper1 = adultDiaperFactory.getDiaper();
		Diaper adultDiaper2 = adultDiaperFactory.getDiaper();
		
		adultDiaper1.setSize(85);
		adultDiaper1.setDesign("multi-color");
		adultDiaper1.setPurpose("casual");

		adultDiaper2.setSize(90);
		adultDiaper2.setDesign("Stripes");
		adultDiaper2.setPurpose("official");
		
		System.out.println("Adult1 diaper Size		: "+adultDiaper1.getSize());
		System.out.println("Adult1 Design			: "+adultDiaper1.getDesign());
		System.out.println("Adult1 purpose			: "+adultDiaper1.getPurpose());
		System.out.println("============================================");
		System.out.println("Adult2 diaper Size		: "+adultDiaper2.getSize());
		System.out.println("Adult2 Design			: "+adultDiaper2.getDesign());
		System.out.println("Adult2 purpose			: "+adultDiaper2.getPurpose());
		System.out.println("============================================");
	}
}
