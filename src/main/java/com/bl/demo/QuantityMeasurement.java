package com.bl.demo;

import com.bl.demo.model.Units;

public class QuantityMeasurement {

    public static boolean equals(Units lengthOne, Units lengthTwo) {
        if (lengthOne == null || lengthTwo == null)
            return false;
        return lengthOne.equals(lengthTwo);
    }
}