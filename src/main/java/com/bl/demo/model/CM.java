package com.bl.demo.model;

import static com.bl.demo.model.Conversions.cmToInch;

public class CM extends QuantityUnits {
    public CM(double length) {
        super(cmToInch(length));
    }
}
