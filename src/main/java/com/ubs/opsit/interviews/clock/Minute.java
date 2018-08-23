package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.validation.TimeUnitValidator;

public class Minute extends AbstractTimeUnit {

	public Minute() {
		this.timeUnitParts = MinuteFactory.getMinutes();
		this.timeUnitValidatr = new TimeUnitValidator(
                units -> units >= 0 && units <= 59,
                "Minute units must be in range: units >= 0 && units <= 59");
	}
	
}
