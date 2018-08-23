package com.ubs.opsit.interviews.clock;

import java.util.Arrays;
import java.util.List;

import com.ubs.opsit.interviews.model.Lamp;
import com.ubs.opsit.interviews.model.LampBuilder;

public class HourFactory {
	private HourFactory() {
	}

	public static List<TimeUnitPart> getHours(){
		return Arrays.asList(getTopHourRow(),getBottomHourRow());
		
	}
	
	private static TimeUnitPart getTopHourRow() {
		return new TimeUnitPart(getLamps(), hourUnit -> hourUnit / 5);
		
	}
	
	private static TimeUnitPart getBottomHourRow() {
		return new TimeUnitPart(getLamps(), hourUnit -> hourUnit % 5);
	}
	
	private static List<Lamp> getLamps(){
		return Arrays.asList(
				LampBuilder.getRedLamp(),
				LampBuilder.getRedLamp(),
				LampBuilder.getRedLamp(),
				LampBuilder.getRedLamp()
				);
		
	}
	
	
}
