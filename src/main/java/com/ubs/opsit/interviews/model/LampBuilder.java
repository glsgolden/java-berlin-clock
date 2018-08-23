package com.ubs.opsit.interviews.model;

public final class LampBuilder {
	
	private LampBuilder() {
	}

	public static Lamp getRedLamp() {
		return new Lamp(Color.RED);
	}

	public static Lamp getYellowLamp() {
		return new Lamp(Color.YELLOW);
	}

}
