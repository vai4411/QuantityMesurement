package com.bl.demo.model;

import static com.bl.demo.model.Conversions.gallonToLitre;

public class Gallon extends QuantityUnits {

    public Gallon(double volume) {
        super(gallonToLitre(volume));
    }
}
