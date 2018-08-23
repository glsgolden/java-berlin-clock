package com.ubs.opsit.interviews.validation;

public class TimeStringValidator {
	
	private TimeStringValidator() {
	}
	
	public static void validate(boolean condition, String message) {
        if (!condition) throw new IllegalArgumentException(message);
    }
	
}
