package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.validation.TimeUnitValidator;

public class Hour extends AbstractTimeUnit {

	public Hour() {
		timeUnitParts = HourFactory.getHours();
		timeUnitValidatr = new TimeUnitValidator(
				units -> units >= 0 && units <= 24,
                "Hour units must be in range: units >= 1 && units <= 24");
	}
	
}
