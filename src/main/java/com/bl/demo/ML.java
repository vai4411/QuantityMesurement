package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

import static com.bl.demo.model.Conversions.mlToLitre;

public class ML extends QuantityUnits {
    public ML(double volume) {
        super(mlToLitre(volume));
    }
}
