/***************************************************************
 * @purpose : Quantity Measurement Unit Conversion To Base Class
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *************************************************************/
package com.bl.demo.enums;

public enum UnitConversion {
    Feet(12),
    Inch(1),
    Centimeter(0.4),
    Yard(36),
    Kilogram(1),
    Gram(0.001),
    Tonne(1000),
    Litre(1),
    Gallon(3.78),
    Millilitre(0.001),
    Celsius(0.00001),
    Fahrenheit(0.00001);

    private final double unit;

    UnitConversion(double unit) {
        this.unit = unit;
    }

    /***+
     * @purpose : Return The Unit Conversion Value To Convert It Into Base Class
     * @return : enum unit
     */
    public double getUnit() {
        return unit;
    }
}
