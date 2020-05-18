/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo;

import com.bl.demo.model.QuantityUnits;

import static com.bl.demo.model.Conversions.kilogramToGram;

public class KiloGrams extends QuantityUnits {
    /**+
     * @purpose : To take weight input in kilograms(double) format then convert it into inch(double) format and pass it to parent class
     * @param : weight
     */
    public KiloGrams(double weight) {
        super(kilogramToGram(weight));
    }
}
