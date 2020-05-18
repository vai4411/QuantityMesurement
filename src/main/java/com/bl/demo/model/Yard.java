package com.bl.demo.model;

import static com.bl.demo.model.Conversions.feetToInch;
import static com.bl.demo.model.Conversions.yardToFeet;

public class Yard extends LengthUnits {

    public Yard(double length) {
        super(yardToFeet(feetToInch(length)));
    }
}
