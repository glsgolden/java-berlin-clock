package com.ubs.opsit.interviews.model;

public enum Switch {
	
	ON(""), OFF("O");
	
	public final String switchState;
	
	Switch(String switchState) {
		this.switchState = switchState;
	}
}
