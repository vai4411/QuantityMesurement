/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.enums.UnitConversion;
import com.bl.demo.model.QuantityUnits;

public class QuantityMeasurement {

    /**+
     * @purpose : To take two units and perform addition of units
     * @param : unit1
     * @param : unit2
     * @return : Give addition of units in double format
     */
    public static double addQuantityUnits(QuantityUnits unit1, QuantityUnits unit2) {
        return unit1.addQuantity(unit2);
    }

    public static double temperatureConversion(UnitConversion unitConversion, double temperature) {
        if (unitConversion == UnitConversion.Fahrenheit)
            return (temperature * 9/5) + 32;
        return temperature;
    }
}