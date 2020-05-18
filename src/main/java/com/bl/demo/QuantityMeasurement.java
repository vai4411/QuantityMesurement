package com.bl.demo;

import com.bl.demo.model.LengthUnits;

public class QuantityMeasurement {

    public static double addLengthUnits(LengthUnits unit1, LengthUnits unit2) {
        return unit1.addLength(unit2);
    }

    public static boolean equals(LengthUnits lengthOne, LengthUnits lengthTwo) {
        if (lengthOne == null || lengthTwo == null)
            return false;
        return lengthOne.equals(lengthTwo);
    }
}