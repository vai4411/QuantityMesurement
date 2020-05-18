/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

public class QuantityMeasurement {

    /**+
     * @purpose : To take two units and perform addition of units
     * @param : unit1
     * @param : unit2
     * @return : Give addition of units in double format
     */
    public static double addLengthUnits(QuantityUnits unit1, QuantityUnits unit2) {
        return unit1.addLength(unit2);
    }

    /**+
     * @purpose : To take two objects and compare that object
     * @param : qualityOne
     * @param : qualityTwo
     * @return : Give result in true or false format
     */
    public static boolean equals(QuantityUnits qualityOne, QuantityUnits qualityTwo) {
        if (qualityOne == null || qualityTwo == null)
            return false;
        return qualityOne.equals(qualityTwo);
    }
}