package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.clock.Hour;
import com.ubs.opsit.interviews.clock.Minute;
import com.ubs.opsit.interviews.clock.Second;
import com.ubs.opsit.interviews.constant.IConstant;
import com.ubs.opsit.interviews.model.Time;
import com.ubs.opsit.interviews.parser.TimeParser;
import com.ubs.opsit.interviews.parser.Parser;
import com.ubs.opsit.interviews.validation.TimeStringValidator;

public class TimeConverterImpl implements TimeConverter {

	private final Parser parser;
	
	private Hour hour; 
	private Minute minute; 
	private Second second; 
	
	public TimeConverterImpl() {
		this.parser = new TimeParser();
		this.hour = new Hour();
		this.minute = new Minute();
		this.second = new Second();
		
	}
	
	
	@Override
	public String convertTime(String aTime) {
		
		TimeStringValidator.validate(aTime != null, "Input string is null");
		
		Time time = this.parser.parse(aTime);
		

		return new StringBuilder(IConstant.MAX_SIZE)
				.append(second.display(time.getSeconds()))
				.append(IConstant.TIME_UNITS_PART_DELIMITER)
				.append(hour.display(time.getHours()))
				.append(IConstant.TIME_UNITS_PART_DELIMITER)
				.append(minute.display(time.getMinutes()))
				.toString();
	}

}
