package com.bl.demo.model;

import com.bl.demo.exception.QuantityMeasurementException;

public class QuantityUnits {
    private final double length;

    public QuantityUnits(double length) {
        this.length = length;
    }

    public double addLength(QuantityUnits quantityUnits) {
        return quantityUnits.length + this.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        QuantityUnits quantityUnits = (QuantityUnits) o;
        if (quantityUnits.length < 0)
            throw new QuantityMeasurementException("Quantity Should Be Positive");
        return length == quantityUnits.length;
    }
}