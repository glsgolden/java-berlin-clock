package com.ubs.opsit.interviews.clock;

import static java.util.stream.Collectors.joining;

import java.util.List;

import com.ubs.opsit.interviews.constant.IConstant;
import com.ubs.opsit.interviews.validation.TimeUnitValidator;


public abstract class AbstractTimeUnit implements TimeUnit {

	 protected List<? extends TimeUnit> timeUnitParts;
	 protected TimeUnitValidator timeUnitValidatr;
	    
	@Override
	public String display(int unit) {
		timeUnitValidatr.validate(unit);
		
		return timeUnitParts.stream().map(timeUnit -> timeUnit.display(unit))
				.collect(joining(IConstant.TIME_UNITS_PART_DELIMITER));
	}

}
