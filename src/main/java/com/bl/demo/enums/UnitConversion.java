package com.bl.demo.enums;

public enum UnitConversion {
    Feet(12),
    Inch(1),
    Centimeter(0.4),
    Yard(3 * 12),
    Kilogram(1),
    Gram(0.001),
    Tonne(1000),
    Litre(1),
    Gallon(3.78),
    Millilitre(0.001),
    Celsius(1),
    Fahrenheit(1);

    private final double unit;

    UnitConversion(double unit) {
        this.unit = unit;
    }

    public double getUnit() {
        return unit;
    }
}
