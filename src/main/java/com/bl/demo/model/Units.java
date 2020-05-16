package com.bl.demo.model;

public class Units {
    private int length;

    public Units(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() == o.getClass())
            return getClass() == o.getClass();
        Units units = (Units) o;
        return length == units.length;
    }
}
