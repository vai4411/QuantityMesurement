package com.bl.demo.model;

public class Units {
    private double length;

    public Units(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Units units = (Units) o;
        return length == units.length;
    }
}
