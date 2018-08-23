package com.ubs.opsit.interviews.clock;


import java.util.Arrays;
import java.util.List;

import com.ubs.opsit.interviews.model.LampBuilder;

public class MinuteFactory {
	
	private MinuteFactory() {
	}
	
	 public static List<TimeUnitPart> getMinutes() {
	        return Arrays.asList(
	                getTopMinuteRow(),
	                getBottomMinuteRow());
	    }

	    public static TimeUnitPart getTopMinuteRow() {
	        return new TimeUnitPart(
	                Arrays.asList(LampBuilder.getYellowLamp(),
	                		LampBuilder.getYellowLamp(),
	                		LampBuilder.getRedLamp(),
	                        LampBuilder.getYellowLamp(),
	                        LampBuilder.getYellowLamp(),
	                        LampBuilder.getRedLamp(),
	                        LampBuilder.getYellowLamp(),
	                        LampBuilder.getYellowLamp(),
	                        LampBuilder.getRedLamp(),
	                        LampBuilder.getYellowLamp(),
	                        LampBuilder.getYellowLamp()),
                		units -> units / 5);
	    }

	    public static TimeUnitPart getBottomMinuteRow() {
	        return new TimeUnitPart(
	        		Arrays.asList(
	        				LampBuilder.getYellowLamp(),
	                		LampBuilder.getYellowLamp(),
	                		LampBuilder.getYellowLamp(),
	                		LampBuilder.getYellowLamp()),
	                units -> units % 5);
	    }

}
