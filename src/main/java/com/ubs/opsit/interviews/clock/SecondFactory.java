package com.ubs.opsit.interviews.clock;

import static java.lang.Math.abs;
import java.util.Arrays;

import java.util.List;

import com.ubs.opsit.interviews.model.LampBuilder;

public class SecondFactory {
	
	private SecondFactory() {
	}
	
	 public static List<TimeUnitPart> getSecond() {
	        return Arrays.asList(getSecondPart());
	    }

	    public static TimeUnitPart getSecondPart() {
	        return new TimeUnitPart(
	        		Arrays.asList(LampBuilder.getYellowLamp()),
	                units -> abs((units % 2) - 1));
	    }
}
