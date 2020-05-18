/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import static com.bl.demo.model.Conversions.gramToKilogram;

public class KiloGrams extends QuantityUnits {
    /**+
     * @purpose : To take weight input in kilograms(double) format and pass it to parent class
     * @param : weight
     */
    public KiloGrams(double weight) {
        super(weight);
    }
}
