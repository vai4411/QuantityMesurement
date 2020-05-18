package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

public class QuantityMeasurement {

    public static double addLengthUnits(QuantityUnits unit1, QuantityUnits unit2) {
        return unit1.addLength(unit2);
    }

    public static boolean equals(QuantityUnits lengthOne, QuantityUnits lengthTwo) {
        if (lengthOne == null || lengthTwo == null)
            return false;
        return lengthOne.equals(lengthTwo);
    }
}