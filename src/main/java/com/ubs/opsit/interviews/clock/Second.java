package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.validation.TimeUnitValidator;

public class Second extends AbstractTimeUnit {

	public Second() {
		this.timeUnitParts = SecondFactory.getSecond();
		this.timeUnitValidatr = new TimeUnitValidator(
                units -> units >= 0 && units <= 59,
                "Second units must be in range: units >= 0 && units <= 59");
	}
	
}
