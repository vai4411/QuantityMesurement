package com.bl.demo.model;

import com.bl.demo.exception.QuantityMeasurementException;

public class Units {
    private double length;

    public Units(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        Units units = (Units) o;
        if (units.length < 0)
            throw new QuantityMeasurementException("Length Should Be Positive");
        return length == units.length;
    }
}