package com.ubs.opsit.interviews.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ubs.opsit.interviews.model.Time;
import com.ubs.opsit.interviews.validation.TimeStringValidator;

import static java.lang.Integer.parseInt;

public class TimeParser implements Parser {

    public static final String DEFAULT_PATTERN = "(\\d\\d):(\\d\\d):(\\d\\d)";
    private Pattern pattern;

    public TimeParser(String patternConfig) {
        pattern = Pattern.compile(patternConfig);
    }

    public TimeParser() {
        pattern = Pattern.compile(DEFAULT_PATTERN);
    }

    @Override
    public Time parse(String time) {
        Matcher matcher = pattern.matcher(time);

        TimeStringValidator.validate(matcher.find(), "Input string does not comply to hh:mm:ss");

        return new Time(
                parseInt(matcher.group(1)),
                parseInt(matcher.group(2)),
                parseInt(matcher.group(3)));
    }
}
