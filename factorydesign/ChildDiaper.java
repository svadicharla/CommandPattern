package com.lewis.assignments.factorydesign;

public class ChildDiaper implements Diaper{
	public int size;
	public String design;
	public String purpose;
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String getDesign() {
		return design;
	}

	@Override
	public String getPurpose() {
		return purpose;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	@Override
	public String toString() {
		return "Child Diaper";
	}
}
