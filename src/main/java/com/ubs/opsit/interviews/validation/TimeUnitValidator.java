package com.ubs.opsit.interviews.validation;

import java.util.function.Predicate;

public class TimeUnitValidator {

	private Predicate<Integer> predicate;
	private String message;
	
	public TimeUnitValidator(final Predicate<Integer> predicate, final String message) {
		this.predicate = predicate;
		this.message = message;
	}
	
	public void validate(int units) {
		if(!predicate.test(units)) {
			throw new IllegalArgumentException(this.message);
		}

	}
	
}
