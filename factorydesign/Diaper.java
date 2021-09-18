package com.lewis.assignments.factorydesign;

public interface Diaper {
	public void setSize(int size);
	public int getSize();
	
	public String getDesign();
	public void setDesign(String design);
	
	public String getPurpose();
	public void setPurpose(String purpose);
}
