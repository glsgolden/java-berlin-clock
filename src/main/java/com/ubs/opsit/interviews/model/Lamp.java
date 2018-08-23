package com.ubs.opsit.interviews.model;



public class Lamp {
	private Color color;
    private Switch aSwitch = Switch.OFF;

    public Lamp(Color color) {
        this.color = color;
    }

    public void switchOn() {
        aSwitch = Switch.ON;
    }

    @Override
    public String toString() {
        return aSwitch == Switch.ON ?
                color.code : aSwitch.switchState;
    }

    public Lamp copy() {
        return new Lamp(this.color);
    }

}
