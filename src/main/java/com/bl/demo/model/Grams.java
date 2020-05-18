/*********************************************************
 * @purpose : Quantity Measurement
 * @author : Vaibhav Patil
 * @date : 18/5/2020
 * *******************************************************/
package com.bl.demo.model;

import com.bl.demo.model.QuantityUnits;

import static com.bl.demo.model.Conversions.gramToKilogram;

public class Grams extends QuantityUnits {
    /**+
     * @purpose : To take weight input in grams(double) format then convert it into kilograms(double) format and pass it to parent class
     * @param : weight
     */
    public Grams(double weight) {
        super(gramToKilogram(weight));
    }
}
