package com.ubs.opsit.interviews.parser;

import com.ubs.opsit.interviews.model.Time;

public interface Parser {
    Time parse(String time);
}
