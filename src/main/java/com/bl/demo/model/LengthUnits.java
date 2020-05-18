package com.bl.demo.model;

import com.bl.demo.exception.QuantityMeasurementException;

import static com.bl.demo.model.Conversions.*;

public class LengthUnits {
    private final double length;
    private LengthUnits Feet, Yard, CM;

    public LengthUnits(double length) {
        this.length = length;
    }

    public double addLength(LengthUnits lengthUnits) {
        double totalLength;
        if (lengthUnits.getClass().equals(Feet) || this.getClass().equals(Feet))
            totalLength = feetToInch(this.length) + feetToInch(lengthUnits.length);
        else if (lengthUnits.getClass().equals(CM) || this.getClass().equals(CM))
            totalLength = cmToFeet(this.length) + cmToFeet(lengthUnits.length);
        else
            totalLength = this.length + lengthUnits.length;
        return totalLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        LengthUnits lengthUnits = (LengthUnits) o;
        if (lengthUnits.length < 0)
            throw new QuantityMeasurementException("Length Should Be Positive");
        return length == lengthUnits.length;
    }
}