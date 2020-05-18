package com.bl.demo.model;

import static com.bl.demo.model.Conversions.feetToInch;

public class Feet extends LengthUnits {

    public Feet(double length) {
        super(feetToInch(length));
    }
}