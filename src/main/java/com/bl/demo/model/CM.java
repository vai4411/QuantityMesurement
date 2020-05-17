package com.bl.demo.model;

import static com.bl.demo.model.Conversions.cmToFeet;

public class CM extends Units {
    public CM(double length) {
        super(cmToFeet(length));
    }
}
