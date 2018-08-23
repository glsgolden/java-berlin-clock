package com.ubs.opsit.interviews.clock;

import java.util.ArrayList;
import java.util.List;

import com.ubs.opsit.interviews.constant.IConstant;
import com.ubs.opsit.interviews.function.LampsOnFunction;
import com.ubs.opsit.interviews.model.Lamp;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public class TimeUnitPart implements TimeUnit {
    

    protected final List<Lamp> lamps;
    protected final LampsOnFunction lampsOnFunction;

    public TimeUnitPart(List<Lamp> lamps, LampsOnFunction lampsOnFunction) {
        this.lamps = lamps;
        this.lampsOnFunction = lampsOnFunction;
    }

    public String display(int units) {
        ArrayList<Lamp> lampsClone = clonedLamps();

        range(0, lampsOnFunction.calculateLampsOnFor(units)).
                forEach(index -> lampsClone.get(index).switchOn());

        return lampsClone.stream().
                map(Lamp::toString).
                collect(joining(IConstant.LAMPS_DELIMITER));
    }

    private ArrayList<Lamp> clonedLamps() {
        ArrayList<Lamp> lampsCopy = new ArrayList<>(lamps.size());
        lamps.forEach(lamp -> lampsCopy.add(lamp.copy()));
        return lampsCopy;
    }
}