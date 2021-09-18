package com.lewis.assignments.commanddesign;

public class DiaperUsage {
	private Usage usage;
	public void setUsage(Usage usage){
	    this.usage = usage;
	  }
	  public void use(){
		  usage.wear();
	  }
}
